package com.datangdu.cn.controller;

import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.datangdu.cn.Util.ImgCodeUtil;
import com.datangdu.cn.model.businessOrder.BusinessOrder;
import com.datangdu.cn.model.product.Product;
import com.datangdu.cn.model.product_user.ProductUser;
import com.datangdu.cn.model.product_user.ProductUserWithBLOBs;
import com.datangdu.cn.service.LoginService;
import com.datangdu.cn.service.OrderProductService;
import com.datangdu.cn.service.ProductService;
import com.datangdu.cn.service.ProductUserService;
import com.datangdu.cn.service.RegisterService;

@Controller
@RequestMapping("/products")
public class ProductUserController {
	@Resource // 相当于创建对象
	ProductService productService;
	@Resource
	LoginService loginService;
	@Resource
	OrderProductService orderService;
	@Resource
	ProductUserService productuserService;
	@Resource
	RegisterService registerService;

@RequestMapping("index")
public String index() {
	return "index";
}
	@RequestMapping("find")
	public String find() {
		return "service_login";
	}

	@RequestMapping("serviceProduct")
	public String serviceProduct() {

		return "service_product";

	}

	@RequestMapping("serviceupdate")
	public String serviceupdate() {

		return "service_update";

	}
/**
 * 模糊查询，按服务名称进行查询 
 * @param map
 * @param name
 * @param tel
 * @return
 */
	@RequestMapping("findByName")
	public String findByName(Map<String, Object> map, @RequestParam(defaultValue = "") String name, String tel) {//模糊查询
		List<Product> productList = productService.findByName(name);
		map.put("productList", productList);
		map.put("name", name);
		map.put("tel", tel);
		return "service_product";

	}
/**
 * 按住键id进行插入，页面访问控制器并传参，传tel
 * @param record
 * @param tel
 * @return
 */
	@RequestMapping("insert")
	public String insert(Product record,String tel) {
		int i = productService.insert(record);
		if (i == 1) {
			return "redirect:findByName?tel="+tel;//控制器间路径跳转传值，传tel
		} else {
			return "service_error";
		}
	}
/**
 * 按主键id删除，页面访问控制器并传参，传tel
 * @param id
 * @param tel
 * @return
 */
	@RequestMapping("delete")
	public String deleteByPrimaryKey(Integer id,String tel) {
		int i = productService.deleteByPrimaryKey(id);
		if (i == 1) {
			return "redirect:findByName?tel="+tel;//控制器间路径跳转传值，传tel
		} else {
			return "service_error";
		} 
	}
/**
 * 用model模型进行传值，按照主键id进行查询，页面访问控制器并传参，传tel
 * @param id
 * @param model
 * @param tel
 * @return
 * @throws Exception
 */
	@RequestMapping("updateQ")
	public String selectByPrimaryKey(Integer id, Model model,String tel) throws Exception {
		Product productList = productService.selectByPrimaryKey(id);
		model.addAttribute("productList", productList);
		model.addAttribute("tel",tel);
		return "service_update";

	}
/**
 * 按主键id进行修改，页面访问控制器并传参，传tel
 * @param record
 * @param tel
 * @return
 */
	@RequestMapping("update")
	public String updateByPrimaryKey(Product record,String tel) {
		int i = productService.updateByPrimaryKey(record);
		if (i == 1) {
			return "redirect:findByName?tel="+tel;
		} else {
			return "service_error";
		}
	}
/**
 * 订单模糊查询，多表进行连接，按name查询，页面访问控制器并传参，传tel
 * @param map
 * @param name
 * @param tel
 * @return
 */
	@RequestMapping("findpname")
	public String findPname(Map<String, Object> map, String name, String tel) {
		List<BusinessOrder> orderList = orderService.findPname(name);
		map.put("orderList", orderList);
		map.put("name", name);
		map.put("tel", tel);
		return "service_orderform";

	}
/**
 * 读取店铺信息，model模型传值，根据tel查询数据
 * @param model
 * @param tel
 * @return
 * @throws Exception
 */
	@RequestMapping("store")
	public String selectByTel(Model model, String tel) throws Exception {
		ProductUser userList = productuserService.selectByTel(tel);
		model.addAttribute("userList", userList);
		model.addAttribute("tel", tel);//控制器间路径跳转传值，传tel
		return "service_store";

	}
/**
 * 设置用户信息，model模型传值，实体类对象属于模型，用model控制器间路径跳转传值，传tel
 * @param tel
 * @param model
 * @return
 */
	@RequestMapping("setQ")
	public String selectBytel(String tel, Model model) {
		ProductUser productuser = productuserService.selectByTel(tel);
		model.addAttribute("productuser", productuser);
		model.addAttribute("tel", tel);//传tel
		return "service_setting";

	}
/**
 * 修改设置信息，省市级三级联动，上传头像，图片以二进制上传，file用来获取输入流，控制器间路径跳转传值，传tel
 * @param file
 * @param record
 * @param request
 * @return
 */
	@RequestMapping("setupdate")
	public String saveUserImg(MultipartFile file, ProductUserWithBLOBs record,HttpServletRequest request) {
		 Map<Object,Object> result = new HashMap<Object,Object>();
		String cmbProvince = request.getParameter("cmbProvince");
		String cmbCity = request.getParameter("cmbCity");
			String cmbArea = request.getParameter("cmbArea");
		String regin = cmbProvince + cmbCity + cmbArea;
			record.setRegin(regin);//省市区三级联动
		try {
			InputStream ins = file.getInputStream();// 获取客户端传图图片的输入流
			byte[] buffer = new byte[32768];// 60k
			int len = 0;
			ByteArrayOutputStream bos = new ByteArrayOutputStream();// 字节输出流
			while ((len = ins.read(buffer)) != -1) {
				bos.write(buffer, 0, len);}
			bos.flush();
			byte data[] = bos.toByteArray();
			record.setProviderImg(data);// 调用接口对图片进行存储
			productuserService.updateByPrimaryKeyWithBLOBs(record);
			 result.put("code",1);
			 result.put("msg", "保存头像成功");
		} catch (Exception e) {
			e.printStackTrace();
			 result.put("code",0);
			 result.put("msg", "保存头像失败");
			return "service_error";
		}
		return "redirect:setQ?tel=" + record.getTel();//控制器间路径跳转传值，传tel
	}
/**
 * 头像展示，控制器间路径跳转传值，传tel
 * @param tel
 * @return
 * @throws Exception
 */
	@RequestMapping(value = "imgshow", produces = MediaType.IMAGE_PNG_VALUE)
	public ResponseEntity<byte[]> headImg(String tel) throws Exception {
		// 根据tel获取当前用户的信息
		ProductUserWithBLOBs user = productuserService.getUserImg(tel);//传tel
		byte[] imageContent;
		imageContent=user.getProviderImg();
		// 设置http头部信息
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.IMAGE_PNG);
		// 返回响应实体
		return new ResponseEntity<byte[]>(imageContent, headers, HttpStatus.OK);
	}

	@ResponseBody
	@RequestMapping("images")
	public void images(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// System.out.println("123456");
		// 调用工具类生成的验证码和验证码图片
		Map<String, Object> codeMap = ImgCodeUtil.generateCodeAndPic();
		// 将四位数字的验证码保存到Session中。
		HttpSession session = req.getSession();
		session.setAttribute("code", codeMap.get("code").toString());
		// 禁止图像缓存。
		resp.setHeader("Pragma", "no-cache");
		resp.setHeader("Cache-Control", "no	-cache");
		resp.setDateHeader("Expires", -1);
		resp.setContentType("image/jpeg");
		// 将图像输出到Servlet输出流中。
		ServletOutputStream sos;
		try {
			sos = resp.getOutputStream();
			ImageIO.write((RenderedImage) codeMap.get("codePic"), "jpeg", sos);
			sos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
/**
 * 登录
 * 取手机号值作为登录条件
 * @param request
 * @return
 */
	@ResponseBody
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public Map<String, Object> login(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String code = (String) session.getAttribute("code");
		String imgcode = request.getParameter("img");//验证码
		int code1 = 0;
		String tel = request.getParameter("tel");
		Map<String, Object> map = new HashMap<String, Object>();
		if (imgcode.toUpperCase().equals(code)) {
			List<ProductUser> loginList = loginService.Login(tel);
			ProductUser password = loginList.get(0);
			if (password.getPassword().equals(request.getParameter("password"))) {
				code1 = 1;
				map.put("code", code1);
			} else {
				map.put("code", code1);
			}
		} else {
			map.put("code", code1);
		}
		return map;
	}

	@RequestMapping("updatepassword")
	public String repassword() {
		return "service_findpassword";

	}
/**
 * 修改密码
 * @param request
 * @param record
 * @return
 */
	@ResponseBody
	@RequestMapping(value = "ab", method = RequestMethod.POST)
	public Map<String, Object> repassword(HttpServletRequest request, ProductUser record) {
		HttpSession session = request.getSession();
		String code = (String) session.getAttribute("code");
		String imgcode = request.getParameter("img");
		String tel = request.getParameter("tel");//获取tel信息
		int code1 = 0;
		Map<String, Object> map = new HashMap<String, Object>();
		if (imgcode.toUpperCase().equals(code)) {
			List<ProductUser> loginList = loginService.Login(tel);
			ProductUser password = loginList.get(0);
			ProductUser user = new ProductUser();
			user.setPassword(request.getParameter("password"));
			user.setTel(password.getTel());
			if (request.getParameter("password").equals(request.getParameter("password1"))) {//对比两次输入密码是否一致
				loginService.repassword(record);
				code1 = 1;
				map.put("code", code1);
			} else {
				map.put("code", code1);
			}
		} else {
			map.put("code", code1);
		}
		return map;
	}

	@RequestMapping("/sregister")
	public String register() {
		return "service_register";
	}
/**
 * 获取tel进行检索，通过手机号作为条件进行注册
 * @param request
 * @param record
 * @return
 */
	@ResponseBody
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public Map<String, Object> register(HttpServletRequest request, ProductUser record) {
		HttpSession session = request.getSession();
		String code = (String) session.getAttribute("code");
		String img = request.getParameter("imgcode");
		String tel = request.getParameter("tel");//获取tel信息
		String password = request.getParameter("password");//获取password信息
		int code1 = 0;
		Map<String, Object> map = new HashMap<String, Object>();
		if (img.toUpperCase().equals(code)) {
			ProductUser user = new ProductUser();
			user.setTel(tel);
			user.setPassword(password);
			registerService.register(user);
			code1 = 1;
			map.put("code", code1);
		} else {
			map.put("code", code1);
		}
		return map;
	}

}

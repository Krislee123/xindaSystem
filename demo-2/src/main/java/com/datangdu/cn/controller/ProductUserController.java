package com.datangdu.cn.controller;

import java.awt.image.RenderedImage;
import java.io.IOException;
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

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.datangdu.cn.Util.ImgCodeUtil;
import com.datangdu.cn.model.bus_order.BusinessOrder;
import com.datangdu.cn.model.product.Product;
import com.datangdu.cn.model.product_user.ProductUser;
import com.datangdu.cn.model.product_user.ProductUserExample;
import com.datangdu.cn.service.LoginService;
import com.datangdu.cn.service.OrderProductService;
import com.datangdu.cn.service.ProductService;
import com.datangdu.cn.service.ProductUserService;

@Controller
@RequestMapping("/product") 
public class ProductUserController {
	@Resource // 相当于创建对象
	ProductService productService;
	@Resource
	LoginService loginService;
	@Resource
	OrderProductService orderService;
@Resource
ProductUserService productuserService;
	@RequestMapping("find")
	public String find() {

		return "service_login";

	}
	
	@RequestMapping("expenses")
	public String expenses() {
		return "service_expenses";
		
	}
	
	/*
	 * @RequestMapping("login") public String login() {
	 * 
	 * return "service_product";
	 * 
	 * }
	 */
	 
	
	  @RequestMapping("serviceProduct") 
	  public String serviceProduct() {
	  
	  return "service_product";
	  
	 }
	  @RequestMapping("serviceupdate") 
	  public String serviceupdate() {
	  
	  return "service_update";
	  
	 }
	 
	@RequestMapping("findByName")
	public String findByName(Map<String, Object> map, @RequestParam(defaultValue = "") String name) {
		List<Product> productList = productService.findByName(name);
		map.put("productList", productList);
		map.put("name", name);
		return "service_product";

	}

	@RequestMapping("insert")
	public String insert(Product record) {

		int i = productService.insert(record);
		if (i == 1) {
			return "redirect:../product/findByName";
		} else {
			return "service_error";
		}
	}

	@RequestMapping("delete")
	public String deleteByPrimaryKey(Integer id) {
		int i = productService.deleteByPrimaryKey(id);
		System.out.println("bbbb" + i);
		if (i == 1) {
			return "redirect:../product/findByName";
		} else {
			return "service_error";

		}

	}
	@RequestMapping("updateQ")
	public  String selectByPrimaryKey(Integer id,Model model) throws Exception {
	Product productList = productService.selectByPrimaryKey(id);
	model.addAttribute("productList", productList);
	return "service_update";
	
		
	}
	
	@RequestMapping("update")
	public String updateByPrimaryKey(Product record) {
		int i=productService.updateByPrimaryKey(record);
		if(i==1) {
			return "redirect:../product/findByName";
		}else {
			return "service_error";
		}
	}
	/*
	 * @RequestMapping("fenye") //@RequestParam参数是基本数据类型，不赋初值，容易报错，用此注释默认值 public
	 * String fenYe(Map<String, Object> map, @RequestParam(defaultValue="0")int
	 * pageStart,@RequestParam(defaultValue="2")int pageSize) { List<ProductUser>
	 * sysUserList=orderService.selectByExample(pageStart,pageSize); long
	 * pageCount=orderService.countByExample();
	 * 
	 * map.put("sysUserList",sysUserList); map.put("pageStart",pageStart);
	 * map.put("pageCount",pageCount); map.put("pageSize", pageSize); return
	 * "redirect:../product/findpname";
	 * 
	 * }
	 */
	
	/*
	 * @RequestMapping("findpname") public String findPname(Map<String, Object>
	 * map,@RequestParam(defaultValue = "")String
	 * name,@RequestParam(defaultValue="0")int
	 * pageStart,@RequestParam(defaultValue="2")int pageSize) { List<ProductUser>
	 * orderList=orderService.findPname(name,pageStart, pageSize); long
	 * pageCount=orderService.countByExample(); map.put( "orderList", orderList);
	 * map.put("name",name); map.put("pageStart",pageStart ); map.put("pageSize",
	 * pageSize); map.put("pageCount", pageCount); return "service_orderform";
	 * 
	 * }
	 */
	@RequestMapping("findpname")
	public String findPname(Map<String,Object>map,String name) {
		List<BusinessOrder> orderList=orderService.findPname(name);
		map.put("orderList", orderList);
		map.put("name", name);
		return "service_orderform";
		
	}
	@RequestMapping("store")
	public String  selectByExample(Model model,ProductUserExample example) {
		 List<ProductUser> userList=productuserService.selectByExample(example);
		 ProductUser product=userList.get(0);
		model.addAttribute("product",product);
		return "service_store";
		
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
@ResponseBody
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public Map<String, Object> login(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String code = (String) session.getAttribute("code");
		String imgcode = request.getParameter("img");
		int code1 = 0;
		String tel = request.getParameter("tel");
		Map<String, Object> map = new HashMap<String, Object>();
	
		if (imgcode.toUpperCase().equals(code)) {
			 System.out.println("22"+imgcode);
			List<ProductUser> loginList = loginService.Login(tel);
			System.out.println("tel"+tel);
			System.out.println("1111111111111"+loginList.size());
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
	 
@ResponseBody
@RequestMapping(value = "ab", method = RequestMethod.POST)
public Map<String, Object> repassword(HttpServletRequest request, ProductUser record) {
	System.out.println("11111111111111111");
	HttpSession session = request.getSession();
	String code = (String) session.getAttribute("code");
	String imgcode = request.getParameter("img");
	String tel = request.getParameter("tel");
	int code1 = 0;
	Map<String, Object> map = new HashMap<String, Object>();
	if (imgcode.toUpperCase().equals(code)) {
		List<ProductUser> loginList = loginService.Login(tel);
		ProductUser password = loginList.get(0);
	ProductUser user=new ProductUser();
	user.setPassword(request.getParameter("password"));
	user.setTel(password.getTel());
		if (request.getParameter("password").equals(request.getParameter("password1"))) {
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
}

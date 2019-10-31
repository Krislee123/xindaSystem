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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.datangdu.cn.Util.ImgCodeUtil;
import com.datangdu.cn.model.product.Product;
import com.datangdu.cn.model.product_user.ProductUser;
import com.datangdu.cn.service.LoginService;
import com.datangdu.cn.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductUserController {
	@Resource // 相当于创建对象
	ProductService productService;
	@Resource
	LoginService loginService;

	@RequestMapping("find")
	public String find() {

		return "service_login";

	}
	 @RequestMapping("login") 
	  public String login() {
	  
	  return "service_product";
	  
	 }
	 
	
	  @RequestMapping("serviceProduct") 
	  public String serviceProduct() {
	  
	  return "service_product";
	  
	 }
	 
	@RequestMapping("findByName")
	public String findByName(Map<String, Object> map, @RequestParam(defaultValue = "") String name) {
		List<Product> productList = productService.findByName(name);
		System.out.println("11111" + name);
		map.put("productList", productList);
		map.put("name", name);
		return "service_product";

	}

	@RequestMapping("insert")
	public String insert(Product record) {

		int i = productService.insert(record);
		System.out.println("iiii" + i);
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
		System.out.println("code=:"+code);
		String imgcode = request.getParameter("img");
		System.out.println("tel===="+request.getParameter("tel"));
		 System.out.println("password===="+request.getParameter("password"));
		
		int code1 = 0;
		String tel = request.getParameter("tel");
		Map<String, Object> map = new HashMap<String, Object>();
		// System.out.println(imgcode+"====="+code+"===");
		if (imgcode.toUpperCase().equals(code)) {
			 System.out.println("22"+imgcode);
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

}

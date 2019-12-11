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
import org.springframework.web.bind.annotation.ResponseBody;

import com.datangdu.cn.Util.ImgCodeUtil;
import com.datangdu.cn.administrators.service.AdminService;
import com.datangdu.cn.model.administrators_user.AdministratorsUser;

@Controller
public class PublicController {
	@Resource
	AdminService adminService;
	
	
	@RequestMapping("/re") 
	public String re(HttpServletRequest request) {
		String url = request.getParameter("page");
		System.out.println(url);
		return url;
	}
	@ResponseBody
	@RequestMapping(value = "/login",method= RequestMethod.POST)
	public Map<String,Object> login(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String code = (String)session.getAttribute("code");
		String imgcode = request.getParameter("imgcode");
		System.out.println("getCommodity===="+request.getParameter("phone"));
		System.out.println("getCommodity===="+request.getParameter("password"));
		int code1 = 0;
		String phone = request.getParameter("phone");
		Map<String,Object> map = new HashMap<String,Object>();
		System.out.println(imgcode+"====="+code+"===");
		if(imgcode.toUpperCase().equals(code)) {
			List<AdministratorsUser> loginList = adminService.operator_login(phone);
			AdministratorsUser password = loginList.get(0);
			if(password.getAdministratorsPw().equals(request.getParameter("password"))) {
				code1 = 1;
				map.put("code", code1);
			}
			else {
				map.put("code", code1);
			}
		}else {
			map.put("code", code1);
		}
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value = "/repassword",method= RequestMethod.POST)
	public Map<String,Object> repassword(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String code = (String)session.getAttribute("code");
		String imgcode = request.getParameter("imgcode");
		System.out.println("getCommodity===="+request.getParameter("phone"));
		String phone = request.getParameter("phone");
		int code1 = 0;
		Map<String,Object> map = new HashMap<String,Object>();
		if(imgcode.toUpperCase().equals(code)) {
			List<AdministratorsUser> loginList = adminService.operator_login(phone);
			AdministratorsUser password = loginList.get(0);
			AdministratorsUser user = new AdministratorsUser();
			user.setId(password.getId());
			user.setAdministratorsPh(password.getAdministratorsPh());
			user.setAdministratorsPw(request.getParameter("password"));
			user.setHp(password.getHp());
			user.setMail(password.getMail());
			user.setName(password.getName());
			user.setState(password.getState());
			user.setTs(password.getTs());
			if(request.getParameter("password").equals(request.getParameter("password1"))) {
				adminService.operator_repassword(user);
				code1 = 1;
				map.put("code", code1);
			}
			else {
				map.put("code", code1);
			}
		}
		else {
			map.put("code", code1);
		}
		System.out.println(imgcode+"====="+code+"===");
		return map;
	}
	@RequestMapping("/images")
	public void images(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
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
}

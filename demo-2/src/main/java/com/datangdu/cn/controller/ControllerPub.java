package com.datangdu.cn.controller;

import java.awt.image.RenderedImage;
import java.io.IOException;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;

import com.datangdu.cn.Util.ImgCodeUtil;

public class ControllerPub {
	@RequestMapping("/redirect")
	public String page(HttpServletRequest request) {
		String url = request.getParameter("page");
		System.out.println("tiaozhuan" + url);
		return url;
	}

	
}

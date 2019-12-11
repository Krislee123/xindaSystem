package com.datangdu.cn.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.datangdu.cn.administrators.service.Service_userService;
import com.datangdu.cn.model.service_user.ServiceUser;

@Controller
@RequestMapping("/facilitator")
public class PrivateService_userController {
	@Resource
	Service_userService service_userService;
@RequestMapping("opfac")
public String opfac() {
	
	return "operator_facilitetor";
	
}

	// 服务商启用时
	@ResponseBody
	@RequestMapping(value = "/open", method = RequestMethod.POST) // 拦截open
	public Map<String, Object> open(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>(); // 新建一个map集合
		List<ServiceUser> userList = service_userService.getUser(request); // 执行getUser方法 按住Ctrl 跳转
		ServiceUser user = userList.get(0);
		int i = service_userService.reState(user);
		List<ServiceUser> service_userList = service_userService.getService_user(request); // 调用getService_user方法
																							// 通过服务商状态查询那个 启用时
		map.put("service_userList", service_userList); // 调用map service_userList查出来的东西
		return map; // 返回map集合 回到前台 js
	}

	// 服务商停用时
	@ResponseBody
	@RequestMapping(value = "/close", method = RequestMethod.POST) // 拦截close
	public Map<String, Object> close(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>(); // 新建一个map集合
		List<ServiceUser> userList = service_userService.getUser(request); // 执行geteUser方法 按住Ctrl 跳转
		ServiceUser user = userList.get(0);
		int i = service_userService.reState1(user);
		List<ServiceUser> service_userList = service_userService.getService_user(request); // 调用getService_user方法
																							// 通过服务商状态查询那个 停用时
		map.put("service_userList", service_userList); // 调用map service_userList查出来的东西
		return map; // 返回map集合 回到前台 js
	}

	// 模糊查询和分页
	@ResponseBody
	@RequestMapping(value = "/page", method = RequestMethod.POST) // 拦截page
	public Map<String, Object> page(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>(); // 新建一个map集合
		List<ServiceUser> service_userList = service_userService.selectByPage(request); // 执行selectBypage方法 按住ctrl 跳转
		List<ServiceUser> userList = service_userService.getService_user(request); // 调用getService_user
		map.put("service_userList", service_userList); // 调用put service_userList查出来的东西
		map.put("userList", userList.size());
		map.put("stateList", userList);
		return map; // 返回map集合 回到前台 js
	}
}

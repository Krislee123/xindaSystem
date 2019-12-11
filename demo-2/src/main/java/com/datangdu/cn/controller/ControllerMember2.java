package com.datangdu.cn.controller;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.datangdu.cn.model.member.Member;
import com.datangdu.cn.model.provider_product.ProviderProduct;
import com.datangdu.cn.model.region.Region;
import com.datangdu.cn.model.service_order.ServiceOrder;
import com.datangdu.cn.zservice.MemberService;
import com.datangdu.cn.zservice.ProviderProductService;
import com.datangdu.cn.zservice.RegionService;
import com.datangdu.cn.zservice.ServiceOrderService;

@Controller
@RequestMapping("/ou")
public class ControllerMember2 {
	@Resource
	MemberService mService;
	@Resource
	RegionService rService;
	@Resource
	ServiceOrderService soService;
	@Resource
	ProviderProductService ppService;
	@RequestMapping("aaaa")
	public String aaaa() {
		return "e-commerce_product";
	}
	

	// 运营管理界面显示注册用户列表
	@ResponseBody
	@RequestMapping(value = "/getlist", method = RequestMethod.GET)
	public Map<String, Object> getlist(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Member> mList = mService.getList();
		int pageNum = (mList.size() + 1) / 2; // 计算页数
		map.put("pageNum", pageNum);
//		System.out.println(pageNum);

		map.put("mList", mList);

		String[] str = new String[3];
		for (int i = 0; i < mList.size(); i++) {
			String str8 = "";
			List<Region> rList = rService.getList(mList.get(i).getRegionId());
			str[2] = rList.get(0).getName();
//		System.out.println(str[2]);

			if (rList.get(0).getLevel() == 3) {
				rList = rService.getList(rList.get(0).getParentId());
				str[1] = rList.get(0).getName();
//		System.out.println(str[1]);
			}

			if (rList.get(0).getLevel() == 2) {
				rList = rService.getList(rList.get(0).getParentId());
				str[0] = rList.get(0).getName();
//			System.out.println(str[0]);
			}
			str8 = str[0] + " " + str[1] + " " + str[2];
			str[0] = "";
			str[1] = "";
			str[2] = "";
			System.out.println(str8);
			mList.get(i).setRegionId(str8);
//		System.out.println(rList.get(0).getId());
		}

		return map;
	}

	// 注册用户列表分页
	@ResponseBody
	@RequestMapping(value = "/paging", method = RequestMethod.POST)
	public Map<String, Object> select(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("传入pageSize==" + request.getParameter("pageSize"));
		System.out.println("传入pageNum==" + request.getParameter("pageNum"));
		List<Member> allList = mService.select(request); 	// 得到查询的所有数量
		int pageNum = (allList.size() + 1) / 2; 						// 计算页数
		map.put("pageNum", pageNum);
		List<Member> mList = mService.selectpaging(request);
		System.out.println();
		System.out.println("mList.size()" + mList.size());
		map.put("mList", mList);

		String[] str = new String[3];
		for (int i = 0; i < mList.size(); i++) {
			String str8 = "";
			List<Region> rList = rService.getList(mList.get(i).getRegionId());
			str[2] = rList.get(0).getName();
//			System.out.println(str[2]);

			if (rList.get(0).getLevel() == 3) {
				rList = rService.getList(rList.get(0).getParentId());
				str[1] = rList.get(0).getName();
//			System.out.println(str[1]);
			}

			if (rList.get(0).getLevel() == 2) {
				rList = rService.getList(rList.get(0).getParentId());
				str[0] = rList.get(0).getName();
//				System.out.println(str[0]);
			}
			str8 = str[0] + " " + str[1] + " " + str[2];
			str[0] = "";
			str[1] = "";
			str[2] = "";
//			System.out.println(str8);
			mList.get(i).setRegionId(str8);
//			System.out.println(rList.get(0).getId());
		}

		return map;
	}
	
	//////////////////////////////用户头像
	@ResponseBody	
	@RequestMapping(value="/headImg", produces = MediaType.IMAGE_PNG_VALUE)
	public ResponseEntity<byte[]> headImg(String id) throws Exception{
		System.out.println("tp");
		byte[] imageContent ;
		// 根据id获取当前用户的信息
		Member user = mService.getUserInfo(id);
				        
		imageContent = user.getHeadImg();
		System.out.println("图片==="+user.getHeadImg());
				        
		// 设置http头部信息
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.IMAGE_PNG);
		// 返回响应实体
		return new ResponseEntity<byte[]>(imageContent, headers, HttpStatus.OK);
	}
	
	////////////////////////////////////////////账户设置
	@ResponseBody
	@RequestMapping(value = "/updatexx", method = RequestMethod.POST)
	public Map<String, Object> updatexx(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		if(request.getParameter("sex").equals("0")) {
			map.put("msg","请选择性别");
			return map;
		}
		if(request.getParameter("name").isEmpty()) {
			map.put("msg","请输入姓名");
			return map;
		}
		if(request.getParameter("email").isEmpty()) {
			map.put("msg","请输入邮箱");
			return map;
		}
		int a= mService.updatexx(request);
		if(a==1) {
			map.put("msg","保存成功");
			return map;
		}
		map.put("msg","保存失败");
		return map;
	}
	/////////////////////////////////保存头像
	@ResponseBody
	@RequestMapping(value = "/saveUserImg")
	public Map<Object,Object> saveUserImg(MultipartFile file,String id) {
		Map<Object,Object> result = new HashMap<Object,Object>();
		System.out.println("55555555");
		try {
		// 获取客户端传图图片的输入流
		InputStream ins = file.getInputStream();
		byte[] buffer=new byte[1024];//bit---byte---1k---1m
		int len=0;
		 // 字节输出流
		 ByteArrayOutputStream bos=new ByteArrayOutputStream();
		while((len=ins.read(buffer))!=-1){
			bos.write(buffer,0,len);
		 }
		 bos.flush();
		byte data[] = bos.toByteArray();
		// 调用接口对图片进行存储
		Member member = new Member();
		member.setId(id);
		member.setHeadImg(data);
		mService.saveUserImg(member);
		result.put("code",1);
			result.put("msg", "保存头像成功");
		} catch (Exception e) {
			result.put("code",0);
			result.put("msg", "保存头像失败");
			return result;
//			return "e-commerce_account";
		 }				
//		Map<String,Object> map = new HashMap<String,Object>();
//		map.put("msg", "头像更新失败");
		return result;
	}
	
	//////////////////////////////////////////显示评价页面
	@ResponseBody
	@RequestMapping(value = "/content", method = RequestMethod.POST)
	public Map<String, Object> content(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<ServiceOrder> soList=soService.content(request);
		System.out.println(soList.size());
		List<ServiceOrder> setList=new ArrayList<ServiceOrder>();
		List<ProviderProduct> ppList= ppService.select(request);		//模糊查询查到所有产品id
		System.out.println(request.getParameter("content"));
		
		for(int j=0;j<soList.size();j++) {
			String [] str=soList.get(j).getServiceId().split(",");//str={0003*1,0002*2}
			System.out.println(str[0]);
			System.out.println(str.length);
			String [] str1=new String[10];
			String [] str2=new String[10];
			List<ProviderProduct> pp;
			StringBuffer buf=new StringBuffer();
			//“0002”
			for(int i=0;i<str.length;i++) {
				String [] str3=str[i].split("\\*");	//str3={0003,1}
				pp=ppService.getid(str3[0]);		//查询产品id
				str1[i]=pp.get(0).getServiceContent();		//产品名称存入str1
				str2[i]=str3[1];											//数量存入str2
				System.out.println("结果"+str1[i]+"*"+str2[i]);
				buf.append(str1[i]+"*"+str2[i]+" ");
				soList.get(j).setServiceId(buf.toString());
				System.out.println(buf.toString());
			}
		}
		
		if(request.getParameter("content").equals("1")) {
			for(int i=0;i<soList.size();i++) {
				if(soList.get(i).getContent()==null) {
					ServiceOrder so=new ServiceOrder();
					so.setServiceNo(soList.get(i).getServiceNo());
					so.setServiceId(soList.get(i).getServiceId());
					so.setPpId(soList.get(i).getPpId());
					so.setServiceName(soList.get(i).getServiceName());
					so.setProviderName(soList.get(i).getProviderName());
					System.out.println("yongh=="+so.getServiceId());
					so.setMemberId(soList.get(i).getMemberId());
					so.setServiceNum(soList.get(i).getServiceNum());
					so.setTotalPrice(soList.get(i).getTotalPrice());
					so.setCreateTime(soList.get(i).getCreateTime());
					setList.add(so);
				}
				}
			}else {
				for(int i=0;i<soList.size();i++) {
					if(soList.get(i).getContent()!=null) {
						ServiceOrder so=new ServiceOrder();
						so.setServiceNo(soList.get(i).getServiceNo());
						so.setServiceId(soList.get(i).getServiceId());
						so.setPpId(soList.get(i).getPpId());
						so.setServiceName(soList.get(i).getServiceName());
						so.setProviderName(soList.get(i).getProviderName());
						System.out.println("yongh=="+so.getServiceId());
						so.setMemberId(soList.get(i).getMemberId());
						so.setServiceNum(soList.get(i).getServiceNum());
						so.setTotalPrice(soList.get(i).getTotalPrice());
						so.setCreateTime(soList.get(i).getCreateTime());
						setList.add(so);
					}
					}
			}
			
		
		
//		if(request.getParameter("content").equals("1")) {
//			for(int i=0;i<soList.size();i++) {		//
//			if(soList.get(i).getContent()==null) {
//				String[] str = soList.get(i).getServiceId().split(",");	//00003*2 00004*3
//				for(int j=0;j<str.length;j++) {
//					String[] str2 = str[j].split("\\*"); // str2={00003,2} 00004,3
//					List<ProviderProduct> pp = ppService.getid(str2[0]); // 查询00003产品信息
//					System.out.println("str2[0]"+str2[0]);
//					for(int n=0;n<ppList.size();n++) {
//					if(str2[0].equals(ppList.get(n).getId())) {
//						System.out.println("循环");
//						ServiceOrder so=new ServiceOrder();
//						so.setServiceNo(soList.get(i).getServiceNo());
//						so.setServiceId(pp.get(0).getServiceContent());
//						so.setPpId(ppList.get(n).getId());
//						so.setServiceName(pp.get(0).getServiceName());
//						so.setProviderName(pp.get(0).getProviderName());
//						System.out.println("yongh=="+so.getServiceId());
//						so.setMemberId(soList.get(i).getMemberId());
//						so.setServiceNum(Integer.valueOf(str2[1]));
//						so.setTotalPrice(pp.get(0).getPrice()*Integer.valueOf(str2[1]));
//						so.setCreateTime(soList.get(i).getCreateTime());
//						setList.add(so);
//					}
//					}
//				}
//			}
//			}
//		}else {
//			
//			for(int i=0;i<soList.size();i++) {		//
//				if(soList.get(i).getContent()!=null) {
//					String[] str = soList.get(i).getServiceId().split(",");	//00003*2 00004*3
//					for(int j=0;j<str.length;j++) {
//						String[] str2 = str[j].split("\\*"); // str2={00003,2} 00004,3
//						List<ProviderProduct> pp = ppService.getid(str2[0]); // 查询00003产品信息
//						System.out.println("str2[0]"+str2[0]);
//						for(int n=0;n<ppList.size();n++) {
//						if(str2[0].equals(ppList.get(n).getId())) {
//							System.out.println("循环");
//							ServiceOrder so=new ServiceOrder();
//							so.setServiceNo(soList.get(i).getServiceNo());
//							so.setPpId(str2[0]);
//							System.out.println("456"+so.getPpId());
//							so.setServiceId(pp.get(0).getServiceContent());
//							so.setServiceName(pp.get(0).getServiceName());
//							so.setProviderName(pp.get(0).getProviderName());
//							so.setPpId(ppList.get(n).getId());
//							System.out.println("yongh=="+so.getServiceId());
//							so.setMemberId(soList.get(i).getMemberId());
//							so.setServiceNum(Integer.valueOf(str2[1]));
//							so.setTotalPrice(pp.get(0).getPrice()*Integer.valueOf(str2[1]));
//							so.setCreateTime(soList.get(i).getCreateTime());
//							setList.add(so);
//						}
//						}
//					}
//				}
//				}	
//		}
		System.out.println("hhhhhhhhh"+setList.size());
		map.put("list", setList);
		return map;
	}

	/////评价
	@ResponseBody
	@RequestMapping(value = "/contentsave", method = RequestMethod.POST)
	public Map<String, Object> contentsave(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		ServiceOrder so=new ServiceOrder();
		so.setServiceNo(request.getParameter("serviceno"));
		so.setContent(request.getParameter("content"));
		soService.contentsave(so);
		return map;
	}
	
	///查看评价
	@ResponseBody
	@RequestMapping(value = "/contentsee", method = RequestMethod.POST)
	public Map<String, Object> contentsee(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		ServiceOrder so=new ServiceOrder();
		List<ServiceOrder> solist=soService.getmm(request.getParameter("serviceno"));
		System.out.println(solist.get(0).getContent());
		map.put("msg",solist.get(0).getContent());
		return map;
	}
	
}

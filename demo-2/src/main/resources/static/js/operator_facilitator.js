//自运行
var page = 1;  //定义全局变量
$(function() {
	page = 1; //自运行函数      开始时走这个    自运行
//	location.href = "product"
	$(".stop-content").hide();
	var state = "1";
		$.ajax({
			url:"/facilitator/page",  //拦截路径
			type:"post",  //请求方式    有两种  一种是post  一种是get post比get安全
			data:{
				state: state,   //搜索框内要搜索的东西
				pageNum: 1,     //分页 第几页
				pageSize: 2,     //一页显示多少条数据
			},
			success: function(data){
				console.log("成功")   //查询成功
				console.log(data);   
				var txt = '';    //定义一个变量 指向一个空字符串
				for(var i=0; i<data.service_userList.length; i++){
					
					if(+data.service_userList[i].state == 1){   //正常状态 1
						txt += `<tr>
	                        <td>${data.service_userList[i].name}</td>
	                        <td>${data.service_userList[i].area}</td>
	                        <td>${data.service_userList[i].servicePh}</td>
	                        <td>${data.service_userList[i].adminIntroduction}</td>
							<td>
                            
                            <span class="handle-btn" onclick="close1(${data.service_userList[i].id})"><i class="fa fa-circle-c fa-fw"></i>停用</span>
							</td>
							</tr>`;
						
				
					} 
				}
				$("tbody").append(txt);  //把上面信息加到tbody中
				//分页
				var tat = ` <span onclick="pageOn(1)">首页</span>
							<span onclick="pageOn('-')">上一页</span>`
				for(var j = 0; j<Math.ceil(data.userList/2); j++){   //Math.ceil(data.userList/2) 上取整 最大页
					tat += `<span class="main-pagination-page" id="pagevalue" onclick= "pageOn(${j+1})">${j+1}</span>`
				}
					tat += `<span onclick="pageOn('+')">下一页</span>
					<span onclick="pageOn(Math.ceil(${data.userList/2}))">尾页</span>
					`
				$(".pagez").append(tat);  //实现分页
				
				
			},
			error: function(){  //没成功走这
				console.log("失败")
			}
		})
		
})

//正常里的分页
function pageOn(pageNum){
	if((typeof pageNum) == "number"){  //判断传过来的参数是不是数字
		page = pageNum;   //是数字的话转到page    page就是当前页是第几页
	} else if(pageNum == "+"){  //如果传入的是加号
		page += 1;   //页数加1
		pageNum = page;   //显示当前页数
	}else if(pageNum == "-"){  //如果传入的是减号
		page = page-1;   //页数减1
		pageNum = page;   //显示当前页数
	}
	$.ajax({
		url:"/facilitator/page",   //拦截路径  再之后走controller层
		type:"post",   //请求方式     有两种    一种是post  一个是get   post比get安全  
		data:{
	    	state: 1,    //1状态正常
			name: "",
			pageNum: pageNum,
			pageSize: 2,   //一页展示多少条数据
		},
		success: function(data){   //在controller层走通后 走这 成功后走的地方
			console.log(data);    //该查的查到后  data接收map集合的数据  正常里的分页
			$("tbody").html("");   //往页面上展示
			var txt = '';
			for(var i=0; i<data.service_userList.length; i++){
				
				if(+data.service_userList[i].state == 1){   //1正常状态
					txt += `<tr>
                        <td>${data.service_userList[i].name}</td>
                        <td>${data.service_userList[i].area}</td>
                        <td>${data.service_userList[i].servicePh}</td>
                        <td>${data.service_userList[i].adminIntroduction}</td>
                        <td>
                      
                        <span class="handle-btn" onclick="close1(${data.service_userList[i].id})"><i class="fa fa-circle-c fa-fw"></i>停用</span>
						</td>
                    </tr>`;
				} 
			}
			$("tbody").append(txt); //把信息加到tbody中
		
		},
		error: function(){   //没成功走这
			console.log("失败")
		}
	})
}

//停用里的分页
function pageClose(pageNum){
	if((typeof pageNum) == "number"){  //判断传过来的参数是不是数字
		page = pageNum;   //是数字的话转到page    page就是当前页是第几页
	} else if(pageNum == "+"){  //如果传入的是加号
		page += 1;   //页数加1
		pageNum = page;   //显示当前页数
	}else if(pageNum == "-"){  //如果传入的是减号
		page = page-1;   //页数减1
		pageNum = page;   //显示当前页数
	}
	$.ajax({
		url:"/facilitator/page",  //拦截路径 再之后走controller层
		type:"post",  //请求方式  有两种 一种是post  一种是get  post比get安全
		data:{
			state:0,  //0 停用状态
			name: "",
			pageNum: pageNum,
			pageSize: 2,  //一页显示多少条数据
		},
		success: function(data){  //在controller层走通后走这    成功后走的地方 
			console.log(data);   //该查的查到后 data接收map集合的地方  停用里的分页
			$("tbody").html("");  //往页面上展示
			for(var i=0; i<data.service_userList.length; i++){
				
				if(+data.service_userList[i].state == 0){  //0 停用状态
					var txt = `<tr>
                        <td>${data.service_userList[i].name}</td>
                        <td>${data.service_userList[i].area}</td>
                        <td>${data.service_userList[i].servicePh}</td>
                        <td>${data.service_userList[i].adminIntroduction}</td>
                        
                        `;
					txt += `<td>
                       
                        <span class="handle-btn open" onclick="open1('${data.service_userList[i].id}')"><i class="fa fa-circle-c fa-fw"></i>启用</span>
                    </td>
                    </tr>`;
					
			
				} 
					$("tbody").append(txt);  //把上面的信息加到tbody中
			}
		
		},
		error: function(){  //没成功走这
			console.log("失败")
		}
	})
}

//find1 click点击事件    正常里的查询
$(".find1").on("click",function(){
	var name = $(".username").val();
	$.ajax({
		url:"/facilitator/page",  //拦截路径 再之后走controller层
		type:"post",  //同时 请求方式 有两种 一种是post 一种是get  post比get安全
		data:{
			name: name,  //搜索框内要搜索的东西
			pageNum: 1,  //分页 第几页
			pageSize: 2,  //一页展示多少条数据
		},
		success: function(data){  //在controller层走通后执行这块   成功之后走的地方
			console.log(data);  //该查的查到后 data接收map集合的数据
			$("tbody").html("");  //往页面上展示
			var txt ='';
			for(var i=0; i<data.service_userList.length; i++){
				
				if(+data.service_userList[i].state == 1){  //1 正常状态
					txt += `<tr>
                        <td>${data.service_userList[i].name}</td>
                        <td>${data.service_userList[i].area}</td>
                        <td>${data.service_userList[i].servicePh}</td>
                        <td>${data.service_userList[i].adminIntroduction}</td>
						<td>
                      
                        <span class="handle-btn open" onclick="open1('${data.service_userList[i].id}')"><i class="fa fa-circle-c fa-fw"></i>启用</span>
						</td>
						</tr>`;
					
			
				}
			}
			$("tbody").append(txt); //把上面信息加到tbody中
			$(".pagez").html("");  //实现分页
			var tat = ` <span onclick="pageOn(1)">首页</span>
				<span onclick="pageOn('-')">上一页</span>`
			for(var j = 0; j<(data.service_userList.length/2); j++){
				tat += `<span class="main-pagination-page" onclick= "pageOn(${j+1})">${j+1}</span>`
			}
				tat += `<span onclick="pageOn('+')">下一页</span>
				<span onclick="pageOn(Math.ceil(${data.service_userList.length/2}))">尾页</span>
				`
			$(".pagez").append(tat);  //往html中添加分页
		
		},
		error: function(){   //没成功走这
			console.log("失败")
		}
	})
})

//停用   里的查询
$(".find2").on("click",function(){
	var name = $(".username1").val();
	$.ajax({
		url:"/facilitator/page",  //拦截路径 再之后走controller层
		type:"post",  //请求方式 有两种 一种是post一种是get post比get安全
		data:{
			name: name,  //搜索框内要搜索的东西
			pageNum: 1, //分页 第几页
			pageSize: 2,  //一页展示多少条数据
		},
		success: function(data){  //在controller层走通后 走这
			console.log(data);  //该查的查到后 data接收map集合的数据
			$("tbody").html("");  //往页面上展示
			var txt ='';
			for(var i=0; i<data.service_userList.length; i++){
				
				if(+data.service_userList[i].state == 0){  //0 停用状态
					txt += `<tr>
                        <td>${data.service_userList[i].name}</td>
                        <td>${data.service_userList[i].area}</td>
                        <td>${data.service_userList[i].servicePh}</td>
                        <td>${data.service_userList[i].adminIntroduction}</td>
						<td>
                        
                        <span class="handle-btn open" onclick="open1('${data.service_userList[i].id}')"><i class="fa fa-circle-c fa-fw"></i>启用</span>
						</td>
						</tr>`;
					
			
				}
			}
			$("tbody").append(txt);  //把上面的信息加到tbody中
			$(".pagez").html("");  //实现分页
			var tat = ` <span>首页</span>
				<span>上一页</span>`
			for(var j = 0; j<(data.service_userList.length/2); j++){
				tat += `<span class="main-pagination-page" onclick= "pageOn(${j+1})">${j+1}</span>`
			}
				tat += `<span>下一页</span>
				<span>尾页</span>
				`
			$(".pagez").append(tat);  //往html中添加分页
		
		},
		error: function(){  //没成功走这
			console.log("失败")
		}
	})
})

$(".user-arrow-down").on("click",function(){
    if($(".dropdown").is(":hidden")){
        $(".dropdown").show();
 }else{
       $(".dropdown").hide();
 }
})

//正常用户分页
$(".order1").on("click", function(){
    $(".main-content").show();
    $(".stop-content").hide();
    $("table").show();
    $(".main-sercive").hide();
    $(".order1").addClass("border-red");
    $(".order2").removeClass("border-red");
    $(".main-top li").eq(3).text("正常用户");
    var state = "1";
    $.ajax({
		url:"/facilitator/page",  //拦截路径 再之后走controller层
		type:"post",  //请求方式 有两种 一个是post 一个是get  post比get安全
		//往后台传参
		data:{
			state: state,  
			pageNum: 1,  //分页 第几页
			pageSize: 2,  //一页展示多少条数据
		},
		success: function(data){  //在controller层走通后走这 
			console.log("成功")
			console.log(data);  //该查的查到后  data接收map集合的数据
			$("tbody").html("");  //往页面上展示
			for(var i=0; i<data.service_userList.length; i++){
				
				if(+data.service_userList[i].state == 1){  //1正常状态
					var txt = `<tr>
                        <td>${data.service_userList[i].name}</td>
                        <td>${data.service_userList[i].area}</td>
                        <td>${data.service_userList[i].servicePh}</td>
                        <td>${data.service_userList[i].adminIntroduction}</td>
                        
                        `;
					txt += `<td>
                       
                        <span class="handle-btn" onclick="close1('${data.service_userList[i].id}')"><i class="fa fa-circle-c fa-fw"></i>停用</span>
                    </td>
                    </tr>`;
					
			
				} 
					$("tbody").append(txt);  //把上面的信息加到tbody中
			}
			$(".pagez").html("");  //实现分页
			var tat = ` <span onclick= "pageOn(1)">首页</span>
				<span  onclick="pageOn('-')">上一页</span>`
			for(var j = 0; j<(data.stateList.length/2); j++){
				tat += `<span class="main-pagination-page" onclick= "pageOn(${j+1})">${j+1}</span>`
			}
				tat += `<span  onclick="pageOn('+')">下一页</span>
				<span  onclick="pageOn(Math.ceil(${data.stateList.length/2}))">尾页</span>
				`
			$(".pagez").append(tat);  //往html中添加分页
			
		},
		error: function(){  //没成功走这
			console.log("失败")
		}
	})
})

//停用用户分页
$(".order2").on("click", function(){
    $(".main-content").hide();
    $(".stop-content").show();
    $("table").show();
    $(".main-sercive").hide();
    $(".order2").addClass("border-red");
    $(".order1").removeClass("border-red");
    $(".main-top li").eq(3).text("停用用户");
    var state = "0";   //0 停用用户
    $.ajax({
		url:"/facilitator/page", //拦截路径
		type:"post",    //请求方式 有两种 一种是post 一种是type   post比type安全 
		data:{
			state: state,   //搜素框内要搜索的东西
			pageNum: 1,   //分页 第几页
			pageSize: 2,   //一页显示多少条数据
		},
		success: function(data){
			console.log("成功")   //查询成功
			console.log(data);  //该查的查到后 data接收map集合的数据
			$("tbody").html("");  //往页面上显示
			for(var i=0; i<2; i++){
				
				if(+data.stateList[i].state == 0){  //0 停用状态
					var txt = `<tr>
                        <td>${data.stateList[i].name}</td>
                        <td>${data.stateList[i].area}</td>
                        <td>${data.stateList[i].servicePh}</td>
                        <td>${data.stateList[i].adminIntroduction}</td>
                        
                        `;
					txt += `<td>
                 
                        <span class="handle-btn" onclick="open1('${data.stateList[i].id}')"><i class="fa fa-circle-c fa-fw"></i>启用</span>
                    </td>
                    </tr>`;
					
			
				} 
					$("tbody").append(txt);  //把上面信息加到tbody中
			}
			$(".pagez").html("");  //实现分页
			var tat = ` <span onclick="pageOn(1)">首页</span>
				<span onclick="pageOn('-')">上一页</span>`
			for(var j = 0; j<(data.stateList.length/2); j++){
				tat += `<span class="main-pagination-page" onclick= "pageClose(${j+1})">${j+1}</span>`
			}
				tat += `<span onclick="pageOn('+')">下一页</span>
				<span onclick="pageOn(Math.ceil(${data.stateList.length/2}))">尾页</span>
				`
			$(".pagez").append(tat);  //往html中添加分页
		},
		error: function(){   //没成功走这
			console.log("失败")
		}
	})
})

//停用页面 实现停用函数
function open1(id){
	var state = "0";  //0 停用状态
	$.ajax({
		url:"/facilitator/open",  //拦截路径
		type:"post",     //请求方式 有两种 一种是post 一种是get post比get安全
		data:{
			id: id,
			state: state,
		},
		success: function(data){  //在controller走通后 执行这块 成功后走的地方
			console.log("成功")
			console.log(data);  //该查的查到后
			$("tbody").html("");  // 往页面上展示
			for(var i=0; i<data.service_userList.length; i++){
				
				if(+data.service_userList[i].state == 0){  //停用状态 0
					var txt = `<tr>
                        <td>${data.service_userList[i].name}</td>
                        <td>${data.service_userList[i].area}</td>
                        <td>${data.service_userList[i].servicePh}</td>
                        <td>${data.service_userList[i].adminIntroduction}</td>
                        
                        `;
					txt += `<td>
                     
                        <span class="handle-btn" onclick="open1(data.service_userList[i].id)"><i class="fa fa-circle-c fa-fw"></i>启用</span>
                    </td>
                    </tr>`;
					
			
				} 
			
				
					$("tbody").append(txt); //把上面的信息加到tbody中
			}
			location.href = "re?page-operator_facilitator" 
			
		}, 
		error: function(){  //没成功走这
			console.log("失败")
		}
	})
	
}

//启用页面 实现启用函数
function close1(id){
	var state = "1";
	$.ajax({
		url:"/facilitator/close",  //拦截路径
		type:"post",  //请求方式  有两种 一种是post 一种是get post比get安全
		//往后台传参
		data:{
			id: id,
			state: state,
		},
		success: function(data){  //在controller层走通后走这    成功后走的地方
			console.log("成功")
			console.log(data);
			$("tbody").html("");   //往页面上展示
			var txt = '';
			for(var i=0; i<data.service_userList.length; i++){
				
				if(+data.service_userList[i].state == 1){  //1 启用状态
					txt += `<tr>
                        <td>${data.service_userList[i].name}</td>
                        <td>${data.service_userList[i].area}</td>
                        <td>${data.service_userList[i].servicePh}</td>
                        <td>${data.service_userList[i].adminIntroduction}</td>
                        <td>
                       
                        <span class="handle-btn" onclick="close1(${data.service_userList[i].id})"><i class="fa fa-circle-c fa-fw"></i>停用</span>
						</td>
						</tr>`;
					
				}
				$("tbody").append(txt); //把上面信息加到tbody中
	
			}
			
			location.href = "re?page-operator_facilitator" 

			
		},
		error: function(){  //没成功走这
			console.log("失败")
		}
	})
	
}

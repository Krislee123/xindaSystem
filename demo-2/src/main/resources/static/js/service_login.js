

$(".code1").on("click", function() {
	var img = document.getElementsByClassName("code1")[0];
	var time = new Date().getTime();
	img.src = "images?t=" + time;
})

// 自运行
$(function() {
	var img = document.getElementsByClassName("code1")[0];
	var time = new Date().getTime();
	img.src = "images?t=" + time;
})

$(".login-btn").on("click", function() {
	
	var tel = $(".tel").val();
var password = $(".password").val();
	var imgcode = $(".code").val();
	//alert(password);
	if(tel =="" || tel == null ){
		window.alert("手机号不能为空");
		$("#msg").css("display", "block");
        $("#msg").text("手机号不能为空!!!");
	}else if(password=="" || password == null){
		window.alert("密码不能为空");
		$("#msg").css("display", "block");
        $("#msg").text("密码不能为空!!!");
	}else if(imgcode =="" || imgcode==null ){
		window.alert("验证码不能为空");
		$("#msg").css("display", "block");
        $("#msg").text("验证码不能为空!!!");
	}else{
$.ajax({
	type : "post",
	// 请求路径
	url : "../products/login",
	// 请求参数
	data : {
		img : imgcode,
		tel : tel,
			password : password,
			
		},
		
	// 返回数据类型
	// 请求成功后调用函数
	success : function(data) {
		//console.log("成功后返回数据", data);
		if (data.code == 1) {
			location.href = "../products/findByName?tel="+tel;
		} else {
			alert("信息输入错误!");
				location.href = "service_login"
		}
		},
		// 请求失败后调用函数
		error : function(data) {
			console.log("失败后返回数据", data);
		}
	})
	}
})



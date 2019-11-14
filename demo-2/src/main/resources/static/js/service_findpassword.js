

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
	var password1 = $(".password1").val();
$.ajax({
	type : "post",
	// 请求路径
	url : "../product/ab",
	// 请求参数
	data : {
		img : imgcode,
		tel : tel,
			password : password,
			password1 : password1,
		},
		
	// 返回数据类型
	// 请求成功后调用函数
	success : function(data) {
		//console.log("成功后返回数据", data);
		if (data.code == 1) {
			location.href = "../product/find"
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
	
})


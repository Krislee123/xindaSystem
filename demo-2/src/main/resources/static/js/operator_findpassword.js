$(function() {
	var img = document.getElementsByClassName("codeimg")[0];
	var time = new Date().getTime();
	img.src = "images?t=" + time;
})

$(".codeimg").on("click", function() {
	var img = document.getElementsByClassName("codeimg")[0];
	var time = new Date().getTime();
	img.src = "images?t=" + time;
})


$(".login-btn").on("click", function(){
	var phone = $(".phone").val();
	var imgcode = $(".code").val();
	var password = $(".password").val();
	var password1 = $(".password1").val();
	$.ajax({
		//请求类型
		type:"post",
		//请求路径
		url:"/repassword",
		//请求参数
		data:{
			phone: phone,
			password: password,
			imgcode: imgcode,
			password1: password1,
		},
		//返回数据类型
		//请求成功后调用函数
		success: function(data){
			console.log("成功后返回数据",data);
			if(data.code == 1){
				location.href = "re?page=operator_login"
			}
			else{
				alert("密码修改失败!");
				location.href = "re?page=operator_findpassword"
			}
			
		},
		//请求失败后调用函数
		error: function(data){
			console.log("失败后返回数据",data);
			//location.href = "re?page=operator_findpassword"
		}
	})
})
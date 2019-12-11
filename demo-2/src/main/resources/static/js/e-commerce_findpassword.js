$(".login-btn").on("click", function(){
	var cellphone=$(".cellphone").val();
	var password1=$(".password1").val();
	var password2=$(".password2").val();
	var code=$(".code").val();
	

	console.log("手机号==",cellphone);
	$.ajax({
		type: "post",
		url: "/ec/findpassword",
		data:{
			cellphone:cellphone,
			password1:password1,
			password2:password2,
			code:code,
		},
		dataType: "json",
		success: function(data){
			console.log("成功后返回的数据",data);
			alert(data.msg);
			if(data.stu==1){
			location.href="redirect?page=e-commerce_findpassword"
			}
		},
		error: function(data){
			console.log("失败后返回的数据",data);
		}
	})
})

    		
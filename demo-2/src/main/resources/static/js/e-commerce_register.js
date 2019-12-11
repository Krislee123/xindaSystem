
$(function() {
	var img = document.getElementsByClassName("img")[0];
	img.src = "imgGetCode";
})
function imgChange() {
	var img = document.getElementsByClassName("img")[0];
	var time = new Date().getTime();
	img.src = "imgGetCode?t=" + time;
}


$(function(){
	$.ajax({
		type: "post",
		url: "/ec/sheng",
		dataType: "json",
		success: function(data){
			var sheng = data.sheng;
			console.log("成功后返回的数据",sheng);
			$("#sheng").html("");
			txt="";
			txt +=`<option value="">省</option>`
			for(var i = 0;i<sheng.length;i++){
				txt +=`
                        <option onclick="shengid('${sheng[i].id}')"  value="${sheng[i].id}">${sheng[i].name}</option>`
			}
			$("#sheng").append(txt);
			$("#shi").html("");
			txt="";
			txt +=`<option value="">市</option>`
			$("#shi").append(txt);
			$("#qu").html("");
			txt="";
			txt +=`<option value="">区</option>`
			$("#qu").append(txt);
			
		},
		error: function(data){
			console.log("失败后返回的数据",data);
		}
	})
})

function changesheng(){
	var id = $("#sheng").val();
	console.log("省",id);
	$.ajax({
		type: "post",
		url: "/ec/shi",
		data:{
			id:id,
		},
		dataType: "json",
		success: function(data){
			var shi = data.shi;
			$("#shi").html("");
			txt="";
			txt +=`<option value="">市</option>`
			for(var i = 0;i<shi.length;i++){
				txt +=`
                        <option class="shiid" value="${shi[i].id}">${shi[i].name}</option>`
			}
			$("#shi").append(txt);
			$("#qu").html("");
			txt="";
			txt +=`<option value="">区</option>`
			$("#qu").append(txt);
		},
		error: function(data){
			console.log("失败后返回的数据",data);
		}
	})
}


function changeshi(){
	var id = $("#shi").val();
	console.log("市id",id);
	$.ajax({
		type: "post",
		url: "/ec/qu",
		data:{
			id:id,
		},
		dataType: "json",
		success: function(data){
			var qu = data.qu;
			$("#qu").html("");
			txt="";
			txt +=`<option value="">区</option>`
			for(var i = 0;i<qu.length;i++){
				txt +=`
                        <option class="quid" value="${qu[i].id}">${qu[i].name}</option>`
			}
			$("#qu").append(txt);
		},
		error: function(data){
			console.log("失败后返回的数据",data);
		}
	})
}

$(".login-btn").on("click",function(){
	var sheng = $("#sheng").val();
	var shi = $("#shi").val();
	var qu = $("#qu").val();
	console.log(sheng,shi,qu);
	
	var cellphone = $("#cellphone").val();
	var password = $("#password").val();
	var code = $(".code").val();
	
	
	$.ajax({
		type: "post",
		url: "/ec/register",
		data:{
			cellphone:cellphone,
			password:password,
			code:code,
			qu:qu,
		},
		dataType: "json",
		success: function(data){
			console.log("成功后返回的数据",data);
			alert(data.msg);
			if(data.status==1){
				 location.href="redirect?page=e-commerce_login"
				}
		},
		error: function(data){
			console.log("失败后返回的数据",data);
		}
	})
	
	
	
})


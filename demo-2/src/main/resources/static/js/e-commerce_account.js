var sex=0;


$(function(){
	img();
	login();
	userinfo();
	cartnum();
})


function cartnum(){
	var cartnum=sessionStorage.getItem("cartnum");
	$(".cartnum").html("");
	var txt="";
	txt +=cartnum
  	$(".cartnum").append(txt);
}

//修改密码
$(".save1").on("click", function () {
	var name=$(".name").val();
	var email=$(".email").val();
	var userid=sessionStorage.getItem("id");
	$.ajax({
		type: "post",
		url: "/ou/updatexx",
		data:{
			name:name,
			email:email,
			sex:sex,
			userid:userid,
		},
		dataType: "json",
		success: function(data){
			alert(data.msg);
			 sessionStorage.setItem("name",name);
			 location.href="redirect?page=e-commerce_account"
		},
		error: function(data){
			console.log("失败后返回的数据",data);
		}
	})
})

function userinfo(){
	var userid=sessionStorage.getItem("id")
	var username=sessionStorage.getItem("name")
	$(".userinfo").html("");
	var txt="";
	txt +=`
	<img class="btn btn-primary" src="/ou/headImg?id=${userid}" onerror="defaultImg(this)" style="
    width: 95px;
    height: 95px;
    display: inline-block;
    border: 1px solid #e1e1e1;
	"/>
<p>${username}</p>
	`
	$(".userinfo").append(txt);
}

function img(){
	var userid=sessionStorage.getItem("id")
	$(".img").html("");
	var txt="";
	txt +=`<label for="file" class="btn btn-primary" style="height: 30px;width: 180px;margin-right: 20px">
	<img class="btn btn-primary" src="/ou/headImg?id=${userid}" onerror="defaultImg(this)" style="
    width: 50px;
    height: 50px;
    display: inline-block;
    border: 1px solid #e1e1e1;
	"/>
	</label>
	<input  name="id" type="hidden" value="${userid}"/>
	`
	$(".img").append(txt);
}

//头像
function defaultImg(img){
		img.src="/images/user-lg.png";
}

$("#form1").ajaxForm(function(data) {
	console.log(data);
	location.href="redirect?page=e-commerce_account"
	console.log("str:" + JSON.stringify(data));
	}
);

function login(){
	var userid=sessionStorage.getItem("id");
	var username=sessionStorage.getItem("name");
	var status=sessionStorage.getItem("status");
	console.log(username);
	if(status!=1){
		alert("请先登录");
		 location.href="redirect?page=e-commerce_login"
	}
	
	$("#sysuser").html("");
	var txt="";
	txt +=username
	$("#sysuser").append(txt);
}
$(".user-quit").on("click", function () {
	sessionStorage.setItem("status",2);
})

$(".radio1").on("click", function () {
	sex=1;
})
$(".radio2").on("click", function () {
	sex=2;
})

$(".search-product").on("click", function () {
    $(".search-product").addClass("font-aqua");
    $(".search-service").removeClass("font-aqua");
})
$(".search-service").on("click", function () {
    $(".search-service").addClass("font-aqua");
    $(".search-product").removeClass("font-aqua");
})

$(".banner a").on("click", function (event) {
    $(".banner a").removeClass("border-b");
    $(event.target).addClass("border-b");
})

$(".user-action a").on("click", function (event) {
    $(".user-action a").removeClass("bg-gray");
    $(event.target).addClass("bg-gray");
})
$(".content-nav li").on("click", function (event) {
    $(".content-nav li").removeClass("nav-active");
    $(event.target).addClass("nav-active");
})

$(".content-banner li").eq(0).on("click", function (event) {
    $(".content-banner li").removeClass("border-b1");
    $(event.target).addClass("border-b1");
    $(".change-password").hide();
    $(".account-info").show();
})
$(".content-banner li").eq(1).on("click", function (event) {
    $(".content-banner li").removeClass("border-b1");
    $(event.target).addClass("border-b1");
    $(".change-password").show();
    $(".account-info").hide();
})


$(".save").on("click", function(){
	var password=$("#password").val();
	var password1=$("#password1").val();
	var password2=$("#password2").val();
	console.log("成功后返回的数据",password);
	var userid=sessionStorage.getItem("id")
	$.ajax({
		type: "post",
		url: "/login/updatepassword",
		data:{
			userid:userid,
			password:password,
			password1:password1,
			password2:password2,
		},
		dataType: "json",
		success: function(data){
			console.log("成功后返回的数据",data);
			alert(data.msg);
			if(data.code==1){
			location.href="redirect?page=e-commerce_account"
			}
		},
		error: function(data){
			console.log("失败后返回的数据",data);
		}
	})
})



$(".search-product").on("click", function(){
    $(".search-product").addClass("font-aqua");
    $(".search-service").removeClass("font-aqua");
})
$(".search-service").on("click", function(){
    $(".search-service").addClass("font-aqua");
    $(".search-product").removeClass("font-aqua");
})

$(".banner a").on("click", function(event){
    $(".banner a").removeClass("border-b");
    $(event.target).addClass("border-b");
})

$(".content-nav li").on("click", function(event){
    $(".content-nav li").removeClass("nav-active");
    $(event.target).addClass("nav-active");
})
var index="id"

$( function(){
	list5();
})
	
function list5(){
	var userid=sessionStorage.getItem("id")
	    $.ajax({
	                url: "/product/gmgm",
	                type: "post",
	              dataType:"json",
	              data:{
	            	  userid:userid,
	            	  index:index,
	              },
	              success:function(data){
	      			console.log("成功后返回的数据",userid);
	    			var username=sessionStorage.getItem("name")
	    	          	console.log("成功后返回的数据",data);
	    	          	login();
	    	          	sessionStorage.setItem("cartnum",data.cartnum);
	    	        //	alert(data.msg);
	    	          	var providerProductInfo=data.providerProductInfo;
	    	          			cartnum();
	    	        	$(".list").html("");
	    	          	var txt="";
	    	          	for(var i=0;i<providerProductInfo.length;i++){
	    	          		if(providerProductInfo[i].status==1){
	    	          		txt+= `    	          		
	    	          		    <div class="article" value="${providerProductInfo[i].id}">	    	          		    
	    	          		    <img class="ss" src="/pp/headImg2?id=${providerProductInfo[i].id}" onerror="defaultImg(this)" style="
    width: 50px;
    height: 50px;
    display: inline-block;
    border: 1px solid #e1e1e1;
	"/>
            <ul class="article-info">
                <li>${providerProductInfo[i].serviceName}</li>
                <li>${providerProductInfo[i].serviceContent}</li>
                <li>${providerProductInfo[i].providerName}</li>
            </ul>
            <ul class="article-price">
                <li>￥${providerProductInfo[i].price}	</li>
                <li>
                    <a onclick="buy('${providerProductInfo[i].id}','${providerProductInfo[i].serviceContent}','${providerProductInfo[i].price}')">立即购买</a>
                    <a onclick=zt('${providerProductInfo[i].id}')>  加入购物车</a>
                  
                </li>     
            </ul></div>  `;
	    	          	}
	    	          	}
	    	        	$(".list").append(txt);
	                },
	            		error:function(data){
			console.log("失败返回后的数据",data);	
		}              
	})
}
	
function list6(){
	console.log("查询内容",$(".select").val());
	var name=$(".select").val();
	    $.ajax({
	                url: "/product/select",
	                type: "get",
		data:{
			name:name,
			index:index,
		},
	              dataType:"json",
	              success:function(data){
	      			var userid=sessionStorage.getItem("id")
	      			console.log("成功后返回的数据",userid);
	    			var username=sessionStorage.getItem("name")
	    	          	console.log("成功后返回的数据",data);
	    	        //	alert(data.msg);
	    	          	var providerProductInfo=data.providerProductInfo;
	    	        	$(".list").html("");
	    	          	var txt="";
	    	          	for(var i=0;i<providerProductInfo.length;i++){
	    	          		txt+= `    	          		
	    	          		    <div class="article" value="${providerProductInfo[i].id}">	    	          		    
	    	          		   <img class="ss" src="/pp/headImg2?id=${providerProductInfo[i].id}" onerror="defaultImg(this)" style="
    width: 50px;
    height: 50px;
    display: inline-block;
    border: 1px solid #e1e1e1;
	"/>
            <ul class="article-info">
                <li>${providerProductInfo[i].serviceName}</li>
                <li>${providerProductInfo[i].serviceContent}</li>
                <li>${providerProductInfo[i].providerName}</li>
            </ul>
            <ul class="article-price">
                <li>￥${providerProductInfo[i].price}	</li>
                <li>
                    <a onclick="buy('${providerProductInfo[i].id}','${providerProductInfo[i].serviceContent}','${providerProductInfo[i].price}')">立即购买</a>
                    <span onclick=zt('${providerProductInfo[i].id}')>  加入购物车</span>
                  
                </li>     
            </ul></div>  `;
	    	          	}
	    	        	$(".list").append(txt);
	                },
	            		error:function(data){
			console.log("失败返回后的数据",data);	
		}              
	})
}

//模糊查询
$(".search-btn").on("click",function(){
	list6();
})

$(".price ").on("click", function(id){
	index="price";
	list6();
})

$(".id ").on("click", function(id){
	index="id";
	list6();
})


//网页得到id
 function zt(id){
	console.log("id",id);
	var userid=sessionStorage.getItem("id")
	var username=sessionStorage.getItem("name")
	console.log("zt",id,userid);
	$.ajax({
		type: "post",
		url: "/product/jkk",			
		data:{
			id:id,
			userid:userid,
		},
		dataType: "json",
		success: function(data){

			console.log("成功后返回的数据",data);
			 location.href="redirect?page=e-commerce_shoping-car"
				
		},error: function(data){
			console.log("失败后返回的数据",data);
		}
	})
}

function cartnum(){
	var cartnum=sessionStorage.getItem("cartnum");
	$(".cartnum").html("");
	var txt="";
	txt +=cartnum
  	$(".cartnum").append(txt);
}

function login(){
	var userid=sessionStorage.getItem("id");
	var username=sessionStorage.getItem("name");
	var status=sessionStorage.getItem("status");
	console.log(userid);
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

function buy(id,service_content,price){
	sessionStorage.setItem("cars",id,);
	sessionStorage.setItem("num1",1,);
	sessionStorage.setItem("carsname",service_content,);
	sessionStorage.setItem("totalprice1",price);
	 location.href="redirect?page=e-commerce_settlement"
}

//图像展示
function defaultImg(img){
	img.src="/images/user-lg.png";
}




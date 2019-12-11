$(".payment li").eq(1).on("click", function(){
    location.href="redirect?page=e-commerce_order";
})

var paytype=0;

//通过去结算网页得到商品
$( function(){

	var userid=sessionStorage.getItem("id")
	var username=sessionStorage.getItem("name")
    var cars=sessionStorage.getItem("cars")
	var num1=sessionStorage.getItem("num1")
	var serviceName=sessionStorage.getItem("carsname")
	var totalprice1=sessionStorage.getItem("totalprice1")
			console.log("cars",cars);
	
var str=cars.split(',');
console.log("cars",str.length);
for(var i=0;i<str.length;i++){
	console.log("cars",str[i]);
}

var str1=num1.split(',');
console.log("num1",str1.length);
for(var i=0;i<str1.length;i++){
	console.log("num1",str1[i]);
}

var str2=serviceName.split(',');
var str3="";
console.log("serviceName",str2.length);
for(var i=0;i<str2.length;i++){
	console.log("serviceName",str2[i]);
	str3+=str2[i]+"*"+str1[i]+" ";
}
console.log("serviceName",str3);

var str4="";
for(var i=0;i<str.length;i++){
	console.log("cars",str[i]);
	if(i<str.length-1){
	str4+=str[i]+"*"+str1[i]+",";
	}else{
	str4+=str[i]+"*"+str1[i]
	}
}

var nn=RndNum(16);
var mm=CurentTime();
console.log("44444444444",mm);
	$.ajax({
		type: "post",
		url: "/product/ggg",			
		data:{
	
			userid:userid,
			cars:cars,
			num1:num1,
			str4:str4,
			totalprice1:totalprice1,
			 nn: nn,
			 mm:mm,
			 
		},
		dataType: "json",
		success: function(data){

			console.log("成功返回后的数据",data);

			$(".list1").html("");
			var txt="";

				txt+=`
			        <ul class="merchandise">
		     <li>
             订单编号：<span class="font-aqua">${nn}</span>
            </li>
            <li>创建时间：${ CurentTime()}</li>
            <li>订单明细：${str3}</li>
             <li>订单总额：¥${totalprice1}</li>
			</ul>
				 `;	
			$(".list1").append(txt);
		     sessionStorage.setItem("str3",str3);
		     sessionStorage.setItem("nn",nn);
		     sessionStorage.setItem("mm",mm);
			console.log("成功后返回的数据",data);
			// location.href="redirect?page=e-commerce_settlement"
		},error: function(data){
			console.log("失败后返回的数据",data);
		}
	})
})



//产生随机数函数
 function RndNum(n){
     var rnd="";
     for(var i=0;i<n;i++)
         rnd+=Math.floor(Math.random()*10);
     return rnd;
 }


//结算时间
function CurentTime()
{ 
    var now = new Date();
    var year = now.getFullYear();       //年
    var month = now.getMonth() + 1;     //月
    var day = now.getDate();            //日 
//    var hh = now.getHours();            //时
//    var mm = now.getMinutes();          //分  
    var clock = year + "-";
    if(month < 10)
        clock += "0";
    clock += month + "-";  
    if(day < 10)
        clock += "0";  
    clock += day + " ";   
//    if(hh < 10)
//        clock += "0";     
//    clock += hh + ":";
//    if (mm < 10) clock += '0'; 
//    clock += mm; 
    return(clock); 
} 


//选择支付类型
$(".radio1").on("click",function(){	
	      paytype=1;
	})
	
//选择支付类型
$(".radio2").on("click",function(){	
	      paytype=2;
	})
//选择支付类型
$(".radio3").on("click",function(){	
	      paytype=3;
	})
	
	
$(".pay2").on("click",function(){	
	      var nn=sessionStorage.getItem("nn")
//var	nn=sessionStorage.getItem("serviceNo")
if(paytype==0){
	alert("请选择支付方式");
}else{
	$.ajax({
		type: "post",
		url: "/product/hhh",	
		data:{
	nn:nn,
	paytype:paytype, 
		},
		dataType: "json",
		success: function(data){

			console.log("成功返回后的数据",data);
alert(data.msg);
if(data.code==1){
	 location.href="redirect?page=e-commerce_order"
}
			// location.href="redirect?page=e-commerce_settlement"
		},error: function(data){
			console.log("失败后返回的数据",data);
		}
	})}
	
	})


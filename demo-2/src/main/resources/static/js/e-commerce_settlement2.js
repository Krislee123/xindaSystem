$(".payment li").eq(1).on("click", function(){
    location.href="redirect?page=e-commerce_order";
})

var paytype=0;

//通过去结算网页得到商品
$( function(){
	var serviceNo=sessionStorage.getItem("serviceNo")
	$.ajax({
		type: "post",
		url: "/product/sss",			
		data:{
	serviceNo:serviceNo,
		},
		dataType: "json",
		success: function(data){

			console.log("成功返回后的数据",data);

			$(".list1").html("");
		   	var list=data.list;
			var txt="";
	       	for(var i=0;i<list.length;i++){
				txt+=`
			        <ul class="merchandise">
		     <li>
             订单编号：<span class="font-aqua">${serviceNo}</span>
            </li>
            <li>创建时间：${ list[i].createTime}</li>
            <li>订单明细：${list[i].serviceId}</li>
             <li>订单总额：¥${list[i].totalPrice}</li>
			</ul>
				 `};	
			$(".list1").append(txt);
			
		/*	var txt="";
			$(".payment").html("");
				txt+=`
			<li><a href="redirect?page=e-commerce_order" >支付</a></li>`
					$(".payment").append(txt);*/
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
//	      var nn=sessionStorage.getItem("nn")
var	nn=sessionStorage.getItem("serviceNo")
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


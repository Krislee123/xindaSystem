$(function() {
//	location.href = "product"
		$.ajax({
			url:"/orderform/login",
			type:"get",
			success: function(data){
				console.log("成功")
				console.log(data);
				for(var i=0; i<data.orderList.length; i++){
					var txt = `<tr>
                        <td>${data.orderList[i].id}</td>
                        <td>${data.orderList[i].buyName}</td>
                        <td>${data.orderList[i].orderContent}</td>
                        <td>${data.orderList[i].orderPrice}</td>
                        <td>${data.orderList[i].ts}</td>
                        
                        `;
					if(+data.orderList[i].state == 1){
						txt += `<td>已支付</td>
						<td>
                           
                        </td>`;
						
				
					} else{
						txt += `<td>未支付</td>
						<td>
                            
                        </td>`;
					}
					txt +=`</tr>`
				
						$("tbody").append(txt);
				}
				
			},
			error: function(){
				console.log("失败")
			}
		})
		
})

$(".fa-search").on("click", function(){
	var num = $(".ordernum").val();
	$.ajax({
		url:"/orderform/search",
		type:"get",
		data:{
			num: num,
		},
		success: function(data){
			console.log(data);
			if(!data.orderList.id){
				alert("订单不存在");
			}else{
				$("tbody").html("");
				var txt = "";
					 txt = `<tr>
	                    <td>${data.orderList.id}</td>
	                    <td>${data.orderList.buyName}</td>
	                    <td>${data.orderList.orderContent}</td>
	                    <td>${data.orderList.orderPrice}</td>
	                    <td>${data.orderList.ts}</td>
	                    
	                    `;
					if(+data.orderList.state == 1){
						txt += `<td>已支付</td>
						<td>
	                        <
	                    </td>`;
						
				
					} else{
						txt += `<td>未支付</td>
						<td>
	                       
	                    </td>`;
					}
					txt +=`</tr>`
		
				console.log(txt);
				$("tbody").append(txt);
			}
			
		},
		error: function(){
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
$(".business-order").on("click", function(){
    $(".main-content").show();
    $("table").show();
    $(".main-sercive").hide();
    $(".business-order").addClass("border-red");
    $(".service-order").removeClass("border-red");
    $(".main-top li").eq(3).text("业务订单");
})
$(".service-order").on("click", function(){
    $(".main-content").hide();
    $("table").hide();
    $(".main-sercive").show();
    $(".service-order").addClass("border-red");
    $(".business-order").removeClass("border-red");
    $(".main-top li").eq(3).text("服务订单");
})
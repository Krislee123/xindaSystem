var page = 0;
$(function() {
//	location.href = "product"
		$.ajax({
			url:"/opeuser/login",
			type:"get",
			data: {
				pageNum: 1,
				pageSize: 2,
				name: '',
			},
			success: function(data){
				console.log("成功")
				console.log(data);
				$("tbody").html("");
				for(var i=0; i<2; i++){
					var txt = `<tr>
	                    <td>${data.buy_userList[i].id}</td>
	                    <td>${data.buy_userList[i].name}</td>
	                    <td>${data.buy_userList[i].ph}</td>
	                    <td>${data.buy_userList[i].buyArea}</td>
	                    <td>${data.buy_userList[i].ts}</td>
	                    <td>${data.buy_userList[i].buyNum}</td>
	                    <td>${data.buy_userList[i].consumePrice}</td>
	                    <td>
	                        
	                    </td>
	                    </tr>
	                    `;
							$("tbody").append(txt);
							
				}
					
				var tat = ` <span onclick="pageOn(1)">首页</span>
					<span onclick="pageOn('-')">上一页</span>`
				for(var j = 0; j<(data.buy_userList.length/2); j++){
					tat += `<span class="main-pagination-page" onclick= "pageOn(${j+1})">${j+1}</span>`
				}
					tat += `<span onclick="pageOn('+')">下一页</span>
					<span onclick="pageOn(Math.ceil(${data.buy_userList.length/2}))">尾页</span>
					`
				$(".pagez").append(tat);
				
			},
			error: function(){
				console.log("失败")
			}
		})
		
})

function pageOn(pageNum){
	if((typeof pageNum) == "number"){
		page = pageNum;
	} else if(pageNum == "+"){
		page += 1;
		pageNum = page;
	}else if(pageNum == "-"){
		page = page-1;
		pageNum = page;
	}
	$.ajax({
		url:"/opeuser/page",
		type:"get",
		data:{
			name: "",
			pageNum: pageNum,
			pageSize: 2,
		},
		success: function(data){
			console.log(data);
			$("tbody").html("");
			for(var i=0; i<data.buy_userList.length; i++){
					if(!data.buy_userList[i].id){
						alert("用户不存在");
					}else{
					var txt = `<tr>
                        <td>${data.buy_userList[i].id}</td>
                        <td>${data.buy_userList[i].name}</td>
                        <td>${data.buy_userList[i].ph}</td>
                        <td>${data.buy_userList[i].buyArea}</td>
                        <td>${data.buy_userList[i].ts}</td>
                        <td>${data.buy_userList[i].buyNum}</td>
                        <td>${data.buy_userList[i].consumePrice}</td>
                        <td>
                          
                        </td>
                        </tr>
                        `;
					
				}
				$("tbody").append(txt);
			}
		
		},
		error: function(){
			console.log("失败")
		}
	})
}

$(".fa-search").on("click", function(){
	var name = $(".username").val();
	$.ajax({
		url:"/opeuser/page",
		type:"get",
		data:{
			name: name,
			pageNum: 1,
			pageSize: 2,
		},
		success: function(data){
			console.log(data);
			for(var i=0; i<data.buy_userList.length; i++){
					if(!data.buy_userList[i].id){
						alert("用户不存在");
					}else{
					$("tbody").html("");
					var txt = `<tr>
                        <td>${data.buy_userList[i].id}</td>
                        <td>${data.buy_userList[i].name}</td>
                        <td>${data.buy_userList[i].ph}</td>
                        <td>${data.buy_userList[i].buyArea}</td>
                        <td>${data.buy_userList[i].ts}</td>
                        <td>${data.buy_userList[i].buyNum}</td>
                        <td>${data.buy_userList[i].consumePrice}</td>
                        <td>
                           
                        </td>
                        </tr>
                        `;
					$("tbody").append(txt);
					
				}
//				$("tbody").append(txt);
			}
			$(".pagez").html("");
			var tat = ` <span>首页</span>
				<span>上一页</span>`
			for(var j = 0; j<=(data.buy_userList.length/2); j++){
				tat += `<span class="main-pagination-page" onclick= "pageOn(${j+1})">${j+1}</span>`
			}
				tat += `<span>下一页</span>
				<span>尾页</span>
				`
			$(".pagez").append(tat);
		
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
    $(".main-pagination").show();
    $(".main-sercive").hide();
    $(".business-order").addClass("border-red");
    $(".service-order").removeClass("border-red");
    $(".main-top li").eq(3).text("注册用户");
})
$(".service-order").on("click", function(){
    $(".main-content").hide();
    $("table").hide();
    $(".main-pagination").hide();
    $(".main-sercive").show();
    $(".service-order").addClass("border-red");
    $(".business-order").removeClass("border-red");
    $(".main-top li").eq(3).text("服务商用户");
})
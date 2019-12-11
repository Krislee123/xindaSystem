var check = null;
$(function() {
//	location.href = "product"
		$.ajax({
			url:"/product/login",
			type:"get",
			success: function(data){
				console.log("成功")
				console.log(data);
				for(var i=0; i<data.service_productList.length; i++){
					var txt = `<tr>
						<td><input type="checkbox" class="checkbox" value="${data.service_productList[i].id}" name="product"></td>
                        <td>${data.service_productList[i].serviceName}</td>
                        <td>${data.service_productList[i].serviceExplain}</td>
                        <td>¥${data.service_productList[i].servicePrice}元</td>
                        <td></td>
                        `;
					if(+data.service_productList[i].serviceState == 1){
						txt += `<td><span class="up-line-mark up-line-mark-red">在线</span></td>
							<td><span class="handle-btn" onclick="downLine('${data.service_productList[i].id}')"><i class="fa fa-arrow-down fa-fw"></i>下线</span></td>`;
				
					} else{
						txt += `<td><span class="down-line-mark down-line-mark-orange">下线</span></td>`;
						txt += `<td>
							<span class="handle-btn"><i class="fa fa-edit fa-fw"></i>编辑</span>
							<span class="handle-btn" onclick="deletel('${data.service_productList[i].id}')"><i class="fa fa-close fa-fw"></i>删除</span>
							<span class="handle-btn" onclick="upLine('${data.service_productList[i].id}')"><i class="fa fa-arrow-up fa-fw"></i>上线</span>
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

$(".checkall").on("change", function(){
	check=this.checked
	$(":checkbox[name='product']").attr("checked",check);
})

$(".up-line").on("click", function(){
	var input= $(":checkbox[name='product']");
	var str= "";
	if(check){
			for(var i = 0;i< input.length;i++){
				str += $(input[i]).val()+",";
			}
			str = str.substr(0,str.length-1);
	}
	$.ajax({
		url:"/product/upall",
		type:"get",
		data:{
			str: str,
		},
		success: function(data){
			console.log(data.xx);
			if(data.xx.indexOf("0") == -1){
				location.href="/re?page=operator_product";
			}
			else if(data.code == "false"){
				alert("操作错误");
			}
		},
		error: function(){
			console.log("失败")
		}
	})
})

$(".down-line").on("click", function(){
	var input= $(":checkbox[name='product']");
	var str= "";
	if(check){
			for(var i = 0;i< input.length;i++){
				str += $(input[i]).val()+",";
			}
			str = str.substr(0,str.length-1);
	}
	$.ajax({
		url:"/product/downall",
		type:"get",
		data:{
			str: str,
		},
		success: function(data){
			console.log(data.xx);
			if(data.xx.indexOf("1") == -1){
				location.href="/re?page=operator_product";
			}
			else if(data.code == "false"){
				alert("操作错误");
			}
		},
		error: function(){
			console.log("失败")
		}
	})
})

$(".fa-search").on("click", function(){
	var text = $(".intext").val();
	$.ajax({
		url:"/product/search",
		type:"get",
		data:{
			text: text,
		},
		success: function(data){
			$("tbody").html("");
			for(var i=0; i<data.service_productList.length; i++){
				var txt = `<tr>
					<td><input type="checkbox" class="checkbox" value="${data.service_productList[i].id}" name="product"></td>
                    <td>${data.service_productList[i].serviceName}</td>
                    <td>${data.service_productList[i].serviceExplain}</td>
                    <td>¥${data.service_productList[i].servicePrice}元</td>
                    <td></td>
                    `;
				if(+data.service_productList[i].serviceState == 1){
					txt += `<td><span class="up-line-mark up-line-mark-red">在线</span></td>
						<td><span class="handle-btn" onclick="downLine('${data.service_productList[i].id}')"><i class="fa fa-arrow-down fa-fw"></i>下线</span></td>`;
			
				} else{
					txt += `<td><span class="down-line-mark down-line-mark-orange">下线</span></td>`;
					txt += `<td>
						<span class="handle-btn"><i class="fa fa-edit fa-fw"></i>编辑</span>
						<span class="handle-btn" onclick="deletel('${data.service_productList[i].id}')"><i class="fa fa-close fa-fw"></i>删除</span>
						<span class="handle-btn" onclick="upLine('${data.service_productList[i].id}')"><i class="fa fa-arrow-up fa-fw"></i>上线</span>
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

$(".user-arrow-down").on("click", function() {
	if ($(".dropdown").is(":hidden")) {
		$(".dropdown").show();
	} else {
		$(".dropdown").hide();
	}
})

function downLine(id){
	location.href="/product/downline?id="+id;
}

function deletel(id){
	location.href="/product/deletel?id="+id;
}

function upLine(id){
	location.href="/product/upline?id="+id;
}
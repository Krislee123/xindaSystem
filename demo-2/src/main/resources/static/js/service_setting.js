$(".user-arrow-down").on("click",function(){
    if($(".dropdown").is(":hidden")){
        $(".dropdown").show();
 }else{
       $(".dropdown").hide();
 }
})
$(".order1").on("click", function(){
    $(".main-content").show();
    $("table").show();
    $(".main-pagination").show();
    $(".main-sercive").hide();
    $(".order1").addClass("border-red");
    $(".order2").removeClass("border-red");
    $(".main-top li").eq(3).text("正常用户");
})
$(".order2").on("click", function(){
    $(".main-content").hide();
    $("table").hide();
    $(".main-pagination").hide();
    $(".main-sercive").show();
    $(".order2").addClass("border-red");
    $(".order1").removeClass("border-red");
    $(".main-top li").eq(3).text("停用用户");
})
$(".order3").on("click", function(){
    $(".main-top li").eq(3).text("未通过用户");
})
$(".change-info").on("click", function(event){
    $(".masking").show();
})
$(".save").on("click", function(event){
    $(".masking").hide();
    console.log("保存");
})
$(".cancel").on("click", function(event){
    $(".masking").hide();
    console.log("取消");
})
$(".user-arrow-down").on("click", function () {
    if ($(".dropdown").is(":hidden")) {
        $(".dropdown").show();
    } else {
        $(".dropdown").hide();
    }
})
$(".sort li").eq(0).on("click", function () {
    $(".sort li").removeClass("font-red");
    $(this).addClass("font-red");
})
$(".sort li").eq(1).on("click", function () {
    $(".sort li").removeClass("font-red");
    $(this).addClass("font-red");
})
$(".sort li").eq(2).on("click", function () {
    $(".sort li").removeClass("font-red");
    $(this).addClass("font-red");
})
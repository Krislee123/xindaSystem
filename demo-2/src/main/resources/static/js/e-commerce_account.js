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
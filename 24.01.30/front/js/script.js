$(function(){
    $(document)
    .on("mouseenter", '.pr-category>li', function(){
        $(this).find('.sub-cate').fadeIn();
    })
    .on("mouseleave", '.pr-category>li', function(){
        $(".sub-cate").fadeOut();
    });
    
//    $('.pr-category>li').hover(function(){
//       $(this).find('.sub-cate').fadeToggle();
//    });
});
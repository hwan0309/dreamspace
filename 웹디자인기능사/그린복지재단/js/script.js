$(function(){
   $('.gnb>li').hover(function(){
      $('.lnbbox').stop().fadeToggle();
      $('.lnb').stop().fadeToggle();
   });
   setInterval(slide, 3000);

   $('.popup').click(function(e){
       e.preventDefault();
       $('.pop').fadeIn();
   });
   $('.close').click(function(){
      $('.pop').fadeOut();
   });

   $('.myfamily').change(function(){
      let $link = $(this).val();
      if($link){
         window.location.href=$link;
      }
   });
});

function slide(){
   $('.slidein').animate({
      'left':'-1200px'
   }, 300, function(){
      $('.slidein img:eq(0)').clone().appendTo('.slidein');
      $('.slidein img:eq(0)').remove();
      $('.slidein').css('left', 0);
   });
}
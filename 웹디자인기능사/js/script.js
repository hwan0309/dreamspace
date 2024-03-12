$(function(){

    $(window).scroll(function(){
       let tops = $(window).scrollTop();  
       if(tops > 0) {
          $('header').css({
             'position': 'fixed',
             'backgroundColor': 'rgba(255,255,255,0.8)',
             'top': 0,
             'width': '100%',
             'zIndex':1000
          }).addClass("fixed");
          $('.category-subnav').css('background-color', 'rgba(255,255,255,0.8)');
          $('.detail').css('margin-top', '200px');
       }else{
         $('header').css({
            'position': 'static',
            'backgroundColor': 'rgba(255,255,255)',
            'top': 0,
            'width': '100%'
         }).removeClass('fixed'); 
         $('.category-subnav').css('background-color', 'rgba(255,255,255,1)'); 
         $('.detail').css('margin-top', '0px');      
       } 
    });

    $(document)
    .on("mouseenter", '.pr-category>li', function(){
        $(this).find('.sub-cate').fadeIn();
    })
    .on("mouseleave", '.pr-category>li', function(){
        $(".pr-category>li>.sub-cate").fadeOut();
    });
    
    $('.category')
    .click(function(){
       if( $(this).find('.category-subnav').css('display')=='none'){
          $(this).find('.category-subnav').css('display', 'flex');
          $(this).addClass('category-act');
       }else{
          $(this).find('.category-subnav').css('display', 'none');
          $(this).removeClass('category-act');
       }
    });

   $('.listview').click(function(e){
       e.preventDefault();
       const view = $(this).data("view");
       $("#pdlist>div").removeClass();
       $('.listview rect').removeClass('list-act-color').addClass('list-color');
       if(view == 3){
          $(this).find('rect').removeClass('list-color').addClass('list-act-color');
          $("#pdlist>div").addClass("col-md-4 mb-5");
       }else if(view == 4){
          $(this).find('rect').removeClass('list-color').addClass('list-act-color');
          $("#pdlist>div").addClass("col-md-3 mb-5");
       }else if(view == 5){
          $(this).find('rect').removeClass('list-color').addClass('list-act-color');
          $("#pdlist>div").addClass("col-md-55 mb-5");
       }
   })
   
   $('.tops').click(function(e){
       e.preventDefault();
       $('html, body').animate({
           scrollTop: 0
       }, 500);
   });

   $('.news').click(function(e){
      e.preventDefault();
      let thenew;
      if($('header').css('position', 'fixed')){
         thenew = $('#new').offset().top - 100;
      }else{
         thenew = $('#new').offset().top - 200;
      }   
      $('html, body').animate({
         scrollTop: thenew + "px"
      })
   });

   $('.hots').click(function(e){
      e.preventDefault();
      let thenew;
      if($('header').css('position', 'fixed')){
         thenew = $('#list').offset().top - 100;
      }else{
         thenew = $('#list').offset().top - 200;
      } 
      $('html, body').animate({
         scrollTop: thenew + "px"
      })
   });


   $('.bottoms').click(function(e){
      e.preventDefault();
      $('html, body').animate({
          scrollTop: $(document).height()
      }, 500);
  });



});
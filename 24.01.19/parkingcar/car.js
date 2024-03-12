$(function(){
       $(document).keydown(function(e){
        const parkTop = $('.park').offset().top;
        const parkLeft = $('.park').offset().left;
        console.log("주차장의 좌표" + parkTop, parkLeft);
        //console.log(e.keyCode);
        let mycar = $('.mycar').offset();
        switch(e.keyCode) {
            case 37:
                $('.cloud').show();
                $('.mycar')
                .css('transform','rotate(270deg)')
                .stop()
                .animate({left: '-=100px' }, 500, function(){
                $('.cloud').hide();
                if((Math.abs(mycar.top - parkTop) < 200) && Math.abs(mycar.left - parkLeft < 200)){
                alert("주차성공");
                };
                 });
                break;
              

                case 38:
                    $('.cloud').show();
                    $('.mycar').css('transform','rotate(0deg)')
                    .stop()
                    .animate({top: '-=100px' }, 500, function(){
                    $('.cloud').hide();
                    if((Math.abs(mycar.top - parkTop) < 200) && Math.abs(mycar.left - parkLeft < 200)){
                        alert("주차성공");
                        };
                    });
                    break;
         
                    case 39:
                        $('.cloud').show();
                        $('.mycar').css('transform','rotate(90deg)')
                        .stop()
                        .animate({left: '+=100px' }, 500, function(){
                        $('.cloud').hide();
                        if((Math.abs(mycar.top - parkTop) < 200) && Math.abs(mycar.left - parkLeft < 200)){
                            alert("주차성공");
                            };
                        });
                        break;
              
                        case 40:
                            $('.cloud').show();
                            $('.mycar').css('transform','rotate(180deg)')
                            .stop()
                            .animate({top: '+=100px' }, 500, function(){                  
                            $('.cloud').hide();
                            if((Math.abs(mycar.top - parkTop) < 200) && Math.abs(mycar.left - parkLeft < 200)){
                                alert("주차성공");
                                }
                            });
                            break;
                    
        }
    });
   

}); //jquery
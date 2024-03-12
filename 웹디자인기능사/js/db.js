$(function(){
    $.ajax({
        url: "data/db.json",
        success: function(rs){
           const cat = rs.category;
           let link='';
           let sublink = '';
           for(let i=0; i<cat.length; i++){
              if(cat[i].sub.length > 0){
                for(let j =0; j< cat[i].sub.length; j++){
                    sublink += `<li>
                                 <a href="${cat[i].sub[j].link}">${cat[i].sub[j].title}</a>
                                </li>`;
                }
                 link += `<li><a href="${cat[i].link}">${cat[i].title}</a>
                              <ul class="sub-cate">${sublink}</ul>
                          </li>`; 
                 sublink = '';         
              }else{
                 link += `<li><a href="${cat[i].link}">${cat[i].title}</a></li>`; 
              }
           }
           $('.pr-category').html(link);
           $('.category-subnav-view').html(link);
        }
      });

   $.get("data/slide.json", function(rs){
       const img = rs.carousel;
       let imgs = '';
       for(let i = 0; i < img.length; i++){
           imgs += `<div class="text-center"><img src="images/${img[i]}" alt="${img[i]}"></div>`;
       }
       $('.mySlick').prepend(imgs).not('.slick-initialized').slick({
         dots: true,
         infinite: true,
         speed: 500,
         fade: true,
         cssEase: 'linear',
         autoplay: true,
         autoplaySpeed: 5000,
         prevArrow:$('.hero-prev'),
         nextArrow:$('.hero-next'),
         responsive: [
            {
              breakpoint: 768,
              settings: {
                slidesToShow: 1,
                slidesToScroll: 1,
                infinite: true,
                dots: true,
                autoplay: true,
                autoplaySpeed: 5000,    
                speed: 500,
                prevArrow:$('.hero-prev'),
                nextArrow:$('.hero-next')         
              }
            }
          ]
       });
   });   

   $.get("data/new.json", function(rs){
        let newbox = '';
        const list = rs.newlist;
        for(let i = 0; i < list.length; i++){
           newbox += `        
           <div class="col-md-3 mb-5">
               <div class="card">
                  <a href="detail.jsp?num=${list[i].num}" class="card-img">
                     <img src="${list[i].img}" class="card-img-top" alt="nothing">
                  </a>
                  <a href="#" class="card-body">
                     <h5 class="mt-4">${list[i].title}</h5>
                     <p>${list[i].txt}</p>
                  </a>
               </div>
           </div> \n  
           `;
        }
        $("#newpd").html(newbox);
   });

   $.get("data/list.json", function(list){
       let lists = '';
       list.forEach(function(item){
          lists += `
          <div class="col-md-3 mb-5">
          <div class="card">
               <a href="detail.jsp?num=${item.num}" class="card-img">
                 <img src="${item.img}" class="card-img-top" alt="${item.img}">
               </a>
               <a href="#" class="card-body">
                  <h5 class="mt-4 pb-2 border-bottom">OFFICE LOOK 
                     <span class="badge badge-danger">NEW</span>
                  </h5>
                  <p class="desc">${item.title}</p>
                  <p class="price">
                     <span class="or">100,000원</span>
                     <span>80,000원</span>
                  </p>
               </a>
          </div>
       </div>
          `;
       });
       $('#pdlist').html(lists);
   });  

});  //jquery
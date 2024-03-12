let i =10;
do{
     console.log("hello");
     i--;
 } while(i < 3) 

 console.log(i);

 while(i < 20) {
     console.log(i);
     i++;
}
/for 문은 for(초깃값; 조건식; 증감식) {

}
    for(let i = 10; i < 20; i++){
     console.log(i);
    }

   1부터 100까지 중에5의 배수이면서 7의 배수가 아니면 빨강 7의 배수이면서 5의 배수가 아니면 파랑 5의 배수이면서 7의 배수는 검정

   for(let i=1; i <= 100; i++) {
     if( i%5==0 && i%7!=0) {

    } else {let2 i%7==0 i%5!

    }

    

}
   } let2 i%7==0 i%5!; let3 i%5==0 i%7==0){
   console.log(i);
   }


for(let i =1; i <=100; i++) {
    if(i % 5 ==0 && i % 7 !=0) {
        document.write("<p class='red'>" + i + "</p>");
    }else 
      if (i % 5!=0 && i % 7 == 0) {
        document.write("<p class='blue'>" + i + "</p>");

      } else 
      if(i%5==0 && i%7==0) {
        document.write("<p class='black'>" + i + "</p>");
      }
    }

//break; === while문에서 사용 가능;

for(let i =1; i<=1000; i++){
  let n = 0;
  //1 + 2 + 3 + 4 + ... + 1000
  n = n + i
}

for( let i = 0; i <= 10; i++){
  if(i % 2 == 0) continue;
  
console.log(i);
}

for (let n = 1; n <= 3; n++) {
 
  for (let m = 1; m <= 3; m++){
    console.log( n + "행" + m + "열");
  }
}

let tb = "table";
  for(let n = 1; n <= 3; n++);{
        tb += n + "행"
      for(let m = 1; m <= 3; m++);{
        tb += m + "열";
  }
    }
tb += "/table";
console.log(tb);



<table>
<tr>
<td>1<td>


let tb =;
  let m =1;
    for(let i=0; i < 3; i++) {
        tb += "<tr>";
    for(let n=0; n < 3; n++) {
        tb += "<td>" + m + "</td>";
        m++
  }
    tb += "</tr>";
 }
     document.write("<table>" + tb + "</table>");


9*9단

for(let m=2; m <= 9; m++){
    for(let n = 1; n <= 9; n++){
      console.log(m + "x" + n + "=" + m*n);
      console.log("");
    }
    console.log("");
  }


var a = 1;
while(a < 9){
  var b = 1;
  a++;
  while(b < 9) {
    b++;
      console.log(a + "x" + b + "=" + a*b);
  }
  console.log("");
      } 







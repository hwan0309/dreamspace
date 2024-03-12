
//1번
function last_digit(x, y, z){ // 세 숫자의 마지막 숫자가 같은지 확인하는 함수 호출
    if(x > 0 && y > 0 
        && z > 0){
      return  x % 10 == y % 10 && 
      y % 10 == z % 10;
    }else{
        return false;
    }
}
console.log(last_digit(11, 21, -19));
console.log(last_digit(13, 23, 22));
console.log(last_digit(13, 23, 23));



function transformString(input) {
    if (input.length < 3) {     // 문자열의 길이가 3보다 작은 경우 
        return input.toUpperCase();    // 모두 대문자로 변환
    } else {
        return input.substring(0, 3).toLowerCase() + input.substring(3);  // 처음 세 글자를 소문자로 변환하고 나머지 부분은 그대로 유지
    }
}
var inputString = "Aeddf";  // 예제 문자열
var result = transformString(inputString);     // 변환 함수 호출
console.log("변환 결과: " + result);       // 결과 출력

//2번
// function front_lower(str){
//     if(str.length < 3){
//         return str.toUpperCase(); //앞에 세문자를 잘라 대문자로 변환
//     }
//     const f_str = (str.substirng(0,3)).toLowerCase(); //0~3까지는 소문자로 변환
//     const b_str = (str.substring(3, str.length));
//         return f_str + b_str; 
// }
// console.log(front_lower("abc"));
// console.log(front_lower("JAVASCRIPT"));

//3번
function sortSum(x, y){
    const sumNum = x + y;
    if(sumNum >= 50 && 
        sumNum <= 80){
            return 65;
        }else{
            return 80;
        }
}
console.log(sortSum(30,20));
console.log(sortSum(90,80));

//4번
function str_reverse(str){     //다른 종류의 함수 function이란 똑같음 변수 선언할시에만 함수 안에다 넣으면 됨
    let abc = str.split("").reverse("").join("");
    return abc;
}
console.log(str_reverse("javascript"));
console.log(str_reverse("안녕"));

//5번
function time_conv(num){
    const hours = Math.floor(num / 60); //60분 나누기 num대입갑(시간)
    const minutes = num % 60; //시간 나누기 값 나머지 = 분값
    return hours + "시간" +
    minutes + "분";
}
console.log(time_conv(450));
console.log(time_conv(570));
console.log(time_conv(900));

//6번
function alphabet_sort(str){
    return str.split().sort().join(); // split나누기 sort정렬 join합치기 
}
console.log(alphabet_sort("gjklfdsoijaaasgj"));
console.log(alphabet_sort("245151412"));
console.log(alphabet_sort("AUIADOIDDNLDVNLV"));

// function cut_fl(str){
//     return str.substr(1, str.length-2); //시작인덱스 자를길이
// }

//9번
function concat_str(str1,str2) {
    str1 = str1.substring(1, str1.length);
    str2 = str2.substring(1, str2.length);
    return str1 + str2;
}

//10번
function c_name(str){
    str = str.toLowerCase();
    if(str.length >= 3){
        if((str.substring(0, 3) == "los")|| 
        (str.substring(0,3) == "new"));
    return str;
    }
    return '';
}
return'';

function const_str(str){
    name_str = strname;
    str = str.split(" ");
    for(let i = 0;  i < str.length; i++){
        str[i] = str[i][0].toUpperCase() + str[i].substr(1); //첫 앞글자 대문자로 변경
    }
    return str.join("");
    console.log(name_str("hi nice to see you"));   
}



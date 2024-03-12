let today = new Date();
let noHour = today.getHours();

function Hour(nowHour) {
    if(nowHour < 12 && nowHour >= 0) {jeonhoo = 'am';}
    else {jeonhoo = 'pm';}
    return jeonhoo;
}
function getweek1(weekNo) {
    let week = ["일", "월", "화", "수", "목", "금", "토"];
    return week[weekNo];
}

document.write("현재시간 " 
+today.getFullYear()+"년"
+(today.getMonth()+1) +"월"
+today.getDate()+"일 ("
+getweek1(today.getDay())+ ")"
+Hour( today.getHours() )
+today.getHours()+"시"
+today.getMinutes()+"분" + "<hr>");



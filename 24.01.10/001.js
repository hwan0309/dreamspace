const t = new Date();

const weeks = t.getDay();

let week;


const hour = date.getHours();

const min = date.getMinutes();


function clock() {
 const hour = date.getHours();
const min = date.getMinutes();

if(hour > 12) {
    const pmHOur = hours - 12;
    console.log(pmHours, minutes);
} else{
    console.log(hours, minutes);
}
}
const test = setInterval(clock, 1000);
console.log(test);

switch(weeks){
    case 0:
        week = "일요일";
        break;

        case 1:
        week = "월요일";
        break;

        case 2:
        week = "화요일";
        break;

        case 3:
        week = "수요일";
        break;

        case 4:
        week = "목요일";
        break;

        case 5:
        week = "금요일";
        break;

        case 6:
        week = "토요일";
        break;
}


const nowdate = `오늘은 ${t.getFullYear()}년 ${t.getMonth()+1}월 
${t.getDate()}일 ${week} 
}
console.log(nowdate)

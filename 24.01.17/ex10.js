function addn(x,y){
    if(x == y){
        return (x + y) * 3;
    }else{
        return x + y;
    }
}

function diff_num(n){
    if(n <= 19){
        return 19 - n;
    }else{
        return (n - 19) * 3;
    }
}

function test50(x, y){
   return ((x==50 || y==50) || (x + y == 50));
}

function test60(x,y){
    if((x < 0 && y > 0) || (x > 0 && y < 0)){
        return true;
    }else {
        return false;
    }
}

function stringAddPy(str){
    if(str === null || str === undefined || str.substring(0,2) === "Py"){
        return str;
    }
    return "Py" + str;
}

//num값 출력
let num = 0;
function ten() {
    num++;
    console.log(num);
    if(num == 10) return;
    ten();
}
ten();

// addn값 출력
console.log(addn(10,20));
console.log(addn(10,10));

// diff_num값 출력
console.log(diff_num(20));
console.log(diff_num(10));

//test50값 출력
console.log(test50(10,20));
console.log(test50(10,40));
console.log(test50(50,30));

//test60값 출력
console.log(test60(1,-1));
console.log(test60(1,10));

//stringAddPy값 출력
console.log(stringAddPy("Python"));
console.log(stringAddPy("javascript"));

//양의 정수 x가 3또는 7의 배수인지 확인하는 함수를 작성하라.

function abc(x) {
// x가 양의 정수가 아니거나 숫자가 아닌 경우 false를 반환
    if (typeof x !== 'number' || x <= 0) {
        return false;
    }
    // x가 3 또는 7의 배수인지 확인
    return x % 3 === 0 || x % 7 === 0;
}
// 배수 출력
console.log(abc(9));  // true (3의 배수)
console.log(abc(14)); // true (7의 배수)
console.log(abc(5));  // false (둘 다 아님)
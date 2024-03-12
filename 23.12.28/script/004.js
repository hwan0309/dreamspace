let a = 10, b=20, m=30, n=40;
let result;

result = a>b||b>m||m>n;
console.log(result);

result= a > b || b>= m || m<=n;
console.log(result);

result = a <= b && b >= m && m <=n;
console.log(result);

result = a <= b && b <= m && m <= n;
console.log(result);

result =!(a > b);
console.log(result);

result = a <= b ?"noscript" : "javascript";
console.log(result);
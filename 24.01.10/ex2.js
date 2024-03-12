const side1 = 5;
const side2 = 6;
const side3 = 7;

var s = (side1 + side2 + side3) /2;

var area = Math.sqrt(s *((s-side1)* (s - side2) * (s - side3)));
console.log(area);
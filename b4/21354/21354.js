//문제: 21354
const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().trim().split("\n");

solution(input);
function solution(input) {
  const [a, p] = input[0].split(" ").map(Number);
  if (7 * a > 13 * p) console.log("Axel");
  else if (7 * a < 13 * p) console.log("Petra");
  else console.log("lika");
}

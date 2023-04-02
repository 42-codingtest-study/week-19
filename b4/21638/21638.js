//문제: 21638
const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().trim().split("\n");

solution(input);
function solution(input) {
  const [a, b] = input[0].split(" ").map(Number);
  const [c, d] = input[1].split(" ").map(Number);
  if (a < 0 && c >= 10)
    console.log(
      "A storm warning for tomorrow! Be careful and stay home if possible!"
    );
  else if (a > c)
    console.log("MCHS warns! Low temperature is expected tomorrow.");
  else if (b < d) console.log("MCHS warns! Strong wind is expected tomorrow.");
  else console.log("No message");
}

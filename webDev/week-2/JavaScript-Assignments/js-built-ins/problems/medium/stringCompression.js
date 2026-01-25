/*
  Write a function `compression` which takes a string as input and returns a compressed version of the string. The compression is done by replacing consecutive repeating characters with the character followed by the count of repetitions. If a character does not repeat, it is not followed by a count.

  Example:
  - Input: "aaabbbbcccvvmm"
  - Output: "a3b4c3v2m2"

  - Input: "abc"
  - Output: "abc"

  - Input: "aabbcc"
  - Output: "a2b2c2"

  - Input: ""
  - Output: ""

  Note:
  - The function should work for any alphanumeric string.

  Once you've implemented the logic, test your code by running
  - `npm run test-compressString`
*/
function compression(str) {
  // Your code here
  let sol = "";
  let i = 0;
  let j = 1;
  let count = 1;
  while (j <= str.length-1) {
    if (str[i] === str[j]) {
      count++;
      j++;
    }
    else {
      if (count === 1) sol = sol.concat(str[i]);
      else sol = sol.concat(str[i]+count)
      i = j;
      j++;
      count = 1;
    }
  }
  if (str.length > 0) {
    if (count === 1) sol = sol.concat(str[i]);
    else sol = sol.concat(str[i] + count);
  }
  return sol;
}

module.exports = compression;
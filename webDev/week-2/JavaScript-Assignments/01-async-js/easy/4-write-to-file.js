// ## Write to a file

// Using the fs library again, try to write to the contents of a file.
// You can use the fs library to as a black box, the goal is to understand async tasks.

const fs = require('fs');
console.log(process.cwd())
fs.writeFile("./JavaScript-Assignments/01-async-js/easy/a.txt", "Hello", (err) => {
    console.log(err);
})
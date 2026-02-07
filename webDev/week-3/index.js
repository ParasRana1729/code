const fs = require("fs");

const contents = fs.readFileSync("a.txt", "utf-8"); // Sync
console.log(contents);

function readFileCallback(err, data) {
    console.log(data);
}

fs.readFile("a.txt", "utf-8", readFileCallback); // Async
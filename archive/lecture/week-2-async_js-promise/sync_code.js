// Sync code is executed line by line, in the order its written

const fs = require("fs");

// I/O bound task
const contentOfA = fs.readFileSync("./a.txt","utf8");
console.log(contentOfA);

const contentOfB = fs.readFileSync("./b.txt", "utf-8");
console.log(contentOfB);

var obj  = {
    place : 1,
    cash : 10,
    total : function(){
        return -1; 
    }
}
console.log(obj.total());
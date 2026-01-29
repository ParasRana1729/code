const fs = require('fs');
console.log("1");
const result = fs.readFileSync("file.txt", "utf-8"); 
console.log(result); // Synchronous way to read a file
fs.readFile("file.txt", "utf-8", function(err, data){
    console.log(data); // Asynchronous way to read a file
});
console.log("2");
fs.writeFile("file.txt", "Asynchronous way to write a file", function(err){
    console.log("File written successfully");
});
fs.appendFile("file.txt", "Appending to the file", function(err){
    console.log("File appended successfully");
});
fs.rename("file.txt", "file2.txt", function(err){
    console.log("File renamed successfully");
});
fs.rename("file2.txt", "file.txt", function(err){
    console.log("File renamed successfully");
});

const os = require('os');
console.log(os.arch());
console.log(os.platform());
console.log(os.homedir());
console.log(os.hostname());
console.log(os.tmpdir());
console.log(os.type());
console.log(os.version());
console.log(os.release());
console.log(os.uptime());
console.log(os.loadavg());
console.log(os.totalmem());
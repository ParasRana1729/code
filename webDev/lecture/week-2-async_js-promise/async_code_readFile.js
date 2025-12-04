// guess the order of print

const fs = require('fs');

function read(err, data){
    console.log(data);
}

fs.readFile('./a.txt', 'utf8', read); //async
fs.readFile('./b.txt', 'utf8', read); //async

setTimeout(() => { // async
    console.log('Timeout')
},0);

console.log("done");
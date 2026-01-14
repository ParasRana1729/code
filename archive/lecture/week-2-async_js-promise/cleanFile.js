// callback approach

const fs = require('fs');

// function cleanFileCallback(filePath, cb){
//     fs.readFile(filePath,'utf8',function(err, data){
//         data = data.trim();
//         fs.writeFile(filePath, data, function(){
//         cb();
//     })
//     })
    
// }

// function done(){
//     console.log("done");
// }

// cleanFileCallback('./a.txt', done);

// promise approach

function cleanFilePromise(filePath){
    return new Promise(function(resolve){
        fs.readFile(filePath, 'utf8', function(err, data){
            data = data.trim();
            fs.writeFile(filePath, data, function(){
                resolve();
            });
        })
    })
}

async function trimFile(){
    await cleanFilePromise('./a.txt');
    console.log("done"); 
}

trimFile();
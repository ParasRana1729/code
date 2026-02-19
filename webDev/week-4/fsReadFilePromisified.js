const fs = require("fs")

function fsReadFilePromisified(filepath, encoding) {
    return new Promise(
        (resolve, reject) => {
            fs.readFile(filepath, encoding,
                 (err, data) => {
                    if (err) {
                        reject(err);
                    }
                    else {
                        resolve(data);
                    }
            })
        }
    )
}

function callback(data) {
    console.log(data);
}

function callbackErr(err) {
    console.log(err);
}

fsReadFilePromisified("./a.txt", "utf-8")
    .then(callback)
    .catch(callbackErr);
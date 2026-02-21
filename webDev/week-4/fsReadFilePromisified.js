const fs = require("fs")

function callback(data) {
    console.log(data);
}

function callbackErr(err) {
    console.log(err);
}

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

fsReadFilePromisified("./a.txt", "utf-8")
    .then(callback)
    .catch(callbackErr);
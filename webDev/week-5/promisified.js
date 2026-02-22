// Promise is a javascript object that represents the eventual completion (or failure) of an asynchronous operation and its resulting value.

// Promise has 3 states:
// 1. Pending: The initial state of a promise.
// 2. Fulfilled: The promise is resolved successfully.
// 3. Rejected: The promise is rejected.

// Promise has 2 methods:
// 1. then: The method to handle the resolved value of the promise.
// 2. catch: The method to handle the rejected value of the promise.

// ReadFile promisified:
const fs = require("fs");

function readFilePromisified(filePath, encoding){
    return new Promise((resolve, reject) => {
        fs.readFile(filePath, encoding, (err, data) => {
            if (err) {
                reject(err);
            }
            else {
                resolve(data);
            }
        });
    });
}

readFilePromisified("./a.txt", "utf-8")
    .then(data => {
        console.log(data);
    })
    .catch(err => {
        console.log(err);
    });

// setTimeout Promisified

function setTimeoutPromisified(ms) {
    return new Promise((resolve) => {
        setTimeout(resolve, ms);
    })
}

setTimeoutPromisified(1000)
    .then(() => console.log("setTimeout Promisified"))
    .finally(() => console.log("always run"))

// async and await
// The async and await syntax in JavaScript provides a way to write asynchronous code that looks and behaves like synchronous code, making it easier to read and maintain. 
async function solve() {
    await setTimeoutPromisified(1000);
    console.log("hi");
    await setTimeoutPromisified(3000);
    console.log("hello");
    await setTimeoutPromisified(5000);
    console.log("hi there");
}

solve();
console.log("last")
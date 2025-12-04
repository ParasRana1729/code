// A Promise in JavaScript is an object that represents the eventual completion (or failure) of an asynchronous operation and its resulting value.

// The Promise constructor takes a callback function (called the executor) that receives resolve (and optionally reject) as arguments.

function setTimeoutPromisified(ms){
    return new Promise(resolve => setTimeout(resolve, ms)); // resolve is a function that, when called, changes the Promise's state from pending to fulfilled and triggers any .then() handlers attached to the Promise
}

setTimeoutPromisified(1000).then(() => {
    console.log("hi");
    return setTimeoutPromisified(3000);
}).then(() => {
    console.log("hello");
    return setTimeoutPromisified(5000);
}).then(() => {
    console.log("hi there");
});

// using asysnc and await
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
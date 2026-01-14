// Call Stack: JavaScript has a call stack where function execution is managed in a Last-In, First-Out (LIFO) order.
// Web APIs (or Background Tasks): These include setTimeout, setInterval, fetch, DOM events, and other non-blocking operations.
// Callback Queue (Task Queue): When an asynchronous operation is completed, its callback is pushed into the Callback queue.
// Event Loop: It continuously checks the call stack and, if empty, moves tasks from the queue to the stack for execution.

console.log("first");

function timeout(){
    console.log('timeout');
}

setTimeout(timeout, 1000);

let c = 0;
for (let i = 0; i < 100000000; i++){
    c++;
}

console.log("after loop");
 
// sync timeout

function setTimeoutSync(timeout){
    let startTime = new Date();
    while(1){
        let currentTime = new Date();
        if (currentTime-startTime>timeout){
            break;
        }
    }
}

setTimeoutSync(1000);
console.log("hello");
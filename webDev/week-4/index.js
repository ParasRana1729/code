function callback() {
    console.log("callback");
}

setTimeout(callback, 1);

let counter = 0;
for (let i = 0; i < 1000; i++) {
    counter++;
}
console.log(counter);

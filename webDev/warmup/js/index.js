// const randomeNumber = [2, 4, 3, 5, 8, 1, 6, 7];

// for (let i = 0; i < randomeNumber.length; i++) {
//     if (randomeNumber[i] % 2 === 0) {
//         console.log(randomeNumber[i]);
//     }
// }

// const allUsers = [
//     { firstName: "John", gender: "Male", age: 25 },
//     { firstName: "Jane", gender: "Female", age: 17 }
// ]

// for (let i = 0; i < allUsers.length; i++) {
//     if (allUsers[i].gender == "Female") {
//         console.log(allUsers[i].firstName);
//     }
// }

// callback:- a function passed as an argument to another function

function calculate(num1, num2, operation) {
    return operation(num1, num2);
}

function add(a, b) {
    return a + b;
}

function multiply(a, b) {
    return a * b;
}

console.log(calculate(5, 3, add));
console.log(calculate(5, 3, multiply));
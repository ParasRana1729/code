// Q1: Filter users who are of legal age (18 or older)
let users = [
    {
        name: "John",
        age: 20,
        city: "New York"
    },
    {
        name: "Jane",
        age: 21,
        city: "Los Angeles"
    },
    {
        name: "Jim",
        age: 16,
        city: "Chicago"
    }
]

function isLegalAge(user) {
    return user.age >= 18;
}

let legalAgeUsers = users.filter(isLegalAge);
console.log(legalAgeUsers);

// Q2: Replace each array in an object with the sum of its elements
function sumOfArray(arr) {
    let sum = 0;
    for (let ele of arr) {
        sum += ele;
    }
    return sum;
}

let obj = { food: [10, 20, 30], travel: [5, 15], bills: [40, 60] }
for (const [key, value] of Object.entries(obj)) {
    obj[key] = sumOfArray(obj[key]);
}
console.log(obj)

// Q3: Count the frequency of each element in an array
const fruits = ["apple", "banana", "apple", "orange", "banana", "apple"]
const freq = fruits.reduce((acc, fruit) => {
    acc[fruit] = (acc[fruit] || 0) + 1;
    return acc;
}, {})
console.log(freq)

// Q4: Swap keys and values in an object
const obj2 = { a: "x", b: "y", c: "z" }
let swap = {}
for (const [key, value] of Object.entries(obj2)) {
    swap[value] = key; 
}
console.log(swap)

// Q5: Find the key with the maximum value in an object
const obj3 = { a: 10, b: 50, c: 20 }
let max = -Infinity;
let keyMax = null;
for (const [key, value] of Object.entries(obj3)) {
    if (value > max) keyMax = key; max = value;
} 
console.log(keyMax);

// Q6: Flatten all arrays from an object's values into a single array
const obj4 = { fruits: ["apple", "banana"], veggies: ["carrot", "pea"] }
const arr = []
for (const [key, value] of Object.entries(obj4)) {
    value.forEach((n) => arr.push(n))
}
console.log(arr)

// Q7: Group an array of objects by a property (city) and collect names
const arr3 = [
    { name: "A", city: "Delhi" },
    { name: "B", city: "Mumbai" },
    { name: "C", city: "Delhi" }
]

const obj5 = arr3.reduce((acc, obj) => {
    const city = obj.city;
    if (!acc[city]) acc[city] = [];
    acc[city].push(obj.name);
    return acc;
}, {})
console.log(obj5)
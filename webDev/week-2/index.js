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
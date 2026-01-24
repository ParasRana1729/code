function add(a, b) {
    return a + b
}
setTimeout(
    () => {
        console.log("After 2 seconds")
    }
, 2000)
console.log(add(2, 5))

function fetchData(callback) {
    setTimeout(
        () => {
            const data = {
                name : "Paras",
                class : "CSE"
            }
            callback(data);
        }
    , 3000)
}

fetchData(
    (data) => {
        console.log(data)
    } 
)

console.log("After Callback")
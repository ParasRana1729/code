const express = require('express');
const data = require('./MOCK_DATA.json');
const app = express();

app.get('/', (req, res) => {
    res.send("Hello from home page");
});
app.get('/about', (req, res) => {
    res.send("Hello from about page");
});
app.get('/data', (req, res) => {
    return res.json(data);
});
app.get('/data/:id', (req, res) => {
    const id = req.params.id;
    const user = data.users.find(user => user.id === parseInt(id));
    if(!user){
        return res.status(404).json({ message: "User not found" });
    }
    return res.json(user);
});
app.listen(9000, () => {
    console.log("Server is running on port 9000");
});


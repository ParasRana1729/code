let ctr = 0;

function addToDo(){
    const value = document.querySelector("input").value;

    ctr++;
    const id = ctr;

    const newEle = document.createElement("div");
    const span = document.createElement("span");
    const button = document.createElement("button");

    span.textContent = value;
    button.textContent = "Delete";

    button.onclick = function() {
        deleteToDo(id);
    };

    newEle.id = id;
    newEle.appendChild(span);
    newEle.appendChild(button);
    document.querySelector("div").appendChild(newEle);
}

function deleteToDo(index){
    const removele = document.getElementById(index);
    removele.parentNode.removeChild(removele);
}

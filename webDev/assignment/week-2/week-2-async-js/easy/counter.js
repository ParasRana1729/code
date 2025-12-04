let count = 0;

function counter(){
    if(count>10){
        return;
    }
    count++;
    console.log(count);
    return setTimeout(counter,1000);
}

setTimeout(counter,1000);
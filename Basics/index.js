const setTImeOutPromisifief = (ms)=>{
    return new Promise(r => setTimeout(()=>{r()},ms))
}


setTImeOutPromisifief(5000).then(cb).catch(err => console.log(err));

function cb(){
    console.log("Printed after 5 seconds")
}

console.log("start")
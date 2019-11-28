function first(){
    setTimeout(function(){
    console.log('first function executed');
    },0)
}
function second(){
    console.log('second function executed');
}
first()
second()
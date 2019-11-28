const message = new Promise(function(resolve,reject){
    if(30>10){
        resolve()
    }
    else{
        reject('failed')
    }
})
message.then(function(msg){
    console.log('sucess message =',msg);
}).catch(function(error){
    console.log('failure message =', msg)
}
    )
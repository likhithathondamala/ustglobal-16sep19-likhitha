const employee = new Promise(function(resolve,reject){
    if(40>10){
        resolve([{
            name : 'Billegates',
            age : 67,
        },
        {
        name : 'mark zuckerburg',
        age : 40,
        },{
        name : 'jeff Bezos',
        age : 45,
        }])
        }
        else{
        reject('failed')
        }
        })
   
    
employee.then(function(data){
    console.log('sucess message =',data);
}).catch(function(error){
    console.log('failure message =', data)
}
    )
    // closure
    function outerfunction(counter){
        function innerfunction(){
            let count;
            count = counter + 10;
            return count; 
        }
        return innerfunction;
    }
    let innerfunc = outerfunction(20)
    let counter = innerfunc();
    console.log('counter value ',counter)

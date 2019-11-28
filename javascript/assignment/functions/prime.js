//Named function
function primenum(n){
    var p=0;
    for(i=1;i<=n;i++){
        if(n%i==0){
         p=p+1;
        }
    }
    if(p==2){
        console.log(n, 'is a prime number');
    }
    else{
        console.log(n ,'is a not prime  number');
    }
}primenum(20);
//function Expression
var prime=function(n){
    var p=0;
    for(i=1;i<=n;i++){
        if(n%i==0){
         p=p+1;
        }
    }
    if(p==2){
        console.log(n, 'is a prime number');
    }
    else{
        console.log(n ,'is a not prime  number');
    }
}
var value=prime(3);
//self invoked function
(function(n){
    var p=0;
    for(i=1;i<=n;i++){
        if(n%i==0){
         p=p+1;
        }
    }
    if(p==2){
        console.log(n, 'is a prime number');
    }
    else{
        console.log(n ,'is a not prime  number');
    }
})(5);
//fat arrow function
var prime=n=>{
    var p=0;
    for(i=1;i<=n;i++){
        if(n%i==0){
         p=p+1;
        }
    }
    if(p==2){
        console.log(n, 'is a prime number');
    }
    else{
        console.log(n ,'is a not prime  number');
    }
}
prime(15);


function circle(n){
    if(n%2==0){
        console.log(n,' is prime number');
    }else{
        console.log(n, 'is not a prime number');
    }
}circle(19);
//function expression
var prime=function(n){
    if(n%2==0){
        console.log(n,' is prime number');
    }else{
        console.log(n, 'is not a prime number');
    }

}
var value = prime(78);
//self invoked function
(function (n){
    if(n%2==0){
        console.log(n,' is prime number');
    }else{
        console.log(n, 'is not a prime number');
    }

})(89)  
//fat arrow function
var primenum=n=>{
    if(n%2==0){
        console.log(n,' is prime number');
    }else{
        console.log(n, 'is not a prime number');
    }
}
primenum(56);

//Named function
function facta(i,num,fact){
    for( i=1;i<num;i++){
        fact=fact*i;
    }
    console.log('factorial =',fact);
    }
facta(1,4,1)
//function expression(anonymous)
 var facta1=function(num){
     var fact=1;
     for(i=1;i<num;i++){
         fact=fact*i;
     }
     return fact;
     }
var value= facta1(6);
console.log('value =',value);
//self invoked
(function(num1){
    var fact=1;
    for(i=1;i<num1;i++){
        fact=fact*i;
    }

    console.log('factorial=',fact)})(45)
    //fat arrow function
    var facta1=(num1,fact)=>{
     for(i=1;i<num1;i++){
         fact=fact*i;
         
     }
     console.log('factorial =',fact);

    }
    facta1(67,1);
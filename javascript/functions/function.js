//Named Functions
function add(num1,num2){
    console.log('sum =',num1+num2);

}
add(10,20);
function add(num1,num2,num3){
    console.log('sum=',num1+num2+num3);
}
add(10,30,40);
//Function Expression (Anonymous)
var sub =function(num1,num2){
    var subvalue= num1-num2;
    return subvalue;

}
var value = sub(10,8)
console.log('value = ' ,value);
console.log('hello');
//self invoked
(function (num1,num2){
    console.log('sum =', num1+num2);
})(10,20);

var div1=(num1,num2)=> {
    console.log('value =',num1/num2);
}
div1(20,50);
var div2 = num1 => {
    console.log('value =',num1);
} 
div2(10);
var div3 = num1=>console.log(num1); 
div3(89);
var div4 = (num1,num2) => num1+num2;
 div4(10,60);
 greeting('likhitha');
 function greeting(msg){
     console.log("hello",msg)
 }
 greet('Dinga')
 var greet=function(msg){
     console.log('hi ', msg);
 }
 greets('Dingi');
 var greets=(msg)=>{
     console.log('hi ',msg);
 }
console.log("=======variable hoisting========")
console.log(hoist);
var hoist =10;
function hoisting(){
    console.log(hoistingA);
    var hoistingA=10;

}
hoisting();
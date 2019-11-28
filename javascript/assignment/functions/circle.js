//Named function
function circle(radius){
    var circum = radius * 2 * Math.PI;
    console.log('circumference of circle=',circum);
    }circle(5);
// function expression
var cir=function(radius){
    var circum1 =radius * 2 * Math.PI;
    console.log('circumference of circle1=',value);
}
 var value= cir(4);

//self invoked function
(function(radius){
    var circum2=radius*2*Math.PI;
    console.log('circumference of circle2=',circum2);
})(6)
//fat arrow function
var cir1 = radius =>{
    var circum=radius*2*Math.PI;
    console.log('circle3 =',circum);
} 
cir1(3);
//Named functions
function array1(i,n){
    var score=[29,67,90,56,null,56];
    score[i]=n;
    console.log('array1 =',score);
}
array1(8,89);
//function expression
var array2=function(i,str){
    var state=['andhra pradesh','karnataka','telangana','kerela',];
    state[i]=str;
    console.log('array2 =',state[3]);
    console.log('array2 =',state);

}
var st=array2(4,'tamilnadu');
//self invoked
(function (i,n){
    var number=[56,98,09,89,63,23]
    number[i]=n;
    console.log('numbers =',number[4]);
    console.log('number = ',number[6]);
})
(6,null);
//fat arrow function
var array3=(i,n)=>{
    var number=[56,98,89,63,23]
    number[i]=n;
    console.log('array3 =',number);
}
array3(3,78);
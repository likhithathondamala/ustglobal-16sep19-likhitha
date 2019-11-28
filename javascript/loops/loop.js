var brands=['bisleri','aqua','kinley']
console.log('for of loop');
for(var element of brands){
    console.log('brand =',element);
}
console.log('==========================')
var brands=['bisleri','aqua','kinley']
console.log('for in loop');
for(var index in brands){
    console.log('brand =',brands[index]);
}
console.log('============================');
console.log('for in loop for object')
var person={
    name:'sundari',
    age:23,
    color:'white'
}
for(var key in person){
    console.log('value =',person[key])

}
console.log('===============')
console.log('foreach')
var movie=['sholay','mayabazar','saho'];
movie.forEach(function(value,index){
    console.log('movie =',value);
    console.log('movie index =',index);
})

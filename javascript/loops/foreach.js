var items=[{
    item:'bangles',
    id:1,
    price:200,
},
{
    item:'eyeliner',
    id:2,
    price:250,
},
{
    item:'watch',
    id:3,
    price:5000,
},
{
    item:'bike',
    id:4,
    price:100000,
}]
items.forEach(function(item,index){
    console.log('item =',item);
    console.log('index of item =',index);
})
console.log('=================');
console.log('does not consider')
var numbers=[10,20,30,40,50]
for(var i=0;i<numbers.length;i++){
    console.log('for loop=',numbers[i]);
}
console.log('=====================');
numbers.forEach(function(value){
    console.log('number =',value);
})
console.log('=====================');
numbers['hundred']=100;
for(var i=0;i<numbers.length;i++){
    console.log('for loop=',numbers[i]);
}
console.log('=====================');
for(var i in numbers){
    console.log('for in loop',numbers[i]);
}
let veg=[{
    name:'tomato',
    price:12,
    quantity:1,
},
{
    name:'potato',
    price:25,
    quantity:1,
},
{
    name:'cabbage',
    price:30,
    quantity:1,
},
{
    name:'carrot',
    price:50,
    quantity:1,
}]
veg.forEach(function(value,index){
    console.log('vegitables:',value)
})
const veg1 = Array.isArray(veg);
console.log('is array or not',veg1)
const veg2=veg.includes('veg.potato',2);
console.log('using include method',veg2)
veg.push({
    name:'calliflower',
    price:45,
    quantity:1,
},)
console.log('after push method',veg);
veg.pop();
console.log('after pop method',veg)
veg.unshift({
    name:'beans',
    price:26,
    quantity:1,
},)
console.log('after unshift method ',veg)
veg.shift();
console.log('after shift method',veg)
veg.splice(2,1,{
    name:'ladiesfinger',
    price:30,
    quantity:1,
},)
console.log(veg);
const veg4=veg.slice(1,3)
console.log('after slice method',veg4);
const index =veg.indexOf('beans')
console.log('index of beans',index)
const string = veg.join(',')
console.log('string', string);
const vegit=veg.map(function(item,index){
   item.price = item.price+20;
return item;
})
console.log(vegit)

const vegi=veg.filter((item)=>item.price>30)
console.log(vegi)
  
console.log('=======2=======');
var laptops=['lenovo','hp','dell','asus'];
console.log(typeof laptops)
const isArrayorNot = Array.isArray(laptops);
console.log('laptop is array or not' , isArrayorNot);
const lenovoi = laptops.includes('lenovo');
console.log('using include method',lenovoi);
laptops.push('samsung','apple');
console.log('array is', laptops);
laptops.pop();
console.log('after pop method', laptops);
laptops.unshift('iball');
console.log('after unshift mathod', laptops);
laptops.shift();
console.log('after shift method',laptops);
laptops.splice(2,2,'lenovo','dell');
console.log('after splice method',laptops);
const laptop=laptops.slice(1,2);
console.log('after slice method', laptop);
const index1=laptops.indexOf('dell');
console.log('index of dell',index1);
const str=laptops.join(',');
console.log('str',str);
const str1=laptops.map(function(value,index){
    let newstr=value+3;
    return newstr;
})
console.log(str1)
const lap=laptops.filter(function(value,index){
    if(index>2){
        return true;

    }else{
        return false;
    }
})
console.log(lap)
console.log('=======3========')
var marks=[45,48,89,89,65];
const isArrayOrNot = Array.isArray(marks);
console.log('marks is array or not',isArrayOrNot);
const mark34=marks.includes(35);
console.log('after the include method',mark34)
marks.push(89,45);
console.log('after push method', marks)
marks.pop();
console.log('after pop method', marks);
marks.unshift(67,37);
console.log('after unshift method', marks);
marks.shift();
console.log('after shift method ',marks);
marks.splice(0,1,67);
console.log(marks);
marks.slice(2,1);
console.log(marks);
const id=marks.indexOf(65);
console.log(id);
const mar=marks.join('+');
console.log(mar)
const mark1=marks.map(function(value,index){
    let newvalue=value+15;
    return newvalue;
})
console.log('after map method',mark1)
const mar1=marks.filter(function(value,index){
    if(value>56){
        return true
    }
    else{return false}
})
console.log(mar1)
console.log('=========4========')
var games=['ludo','candycrush','pubg']
console.log(typeof games);
const array = Array.isArray(games);
console.log('games is array ',array);
const ludo1=games.includes('ludo');
console.log('using include method',ludo1);
const push=games.push('candy','subway');
console.log('after push method',push);
games.pop('ludo')
console.log('after pop method',games);
games.unshift('ludo','carmoms');
console.log('after unshift method',games);
games.shift();
console.log('after shift method',games);
const spli=games.splice(1,3,'friuty','iball');
console.log('after splice method',spli);
const slic=games.slice(1,2)
console.log('after slice method',slic);
const indexofcandy=games.indexOf('candy')
console.log('after indexof',indexofcandy);
const strin=games.join('-');
console.log(strin);
const gamess=games.map(function(value,index){
    let string=value+'game';
    return string;
})
console.log(gamess);
let gamee=games.filter(function(value,id){
    if(value='ludo'){
        return true;
    }else{
        return false;
    }
})
console.log(gamee)
console.log('==========5============');
var friends=['arun','ram','balaji','madhan','tarun','veera']

const isArrayOrnot = Array.isArray(friends);
console.log('friends is array or not',isArrayOrnot);
const friendarun=friends.includes('arun');
console.log('after the include method',friendarun)
friends.push('sravani','radhika');
console.log('after push method', friends)

friends.unshift('ram','arun');
console.log('after unshift method', friends);
marks.shift();
console.log('after shift method ',friends);
friend=friends.splice(0,1,'baba');
console.log(friend);
friends.slice(2,1);
console.log(friends);
const id1=friends.indexOf('balaji');
console.log(id1);
const frd=friends.join('+');
console.log(frd)
const frd1=friends.map(function(value,index){
    let newvalue=value+'frd';
    return newvalue;
})
console.log('after map method',frd1)
const frds=friends.filter(function(value,index){
    if(value>'ram'){
        return true
    }
    else{return false}
})
console.log(frds)
console.log('============6============')
var course=['cse','ece','eee','civil']
console.log(typeof course)
const isArray = Array.isArray(course)
console.log('course array or not',isArray)
const hascse = course.includes('cse');
console.log('using include method ',hascse);
course.push('aeronotics');
console.log('after push method',course);
course.pop();
console.log('after pop method',course)
course.unshift('chemical');
console.log('after unshift method',course);
course.shift();
console.log('after shift method',course);

const courses=course.splice(3,2,'mech','it')
console.log(courses)
const afterslice = course.slice(2,4)

console.log('after the slice method',afterslice)
const indexOf2 = course.indexOf('civil')
console.log('Index of Civil ', indexOf2)
const stringbranch = course.join('-')
console.log('string ',stringbranch)

const branches=course.map(function(value,index){
    let newvalue=value+'eng';
    return newvalue;
})
console.log(branches)
const cou=course.filter(function(value,index){
    if(value='cse'){
        return true; 
    }else{
        return false;
    }
})
console.log(cou)
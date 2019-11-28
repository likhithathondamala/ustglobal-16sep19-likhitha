const hobbies=['sleeping','cricket','eating','coding','roaming']
console.log(typeof hobbies)
const isArrayOrNot = Array.isArray(hobbies)
console.log('hobbies array or not',isArrayOrNot)
const hascricket = hobbies.includes('cricket');
console.log('using include method ',hascricket);
hobbies.push('guitar','volleyball');
console.log('after push method',hobbies);
hobbies.pop();
console.log('after pop method',hobbies)
hobbies.unshift('numismatics','singing');
console.log('after unshift method',hobbies);
hobbies.shift();
console.log('after shift method',hobbies);
const hobbies1 = ['sleeping','cricket','eating','coding']
hobbies1.splice(3,2,'bird watching','roaming')
console.log(hobbies1)
const afterslice = hobbies1.slice(2,4)
console.log('after the slice method',hobbies1)
console.log('after the slice method',afterslice)
const indexOfCoding = hobbies1.indexOf('coding')
console.log('Index of Coding ', indexOfCoding)
const stringhobbies = hobbies.join('-')
console.log('string ',stringhobbies)
const numbers=[100,200,300,400];
const num1=numbers.map(function(value,index){
    let newvalue=value+50;
    return newvalue;
})
console.log('after map method',num1)
const num2=numbers.map(value=>value+500)
console.log('after fat arrow',num2)
const number=numbers.filter(function(value,index){
    if(value>200){
        return true; 
    }else{
        return false;
    }
})
console.log(number)
console.log('===fat arrow===')
const num5=numbers.filter(value=>value>200);
console.log(num5)
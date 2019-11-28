console.log('windows object', window);
console.log('this keyword',this);
console.log(this === window)
// window.alert('welcome to javascript class')
// alert('welcome to ust global and testyantra')
// let confirmDelete =confirm('are you sure you want to delete')
// console.log('confirm  deletion',confirmDelete)

let username=prompt('what is your name ' , 'likhitha');
console.log('user name', username)
const person={
    firstName :'likhitha',
    age:22,
    lastName : 'thondamala',
    getName : function(){
        console.log('this keyword',this);
        return this.firstName + ' '+ this.lastName
    }
}
let fullName = person.getName()
console.log('full name ',fullName)
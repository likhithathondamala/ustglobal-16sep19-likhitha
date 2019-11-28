const person = {
    name : 'sundar',
    age  :  26,
    color : 'white',
    address : {
        city : 'dharmavaram',
        state : 'andhra pradesh',
        pincode : 515671
        },
    hobbies : ['coding', 'Bird Watching', 'singing']
    }
    console.log('javascript person Object',person);
    // javascript to json object
    const jsonobject = JSON.stringify(person);
    console.log('JSON person object' , jsonobject)
    // json object to javascript
const javascriptobject = JSON.parse(jsonobject);
console.log('javascript object' , javascriptobject)

localStorage.setItem('email','thondamalalikhitha@gmail.com');
const emailID=localStorage.getItem('email')
console.log('Email ID = ',emailID);
localStorage.clear();

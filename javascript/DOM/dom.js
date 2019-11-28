let h1Element = document.getElementById('demo');
console.log('element =', h1Element)
console.log( 'element =',h1Element.textContent)
h1Element.textContent = 'Good Evening'
let buttonElement = document.createElement('button');
buttonElement.textContent='clickme!!'
console.log('button Element',buttonElement)

document.body.appendChild(buttonElement);
let ulElement = document.createElement('ul')
let li1Element = document.createElement('li')
let li2Element = document.createElement('li')
let li3Element = document.createElement('li')

li1Element.textContent = 'java';
li2Element.textContent = 'sql';
li3Element.textContent = 'javascript';

ulElement.appendChild(li1Element);
ulElement.appendChild(li2Element);
ulElement.appendChild(li3Element);
document.body.appendChild(ulElement)

h1Element.style. color = "red"
h1Element.style.fontSize ='20px'
function showmessage(){
    alert('hello')
}
function changeColor(){
    let pElement = document.getElementById('mover')
    pElement.style.color = 'red'
}
function removecolor(){
    let pElement = document.getElementById('mover')
    pElement.color='black';
}
function printhello(){
    console.log('hello')
    let userName=document.getElementById('username').value
    document.getElementById('showusername').textContent = userName;
}
let name = 'likhitha'
let age = 22
let no = 9703410450
console.log('name is' +name + 'age is' +age+ 'phone no is' +no);
console.log(`name is ${name} age is ${age} phone no is ${no}`);
console.log(`2 + 2 =${2+2}`)

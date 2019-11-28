var score={
    name:'sachin',
    country:'india',
    score:100 ,
};

console.log('for in loop');
for(var index in score){
    console.log('score =',score[index]);
}
var name={
    name:'virat',
    country:'india',
    score:100,
};
console.log('for in loop');
for(var index in name){
    console.log('score =',name[index]);
}
var address={
       dno:1233,
       street:'shiva nagar',
       city:"puttaparthi",
       state:'andhra pradesh',
      }
      for(var key in address){
          console.log('address =',address[key])
      }
    console.log('==========================');
      var laptops=['lenovo','hp','dell','asus'];
for(var value in laptops){
    console.log('company name of laptop :',laptops[value]);
}
var marks=[45,48,89,89,65];
for(var index in marks){
    console.log('student marks:',marks[index]);
}
var watch=['sonata','titan','fasktrack'];
for(var index in watch){
    console.log('watch is',watch[index]);
}
var games=['ludo','candycrush','pubg']
for(var index1 in games){
    console.log('game is',games[index1])
}
var friends=['arun','ram','balaji','madhan','tarun','veera']
for(var index in friends){
console.log('best friend :',friends[index])
}
var cars=['bmw','nano','swayam']
for(var index in cars){
    console.log('car is',cars)
}
var course=['cse','ece','eee','civil']
for(var index in course){
    console.log('course is',course)
}
var city=['Dharmavaram','Anantapur','Puttaparthi','Tadiparthi']
for(var index in city){
    console.log('city is',city[index])
}
var movies=['happy days','suryavamsham','college days']
for(var index in movies){
    console.log('movie is',movies[index])
}
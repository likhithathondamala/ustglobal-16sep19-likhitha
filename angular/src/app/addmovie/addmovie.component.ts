import { Component, OnInit } from '@angular/core';
import { Validators, FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-addmovie',
  templateUrl: './addmovie.component.html',
  styleUrls: ['./addmovie.component.css']
})
export class AddmovieComponent implements OnInit {
  
  get title(){
   return  this.form.get('title');
  }
  get movie(){
    return  this.form.get('movie');
   }
   get description(){
    return  this.form.get('description');
   }
   form =new FormGroup({
    title: new FormControl('' ,  [Validators.required ]),
    movie: new FormControl('' ,  [Validators.required]),
    description: new FormControl('' , [Validators.required])
  });

  constructor() { }

  ngOnInit() {
  }
  loginData(form){
    console.log(form);
  }
}



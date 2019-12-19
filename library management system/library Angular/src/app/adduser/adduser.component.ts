import { Component, OnInit } from '@angular/core';

import { Router } from '@angular/router';
import { NgForm, FormGroup, FormControl, Validators } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-adduser',
  templateUrl: './adduser.component.html',
  styleUrls: ['./adduser.component.css']
})
export class AdduserComponent implements OnInit {
  // get name(){
  //   return this.registerForm.get('name');
  // }
  // get email(){
  //   return this.registerForm.get('email');
  // }
  // get password(){
  //   return this.registerForm.get('password');
  // }
  // registerForm = new FormGroup({
  //   name:new FormControl('',[Validators.required,Validators.minLength(5)]),
  //   password: new FormControl('',[Validators.required,Validators.minLength(6)]),
  //   email: new FormControl('', [Validators.required,Validators.email,Validators.minLength(4)]) ,
  
  // })
  

  constructor(private http: HttpClient , private router: Router, private service: AuthService) { }

  register(registerForm: NgForm) {
    console.log(registerForm.value);
    this.http.post(`${this.service.baseURL}/registeruser`, registerForm.value, {headers: this.service.header}).subscribe(response => {
      registerForm.reset();
      if (response) {
        alert('Student Added Note this ID for Login  ' + response);
        this.router.navigate(['/']);
      } else {
        alert('Failed to add Student');
      }});
  }

  ngOnInit() {
  }

}

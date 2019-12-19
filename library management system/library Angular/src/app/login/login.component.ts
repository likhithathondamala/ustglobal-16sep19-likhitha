import { Component, OnInit } from '@angular/core';
import { LoginResponse } from '../LoginResponse';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';
import { HttpClient } from '@angular/common/http';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  ngOnInit() {

  }

  constructor(private http: HttpClient,
              private router: Router,
              private service: AuthService) { }

login(form: NgForm) {
console.log(form);
this.http.post<LoginResponse>(`${this.service.baseURL}/login/${form.value.id}/
${form.value.password}`, form.value)
.subscribe(response => {
  // console.log(response.type);
  // console.log(response);
  
  if (response != null && response.type === 'admin') {
    alert('Login Success');
    this.router.navigate(['/']);
    this.service.isALoggedIn = true;
  
  } else if (response != null && response.type === 'Librarian') {
    alert('Login Success');
    this.router.navigate(['/']);
    this.service.isLLoggedIn = true;
    

  } else if (response != null && response.type === 'Student') {
    alert('Login Success');
    this.router.navigate(['/']);
    this.service.isSLoggedIn = true;
  } else  {
   alert('Login Failed');
  }
},err => {
  console.log(err);
  if(err){
 alert('Login Credentials are invalid');
  }
});
}



}

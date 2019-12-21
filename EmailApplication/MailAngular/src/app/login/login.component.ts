import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { MailService } from '../mail.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  error: string;
  constructor(private auth: MailService , private router: Router) { }

  Loginform(form: NgForm) {
    // tslint:disable-next-line: no-unused-expression
    this.error == null;
    console.log(form.value);
    this.auth.login(form.value).subscribe(data => {
      console.log('Response of login', data);

      if (data && data.message === 'Login succesful') {
        localStorage.setItem('userDetails', JSON.stringify(data));

        this.router.navigateByUrl('/mail-list');
        // this.router.navigateByUrl('/');
      }
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });

  }

  ngOnInit() {
  }




}

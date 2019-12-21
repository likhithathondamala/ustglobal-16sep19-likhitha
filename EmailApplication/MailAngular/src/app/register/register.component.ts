import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { MailService } from '../mail.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  message: string;

  constructor(private auth: MailService, private router: Router) { }


  Registerform(registerform: NgForm) {
    console.log(registerform.value);
    this.auth.register(registerform.value).subscribe(data => {
      console.log(data);
      if (data.statusCode === 201) {
        this.message = 'success';
        localStorage.setItem('userDetails', JSON.stringify(data));
        alert('Registration success')
        this.router.navigateByUrl('/');
      } else {
        alert ('already registered.... please login')
      }
      registerform.reset();
    });
  }

  ngOnInit() {
  }


}

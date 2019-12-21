import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { MailService } from '../mail.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-change',
  templateUrl: './change.component.html',
  styleUrls: ['./change.component.css']
})
export class ChangeComponent implements OnInit {

  constructor(private auth: MailService, private router: Router) { }

  ngOnInit() {
  }

  changeform(form: NgForm) {
    console.log(form);

    this.auth.login(form.value).subscribe(data => {
      console.log('Response of login', data);

      if (data && data.message === 'Login succesful') {
        localStorage.setItem('userDetails', JSON.stringify(data));

        this.router.navigateByUrl('/mail-list');
        // this.router.navigateByUrl('/');
      }
      form.reset();
    });
  }
}

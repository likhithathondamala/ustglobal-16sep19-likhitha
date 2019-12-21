import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { MailService } from '../mail.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-compose',
  templateUrl: './compose.component.html',
  styleUrls: ['./compose.component.css']
})
export class ComposeComponent implements OnInit {

  constructor(private service: MailService, private router: Router) { }

  ngOnInit() {
  }
  compose(composeForm: NgForm) {
    this.service.composeMails(composeForm.value).subscribe(response => {
      if (response) {
        alert('Message Sent');
        this.router.navigate(['/']);
      } else {
        alert('Failed to send message ');
      }
    });
  }

}

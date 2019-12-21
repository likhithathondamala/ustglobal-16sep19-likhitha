import { Component, OnInit } from '@angular/core';
import { MailService } from '../mail.service';

@Component({
  selector: 'app-sent',
  templateUrl: './sent.component.html',
  styleUrls: ['./sent.component.css']
})
export class SentComponent implements OnInit {

  mail;
  constructor(private service: MailService) {
    console.log('constructor got excecuted');
    this.getMails();
  }
  getMails() {
    console.log('hi from product component');
    this.service.getMails().subscribe(res => {
      console.log(res);
      this.mail = res;
    }, err => {
      console.log(err);
    });
    console.log('subscription ended');
  }


  ngOnInit() {
  }

}

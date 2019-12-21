import { Component, OnInit } from '@angular/core';
import { MailService } from '../mail.service';

@Component({
  selector: 'app-mail-list',
  templateUrl: './mail-list.component.html',
  styleUrls: ['./mail-list.component.css']
})
export class MailListComponent implements OnInit {
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


  delete(mails) {
    console.log(mails);
    this.service.delete(mails.mid).subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('deleted successfully');
    })
  }
  ngOnInit() { }
}


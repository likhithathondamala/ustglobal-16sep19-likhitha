import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { BookTransactionResponse } from '../../bookTransaction.response';
import { AuthService } from '../auth.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-return-book',
  templateUrl: './return-book.component.html',
  styleUrls: ['./return-book.component.css']
})
export class ReturnBookComponent implements OnInit {
  ngOnInit() {
    
  }

  constructor(private http:HttpClient,private service:AuthService,private router:Router) { }
  issue(returnForm: NgForm) {
    console.log(returnForm.value);
    this.http.post(`${this.service.baseURL}/returnbook`, returnForm.value, {headers: this.service.header}).subscribe(response => {
      returnForm.reset();
      if (response) {
        alert('Book is issued   ' + response);
        this.router.navigate(['/']);
      } else {
        alert('Failed to return book');
      }});
  }


}

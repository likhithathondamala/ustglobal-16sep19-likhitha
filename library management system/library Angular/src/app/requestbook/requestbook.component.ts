import { Component, OnInit } from '@angular/core';

import { HttpClient } from '@angular/common/http';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

import { BookResponse } from 'src/bookResponse';

@Component({
  selector: 'app-requestbook',
  templateUrl: './requestbook.component.html',
  styleUrls: ['./requestbook.component.css']
})
export class RequestbookComponent implements OnInit {

 books:BookResponse;

  constructor(private http: HttpClient,private service: AuthService, private router: Router) {
    this.getData();
   }

  ngOnInit() {
  }

  getData() {
    this.http.get<BookResponse>(`${this.service.baseURL}/getBooks`).subscribe(response => {
      this.books = response;
      console.log(this.books);
    });
  }

  searchBook(book) {
    this.http.get(`${this.service.baseURL}//request/${book.bid}`).subscribe(resp =>{
      console.log(resp);
      if(resp) {
        this.getData();
        alert('Book requested successfully');
      } else {
        alert('Book not avaliable');
      }
      console.log(resp);
      this.getData();
    });
  }
}

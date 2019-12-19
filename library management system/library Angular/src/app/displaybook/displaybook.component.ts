import { Component, OnInit } from '@angular/core';

import { HttpClient } from '@angular/common/http';
import { AuthService } from '../auth.service';
import { BookResponse } from 'src/bookResponse';


@Component({
  selector: 'app-displaybook',
  templateUrl: './displaybook.component.html',
  styleUrls: ['./displaybook.component.css']
})
export class DisplaybookComponent implements OnInit {
 book: BookResponse;
  constructor(private http: HttpClient ,
              private service: AuthService) { 
this.getData();
              }
  ngOnInit() {
  }
  getData() {
    this.http.get<BookResponse>(`${this.service.baseURL}/getBooks`).subscribe(response => {
      this.book = response;
      console.log(this.book);
    });
  }
  deleteLibrarian(books) {
    this.http.delete(`${this.service.baseURL}/deletebook/${books.bid}`).subscribe(resData => {
      if (resData) {
        console.log(resData);
        this.getData();
      } else {
        alert('Failed to Delete Book');
      }
      console.log(resData);
      this.getData();
    }, err => {
      console.log(err);
    });
  }



}

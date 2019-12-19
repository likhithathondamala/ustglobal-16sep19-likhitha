import { Component, OnInit } from '@angular/core';
import { BookTransactionResponse } from 'src/bookTransaction.response';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-issuebook',
  templateUrl: './issuebook.component.html',
  styleUrls: ['./issuebook.component.css']
})
export class IssuebookComponent implements OnInit {
issuedBook : BookTransactionResponse;
  issuedBooks: any;

  constructor(private http: HttpClient, private router: Router,private service: AuthService) {
    this.getIssueBook();
   }

  ngOnInit() {
  }
 getIssueBook(){
   this.http.get<BookTransactionResponse>(`${this.service.baseURL}/getBookIssues`).subscribe(response=>{
   this.issuedBooks = response;
   console.log(this.issuedBooks);
   });
 }

  }



import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-issue-books',
  templateUrl: './issue-books.component.html',
  styleUrls: ['./issue-books.component.css']
})
export class IssueBooksComponent implements OnInit {

  constructor(private http:HttpClient,private service:AuthService,private router:Router) { }
  issue(issueForm: NgForm) {
    console.log(issueForm.value);
    this.http.post(`${this.service.baseURL}/createissue`, issueForm.value, {headers: this.service.header}).subscribe(response => {
      issueForm.reset();
      if (response) {
        alert('Book is issued   ' + response);
        this.router.navigate(['/']);
      } else {
        alert('Failed to add Student');
      }});
  }

  ngOnInit() {
  }

}

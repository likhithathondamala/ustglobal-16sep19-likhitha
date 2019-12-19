import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';
import { NgForm } from '@angular/forms';


@Component({
  selector: 'app-addbook',
  templateUrl: './addbook.component.html',
  styleUrls: ['./addbook.component.css']
})
export class AddbookComponent implements OnInit {

  constructor(private http: HttpClient , private router: Router, private service: AuthService) { }

  addBook(addBookForm: NgForm) {
    console.log(addBookForm.value);
    this.http.post(`${this.service.baseURL}/createbook`, addBookForm.value, {headers: this.service.header}).subscribe(response => {
      addBookForm.reset();
      if (response) {
        alert('Book Added Note this ID   ' + response);
        this.router.navigate(['/']);
      } else {
        alert('Failed to add Book');
      }});
  }

  ngOnInit() {
  }

}

import { Component, OnInit } from '@angular/core';
import { NgForm, FormGroup, FormControl, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-addlibrarian',
  templateUrl: './addlibrarian.component.html',
  styleUrls: ['./addlibrarian.component.css']
})
export class AddlibrarianComponent implements OnInit {

//   get name(){
//     return this.addLibrarianForm.get('name');
//   }
//   get email(){
//     return this.addLibrarianForm.get('email');
//   }
//   get password(){
//     return this.addLibrarianForm.get('password');
//   }
// addLibrarianForm = new FormGroup({
//   name: new FormControl('', [Validators.required, Validators.minLength(5)]),
//   password: new FormControl('', [Validators.required, Validators.minLength(6)]),
//   email: new FormControl('', [Validators.required, Validators.email, Validators.minLength(4)]) ,

// })
  constructor(private http: HttpClient,private router: Router,private service: AuthService) { }

  addLibrarian(addLibrarianForm: NgForm) {
    console.log(addLibrarianForm.value);
    this.http.post(`${this.service.baseURL}/adduser`, addLibrarianForm.value, {headers: this.service.header}).subscribe(response => {
      addLibrarianForm.reset();
      if (response) {
        alert('Librarian Added Note this ID for Login  ' + response);
        this.router.navigate(['/']);
      } else {
        alert('Failed to add Librarian');
      }});
  }

  ngOnInit() {
  }

}

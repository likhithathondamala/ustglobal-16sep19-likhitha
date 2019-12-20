import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent implements OnInit {
  ngOnInit() {

  }
  
     constructor(private http: HttpClient , private router: Router, private service: AuthService){}
  addproduct(addproductForm: NgForm) {
    console.log(addproductForm.value);
    this.http.post(`${this.service.baseURL}/add`, addproductForm.value, {headers: this.service.header}).subscribe(response => {
      addproductForm.reset();
      if (response) {
        alert('Product Added Note this ID   ' + response);

      } else {
        alert('Failed to add Product');
      }});
  }

}

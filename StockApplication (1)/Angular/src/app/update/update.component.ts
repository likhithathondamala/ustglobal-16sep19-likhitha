import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  constructor(private http: HttpClient , private router: Router, private service: AuthService){}
  updateproduct(updateproductForm: NgForm) {
    console.log(updateproductForm.value);
    this.http.post(`${this.service.baseURL}/modify`, updateproductForm.value, {headers: this.service.header}).subscribe(response => {
      updateproductForm.reset();
      if (response) {
        alert('Product updated Note this ID   ' + response);

      } else {
        alert('Failed to update Product');
      }});
  }

  ngOnInit() {
  }

}

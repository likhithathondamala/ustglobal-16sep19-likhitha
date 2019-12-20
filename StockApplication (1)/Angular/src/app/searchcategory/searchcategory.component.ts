import { Component, OnInit } from '@angular/core';
import { ProductResponse } from '../productresponse';
import { AuthService } from '../auth.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-searchcategory',
  templateUrl: './searchcategory.component.html',
  styleUrls: ['./searchcategory.component.css']
})
export class SearchcategoryComponent implements OnInit {

  data: ProductResponse;

  constructor(private service:AuthService,private http:HttpClient,private router:Router) { }

  ngOnInit() {
  }
  getProductInfo(Productname){
    console.log(Productname.value);
    this.http.get<ProductResponse>(`${this.service.baseURL}/getbycategory/${Productname.value.category}`).subscribe(response =>{
      console.log(response);
      if (response!=null)  {
        this.data =response;
        alert('Product found');
        console.log(response);
      } else {
        alert('no Product found ' );
      }
     
    });
  }
}

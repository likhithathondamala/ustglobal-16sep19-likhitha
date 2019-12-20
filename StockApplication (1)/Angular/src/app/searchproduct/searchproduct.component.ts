import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { ProductResponse } from '../productresponse';

@Component({
  selector: 'app-searchproduct',
  templateUrl: './searchproduct.component.html',
  styleUrls: ['./searchproduct.component.css']
})
export class SearchproductComponent implements OnInit {
  

  data: ProductResponse;

  constructor(private service:AuthService,private http:HttpClient,private router:Router) { }

  ngOnInit() {
  }
  getProductInfo(Productname){
    console.log(Productname.value);
    this.http.get<ProductResponse>(`${this.service.baseURL}/getbyname/${Productname.value.name}`).subscribe(response =>{
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

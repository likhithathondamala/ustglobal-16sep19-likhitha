import { Component, OnInit } from '@angular/core';
import { ProductResponse } from '../productresponse';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-searchcompany',
  templateUrl: './searchcompany.component.html',
  styleUrls: ['./searchcompany.component.css']
})
export class SearchcompanyComponent implements OnInit {

  data: ProductResponse;

  constructor(private service:AuthService,private http:HttpClient,private router:Router) { }

  ngOnInit() {
  }
  getProductInfo(Productname){
    console.log(Productname.value);
    this.http.get<ProductResponse>(`${this.service.baseURL}/getbycompany/${Productname.value.company}`).subscribe(response =>{
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

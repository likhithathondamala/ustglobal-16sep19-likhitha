import { Component, OnInit } from '@angular/core';
import { RegistrationResponse } from '../registrationResponse';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { BookTransactionResponse } from '../../bookTransaction.response';

@Component({
  selector: 'app-viewrequest',
  templateUrl: './viewrequest.component.html',
  styleUrls: ['./viewrequest.component.css']
})
export class ViewrequestComponent implements OnInit {
  requests: RegistrationResponse;
  acceptedRequest: BookTransactionResponse;
  constructor(private service: AuthService,
              private http: HttpClient,
              private router: Router) {
    this.getRequest();
  }
  getRequest() {
    this.http.get<RegistrationResponse>(`${this.service.baseURL}/viewRequest`).subscribe(response => {
      this.requests = response;
      console.log(this.requests);
    });
  }
  accept(request){
    this.router.navigate(['/issuebooks']);
  }
  
  ngOnInit() {
  }

}


import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
baseURL = ' http://localhost:8080/librarymanagement';
header = new HttpHeaders({'content-type' : 'application/json'});
isALoggedIn = false;
isLLoggedIn = false;
isSLoggedIn = false;


constructor(private http: HttpClient) { }

isAdminLoggedIn() {
  if (this.isALoggedIn) {
    return true;
  }
  return false;
}

isLibrarianLoggedIn() {
  if (this.isLLoggedIn) {
    return true;
  }
  return false;
}

isStudentLoggedIn() {
  if (this.isSLoggedIn) {
    return true;
  }
  return false;
}

}

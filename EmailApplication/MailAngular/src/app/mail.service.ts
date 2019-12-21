import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MailService {

  constructor(private http: HttpClient) { }

  register(user): Observable<any> {
    return this.http.post('http://localhost:8083/user/register', user);
  }

  login(user): Observable<any> {
    return this.http.post(`http://localhost:8083/user/login/${user.email}/${user.password}`, user);
  }
  getMails(): Observable<any> {
    return this.http.get('http://localhost:8083/user/get-all-messages');
  }
  composeMails(mail): Observable<any> {
    return this.http.post('http://localhost:8083/user/compose', mail);
  }
  delete(mid: number): Observable<any> {
    return this.http.delete(`http://localhost:8083/user/delete/${mid}`);
  }
  changepassword(user): Observable<any> {
    return this.http.post(`http://localhost:8083/user/changepassword`, user);
  }
}

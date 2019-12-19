import { Component, OnInit } from '@angular/core';
import { StudentResponse } from '../studentResponse';
import { HttpClient } from '@angular/common/http';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-showalllibrarian',
  templateUrl: './showalllibrarian.component.html',
  styleUrls: ['./showalllibrarian.component.css']
})
export class ShowalllibrarianComponent implements OnInit {

  
 
  LibrarianData: any;
  librarian: StudentResponse;

  constructor(private http: HttpClient, 
              private service: AuthService) {
    this.getData();
    // this.getDatas();
  }

  ngOnInit() {
  }

  getData(){
    this.http.get<StudentResponse>(`${this.service.baseURL}/displaylibrarian`).subscribe(response=>{
      this.librarian = response;
      console.log(this.librarian);
    });
  }


deleteLibrarian(librarians) {
  this.http.delete(`${this.service.baseURL}/deletelib/${librarians.id}`).subscribe(resData => {
    if (resData) {
      console.log(resData);
      this.getData();
    } else {
      alert('Failed to Delete Librarian');
    }
    console.log(resData);
    this.getData();
  }, err => {
    console.log(err);
  });
}


}

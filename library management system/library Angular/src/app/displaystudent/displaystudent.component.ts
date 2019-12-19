import { Component, OnInit, PipeTransform } from '@angular/core';
import { StudentResponse } from '../studentResponse';
import { HttpClient } from '@angular/common/http';
import { AuthService } from '../auth.service';
import { pipe } from 'rxjs';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-displaystudent',
  templateUrl: './displaystudent.component.html',
  styleUrls: ['./displaystudent.component.css']
})

export class DisplaystudentComponent implements OnInit {

  student: StudentResponse;
 
  StudentData: any;

  constructor(private http: HttpClient, 
              private service: AuthService) {
    this.getData();
    // this.getDatas();
  }

  ngOnInit() {
  }

  getData(){
    this.http.get<StudentResponse>(`${this.service.baseURL}/getusers`).subscribe(response=>{
      this.student = response;
      console.log(this.student);
    });
  }

getStudentInfo(Student){
  console.log(Student.value);
  this.http.get(`${this.service.baseURL}/getStudent/${Student.value.id}`).subscribe(response =>{
    console.log(response);
    if (response!=null)  {
      alert('student found');
      console.log(response);
    } else {
      alert('no student found ' );
    }
    this.StudentData =response;
  });
}

deleteLibrarian(students) {
  this.http.delete(`${this.service.baseURL}/deleteStudent/${students.id}`).subscribe(resData => {
    if (resData) {
      console.log(resData);
      this.getData();
    } else {
      alert('Failed to Delete Student');
    }
    console.log(resData);
    this.getData();
  }, err => {
    console.log(err);
  });
}




}
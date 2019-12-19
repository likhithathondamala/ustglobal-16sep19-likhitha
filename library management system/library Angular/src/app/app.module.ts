import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import {  RouterModule } from '@angular/router';
import { AddbookComponent } from './addbook/addbook.component';
import { AdduserComponent } from './adduser/adduser.component';
import { AddlibrarianComponent } from './addlibrarian/addlibrarian.component';
import { DisplaystudentComponent } from './displaystudent/displaystudent.component';
import { DisplaybookComponent } from './displaybook/displaybook.component';
import { RequestbookComponent } from './requestbook/requestbook.component';
import { ViewrequestComponent } from './viewrequest/viewrequest.component';
import { ReturnBookComponent } from './return-book/return-book.component';
import { IssuebookComponent } from './issuebook/issuebook.component';
import { ShowalllibrarianComponent } from './showalllibrarian/showalllibrarian.component';
import { IssueBooksComponent } from './issue-books/issue-books.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HeaderComponent,
    HomeComponent,
    AddbookComponent,
    AdduserComponent,
    AddlibrarianComponent,
    DisplaystudentComponent,
    DisplaybookComponent,
    RequestbookComponent,
    ViewrequestComponent,
    ReturnBookComponent,
    IssuebookComponent,
    ShowalllibrarianComponent,
    IssueBooksComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      {path : '' , component : HomeComponent},
      {path : 'login', component : LoginComponent},
      {path : 'addbook', component: AddbookComponent},
      {path : 'adduser', component : AdduserComponent},
      {path : 'displaybook', component : DisplaybookComponent},
      {path : 'addlibrarian', component : AddlibrarianComponent},
      {path : 'displayusers', component : DisplaystudentComponent},
      {path : 'requestbook', component : RequestbookComponent},
      {path : 'viewrequest', component : ViewrequestComponent},
      {path : 'returnbook', component : ReturnBookComponent},
      {path : 'issuedbook', component : IssuebookComponent},
      {path : 'showalllibrarian', component: ShowalllibrarianComponent},
      {path : 'issuebooks', component:IssueBooksComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

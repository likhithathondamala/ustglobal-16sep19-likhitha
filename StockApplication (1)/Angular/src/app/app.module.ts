import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { AddproductComponent } from './addproduct/addproduct.component';
import { RouterModule } from '@angular/router';
import { SearchproductComponent } from './searchproduct/searchproduct.component';
import { UpdateComponent } from './update/update.component';
import { SearchcategoryComponent } from './searchcategory/searchcategory.component';
import { SearchcompanyComponent } from './searchcompany/searchcompany.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AddproductComponent,
    SearchproductComponent,
    UpdateComponent,
    SearchcategoryComponent,
    SearchcompanyComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule,
    RouterModule.forRoot([
      { path : 'addproduct', component: AddproductComponent},
      { path : 'searchproduct', component : SearchproductComponent},
      { path : 'searchcategory', component: SearchcategoryComponent},
      { path : 'searchcompany', component: SearchcompanyComponent},
      {path : 'update',component:UpdateComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

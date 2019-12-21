import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HeaderComponent } from './header/header.component';
import { SidenavComponent } from './sidenav/sidenav.component';
import { ChangeComponent } from './change/change.component';
import { ComposeComponent } from './compose/compose.component';
import { MailListComponent } from './mail-list/mail-list.component';
import { SentComponent } from './sent/sent.component';


const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'header', component: HeaderComponent },
  { path: 'sidenav', component: SidenavComponent },
  { path: 'forgot', component: ChangeComponent },
  { path: 'compose', component: ComposeComponent },
  { path: 'mail-list', component: MailListComponent },
  { path: 'sent', component: SentComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

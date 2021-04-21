import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PersonComponent } from './form/person/person.component';
import { PeopleComponent } from './form/people/people.component';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { UpdatePersonComponent } from './form/update-person/update-person.component';
import { CreatePersonComponent } from './form/create-person/create-person.component';
import { ModalModule } from 'ngx-bootstrap/modal';
import { HomeComponent } from './navegation/home/home.component';
import { cpfPipe } from './pip/cpfPip';
import { fonePip } from './pip/fonePip';
import { AuthInterceptor } from 'src/http.interceptor';
import { LoginAuthComponent } from './login/login-auth/login-auth.component';


@NgModule({
  declarations: [
    AppComponent,
    PersonComponent,
    PeopleComponent,
    HomeComponent,
    UpdatePersonComponent,
    CreatePersonComponent,
    cpfPipe,
    fonePip,
    LoginAuthComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ModalModule.forRoot(),
    FormsModule

  ],
  providers: [{
    provide: HTTP_INTERCEPTORS,
    useClass: AuthInterceptor,
    multi: true
  }],

  bootstrap: [AppComponent]
})
export class AppModule { }

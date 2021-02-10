import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PersonComponent } from './form/person/person.component';
import { PeopleComponent } from './form/people/people.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { UpdatePersonComponent } from './form/update-person/update-person.component';
import { CreatePersonComponent } from './form/create-person/create-person.component';

@NgModule({
  declarations: [
    AppComponent,
    PersonComponent,
    PeopleComponent,
    UpdatePersonComponent,
    CreatePersonComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

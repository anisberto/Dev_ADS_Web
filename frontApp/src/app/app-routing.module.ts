import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreatePersonComponent } from './form/create-person/create-person.component';
import { PersonComponent } from './form/person/person.component';
import { UpdatePersonComponent } from './form/update-person/update-person.component';
import { HomeComponent } from './navegation/home/home.component';

const routes: Routes = [
  {path:"",component:HomeComponent},
  {path:"personUpdate/:id",component:UpdatePersonComponent},
  {path:"listPerson",component:PersonComponent},
  {path:"createPerson",component:CreatePersonComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

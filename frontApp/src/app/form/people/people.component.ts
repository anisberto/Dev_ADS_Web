import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Person } from '../person';
import { PersonService } from '../person.service';

@Component({
  selector: 'app-people',
  templateUrl: './people.component.html',
  styleUrls: ['./people.component.css']
})
export class PeopleComponent implements OnInit {
  people: Person[] = [];
  person: any;
  
  constructor(private personService: PersonService,private router: Router) { }

  ngOnInit(): void {
    this.personService.getPerson().subscribe((per: Person[])=>{
      this.people = per
    })
  }

  deletePerson(id: number){
    this.personService.deletePerson(id).subscribe((data)=>{this.person=data})
    alert("Person was deleted")
    document.location.reload(true);
  }
}

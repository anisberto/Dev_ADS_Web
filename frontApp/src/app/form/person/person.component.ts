import { Component, OnInit } from '@angular/core';
import { Person } from '../person';
import { PersonService } from '../person.service';

@Component({
  selector: 'app-person',
  templateUrl: './person.component.html',
  styleUrls: ['./person.component.css']
})
export class PersonComponent implements OnInit {
  person: Person={
    nome:'',
    email: '',
    cpf: '',
    telefone: ''
  }
  constructor(private personService: PersonService) { }

  ngOnInit(): void {
  }

  savePerson(){
    alert(this.person.nome)
    this.personService.addPerson(this.person).subscribe(()=>{
      alert("Person was created!")
    })
  }
}
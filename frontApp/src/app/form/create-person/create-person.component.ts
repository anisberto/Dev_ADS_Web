import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Person } from '../person';
import { PersonService } from '../person.service';

@Component({
  selector: 'app-create-person',
  templateUrl: './create-person.component.html',
  styleUrls: ['./create-person.component.css']
})
export class CreatePersonComponent implements OnInit {

  person: Person={
    nome:'',
    email: '',
    telefone: ''
  }
  constructor(private personService: PersonService , private router: Router) { }

  ngOnInit(): void {
  }
  update(){
    if(this.person == null){
      alert("Preencha todos os itens")
    }else{
      this.personService.updatePerson(this.person).subscribe(()=>{
      })
      this.router.navigate(["/listPerson"]);
    }
  }

}

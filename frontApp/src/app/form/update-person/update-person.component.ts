import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Person } from '../person';
import { PersonService } from '../person.service';

@Component({
  selector: 'app-update-person',
  templateUrl: './update-person.component.html',
  styleUrls: ['./update-person.component.css']
})
export class UpdatePersonComponent implements OnInit {
  person?: any={
    nome:'',
    email: '',
    telefone: ''
  }
  constructor(private personService: PersonService , private router: Router,private route: ActivatedRoute) { }

  ngOnInit(): void {
    const id = this.route.snapshot.paramMap.get("id");
    this.personService.getPersonById(id).subscribe((per) => {
      this.person = per;
    });
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

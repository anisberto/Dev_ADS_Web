import { Component, OnInit, Pipe, TemplateRef } from '@angular/core';
import { Router } from '@angular/router';
import { Person } from '../person';
import { PersonService } from '../person.service';

import { BsModalService, BsModalRef } from 'ngx-bootstrap/modal';
import { cpfPipe } from 'src/app/pip/cpfPip';

@Component({
  selector: 'app-people',
  templateUrl: './people.component.html',
  styleUrls: ['./people.component.css']
})
export class PeopleComponent implements OnInit {
  people: Person[] = [];
  person: any;
  modalRef: BsModalRef = new BsModalRef;
  message: any;

  constructor(private personService: PersonService, private router: Router,private modalService: BsModalService) { }

  ngOnInit(): void {
    this.personService.getPerson().subscribe((per: Person[]) => {
      this.people = per
    })
  }

  deletePerson(id: number) {
    this.personService.deletePerson(id).subscribe(
      (data) => {
        this.person = data
      })
    this.load();
  }
  load() {
    location.reload()
  }

  openModal(template: TemplateRef<any>) {
    this.modalRef = this.modalService.show(template, {class: 'modal-sm'});
  }
 
  confirm(id: number): void {
    this.deletePerson(id);
    this.modalRef.hide();
  }
 
  decline(): void {
    this.modalRef.hide();
  }
}

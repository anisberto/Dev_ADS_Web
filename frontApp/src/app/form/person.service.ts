import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Person } from './person';

import {environment} from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class PersonService {

  constructor(private httpcliente: HttpClient) { }

  getPerson(): Observable<Person[]> {
    const url = `${environment.url}`;
    return this.httpcliente.get<Person[]>(url);
  }

  getPersonById(id: any): Observable<Person> {
    const url = `${environment.url}/${id}`;
    return this.httpcliente.get<Person>(url);
  }

  addPerson(person: Person): Observable<Person>{
    return this.httpcliente.post<Person>(environment.url,person);
  }

  deletePerson(id: any): Observable<Person>{
    return this.httpcliente.delete<Person>(`${environment.url}/${id}/ads`);
  }

  updatePerson(person: Person): Observable<Person>{
    return this.httpcliente.put<Person>(environment.url,person);
  }
}

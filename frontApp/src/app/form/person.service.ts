import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

import {environment} from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class PersonService {

  constructor(private httpcliente: HttpClient) { }

  getPerson(): Observable<any[]> {
    const url = `${environment.url}`;
    return this.httpcliente.get<any[]>(url);
  }

  getPersonById(id: any): Observable<any> {
    const url = `${environment.url}/${id}`;
    return this.httpcliente.get<any>(url);
  }

  addPerson(person: any): Observable<any>{
    return this.httpcliente.post<any>(environment.url,person);
  }

  deletePerson(id: any): Observable<any>{
    return this.httpcliente.delete<any>(`${environment.url}/${id}/ads`);
  }

  updatePerson(person: any): Observable<any>{
    return this.httpcliente.put<any>(environment.url,person);
  }
}

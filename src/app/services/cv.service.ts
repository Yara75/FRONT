import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Infos } from '../models/infos.model';

@Injectable({
  providedIn: 'root'
})
export class CvService {

  private baseUrl = 'http://localhost:8080/infos'; 

  constructor(private http: HttpClient) { }

  getAllInfos(): Observable<any[]> {
    return this.http.get<any[]>(this.baseUrl); 
  }


  enregistrerInfos(info: Infos): Observable<any> {
    console.log('Appel de la méthode enregistrerInfos() avec les informations:', info);
    return this.http.post<any>('http://localhost:8080/infos/enregistrer', info);
  }
}





import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Diploma, Expro, Infos, PersonalInfo } from '../models/infos.model';
import { Certif, Skills, Hobbie, Contact } from 'models/home.model';

@Injectable({
  providedIn: 'root'
})
export class CvService {

  private baseUrl = 'http://localhost:8080/infos'; 
  private baseUrlD = 'http://localhost:8080/Diploma';
  constructor(private http: HttpClient) { }

  getAllInfos(): Observable<any[]> {
    return this.http.get<any[]>(this.baseUrl); 
  }


  enregistrerInfos(info: Infos): Observable<any> {
    console.log('Appel de la méthode enregistrerInfos() avec les informations:', info);
    return this.http.post<any>('http://localhost:8080/infos/enregistrer', info);
  }

  addDiploma(diplomes : Diploma): Observable<any>{
    console.log('Appel de la méthode addDiploma() avec les informations:', diplomes);
    return this.http.post<any>('http://localhost:8080/Diploma/enregistrer', diplomes);
  }  

  addPro(expro : Expro): Observable<any>{
    console.log('Appel de la méthode addPro() avec les informations:', expro);
    return this.http.post<any>('http://localhost:8080/ExPro', expro);
  } 
  
  addSkills(skills : Skills): Observable<any>{
    console.log('Appel de la méthode addSkills() avec les informations:', skills);
    return this.http.post<any>('http://localhost:8080/Skills', skills);
  }  

  addCertif(certif : Certif): Observable<any>{
    console.log('Appel de la méthode addCertif() avec les informations:', certif);
    return this.http.post<any>('http://localhost:8080/Certif', certif);
  }  

  addHobbie(hobbie : Hobbie): Observable<any>{
    console.log('Appel de la méthode addCertif() avec les informations:', hobbie);
    return this.http.post<any>('http://localhost:8080/Hobbie', hobbie);
  } 

  addContact(contact : Contact): Observable<any>{
    console.log('Appel de la méthode addContact() avec les informations:', contact);
    return this.http.post<any>('http://localhost:8080/Contact', contact);
  }

  addPersonalInfo(personalinfo : PersonalInfo): Observable<any>{
    console.log('Appel de la méthode addpersonalinfo() avec les informations:', personalinfo);
    return this.http.post<any>('http://localhost:8080/PersonalInfo', personalinfo);
  }
}






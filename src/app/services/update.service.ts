import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Diploma, Expro, Infos, PersonalInfo } from '../models/infos.model';
import { Certif, Skills, Hobbie, Contact, ExPro } from 'models/home.model';

@Injectable({
  providedIn: 'root'
})

export class CvService {

  private baseUrl = 'http://localhost:8080/PersonalInfo';
  private baseUrlD = 'http://localhost:8080/Diploma';
  private baseUrlE = 'http://localhost:8080/ExPro'; 
  private baseUrlS = 'http://localhost:8080/Skills';
  private baseUrlC = 'http://localhost:8080/Certif';
  private baseUrlH = 'http://localhost:8080/Hobbie';
  private baseUrlCT = 'http://localhost:8080/Contact';     
  

  constructor(private http: HttpClient) { }

  getAllInfos(): Observable<any[]> {
    return this.http.get<any[]>(this.baseUrl); 
  }

  getAllDiplomes(): Observable<any[]> {
    return this.http.get<any[]>(this.baseUrlD); 
  }

  getAllExPro(): Observable<any[]> {
    return this.http.get<any[]>(this.baseUrlE); 
  }

  getAllSkills(): Observable<any[]> {
    return this.http.get<any[]>(this.baseUrlS); 
  }

  getAllCertif(): Observable<any[]> {
    return this.http.get<any[]>(this.baseUrlC); 
  }

  getAllHobbie(): Observable<any[]> {
    return this.http.get<any[]>(this.baseUrlH); 
  }

  getAllContact(): Observable<any[]> {
    return this.http.get<any[]>(this.baseUrlCT); 
  }

  updatePersonalInfo(personalinfo : PersonalInfo, id: number): Observable<any>{
    console.log('Appel de la méthode updatepersonalinfo() avec les informations:', personalinfo);
    console.log('id:', id);
    return this.http.post<any>('http://localhost:8080/PersonalInfo/2', personalinfo);
  }

  updateDiplomaById(diplome: Diploma, id: number): Observable<any> {
    console.log('Appel de la méthode updateDiploma() avec les informations:', diplome);
    console.log(id);
    const numericId: number = Number(id); 
    return this.http.post<any>(`http://localhost:8080/Diploma/${numericId}`, diplome);
  }
 
  //Ajouter le update by id dans le BACK 
  updateExProById(expro: ExPro, id: number): Observable<any> {
    console.log('Appel de la méthode updateDiploma() avec les informations:', expro);
    console.log(id);
    const numericId: number = Number(id); 
    return this.http.post<any>(`http://localhost:8080/ExPro/${numericId}`, expro);
  }

//Ajouter le update by id dans le BACK 
  updateSkillsById(skills: Skills, id: number): Observable<any> {
    console.log('Appel de la méthode updateDiploma() avec les informations:', skills);
    console.log(id);
    const numericId: number = Number(id); 
    return this.http.post<any>(`http://localhost:8080/Skills/${numericId}`, skills);
  }

  //Ajouter le update by id dans le BACK 
  updateCertifById(certif: Certif, id: number): Observable<any> {
    console.log('Appel de la méthode updateDiploma() avec les informations:', certif);
    console.log(id);
    const numericId: number = Number(id); 
    return this.http.post<any>(`http://localhost:8080/Certif/${numericId}`, certif);
  }

  updateHobbie(hobbie: Hobbie, id: number): Observable<any> {
    console.log('Appel de la méthode updateDiploma() avec les informations:', hobbie);
    console.log(id);
    const numericId: number = Number(id); 
    return this.http.post<any>(`http://localhost:8080/Hobbie/${numericId}`, hobbie);
  }

}



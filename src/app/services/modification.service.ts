import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Infos } from '../models/modification.model';

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

  deleteInfo(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`);
  }

  deleteDiplome(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrlD}/${id}`);
  }

  deleteExPro(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrlE}/${id}`);
  }

  deleteSkill(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrlS}/${id}`);
  }

  deleteCertif(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrlC}/${id}`);
  }

  deleteHobbie(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrlH}/${id}`);
  }

  deleteContact(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrlCT}/${id}`);
  }
  deleteAllInfo(): Observable<any> {
    // Effectuez ici la logique pour supprimer toutes les informations de la base de données
    return this.http.delete<any>(this.baseUrl);
  }
  deleteAllDiplome(): Observable<any> {
    // Effectuez ici la logique pour supprimer toutes les informations de la base de données
    return this.http.delete<any>(this.baseUrlD);
  }
  deleteAllExpro(): Observable<any> {
    // Effectuez ici la logique pour supprimer toutes les informations de la base de données
    return this.http.delete<any>(this.baseUrlE);
  }
  deleteAllSkill(): Observable<any> {
    // Effectuez ici la logique pour supprimer toutes les informations de la base de données
    return this.http.delete<any>(this.baseUrlS);
  }
  deleteAllCertif(): Observable<any> {
    // Effectuez ici la logique pour supprimer toutes les informations de la base de données
    return this.http.delete<any>(this.baseUrlC);
  }
  deleteAllHobbie(): Observable<any> {
    // Effectuez ici la logique pour supprimer toutes les informations de la base de données
    return this.http.delete<any>(this.baseUrlH);
  }
  deleteAllContact(): Observable<any> {
    // Effectuez ici la logique pour supprimer toutes les informations de la base de données
    return this.http.delete<any>(this.baseUrlCT);
  }
}

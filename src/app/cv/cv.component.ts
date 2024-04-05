import { Component, OnInit } from '@angular/core';
import { CvService } from '../services/cv.service';
import { Infos } from '../models/infos.model';
import { Diploma, Expro, Skills, Certif } from '../models/infos.model';

@Component({
  selector: 'app-cv',
  templateUrl: './cv.component.html',
  styleUrls: ['./cv.component.scss']
})
export class CvComponent implements OnInit {

  nom: string = '';
  prenom: string = '';
  obtentionDate : Date = new Date();
  name: string = '';
  school: string = '';
  nameC: string = '';
  beginD: Date = new Date();
  endD: Date = new Date();
  job: string = '';
  domains: string = '';
  details: string = '';
  domain: string = '';

  infos: any[] | undefined;
  diplomes : any[] | undefined;
  expro: any[] | undefined;
  skills: any[] | undefined;
  certif: any[] | undefined;

  constructor(private cvService: CvService) { }

  ngOnInit(): void {
   // this.loadInfos();
  }

  loadInfos(): void {
    console.log("Méthode loadInfos() appelée.");
    this.cvService.getAllInfos().subscribe(
      (data: any[]) => {
        this.infos = data;
      },
      (error: any) => {
        console.log(error);
      }
    );
  }

  submitForm(): void {
    if (!this.name || !this.school || !this.obtentionDate) {
        console.log('Veuillez entrer un nom et un prénom valides.');
        return; 
    }  

    const diplomes: Diploma = {
      obtentionDate: this.obtentionDate,
      name: this.name,
      school: this.school
    };

    this.cvService.addDiploma(diplomes).subscribe(
        (data: any) => {
            console.log('Infos enregistrées avec succès !', data);
        },
        (error: any) => {
            console.log('Erreur lors de l\'enregistrement des infos : ', error);
        }
    );
  }

  submitFormPro(): void {
    if (!this.nameC || !this.beginD || !this.endD || !this.job) {
        console.log('Veuillez entrer des données valides.');
        return; 
    }  
    console.log('ok nous sommes passés');
    const expro: Expro = {
      nameC: this.nameC,
      beginD: this.beginD,
      endD: this.endD,
      job: this.job
    };
    
    this.cvService.addPro(expro).subscribe(
        (data: any) => {
            console.log('Infos enregistrées avec succès !', data);
        },
        (error: any) => {
            console.log('Erreur lors de l\'enregistrement des infos : ', error);
        }
    );
  }

  submitFormSkills(): void {
    if (!this.domains || !this.details) {
        console.log('Veuillez entrer des données valides.');
        return; 
    }  
    console.log('ok nous sommes passés');
    const skills: Skills = {
      domains: this.domains,
      details: this.details
    };
    
    this.cvService.addSkills(skills).subscribe(
        (data: any) => {
            console.log('Infos enregistrées avec succès !', data);
        },
        (error: any) => {
            console.log('Erreur lors de l\'enregistrement des infos : ', error);
        }
    );
  }

  submitFormCertif(): void {
    if (!this.name || !this.domain) {
        console.log('Veuillez entrer des données valides.');
        return; 
    }  
    console.log('ok nous sommes passés');

    const certif: Certif = {
      name: this.name,
      domain: this.domain
    };
    
    this.cvService.addCertif(certif).subscribe(
        (data: any) => {
            console.log('Infos enregistrées avec succès !', data);
        },
        (error: any) => {
            console.log('Erreur lors de l\'enregistrement des infos : ', error);
        }
    );
  }
  
}



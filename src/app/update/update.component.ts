import { Component, OnInit } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { CvService } from '../services/update.service';
import { Infos } from '../models/home.model';
import { Diplome } from '../models/home.model';
import { ExPro } from '../models/home.model';
import { Skills } from '../models/home.model';
import { Certif } from '../models/home.model';
import { Hobbie } from '../models/home.model';
import { Contact } from '../models/home.model';
import {PersonalInfo, Diploma } from '../models/infos.model';

@Component({
  selector: "update",
  templateUrl: "./update.component.html",
  styleUrls: ["./update.component.scss"],
})

export class UpdateComponent implements OnInit {
  nom: string = '';
  prenom: string = '';
  id: number = 0;
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
  description: string = '';
  type: string = '';
  info: string = '';
  surname: string = '';
  birth: Date = new Date();
  infos: Infos[] = [];
  diplomes: Diplome[] = [];
  expro: ExPro[] = [];
  skills: Skills[] = [];
  certif: Certif[] = [];
  hobbie: Hobbie[] = [];
  contact: Contact[] = [];

  constructor(private cvService: CvService) {} 

  ngOnInit(): void {
     this.loadInfos();
     this.loadDiplomes();
     this.loadExPro();
     this.loadSkills();
     this.loadCertif();
     this.loadHobbie();
     this.loadContact();
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

  loadDiplomes(): void {
    console.log("Méthode loadDiplomes() appelée.");
    this.cvService.getAllDiplomes().subscribe(
      (data: Diplome[]) => {
        this.diplomes = data;
      },
      (error: any) => {
        console.log(error);
      }
    );
  }

  loadExPro(): void {
    console.log("Méthode loadDiplomes() appelée.");
    this.cvService.getAllExPro().subscribe(
      (data: ExPro[]) => {
        this.expro = data;
      },
      (error: any) => {
        console.log(error);
      }
    );
  }

  loadSkills(): void {
    console.log("Méthode loadDiplomes() appelée.");
    this.cvService.getAllSkills().subscribe(
      (data: Skills[]) => {
        this.skills = data;
      },
      (error: any) => {
        console.log(error);
      }
    );
  }

  loadCertif(): void {
    console.log("Méthode loadDiplomes() appelée.");
    this.cvService.getAllCertif().subscribe(
      (data: Certif[]) => {
        this.certif = data;
      },
      (error: any) => {
        console.log(error);
      }
    );
  }

  loadHobbie(): void {
    console.log("Méthode loadHobbie() appelée.");
    this.cvService.getAllHobbie().subscribe(
      (data: Hobbie[]) => {
        this.hobbie = data;
      },
      (error: any) => {
        console.log(error);
      }
    );
  }

  loadContact(): void {
    console.log("Méthode loadHobbie() appelée.");
    this.cvService.getAllContact().subscribe(
      (data: Contact[]) => {
        this.contact = data;
      },
      (error: any) => {
        console.log(error);
      }
    );
  }


  updateFormPersonalinfo(): void {
    console.log("name = " + this.name + "surname = " + this.surname + "birth = " + this.birth + "id = " + this.id);
    if (!this.surname || !this.name || !this.birth || !this.id) {
        console.log('[UPDATE] Veuillez entrer des données valides');
        return; 
    }  
    console.log('ok nous sommes passés');

    const personalinfo: PersonalInfo = {
      surname: this.surname,
      name: this.name,
      birth: this.birth
    };
    
    this.cvService.updatePersonalInfo(personalinfo, this.id).subscribe(
        (data: any) => {
            console.log('Infos enregistrées avec succès !', data);
        },
        (error: any) => {
            console.log('Erreur lors de l\'enregistrement des infos : ', error);
        }
    );
  }


  updateFormDiploma(): void {
    console.log("name = " + this.name + "school = " + this.school + "date obtention = " + this.obtentionDate + "id = " + this.id);
    if (!this.name || !this.school  || !this.obtentionDate || !this.id) {
        console.log('[UPDATE] Veuillez entrer des données valides');
        return; 
    }  
    console.log('ok nous sommes passés');

    const diplomes: Diploma = {
      obtentionDate: this.obtentionDate,
      name: this.name,
      school: this.school
    };
    
    this.cvService.updateDiplomaById(diplomes, this.id).subscribe(
        (data: any) => {
            console.log('Infos enregistrées avec succès !', data);
        },
        (error: any) => {
            console.log('Erreur lors de l\'enregistrement des infos : ', error);
        }
    );
  }
}



import { Component, OnInit } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { CvService } from '../services/home.service';
import { Infos } from '../models/home.model';
import { Diplome } from '../models/home.model';
import { ExPro } from '../models/home.model';
import { Skills } from '../models/home.model';
import { Certif } from '../models/home.model';
import { Hobbie } from '../models/home.model';
import { Contact } from '../models/home.model';

@Component({
  selector: "home",
  templateUrl: "./home.component.html",
  styleUrls: ["./home.component.scss"],
})

export class HomeComponent implements OnInit {
  nom: string = "";
  prenom: string = "";
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
}


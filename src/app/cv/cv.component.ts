import { Component, OnInit } from '@angular/core';
import { CvService } from '../services/cv.service';
import { Infos } from '../models/infos.model';

@Component({
  selector: 'app-cv',
  templateUrl: './cv.component.html',
  styleUrls: ['./cv.component.scss']
})
export class CvComponent implements OnInit {

  nom: string = '';
  prenom: string = '';

  infos: any[] | undefined;

  constructor(private cvService: CvService) { }

  ngOnInit(): void {
    this.loadInfos();
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
    // Vérification que les valeurs de nom et prénom ne sont pas vides
    if (!this.nom || !this.prenom) {
        console.log('Veuillez entrer un nom et un prénom valides.');
        // Gérer l'erreur ici, comme afficher un message à l'utilisateur
        return; // Sortir de la fonction si les valeurs sont vides
    }

    console.log('Nom 2 :', this.nom);
    console.log('Prénom:', this.prenom);
    
    // Création de l'objet contenant les informations à envoyer
    const info: Infos = {
        nom: this.nom,
        prenom: this.prenom
    };

    // Envoi de la requête HTTP vers le backend
    this.cvService.enregistrerInfos(info).subscribe(
        (data: any) => {
            console.log('Infos enregistrées avec succès !', data);
            // Vous pouvez ajouter ici du code pour recharger les données ou afficher un message de succès.
        },
        (error: any) => {
            console.log('Erreur lors de l\'enregistrement des infos : ', error);
            // Gérer les erreurs ici, comme afficher un message d'erreur à l'utilisateur.
        }
    );

  }



  
  
}


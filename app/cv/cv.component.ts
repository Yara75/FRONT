// cv.component.ts
import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cv',
  templateUrl: './cv.component.html',
  styleUrls: ['./cv.component.scss']
})
export class CvComponent {
  nom: string = '';
  prenom: string = '';
  age: number | null = null;
  adresse: string = '';
  courriel: string = '';
  poste: string = ''; // Assurez-vous d'avoir cette déclaration

  constructor(private router: Router) {}

  submitForm() {
    // Traitement du formulaire ici
    console.log('Formulaire soumis avec les données :', this.nom, this.prenom, this.age, this.adresse, this.courriel, this.poste);

    // Redirection vers la page d'accueil après soumission du formulaire
    this.router.navigate(['/']);
  }
}

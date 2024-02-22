import { Component, OnInit } from "@angular/core";

@Component({
  selector: "home",
  templateUrl: "./home.component.html",
  styleUrls: ["./home.component.scss"],
})
export class HomeComponent implements OnInit {
  nom: string = ""; 
  prenom: string = ""; 
  courriel: string = ""; 

  constructor() {}

  ngOnInit(): void {}
}

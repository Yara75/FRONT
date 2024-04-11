// app-routing.module.ts
import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { HomeComponent } from "home/home.component";
import { StudentsComponent } from "students/students.component";
import { StudentsResolver } from "students/students.resolver";
import { StudentDetailsComponent } from "students/student-details/student-details.component";
import { StudentDetailsResolver } from "students/student-details/student-details.resolver";
import { MajorsComponent } from "majors/majors.component";
import { MajorsResolver } from "majors/majors.resolver";
import { MajorStudentsResolver } from "majors/major-students/major-students.resolver";
import { MajorStudentsComponent } from "majors/major-students/major-students.component";
import { CvComponent } from "./cv/cv.component"; // Ajoutez l'import pour CvComponent
import { MessageFormComponent } from "messageform/messageform.component";
import { modificationComponent } from "./modification/modification.component";


const routes: Routes = [
  { path: "", component: HomeComponent },
  {
    path: "etudiants",
    component: StudentsComponent,
  },
  {
    path: "details-etudiant/:id",
    component: StudentDetailsComponent,
    resolve: {
      student: StudentDetailsResolver,
    },
  },
  {
    path: "filieres",
    component: MajorsComponent,
    resolve: {
      majors: MajorsResolver,
    },
  },
  {
    path: "etudiants-filiere/:id",
    component: MajorStudentsComponent,
    resolve: {
      studentsFromMajor: MajorStudentsResolver,
    },
  },
  {
    path: "cv1", // Ajoutez la route pour le formulaire CV 1
    component: CvComponent,
  },
  {
    path: "messageform",
    component: MessageFormComponent,
  },
  {
    path: "modification",
    component: modificationComponent,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}

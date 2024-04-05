import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { catchError, tap } from "rxjs/operators";
import { Student } from "models/student.model";
import { StudentService } from "services/student.service";

@Injectable({
  providedIn: "root",
})
export class StudentsResolver {
  constructor(private studentService: StudentService) {}

  resolve(): Observable<Student[]> {
    return this.studentService.findAll().pipe(
      tap(students => console.log('Students resolved:', students)),
      catchError(error => {
        console.error('Error in StudentsResolver:', error);
        throw error; // Rethrow the error to prevent the route from being resolved
      })
    );
  }
}

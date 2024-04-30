import { Observable, Subject } from 'rxjs';
import { Injectable } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';

@Injectable({
    providedIn:'root'
})
export class AlertService {

    constructor(private snackBar:MatSnackBar){}

    displayAlert(msg: string, action?: string) {
        this.snackBar.open(msg, action, {duration : 3000});
    }
}
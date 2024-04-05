import { Observable } from 'rxjs';
import { Message } from 'models/home.model';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root'
})
export class MessageService {
    private baseUrl = "http://localhost:8080/Message"

    constructor(private http: HttpClient) {}

    sendMessage(message: Message): Observable<any[]> {
        return this.http.post<any[]>(this.baseUrl,message);
    }
}
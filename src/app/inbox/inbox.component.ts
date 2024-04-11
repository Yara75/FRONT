import { Component, OnInit } from '@angular/core';
import { Message } from '../models/home.model'
import { MessageService } from 'services/message.service';

@Component({
    selector: 'app-cv',
    templateUrl: 'inbox.component.html',
    styleUrl: 'inbox.component.scss'
})

export class InboxComponent {
    messages: Message[] = [];

    constructor(private messageService:MessageService){}

    ngOnInit(): void {
        this.loadMessages();
    }

    loadMessages(): void {
        console.log("Method loadMessages called");
        this.messageService.getMessages().subscribe(
            (data:any[]) => {
                this.messages = data;
            },
            (error: any) => {
                console.log(error);
              }
        )
    }

    deleteMessageById(id:number): void {
        console.log("Method deleteMessageById called :"+id);
        this.messageService.deleteMessageById(id).subscribe(
            () => {
                console.log("Message deleted");
                this.loadMessages();
            }
        )
    }
}
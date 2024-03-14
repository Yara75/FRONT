package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Contact;
import com.takima.backskeleton.services.ContactService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("Contact")
@RestController
@RequiredArgsConstructor
public class ContactController {
    private final ContactService contactService;
    @GetMapping("")
    public List<Contact> listContact(){return contactService.getAll();}

    public String addContact(@RequestParam(required = true, name = "type") String type, @RequestParam(required = true, name="info") String info) {
        contactService.addContact(type, info);
        return type+":"+info+" added";
    }
}

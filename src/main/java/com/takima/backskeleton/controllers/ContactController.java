package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Contact;
import com.takima.backskeleton.services.ContactService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RequestMapping("Contact")
@RestController
@RequiredArgsConstructor
public class ContactController {
    private final ContactService contactService;
    @GetMapping("")
    public List<Contact> listContact(){return contactService.getAll();}
}

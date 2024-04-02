package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Contact;
import com.takima.backskeleton.services.ContactService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RequestMapping("Contact")
@RestController
@RequiredArgsConstructor
public class ContactController {
    private final ContactService contactService;
    @GetMapping("")
    public List<Contact> listContact(){return contactService.findall();}

    @PostMapping("")
    public String addContact(@RequestBody Contact contactTmp) {
        contactService.addContact(contactTmp);
        return contactTmp.getType()+":"+contactTmp.getInfo()+" added";
    }

    @GetMapping("/{id}")
    public Optional<Contact> findContactById(@PathVariable Long id) {
        return contactService.findById(id);
    }

    @PostMapping("/{id}")
    public void updateContactById(@RequestBody Contact contactTmp, @PathVariable Long id) {
        contactService.updateContactById(contactTmp, id);
    }

    @DeleteMapping("/{id}")
    public void deleteContactById(@PathVariable Long id) {
        contactService.deleteContactById(id);
    }
}

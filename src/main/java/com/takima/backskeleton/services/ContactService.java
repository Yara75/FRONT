package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.ContactDao;
import com.takima.backskeleton.models.Contact;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactService {
    private final ContactDao contactDao;

    public List<Contact> getAll(){
        Iterable<Contact> it = contactDao.getAll();
        List<Contact> contacts = new ArrayList<>();
        it.forEach(contacts::add);
        return contacts;
    }

    public void addContact(String type, String info) {
        try {
            contactDao.addContact(type, info);
        } catch (org.springframework.orm.jpa.JpaSystemException e) {
            System.out.println("Exception handled");
        }
    }
}

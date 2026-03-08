package com.addressbookapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.addressbookapp.model.Contact;
import com.addressbookapp.service.AddressBookService;

@RestController
@RequestMapping("/contacts")
public class AddressBookController {

    @Autowired
    private AddressBookService addressBookService;

    @PostMapping
    public Contact addContact(@RequestBody Contact contact) {
        return addressBookService.addContact(contact);
    }

    @GetMapping
    public List<Contact> getAllContacts() {
        return addressBookService.getAllContacts();
    }
}
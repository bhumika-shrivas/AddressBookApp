package com.addressbookapp.model;

import java.util.ArrayList;
import java.util.List;

// Simple container representing an AddressBook identified by a name and
// holding a list of Contact objects. Used by the service to manage multiple books.
public class AddressBook {

    private String name;
    private List<Contact> contacts = new ArrayList<>();

    public AddressBook() {}

    public AddressBook(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
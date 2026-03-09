package com.addressbookapp.service;

import com.addressbookapp.model.Contact;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

// Service to fetch contacts from JSON Server
public class JSONServerService {

    private static final String JSON_SERVER_URL =
            "http://localhost:3000/contacts";

    public List<Contact> getContactsFromJSONServer() {

        RestTemplate restTemplate = new RestTemplate();

        Contact[] contacts =
                restTemplate.getForObject(JSON_SERVER_URL, Contact[].class);

        return Arrays.asList(contacts);
    }
}
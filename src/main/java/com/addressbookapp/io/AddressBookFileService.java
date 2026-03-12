package com.addressbookapp.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.addressbookapp.model.Contact;

// Service to handle simple file output for AddressBook contacts. Currently
// writes a minimal representation (first, last, city) to a file named contacts.txt.
// IOException is caught and printed; callers are not notified of failures.
public class AddressBookFileService {

    public void writeContactsToFile(List<Contact> contacts) {

        try {
            FileWriter writer = new FileWriter("contacts.txt");

            for (Contact contact : contacts) {
                // write a compact, human-readable line per contact
                writer.write(contact.getFirstName() + " "
                        + contact.getLastName() + " "
                        + contact.getCity() + "\n");
            }

            writer.close();

        } catch (IOException e) {
            // print stack trace — in production consider logging and propagating
            e.printStackTrace();
        }
    }
}
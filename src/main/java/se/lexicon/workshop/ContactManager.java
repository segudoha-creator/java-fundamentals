
package se.lexicon.workshop;

import java.util.ArrayList;

public class ContactManager {

    private ArrayList<Contact> contacts = new ArrayList<>();
    private int nextId = 1;

    public void addContact(String name, String phone, String email) {
        Contact contact = new Contact(nextId, name, phone, email);
        contacts.add(contact);
        nextId++;

        System.out.println("Contact added successfully!");
    }

    public void displayAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
            return;
        }

        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public Contact searchContact(int id) {
        for (Contact contact : contacts) {
            if (contact.getId() == id) {
                return contact;
            }
        }

        return null;
    }

    public boolean updateContact(int id, String name, String phone, String email) {
        Contact contact = searchContact(id);

        if (contact == null) {
            return false;
        }

        contact.setName(name);
        contact.setPhone(phone);
        contact.setEmail(email);

        return true;
    }

    public boolean deleteContact(int id) {
        Contact contact = searchContact(id);

        if (contact == null) {
            return false;
        }

        contacts.remove(contact);
        return true;
    }
}

package ContactManagement;

import java.util.*;

public class ContactDirectory {
    private List<Contact> contactList;
    private Set<String> contactTypes;
    private Map<String, Contact> contactMap;

    public ContactDirectory() {
        contactList = new ArrayList<>();
        contactTypes = new HashSet<>();
        contactMap = new HashMap<>();
    }

    public void addContact(Contact contact) {
        contactList.add(contact);
        contactMap.put(contact.getName(), contact);
        contactTypes.add(contact.getContactType());
    }

    public void updateContact(String name, String phoneNumber, String email, String contactType) {
        if (contactMap.containsKey(name)) {
            Contact contact = contactMap.get(name);
            contact.setPhoneNumber(phoneNumber);
            contact.setEmail(email);
            contact.setContactType(contactType);
            contactTypes.add(contactType);
        } else {
            System.out.println("The Contact was not found in the list.");
        }
    }

    public void displayContacts() {
        for (Contact contact : contactList) {
            System.out.println(contact);
        }
    }

    public void displayContactTypes() {
        System.out.println("List of unique Contact Types: " + contactTypes);
    }

    public void sortContactsByName() {
        contactList.sort(Comparator.comparing(Contact::getName));
    }

    public Contact searchContactByName(String name) {
        return contactMap.get(name);
    }
}

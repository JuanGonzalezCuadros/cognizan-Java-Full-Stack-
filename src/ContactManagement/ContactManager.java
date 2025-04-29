package ContactManagement;

public class ContactManager {
    public static void main(String[] args) {
        ContactDirectory contactDirectory = new ContactDirectory();

        Contact contact1 = new Contact(1, "Anthony Doll", "344-2011", "anthon@email.com", "Professional");
        Contact contact2 = new Contact(2, "Sally Sol", "555-4132", "sally@email.com", "Personal");
        Contact contact3 = new Contact(3, "Adam West", "555-3644", "adam@email.com", "Personal");
        Contact contact4 = new Contact(4, "Stephen Back", "766-8785", "stephen@email.com", "Professional");

        //Add new contacts to the directory
        System.out.println("Add new contacts to the directory");
        contactDirectory.addContact(contact1);
        contactDirectory.addContact(contact2);
        contactDirectory.addContact(contact3);
        contactDirectory.addContact(contact4);

        System.out.println("Contacts:");
        contactDirectory.displayContacts();

        //Register and display unique contact types
        System.out.println("\nRegister and display unique contact types");
        contactDirectory.displayContactTypes();

        //Search for a contact by name and display their details
        System.out.println("\nSearch for a contact by name and display their details");
        Contact searchContact = contactDirectory.searchContactByName("Anthony Doll");
        if (searchContact != null) {
            System.out.println(searchContact);
        }

        //Update contact information and manage the contact list
        System.out.println("\nUpdate contact information and manage the contact list");
        contactDirectory.updateContact("Stephen Back", "766-3385", "stephen.back@gmail.com", "Professional");
        contactDirectory.displayContacts();

        //Sort and display the list of contacts alphabetically
        System.out.println("\nSort and display the list of contacts alphabetically");
        contactDirectory.sortContactsByName();
        contactDirectory.displayContacts();
    }
}

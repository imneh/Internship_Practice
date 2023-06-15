//You have been tasked with creating a phone directory using the HashMap data structure in Java. The phone directory should store the names and phone numbers of individuals. Implement the following functionalities:
//Add a contact: Allow the user to add a new contact to the phone directory. The user should provide the name and phone number of the contact.
//Remove a contact: Allow the user to remove a contact from the phone directory.The user should provide the name of the contact to be removed.
//Search for a contact: Allow the user to search for a contact by name. If the contact is found, display the corresponding phone number. If the contact is not found, display a message indicating that the contact was not found.
//Display all contacts: Display all the contacts in the phone directory, along with their corresponding phone numbers.
//Implement the PhoneDirectory class that internally uses a HashMap to store the contacts. The keys in the HashMap should be the names of the contacts (String), and the values should be the phone numbers (String).
//Write a main method to demonstrate the functionality of the PhoneDirectory class. Create an instance of the PhoneDirectory class and perform the following operations:
//Add at least five contacts to the phone directory.
//Search for a contact by name and display the phone number.
//Remove a contact from the phone directory.
//Display all the contacts in the phone directory.
import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory{
    private Map<String, String> contacts;

    public PhoneDirectory() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    public void removeContact(String name) {
        contacts.remove(name);
     public void searchContact(String name) {
        String phoneNumber = contacts.get(name);
        if (phoneNumber != null) {
            System.out.println("Phone number: " + phoneNumber);
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void displayAllContacts() {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Phone number: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        PhoneDirectory directory = new PhoneDirectory();

        
        directory.addContact("Neha", "1234567890");
        directory.addContact("Salman", "9876543210");
        directory.addContact("karthik", "4567890123");
        directory.addContact("amulya", "5678901234");
        directory.addContact("siraaj", "2345678901");

        directory.searchContact("Neha");

      
        directory.removeContact("Salman");

        directory.displayAllContacts();
    }
}
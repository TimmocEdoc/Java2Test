package test;

import java.security.Key;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook implements Function{
    HashMap<String, Integer> Contact = new HashMap<>();
    @Override
    public void addContact() {
        String Name;
        Integer Phone;
        Scanner scanName = new Scanner(System.in);
        System.out.println("Enter name:");
        Name = scanName.nextLine();
        Scanner scanPhone = new Scanner(System.in);
        System.out.println("Enter phone:");
        Phone = scanPhone.nextInt();
        Contact c = new Contact(Name, Phone);
        Contact.put(c.getName(), c.getPhone());
        System.out.println(Contact);
    }
    public void findContact() {
        String Name;
        Scanner scanName = new Scanner(System.in);
        System.out.println("Enter name:");
        Name = scanName.nextLine();
        if (Contact.containsKey(Name)) {
            System.out.println("Name: "+Contact.get(Name));
        } else {
            System.out.println("Not found.");
        }
    }
    public void display() {
        for (String k: Contact.keySet()) {
            System.out.println("Name: "+ k);
            System.out.println("Phone: "+ Contact.get(k));
        }
    }
    public void exit() {
        System.out.println("Bye.");
        System.exit(1);
    }
}

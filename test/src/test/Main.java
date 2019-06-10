package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            int choice;
            AddressBook ab = new AddressBook();
            Scanner scan = new Scanner(System.in);
            System.out.println("Please choose[Add new contact(1)][Find a contact by name(2)][Display contacts(3)][Exit(4)]");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    ab.addContact();
                    break;
                case 2:
                    ab.findContact();
                    break;
                case 3:
                    ab.display();
                    break;
                case 4:
                    ab.exit();
                    break;
                default:
                    System.out.println("Nice try.");
                    break;
            }
        }
    }
}

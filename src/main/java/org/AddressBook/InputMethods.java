package org.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class InputMethods {
    static Scanner scanner = new Scanner(System.in);

    public void add(ArrayList<Contacts> array) {
        String option;
        do{
            Contacts contacts = new Contacts();
            System.out.println("Enter person firstname : ");
            contacts.setFirstName(scanner.next());

            System.out.println("Enter person lastname : ");
            contacts.setLastName(scanner.next());

            System.out.println("Enter  person address : ");
            contacts.setAddress(scanner.next());

            System.out.println("Enter person email : ");
            String email = scanner.next();
            contacts.setEmail(email);

            System.out.println("Enter person phoneNo : ");
            int phoneNo = scanner.nextInt();
            contacts.setPhoneNo(phoneNo);

            array.add(contacts);
            System.out.println("Do you want to add more person details[Yes/No]?");
            option = scanner.next();
        }while (!option.equalsIgnoreCase("no"));
    }

    public void print(ArrayList<Contacts> array) {
        System.out.println();
        System.out.println("*******Address Book************");
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).firstName + " " + array.get(i).lastName + " " + array.get(i).address + " "
                    + array.get(i).phoneNo + " " + array.get(i).state + " " + array.get(i).city + " " + array.get(i).zip);
        }
    }

    public void edit(ArrayList<Contacts> array) {
        System.out.println("What you want to Edit, select from following menu :");
        System.out.println("firstName, lastName, address, city, state, zip, phoneNo, email");
        String toEdit = scanner.next();

        switch (toEdit) {
            case "firstName":
                System.out.println("whose name you want to Edit");
                String oldName = scanner.next();
                for (int j = 0; j < array.size(); j++) {
                    if (oldName.equals(array.get(j).getFirstName())) {
                        System.out.println("enter new firstname :");
                        String newName = scanner.next();
                        array.get(j).setFirstName(newName);
                    }
                }
                System.out.println("Successfully done");
                break;
            case "lastName":
                System.out.println("whose lastname you want to Edit");
                String oldLastname = scanner.next();
                for (int j = 0; j < array.size(); j++) {
                    if (oldLastname.equals( array.get(j).getLastName())) {
                        System.out.println("enter new lastname :");
                        String newName = scanner.next();
                        array.get(j).setLastName(newName);
                    }
                }
                System.out.println("Successfully done");
                break;

            case "address":
                System.out.println("whose address you want to Edit");
                String oldAddress = scanner.next();
                for (int j = 0; j < array.size(); j++) {
                    if (oldAddress.equals( array.get(j).getAddress())) {
                        System.out.println("enter new lastname :");
                        String newName = scanner.next();
                        array.get(j).setAddress(newName);
                    }
                }
                System.out.println("Successfully done");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
    public void delete(ArrayList<Contacts> array) {
        System.out.println("Enter name you want to delete:");
        String deleteName = scanner.next();
        for (Contacts contact : array) {
            if (contact.getFirstName().equalsIgnoreCase(deleteName)) {
                array.remove(contact);
                System.out.println("!!Deleted!!");
                break;
            } else {
                System.out.println("Doesn't exist.");
            }
        }
        System.out.println("After deletion");
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).firstName + " " + array.get(i).lastName + " " + array.get(i).address + " "
                    + array.get(i).phoneNo + " " + array.get(i).state + " " + array.get(i).city + " " + array.get(i).zip);
        }
    }

}

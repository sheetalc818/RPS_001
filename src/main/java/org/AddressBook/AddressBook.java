package org.AddressBook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class AddressBook extends InputMethods {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the address Book Program!!");
        HashMapClass hashMapClass = new HashMapClass();
        HashMap<String, ArrayList<Contacts>> hashMap = new HashMap<>();
        int result =0;
        while(result!=8) {
            System.out.println();
            System.out.println("What do you want to perform from Main Menu");
            System.out.println("1. Add\n2. Edit\n3. Delete\n4.List Of Address Book\n5.Print specific Book\n6. Print complete address Book\n7. Search\n8. Stop");
            result = scanner.nextInt();
            switch (result) {
                case 1:
                    hashMapClass.addBook(hashMap);
                    break;
                case 2:
                    hashMapClass.toEdit(hashMap);
                    break;
                case 3:
                    hashMapClass.toDeleteBook(hashMap);
                    break;
                case 4:
                    hashMapClass.listOfBookNames(hashMap);
                    break;
                case 5:
                    hashMapClass.particularBookName(hashMap);
                    break;
                case 6 :
                    //hashMapClass.sortByFirstName(hashMap);
                    hashMapClass.printMap(hashMap);
                    break;
                case 7 :
                    hashMapClass.searchBookWithName(hashMap);
                    break;
                case 8 :
                    System.out.println("Thank You !!");
                    exit(0);
                    break;
                default:
                    System.out.println("Invalid input!!");
            }
        }
    }
}

package org.mypractice.fileio.addressbook;

public class Main {
    public static void main(String[] args) {
        AddressBookController controller = new AddressBookController("src/main/java/org/mypractice/fileio/addressbook/data_file.txt");
        controller.run();
    }
}
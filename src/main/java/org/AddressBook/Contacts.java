package org.AddressBook;

import java.util.concurrent.atomic.AtomicInteger;

public class Contacts {
    private static AtomicInteger nextID = new AtomicInteger(1);

    private int id;
    private String firstName;
    private String surname;
    private String phoneNumber;
    private String email;
    private String address;

    Contacts(int id, String firstName, String surname, String phoneNumber, String email, String address) {
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    Contacts(String firstName, String surname, String phoneNumber, String email, String address) {
        this(nextID.getAndIncrement(), firstName, surname, phoneNumber, email, address);
    }

    public Contacts() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    int getID() {
        return id;
    }

    String getFirstName() {
        return firstName;
    }

    String getSurname() {
        return surname;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }

    String getEmail() {
        return email;
    }

    String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "\n\nID: " + getID() + "\nName: " + getFirstName() + "\nSurname: " + getSurname() + "\nPhone number: " + getPhoneNumber() + "\nEmail: " +
                getEmail() + "\nAddress: " + getAddress();
    }
}

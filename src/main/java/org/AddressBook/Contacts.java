package org.AddressBook;

import java.util.concurrent.atomic.AtomicInteger;

public class Contacts {
        String firstName;
        String lastName;
        String  address;
        String city;
        String state;
        int zip;
        int phoneNo;
        String email;
        public Contacts(){

        }

        @Override
        public String toString() {
            return "Contacts{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", address='" + address + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", zip=" + zip +
                    ", phoneNo=" + phoneNo +
                    ", email='" + email + '\'' +
                    '}';
        }

        public Contacts(String firstName, String lastName, String address, String city, String state, int zip, int phoneNo, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zip = zip;
            this.phoneNo = phoneNo;
            this.email = email;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public int getZip() {
            return zip;
        }

        public void setZip(int zip) {
            this.zip = zip;
        }

        public int getPhoneNo() {
            return phoneNo;
        }

        public void setPhoneNo(int phoneNo) {
            this.phoneNo = phoneNo;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
}

package org.AddressBook;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataFile {
    private File file;
    public DataFile(String fileName) {
        this.file = new File(fileName);
    }
    public void save(Contacts person) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(person.getFirstName()+"\r\n" + person.getSurname() + "\r\n" + person.getPhoneNumber() + "\r\n" + person.getEmail() +
                    "\r\n" + person.getAddress() + "\r\n\r\n");
        } catch(IOException e) {
            System.out.println(e);
        }
    }

    public List<Contacts> loadAll() throws IOException {
        List<Contacts> people = new ArrayList<Contacts>();

        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String name = null;
            while((name = reader.readLine()) != null) {
                Contacts person = new Contacts(name, reader.readLine(), reader.readLine(), reader.readLine(), reader.readLine());
                people.add(person);
                reader.readLine();
            }
        }
        catch ( IOException e) {
            System.out.println(e);
        }
        return people;
    }
}


package org.AddressBook;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class CsvWrite {
    public static void writeContactInCSV(ArrayList<Contacts> array) throws IOException {
        String path = "C:\\Users\\Admin\\Documents\\RPSPrograms\\FirstMavenDemo\\src\\main\\java\\org\\AddressBook\\AddressData.csv";
        FileWriter writer;
        writer = new FileWriter(path,true);//
        //writer = new FileWriter(path,true);// true : append data, false: overwrite the data

        for (int i=0; i<array.size();i++){
            writer.write(array.get(i).getFirstName());
            writer.write(",");

            writer.write(array.get(i).getLastName());
            writer.write(",");

            writer.write(array.get(i).getEmail());
            writer.write(",");

            writer.write(array.get(i).getCity());
            writer.write(",");

            writer.write(array.get(i).getPhoneNo());
            writer.write(",");

            writer.write(array.get(i).getZip());
            writer.write(",");

            writer.write(array.get(i).getState());
            writer.write(",");

            writer.write(array.get(i).getAddress());
            writer.write("\r\n");
        }
        System.out.println("Writing Success!!");
        writer.close();
    }
}

package org.session.example.opencsv;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteDataLineByLine {
    public static Scanner sc;
    public static void main(String[] args) throws IOException, CsvValidationException {
        File file = new File("C:\\Users\\Admin\\Documents\\RPSPrograms\\FirstMavenDemo\\src\\main\\java\\org\\session\\example\\opencsv\\linebyline.csv");
        FileWriter outputFile = new FileWriter(file);
        sc = new Scanner(System.in);
        writeDataOnToTheFile(outputFile, sc);
        readDataFromTheFile(file);
        addDataToCSV(outputFile,sc);
    }
    public static void writeDataOnToTheFile(FileWriter outputFile, Scanner sc) throws IOException {
        CSVWriter writer = new CSVWriter(outputFile);
        String[] header = {"Engineer Name", "Engineer Pass Year", "Stream"};
        writer.writeNext(header);
        System.out.println("How many Records user wants to add :");
        int count = sc.nextInt();
        for (int i = 0; i < count; i++){
            System.out.println("Enter the Engineer name, passing year and stream : ");
            String name = sc.next();
            String passYear = sc.next();
            String stream = sc.next();
            String[] data1 = {name, passYear, stream};
            writer.writeNext(data1);
        }

//        String[] data2 = {"Navneet", "2022", "Mech"};
//        writer.writeNext(data2);
//
//        String[] data3 = {"Nihaant", "2023", "Civil"};
//        writer.writeNext(data3);
        writer.close();
    }

    public static void readDataFromTheFile(File file) throws IOException, CsvValidationException {
        CSVReader reader = new CSVReader(new FileReader(file));
        String[] nextLine;
        while((nextLine = reader.readNext())!=null){
            for (String token : nextLine){
                System.out.println(token);
            }
            System.out.println("\n");
        }
    }

    public static void addDataToCSV(FileWriter outputFile, Scanner sc) throws IOException {
        CSVWriter write1 = new CSVWriter(outputFile, ';', CSVWriter.NO_QUOTE_CHARACTER,CSVWriter.NO_ESCAPE_CHARACTER,CSVWriter.DEFAULT_LINE_END);
        List<String[]> data = new ArrayList<>();
        System.out.println("Enter the now of rows : ");
        int count = sc.nextInt();
        System.out.println("Enter the data :");
        for (int i=0; i<count; i++){
            String row = sc.nextLine();
            String[] rowData = row.split(" ");
            data.add(rowData);
        }
        write1.writeAll(data);
        write1.close();
    }
}

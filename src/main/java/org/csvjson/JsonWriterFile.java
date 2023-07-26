package org.csvjson;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class JsonWriterFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\Admin\\Documents\\RPSPrograms\\FirstMavenDemo\\src\\main\\java\\org\\csvjson\\companies.json";
        JSONArray obj = new JSONArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Records you want to add :");
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("Enter the name, employeeId and offices :");
            String name = sc.next();
            String empId = sc.next();
            String offices = sc.next();

            JSONObject json = new JSONObject();
            json.put("name", name);
            json.put("employees", empId);
            json.put("offices", List.of(offices));

            obj.add(json);
        }

        try (PrintWriter out = new PrintWriter(new FileWriter(path))) {
            out.write(obj.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Written Successfully");
    }
}



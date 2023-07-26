package org.csvjson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class MyClass {
    public static void main(String[] args) {
        String path = "C:\\Users\\Admin\\Documents\\RPSPrograms\\FirstMavenDemo\\thaicreate.csv";
        try {
            ArrayList<HashMap<String, String>> myArrList = new ArrayList<HashMap<String, String>>();
            HashMap<String, String> map;

            /*** Rows 1 ***/
            map = new HashMap<String, String>();
            map.put("CustomerID", "C001");
            map.put("Name", "Win Weerachai");
            map.put("Email", "win.weerachai@thaicreate.com");
            map.put("CountryCode", "TH");
            map.put("Budget", "1000000");
            map.put("Used", "600000");
            myArrList.add(map);

            /*** Rows 2 ***/
            map = new HashMap<String, String>();
            map.put("CustomerID", "C002");
            map.put("Name", "John  Smith");
            map.put("Email", "john.smith@thaicreate.com");
            map.put("CountryCode", "UK");
            map.put("Budget", "2000000");
            map.put("Used", "800000");
            myArrList.add(map);

            /*** Rows 3 ***/
            map = new HashMap<String, String>();
            map.put("CustomerID", "C003");
            map.put("Name", "Jame Born");
            map.put("Email", "jame.born@thaicreate.com");
            map.put("CountryCode", "US");
            map.put("Budget", "3000000");
            map.put("Used", "600000");
            myArrList.add(map);

            /*** Rows 4 ***/
            map = new HashMap<String, String>();
            map.put("CustomerID", "C004");
            map.put("Name", "Chalee Angel");
            map.put("Email", "chalee.angel@thaicreate.com");
            map.put("CountryCode", "US");
            map.put("Budget", "4000000");
            map.put("Used", "100000");
            myArrList.add(map);

            FileWriter writer;
            writer = new FileWriter(path, true);  //True = Append to file, false = Overwrite
            for (int i = 0; i < myArrList.size(); i++) {
                writer.write(myArrList.get(i).get("CustomerID"));

                writer.write(",");

                writer.write(myArrList.get(i).get("Name"));

                writer.write(",");

                writer.write(myArrList.get(i).get("Email"));

                writer.write(",");

                writer.write(myArrList.get(i).get("CountryCode"));

                writer.write(",");

                writer.write(myArrList.get(i).get("Budget"));
                writer.write(",");

                writer.write(myArrList.get(i).get("Used"));

                writer.write("\r\n");
            }
            System.out.println("Write success!");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

package org.session.example.csv_json_writer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class CsvFileWriterDemo {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Admin\\Documents\\RPSPrograms\\FirstMavenDemo\\src\\main\\java\\org\\session\\example\\csv_json_writer\\EngineersData.csv";
        ArrayList<HashMap<String,String>> mapArrayList = new ArrayList<>();
        HashMap<String, String> engineerMap;

        engineerMap = new HashMap<>();
        engineerMap.put("EngineerId","101");
        engineerMap.put("EngineerName", "Bharati");
        engineerMap.put("Email","abc@gmail.com");
        engineerMap.put("PassYear","2020");
        mapArrayList.add(engineerMap);

        engineerMap = new HashMap<>();
        engineerMap.put("EngineerId","102");
        engineerMap.put("EngineerName", "K");
        engineerMap.put("Email","k@gmail.com");
        engineerMap.put("PassYear","2021");
        mapArrayList.add(engineerMap);

        engineerMap = new HashMap<>();
        engineerMap.put("EngineerId","103");
        engineerMap.put("EngineerName", "Sachin");
        engineerMap.put("Email","sachin@gmail.com");
        engineerMap.put("PassYear","2022");
        mapArrayList.add(engineerMap);

        engineerMap = new HashMap<>();
        engineerMap.put("EngineerId","104");
        engineerMap.put("EngineerName", "Suraj");
        engineerMap.put("Email","suraj@gmail.com");
        engineerMap.put("PassYear","2020");
        mapArrayList.add(engineerMap);

        engineerMap = new HashMap<>();
        engineerMap.put("EngineerId","105");
        engineerMap.put("EngineerName", "Mahesh");
        engineerMap.put("Email","Mahesh@gmail.com");
        engineerMap.put("PassYear","2023");
        mapArrayList.add(engineerMap);

        FileWriter writer;
        writer = new FileWriter(path);//
        //writer = new FileWriter(path,true);// true : append data, false: overwrite the data

        for (int i=0; i<mapArrayList.size();i++){
            writer.write(mapArrayList.get(i).get("EngineerId"));
            writer.write(",");
            writer.write(mapArrayList.get(i).get("EngineerName"));
            writer.write(",");
            writer.write(mapArrayList.get(i).get("Email"));
            writer.write(",");
            writer.write(mapArrayList.get(i).get("PassYear"));
            writer.write("\r\n");
        }
        System.out.println("Writing Success!!");
        writer.close();
    }
}

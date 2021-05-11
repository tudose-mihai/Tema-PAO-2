package com.company;
import java.io.FileWriter;
import java.util.Date;

public class CSVwriter {
    public void toCSV(String path, String[] info) throws Exception{
        FileWriter writer = new FileWriter(path);
        String toWrite="";
        for(String data: info){
            toWrite = toWrite + data + ",";
        }
        toWrite = toWrite + new Date();
        System.out.println(toWrite);
        writer.write(toWrite);
        writer.close();
    }
}

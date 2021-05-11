package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVreader {
    public ArrayList<String[]> scan(String path) throws Exception{
        Scanner scan = new Scanner(new File(path));
        scan.useDelimiter("\n");
        ArrayList<String[]> lines= new ArrayList<String[]>();
        while(scan.hasNext())
        {
            String ln = scan.next();
            String[] info = ln.split(",");
            lines.add(info);
        }
        scan.close();
        return lines;

    }
}

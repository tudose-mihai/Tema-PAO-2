package com.company;

public class Main {

    public static void main(String[] args) throws Exception {




    CSVwriter writeTest = new CSVwriter();

    writeTest.toCSV("C:\\Users\\Q\\IdeaProjects\\Proiect-PAO-Cabinet-Medical\\src\\com\\company\\Log.csv", new String[]{"Marcus", "Aurelius", "mare om", "mare caracter"});

    ClinicService service = new ClinicService();

    service.Menu();



    }

}

package com.company;

import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class ClinicService {
//    private Appointment[] _appointments;
//    private Employee[] _employees;
    private ArrayList<Appointment> _appointments = new ArrayList<Appointment>();
    private ArrayList<Medic> _medics = new ArrayList<Medic>();
    private ArrayList<Specialization> _specs = new ArrayList<Specialization>();
    private ArrayList<Insurance> _insurances = new ArrayList<Insurance>();




    public void Menu(){
        CSVreader InsReader = new CSVreader();
        ArrayList<String[]> inss= new ArrayList<String[]>();
        {
            try {
                inss = InsReader.scan("C:\\Users\\Q\\IdeaProjects\\Proiect-PAO-Cabinet-Medical\\src\\com\\company\\Asigurari.csv");
                for(String[] line : inss){
                    Double percReduction = Double.parseDouble(line[1]);
                    Integer flatReduction = Integer.parseInt(line[2].substring(0, line[2].length()-1));
                    Insurance x = new Insurance(line[0], percReduction, flatReduction);
                    _insurances.add(x);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        CSVreader SpecReader = new CSVreader();
        ArrayList<String[]> specs= new ArrayList<String[]>();
        {
            try {
                specs = SpecReader.scan("C:\\Users\\Q\\IdeaProjects\\Proiect-PAO-Cabinet-Medical\\src\\com\\company\\Specializari.csv");
                for(String[] line : specs){
                    Integer specIndex = Integer.parseInt(String.valueOf(line[1].charAt(0)));
                    Specialization x = new Specialization(line[0], specIndex);
                    _specs.add(x);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        CSVreader scanCSVreader = new CSVreader();
        ArrayList<String[]> medics;
        {
            try {
                medics = scanCSVreader.scan("C:\\Users\\Q\\IdeaProjects\\Proiect-PAO-Cabinet-Medical\\src\\com\\company\\Medici.csv");
                for(String[] line : medics){
                    String firstName = line[0], lastName = line[1], location = line[3];
                    Integer age = Integer.parseInt(line[2]), salary =  Integer.parseInt(line[4]), specIndex = Integer.parseInt(String.valueOf(line[5].charAt(0)));
                    Specialization spec = _specs.get(specIndex);
                    Medic x = new Medic(firstName,lastName, age, location, salary, spec);
                    _medics.add(x);

                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("danger, danger");
            }
        }
        Scanner scanner = new Scanner(System.in);
        Medic medic = new Medic();
        Specialization general = new Specialization();
        Insurance basic = new Insurance("Basic", 0.7, 12);

        Boolean first = true;
        while(1>0){

            System.out.println();
            if(first) {
                System.out.println("Welcome. Please select an option:");
                first = false;
            }

            System.out.println("1) See appointments");
            System.out.println("2) See medics");
            System.out.println("3) Add appointment");
            System.out.println("4) Exit");
            System.out.println();

            int option = scanner.nextInt();
            if(option == 1){
                for (Appointment app : _appointments){
                    System.out.print("Client: ");
                    System.out.print(app.getClient().getFirstName() + " ");
                    System.out.println(app.getClient().getLastName());

                    System.out.print("Medic: ");
                    System.out.print(app.getMedic().getFirstName() + " ");
                    System.out.println(app.getMedic().getLastName());

                    System.out.print("Cost: ");
                    System.out.println(app.getCost());

                    System.out.print("Date: ");
                    System.out.println(app.getDate());
                }
            }
            else if (option == 2){
                for (Medic emp : _medics){
                    System.out.print(emp.getFirstName() + " ");
                    System.out.print(emp.getLastName() + " ");
                    System.out.print(emp.getSpecialization().getTitle() + " ");
                    System.out.println(emp.getHireDate());
                }
            }
            else if(option == 3) {
                System.out.println("Choose a medic: ");
                for (Medic emp : _medics){
                    if(emp.getClass() == medic.getClass()) {
                        System.out.println(emp.getLastName());
                    }
                }
                System.out.println();
                String name = scanner.nextLine();
                Medic chosenMedic = (Medic) _medics.get(0);
                for (Employee emp : _medics){
                    if(emp.getLastName().equals(name) && emp.getClass() == medic.getClass()) {
                        chosenMedic = ((Medic) emp);
                        break;
                    }
                }
                System.out.println("Client first name: ");
                String fname = scanner.nextLine();
                System.out.println("Client last name: ");
                String lname = scanner.nextLine();
                System.out.println("Client age: ");
                int age = scanner.nextInt();

                Client client = new Client(fname, lname, age, basic);

                _appointments.add(new Appointment(chosenMedic, client, new Date(), 30));


            }
            else if(option == 4){
                System.out.println("Goodbye!");
                return;
            }
            else{
                System.out.println("Invalid option");
            }


        }


    }

}

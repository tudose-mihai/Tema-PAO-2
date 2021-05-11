package com.company;

public class Medic extends Employee{
    private Specialization _specialization;
    public Medic(String firstName, String lastName, int age, String location, int salary,
                 Specialization specialization) {
        super(firstName, lastName, age, location, salary* specialization.getSalaryMultiplier());
        _specialization = specialization;
    }
    public Medic() {
        super();
    }

    public Medic(Medic emp) {
        super(emp.getFirstName(), emp.getLastName(), emp.getAge(), emp.getLocation(), emp.getSalary());
        _specialization = emp.getSpecialization();
    }

    public void setSpecialization(Specialization spec){
        _specialization = spec;
    }

    public Specialization getSpecialization(){
        return _specialization;
    }



}

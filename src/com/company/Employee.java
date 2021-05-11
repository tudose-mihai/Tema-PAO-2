package com.company;

import java.util.Date;

public class Employee extends Person{
    protected String _location;
    protected Date _hiredate;
    protected int _salary;
    public Employee() {
        super();
    }
    public Employee(String firstName, String lastName, int age, String location, int salary) {
        super(firstName, lastName, age);
        _location = location;
        _salary = salary;
        _hiredate = new Date();
    }

    public void setLocation(String location){
        _location = location;
    }

    public void setHireDate(Date date){
        _hiredate = date;
    }

    public void setSalary(int salary){
        _salary = salary;
    }

    public String getLocation(){
        return _location;
    }

    public Date getHireDate(){
        return _hiredate;
    }

    public int getSalary(){
        return _salary;
    }
}

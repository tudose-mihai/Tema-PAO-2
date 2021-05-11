package com.company;

public class Specialization {
    private String _title;
    private int _salaryMultiplier;



    public Specialization(){
        _title = "";
        _salaryMultiplier = 0;
    }

    public Specialization(String title, int salaryMultiplier){
        _title = title;
        _salaryMultiplier = salaryMultiplier;
    }

    public void setTitle(String title){
        _title = title;
    }

    public void setSalaryMultiplier(int salaryMultiplier){
        _salaryMultiplier = salaryMultiplier;
    }

    public String getTitle(){
        return _title;
    }

    public int getSalaryMultiplier(){
        return _salaryMultiplier;
    }
}

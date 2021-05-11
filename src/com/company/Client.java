package com.company;

public class Client extends Person{
    private Insurance _insurance;

    Client(String firstName, String lastName, int age, Insurance insurance){
        super(firstName,lastName,age);
        _insurance = insurance;
    }

    public Insurance getInsurance(){
        return _insurance;
    }

    public void setInsurance(Insurance insurance){
        _insurance = insurance;
    }
}

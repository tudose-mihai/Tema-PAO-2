package com.company;

import java.util.Date;


public class Person {
    protected String _firstName;
    protected String _lastName;
    protected int _age;
    protected int _id;
    protected static int count = 0;
    public Person() {
        _firstName = "";
        _lastName = "";
        _age = 0;
        _id = count;
        count++;
    }
    public Person(String firstName, String lastName, int age) {
        _firstName = firstName;
        _lastName = lastName;
        _age = age;
        _id = count;
        count++;
    }

    public String getFirstName(){
        return _firstName;
    }

    public String getLastName(){
        return _lastName;
    }

    public int getAge(){
        return _age;
    }
}

package com.company;

import java.lang.ref.Cleaner;
import java.util.Date;

public class Appointment {
    private Medic _medic;
    private Client _client;
    private Date _date;
    private float _cost;

    Appointment(Medic medic, Client client, Date date, int cost){
        _medic = medic;
        _client = client;
        _date = date;
        int medicRate = medic.getSpecialization().getSalaryMultiplier();
        double percentageReduction = client.getInsurance().getPercentageReduction();
        int flatReduction = client.getInsurance().getFlatReduction();
        _cost = (float) (((cost * medicRate) - flatReduction) * percentageReduction);
    }

    public void setMedic (Medic medic){
        _medic = medic;
    }

    public void setClient (Client client){
        _client = client;
    }

    public void setDate (Date date){
        _date = date;
    }

    public void setCost (int cost){
        _cost = cost;
    }

    public Medic getMedic(){
        return _medic;
    }

    public Client getClient(){
        return _client;
    }

    public Date getDate(){
        return _date;
    }

    public float getCost(){
        return _cost;
    }

}

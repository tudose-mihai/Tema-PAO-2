package com.company;

public class Insurance {
    private String _title;
    private double _percentageReduction;
    private int _flatReduction;


    public Insurance(){
        _title = "";
        _percentageReduction = 1;
        _flatReduction = 0;
    }

    public Insurance(String title, double percentageReduction, int flatReduction){
        _title = title;
        _percentageReduction = percentageReduction;
        _flatReduction = flatReduction;
    }

    public void setTitle(String title){
        _title = title;
    }

    public void setPercentageReduction(int percentageReduction){
        _percentageReduction = percentageReduction;
    }

    public void setFlatReduction(int flatReduction){
        _flatReduction = flatReduction;
    }

    public String getTitle(){
        return _title;
    }

    public double getPercentageReduction(){
        return _percentageReduction;
    }

    public int getFlatReduction(){ return _flatReduction; }

}

package com.company;

public class MyDate {

    int day;
    int year;
    int month;

    public MyDate(){

    }

    public MyDate(int m, int d, int y){
        setDate(m, d, y);

    }


    public String toString(){
        // TODO return a string with month/day/year like "01/20/2018"

        return month+"/"+day+"/"+year;

    }

    public void setDate(int m, int d, int y){
        // TODO set the MyDate attribute with m, d, and y values here!
        day = d;
        month = m;
        year = y;
    }
}

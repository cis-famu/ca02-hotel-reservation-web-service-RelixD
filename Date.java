/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca02hotelreservation;

/**
 *
 * @author Relo's PC
 */
public class Date {
private int year;
private int month;
private int date;
private int hrs;
private int mins;


public Date()
{
}

    public Date(int year, int month, int date, int hrs, int mins) {
        this.year = year;
        this.month = month;
        this.date = date;
        this.hrs = hrs;
        this.mins = mins;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setHrs(int hrs) {
        this.hrs = hrs;
    }

    public void setMins(int mins) {
        this.mins = mins;
    }
    
    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDate() {
        return date;
    }
    public int getHrs() {
        return hrs;
    }
    public int getMins() {
        return mins;
    }


}

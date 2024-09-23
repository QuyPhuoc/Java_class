package org.example;

public class Time {
    private int gio, phut, giay;
    public Time(int gio, int phut, int giay){
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }
    public String toString(){
        return gio + " " + phut + " " + giay;
    }
    public int getGio(){
        return gio;
    }
    public int getPhut(){
        return phut;
    }
    public int getGiay(){
        return giay;
    }
}

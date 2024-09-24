package org.example;

public class Bangdiem  {
    private static int index = 1;
    private String Ma, ten, xeploai;
    private double gpa;

    public Bangdiem(String ten, double gpa){
        this.Ma = String.format("HS%02d", index);
        index++;
        this.ten = ten;
        this.gpa = gpa;
        if(this.gpa >= 9){
            this.xeploai = "XUAT SAC";
        }else if(this.gpa >= 8){
            this.xeploai = "GIOI";
        }else if(this.gpa >= 7){
            this.xeploai = "KHA";
        }else if(this.gpa >= 5){
            this.xeploai = "TB";
        }else{
            this.xeploai = "YEU";
        }
    }

    public double getGpa() {
        return gpa;
    }

    public String getMa() {
        return Ma;
    }

    public String toString(){
        return this.Ma + " " + this.ten + " " + String.format("%.1f", gpa) + " " + this.xeploai;
    }

}

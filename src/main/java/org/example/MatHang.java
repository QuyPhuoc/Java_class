package org.example;

public class MatHang {
    private String ma, ten, donvi;
    private int giamua, giaban;

    public MatHang(String ma, String ten, String donvi, int giamua, int giaban){
        this.ma = ma;
        this.ten = ten;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
    }
    public int loinhuan(){
        return giaban - giamua;
    }



    public String toString(){
        return ma + " " + ten + " " + donvi + " " + giamua + " " + giaban + " " +  loinhuan();
    }
}

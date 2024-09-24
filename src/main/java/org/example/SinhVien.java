package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class SinhVien {
    protected String Ma;
    private String Hoten;
    private String Lop;
    private String ngaySinh;
    protected double gpa;

    public SinhVien() {
        this.Hoten = "";
        this.Ma = "";
        this.Lop = "";
        this.ngaySinh = "";
        this.gpa = 0.0;
    }
    public SinhVien(String Ma, String Hoten, String Lop, String ngaySinh, double gpa){
        this.Hoten = Hoten;
        this.gpa = gpa;
        this.ngaySinh = ngaySinh;
        this.Ma = Ma;
        this.Lop = Lop;
    }

    public String getLop() {
        return Lop;
    }

    public String getMa() {
        return Ma;
    }

    public void Hienthi(){
        System.out.println(Ma + " " + Hoten + " " + Lop + " " + ngaySinh + " " + String.format("%.1f", gpa));
    }
    public void chuanHoaTen(){
        String[] a = Hoten.trim().split("\\s+");
        String name = "";
        for(String x : a){
            name += Character.toUpperCase(x.charAt(0));
            for(int i = 1; i < x.length(); i++){
                name += Character.toLowerCase(x.charAt(i));
            }
            name += " ";
        }
        Hoten = name.trim();
    }
    public void chuanHoaNgaysinh(){
        StringBuilder sb = new StringBuilder(ngaySinh);
        if(sb.charAt(1) == '/'){
            sb.insert(0, "0");
        }
        if(sb.charAt(4) == '/'){
            sb.insert(3, "0");
        }
        ngaySinh = sb.toString();
    }
    public String getSortedName(){
        String[] a1 = Hoten.split("/");
        String res = a1[a1.length - 1];
        for(int i = 0; i < a1.length - 1; i++){
            res += " " + a1[i];
        }
        return res;
    }
}




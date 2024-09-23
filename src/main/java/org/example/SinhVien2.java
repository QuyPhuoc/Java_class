package org.example;

import javax.swing.text.StyleContext;

public class SinhVien2 {
    private String ma, ten, ngaysinh, lop;
    private double gpa;
    public SinhVien2(String ma, String ten, String lop, String ngaysinh , double gpa){
        this.ma = ma;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.lop = lop;
        this.gpa = gpa;
    }
    public void chuanHoaTen(){
        String[] a = ten.trim().split("\\s+");
        String name = "";
        for(String x : a){
            name += Character.toUpperCase(x.charAt(0));
            for(int i = 1; i < x.length(); i++){
                name += Character.toLowerCase(x.charAt(i));
            }
            name += " ";
        }
        ten = name.trim();
    }
    public void chuanHoa(){
        StringBuilder sb = new StringBuilder(ngaysinh);
        if(sb.charAt(1) == '/'){
            sb.insert(0, "0");
        }
        if(sb.charAt(4) == '/'){
            sb.insert(3, "0");
        }
        ngaysinh = sb.toString();
    }

    public String getMa() {
        return ma;
    }

    public double getGpa() {
        return gpa;
    }

    public String toString(){
        return ma + " " + ten + " "  + lop +" " + ngaysinh + " " + String.format("%.2f", gpa);
    }
}

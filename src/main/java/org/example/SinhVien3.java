package org.example;

public class SinhVien3  {
    private String ma, ten, lop, email;
    public SinhVien3(String ma, String ten, String lop, String email){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getLop() {
        return lop;
    }

    public String getMa() {
        return ma;
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
    public String toString(){
        return ma + " " + ten + " " + lop + " " + email;
    }
}

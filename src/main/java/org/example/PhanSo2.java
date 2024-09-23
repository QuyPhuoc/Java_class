package org.example;

public class PhanSo2 {
    private long tu, mau;
    public PhanSo2(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }

    public static long gcd(long a, long b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
    public PhanSo2 tong(PhanSo2 other){
        long tu_new = this.tu * other.mau + this.mau * other.tu;
        long mau_new = this.mau * other.mau;
        long ucln = gcd(tu_new, mau_new);
        PhanSo2 res = new PhanSo2(tu_new / ucln, mau_new / ucln);
        return res;
    }

    public PhanSo2 nhan(PhanSo2 other){
        long tu_new = this.tu * other.tu;
        long mau_new = this.mau * other.mau;
        long ucln = gcd(tu_new, mau_new);
        PhanSo2 res = new PhanSo2(tu_new / ucln, mau_new / ucln);
        return res;
    }
    public String toString(){
        return this.tu + "/" + this.mau;
    }
}

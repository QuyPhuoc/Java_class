package org.example;


class GCD {
    public static long gcd(long a, long b){
        if(b == 0){
            return a;
        }
            return gcd(b, a % b);
    }
}
public class PhanSo {
    private long tuso, mauso;
    public PhanSo(){
        this.tuso = 0;
        this.mauso = 1;
    }
    public PhanSo(long tuso, long mauso){
        this.tuso = tuso;
        this.mauso = mauso;
    }

    public long getTuso() {
        return tuso;
    }

    public void setTuso(long tuso) {
        this.tuso = tuso;
    }

    public long getMauso() {
        return mauso;
    }

    public void setMauso(long mauso) {
        this.mauso = mauso;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(tuso).append("/").append(mauso);
        String res = sb.toString();
        return res;
    }
    public final PhanSo lowestTerm(){
        long gcd = GCD.gcd(this.tuso, this.mauso);
        long tuso = this.tuso / gcd;
        long mauso = this.mauso / gcd;
        PhanSo res = new PhanSo(tuso, mauso);
        return res;
    }


}

class FractionToLowestTermConverter{
    /**Chuyển đổi phân số về dạng tối giản
    *
     * @param phanSo Phân số cần chuyển đổi
     * @return Chuyển phân số ở dạng tối giản
     *
     * */

    public String convert(final PhanSo phanSo){
        PhanSo lowest = phanSo.lowestTerm();
        StringBuilder sb = new StringBuilder();
        sb.append(lowest.getTuso()).append("/").append(lowest.getMauso());
        String res = sb.toString();
        return res;
    }
    public PhanSo convertBack(final String value){
        PhanSo res = new PhanSo();
        return res;
    }
}

class FractionToDecimalConverter{
    public String convert(final PhanSo phanSo){
        return "";
    }
    public PhanSo convertBack(final String value){
        PhanSo res = new PhanSo();
        return res;
    }
}

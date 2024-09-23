package org.example;

import java.util.HashMap;
import java.util.Map;

public class Nhanvien {
    private String ma, ten, chucVu;
    private int luong, ngayCong;
    private static Map<String, Integer> map = new HashMap<>();
    static{
        map.put("GD", 250000);
        map.put("PGD", 200000);
        map.put("TP", 180000);
        map.put("NV", 150000);
    }
    public Nhanvien(String ten, String chucVu,int luong, int ngayCong){
        this.ma = "NV01";
        this.ten = ten;
        this.chucVu = chucVu;
        this.luong = luong;
        this.ngayCong = ngayCong;
    }
    public int map1(){
        return map.get(chucVu);
    }
//    public void chuanHoa(){
//        String[] a = ten.split("\\s+");
//        String res = "";
//        for(String x : a){
//            res += Character.toUpperCase(x.charAt(0));
//            for(int i = 1; i < x.length(); i++){
//                res += Character.toLowerCase(x.charAt(i));
//            }
//            res += " ";
//        }
//        ten = res.trim();
//    }
//    public void chuanhoaNgay() {
//        StringBuilder sb1 = new StringBuilder(ngaySinh);
//
//        if (sb1.charAt(1) == '/') {
//            sb1.insert(0, "0");
//        }
//        if (sb1.charAt(4) == '/') {
//            sb1.insert(3, "0");
//        }
//        ngaySinh = sb1.toString();
//    }
    public int luongThang(){
        return luong * ngayCong;
    }

    public int donate(){
        int luongT = luongThang();
        if(ngayCong >= 25){
            return luongT * 20 / 100;
        }else if(ngayCong >= 22){
            return luongT * 10 / 100;
        }else{
            return 0;
        }
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(ma + " ");
        sb.append(ten + " ");
        sb.append(luongThang() + " ");
        sb.append(donate() + " ");
        sb.append(map1() + " ");
        sb.append((map1() + luongThang() + donate()) + " ");
        return sb.toString();
    }

}

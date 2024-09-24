package org.example;

import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien3> list = new ArrayList<>();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            SinhVien3 sv = new SinhVien3(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            sv.chuanHoaTen();
            list.add(sv);
        }
        int query = sc.nextInt();
        sc.nextLine();
        String[] Q = new String[query];
        for(int i = 0; i < query; i++){
            Q[i] = sc.nextLine();
        }

        for(String x : Q){
            System.out.println("DANH SACH SINH VIEN KHOA " + x + " :");
            for(SinhVien3 a : list){
                if(a.getLop().equals(x)){
                    System.out.println(a);
                }
            }
            System.out.println("DANH SACH SINH VIEN KHOA ");
        }
    }
}

package org.example;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
import java.util.Collections;
public class Giaibt {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long a = sc.nextLong();
        if(a % 2 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}

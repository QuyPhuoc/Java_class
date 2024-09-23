package org.example;

public class Gcd {
    public static long gcd(long a, long b){
        if(b == 0){
            return a;
        }
        else
            return gcd(b, a % b);
    }
}

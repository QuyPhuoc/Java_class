package org.example;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;
import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Game> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
           Game g = new Game(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
           list.add(g);
        }
        Collections.sort(list, new Comparator<Game>() {
            @Override
            public int compare(Game o1, Game o2) {
                if(o1.getTime() != o2.getTime()){
                    return o2.getTime() - o1.getTime();
                }
                return o1.getUsername().compareTo(o2.getUsername());
            }
        });
        for(Game x : list){
            System.out.println(x);
        }
     }
}

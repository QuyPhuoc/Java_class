package org.example;

public class Game {
    private String username;
    private String pass;
    private String name, time_start, time_end;

    public Game(String username, String pass, String name, String time_start, String time_end){
        this.username = username;
        this.pass = pass;
        this.name = name;
        this.time_start = time_start;
        this.time_end = time_end;
    }

    public int getTime(){
        //int hours = (time.charAt(0) - '0' * 10 + time.charAt(1) - '0');
         String[] a = time_start.split(":");
         String[] b = time_end.split(":");
         int timeStart = 60 * (Integer.parseInt(a[0])) + Integer.parseInt(a[1]);
         int timeEnd = 60 * (Integer.parseInt(b[0])) + Integer.parseInt(b[1]);

         return timeEnd - timeStart;
    }

    public String toString(){
        String res = username + " " + pass + " " + name + " ";
        res = res + getTime() / 60 + " gio " + getTime() % 60 + " phut";
        return res;
    }

    public String getUsername() {
        return username;
    }
}

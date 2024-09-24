package org.example;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Bangdiem> list = new ArrayList<>();
        sc.nextLine();
        for(int i = 1; i <= n; i++){
            String name = sc.nextLine();
            String gradeSTR = sc.nextLine();

            String[] a = gradeSTR.split("\\s+");

            double[] b = Arrays.stream(a).mapToDouble(Double::parseDouble).toArray();
            double averages =Arrays.stream(b)
                    .average()
                    .orElse(0.0);
            Bangdiem bd = new Bangdiem(name, averages);
            list.add(bd);
        }
        Collections.sort(list, new Comparator<Bangdiem>() {
            @Override
            public int compare(Bangdiem o1, Bangdiem o2) {
                if(o1.getGpa() != o2.getGpa()){
                    return Double.compare(o2.getGpa(), o1.getGpa());
                }
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for(Bangdiem x : list){
            System.out.println(x);
        }
     }
}

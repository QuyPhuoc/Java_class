package org.example;

import java.util.HashMap;
import java.util.Map;

//goi ra interface va cai dat cho no phuong thuc tinh *Luong
interface Teacher{
    public int CaculateIncome(int basicSalary, int salaryScale);
    default int getSalary(String ma){
        return Integer.parseInt(ma.substring(2,4));
    }
}
class HieuTruong implements Teacher{
    @Override
    public int CaculateIncome(int basicSalary, int salaryScale) {
        return basicSalary * salaryScale + 2_000_000;
    }
}

class Hieupho implements Teacher{

    @Override
    public int CaculateIncome(int basicSalary, int salaryScale) {
        return basicSalary * salaryScale + 900_000;
    }
}

class Giaovien implements Teacher{

    @Override
    public int CaculateIncome(int basicSalary, int salaryScale) {
        return basicSalary * salaryScale + 500_000;
    }
}

class TeacherFactory{
    private static final Map<String, Teacher> map = new HashMap<>();
    static {
        map.put("HT", new HieuTruong());
        map.put("HP", new Hieupho());
        map.put("GV", new Giaovien());
    }
    public static Teacher create(String ma){
        return map.get(ma.substring(0, 2));
    }
}

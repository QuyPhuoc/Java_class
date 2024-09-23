package org.example;



class mauSac{
    public static String chuanHoa(String s){
        StringBuilder sb = new StringBuilder();
        if(sb != null && !s.isEmpty()){
            sb.append(Character.toUpperCase(s.charAt(0)));
            for(int i = 1; i < s.length(); i++){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return sb.toString();
    }
}
class HCN {
    private int dai, rong;
    private String mausac;

    public HCN (){
    }
    public HCN(int dai, int rong, String mausac){
        this.dai = dai;
        this.rong = rong;
        this.mausac = mausac;
    }
    public int Dientich(){
        return this.dai * this.rong;
    }
    public int chuVi(){
        return (this.dai + this.rong) * 2;
    }
//    public void chuanHoa(){
//        String[] mau = mausac.trim().split("//s+");
//        String tenmau = "";
//        for(String x : mau){
//            tenmau += Character.toUpperCase(x.charAt(0));
//            for(int i = 1; i < x.length(); i++){
//                tenmau += Character.toLowerCase(x.charAt(i));
//            }
//            tenmau += " ";
//        }
//        mausac = tenmau.trim();
//    }
    public String toString(){
        if(dai <= 0 || rong <= 0){
            return "INVALID";
        }else{
            return String.format("%d %d %s", chuVi(), Dientich(),  mauSac.chuanHoa(this.mausac));
        }
    }

}

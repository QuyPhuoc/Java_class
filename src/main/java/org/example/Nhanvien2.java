package org.example;

public class Nhanvien2 {
        private String ma, Hoten, GT, ngaySinh, Diachi, thue, ngaykiHD;

        public Nhanvien2(String ma, String Hoten, String GT, String ngaySinh, String Diachi, String thue, String ngaykiHD){
            this.ma = ma;
            this.Hoten = Hoten;
            this.GT = GT;
            this.ngaySinh = ngaySinh;
            this.Diachi = Diachi;
            this.thue = thue;
            this.ngaykiHD = ngaykiHD;
        }
        public void chuanHoa(){
            String[] a = Hoten.split("\\s+");
            String res = "";
            for(String x : a){
                res += Character.toUpperCase(x.charAt(0));
                for(int i = 0; i < x.length(); i++){
                    res += Character.toLowerCase(x.charAt(i));
                }
                res += " ";
            }
            Hoten = res.trim();
        }
        public void chuanhoaNgaySinh(){
            StringBuilder sb = new StringBuilder(ngaySinh);
            if(sb.charAt(1) == '/'){
                sb.insert(0, "0");
            }
            if (sb.charAt(4) == '/') {
                sb.insert(3, "0");
            }
            ngaySinh = sb.toString();

        }
    public void chuanhoaNgayHD(){
        StringBuilder sb = new StringBuilder(ngaykiHD);
        if(sb.charAt(1) == '/'){
            sb.insert(0, "0");
        }
        if (sb.charAt(4) == '/') {
            sb.insert(3, "0");
        }
        ngaykiHD = sb.toString();
    }

    public String getNgaykiHD() {
        return ngaykiHD;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getMa() {
        return ma;
    }

    @Override
        public String toString() {
            return ma + " " + Hoten + " " + GT + " " + ngaySinh + " " + Diachi + " " + thue + " " + ngaykiHD;
        }
}

package J05077;

public class TL {
    private String ma, ten, phongBan;
    private int luong, ngayCong;

    public TL(String ma, String ten, String phongBan, int luong, int ngayCong) {
        this.ma = ma;
        this.ten = ten;
        this.phongBan = phongBan;
        this.luong = luong;
        this.ngayCong = ngayCong;
    }

    public String getMa() {
        return ma;
    }

    private int heSo() {
        char c = ma.charAt(0);
        int nam = Integer.parseInt(ma.substring(1,3));

        if(c == 'A') {
            if(nam >= 1 && nam <=3)
                return 10;
            if(nam <=8)
                return 12;
            if(nam <=15)
                return 14;
            return 20;
        }
        if(c == 'B') {
            if(nam >= 1 && nam <=3)
                return 10;
            if(nam <=8)
                return 11;
            if(nam <=15)
                return 13;
            return 16;
        }
        if(c == 'C') {
            if(nam >= 1 && nam <=3)
                return 9;
            if(nam <=8)
                return 10;
            if(nam <=15)
                return 12;
            return 14;
        }
        if(c == 'D') {
            if(nam >= 1 && nam <=3)
                return 8;
            if(nam <=8)
                return 9;
            if(nam <=15)
                return 11;
            return 13;
        }
        return 0;
    }

    private int tongLuong() {
        return heSo()*ngayCong*luong*1000;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tongLuong();
    }
}

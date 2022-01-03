package J07047;

public class Phong {
    private String kiHieu,ten;
    private float dongia,phiphucvu;

    public Phong(String kiHieu, String ten, float dongia, float phiphucvu) {
        this.kiHieu = kiHieu;
        this.ten = ten;
        this.dongia = dongia;
        this.phiphucvu = phiphucvu;
    }

    public String getKiHieu() {
        return kiHieu;
    }

    public String getTen() {
        return ten;
    }

    public float getDongia() {
        return dongia;
    }

    public float getPhiphucvu() {
        return phiphucvu;
    }

}

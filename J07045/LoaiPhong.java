package J07045;

public class LoaiPhong implements Comparable<LoaiPhong> {
    private String loai,name;
    private int ngay;
    private float phucvu;

    public LoaiPhong(String line) {
        String [] arr = line.split("\\s+");
        this.loai = arr[0];
        this.name = arr[1];
        this.ngay = Integer.parseInt(arr[2]);
        this.phucvu =Float.parseFloat(arr[3]);
    }

    @Override
    public String toString() {
        return loai+" "+name+" "+ngay+" "+phucvu;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return this.name.compareTo(o.name);
    }
}

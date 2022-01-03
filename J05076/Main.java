package J05076;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<hanghoa> ds = new ArrayList<>();
        int n = Integer.parseInt(input.nextLine());
        for(int i=0;i<n;i++){
            ds.add(new hanghoa(input.nextLine(), input.nextLine(), input.nextLine()));
        }
        int t = Integer.parseInt(input.nextLine());
        for(int i =0;i<t;i++){
            String ma = input.next();
            int sln = Integer.parseInt(input.next());
            int dongia = Integer.parseInt(input.next());
            int slx = Integer.parseInt(input.next());
            for(hanghoa j:ds){
                if(j.getMa().equals(ma)){
                    long giaTriNhap = (long) sln * dongia;
                    long giaTriXuat = 0;
                    if(j.getXeploai().equals("A"))
                        giaTriXuat = (long) (dongia * slx * (1.08));
                    else if(j.getXeploai().equals("B"))
                        giaTriXuat = (long) (dongia * slx * (1.05));
                    else
                        giaTriXuat = (long) (dongia * slx * (1.02));
                    System.out.println(ma + " " + j.getName() + " " + giaTriNhap + " " + giaTriXuat);
                }
            }
        }
    }
}

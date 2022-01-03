package J07035;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList<Bangdiemc> ds4 = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("SINHVIEN.in"));
        ArrayList<Hocsinh> ds1 = new ArrayList<>();
        int n = Integer.parseInt(input.nextLine());
        for(int i = 0;i<n;i++){
            ds1.add(new Hocsinh(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Scanner input1 = new Scanner(new File("MONHOC.in"));
        ArrayList<Monhoc> ds2 = new ArrayList<>();
        int t = Integer.parseInt(input1.nextLine());
        for(int i =0;i<t;i++){
            ds2.add(new Monhoc(input1.nextLine(),input1.nextLine(),Integer.parseInt(input1.nextLine())));
        }
        Scanner input2 = new Scanner(new File("BANGDIEM.in"));
        int h = Integer.parseInt(input2.nextLine());
        for(int i = 0;i<h;i++){
            String ma = input2.next();
            String mamh = input2.next();
            float diem = Float.parseFloat(input2.next());
            input2.nextLine();
            String mon="";
            int tinchi=0;
            for(Monhoc k:ds2){
                if(mamh.equals(k.getMa())){
                    mon = k.getMon();
                    tinchi= k.getTinchi();
                    break;
                }
            }
            for(Hocsinh j:ds1){
                if(ma.equals(j.getMaSV())){
                    ds4.add(new Bangdiemc(j.getMaSV(), j.getName(), j.getLop(),mamh,mon,tinchi,diem));
                }
            }

        }
        Collections.sort(ds4);
        int m = Integer.parseInt(input2.nextLine());
        for(int i =0;i<m;i++){
            String k = input2.nextLine();
            System.out.println("BANG DIEM MON "+seachMon(k)+":");
            for(Bangdiemc c:ds4){
                if(k.equals(c.getMaMH())){
                    System.out.println(c);
                }
            }
        }
    }
    static String seachMon(String a){
        for(Bangdiemc j:ds4){
            if(a.equals(j.getMaMH())){
                return j.getMon();
            }
        }
        return null;
    }
}
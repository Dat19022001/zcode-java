package J07046;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner input = new Scanner(new File("KHACH.in"));
        int t = Integer.parseInt(input.nextLine());
        ArrayList<phong> ds = new ArrayList<>();
        for(int i=0;i<t;i++){
            String name = input.nextLine();
            String maP = input.nextLine();
            String ngayden = input.nextLine();
            String ngaydi = input.nextLine();
            ds.add(new phong(i,name,maP,ngayden,ngaydi));
        }
        Collections.sort(ds);
        for (phong i:ds){
            System.out.println(i);
        }
    }
}

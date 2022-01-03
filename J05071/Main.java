package J05071;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList<ThanhPho> ds = new ArrayList<>();
    static ArrayList<cuocdt> ds1 = new ArrayList<>();
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        while (n-- >0) {
            ThanhPho tp = new ThanhPho(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()));
            ds.add(tp);
        }

        int m = Integer.parseInt(in.nextLine());
        while (m-- >0) {
            String sdt = in.next();
            cuocdt cg = new cuocdt(sdt, searchById(maVung(sdt)),in.next(), in.next());
            ds1.add(cg);
        }
        Collections.sort(ds1);
        for (cuocdt i : ds1)
            System.out.println(i);
    }

    static String maVung(String sdt) {
        if(sdt.charAt(0) == '0')
            return sdt.substring(1,3);
        return sdt.substring(0,2);
    }
    static ThanhPho searchById(String id) {
        for (ThanhPho i : ds) {
            if(i.getMaVung().equals(id))
                return i;
        }
        return null;
    }
}

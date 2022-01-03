package J06004;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<sv> ds1= new ArrayList<>();
        ArrayList<in> ds2 = new ArrayList<>();
        int t = input.nextInt(),a= input.nextInt();
        input.nextLine();
        for(int i=0;i<t;i++){
            ds1.add(new sv(input.nextLine(), input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine())));
        }
        for(int i = 1;i<=a;i++){
            String m = input.nextLine();
            for(sv j:ds1){
                if(j.getNhom()==i){
                    ds2.add(new in(j.getMaSv(),j.getName(),j.getSdt(),j.getNhom(),m));
                }
            }
        }
        Collections.sort(ds2);
        for(in i:ds2){
            System.out.println(i);
        }
    }
}

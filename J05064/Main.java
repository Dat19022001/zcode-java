package J05064;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());
        int countHT =0,countHP=0;
        for(int i=0;i<n;i++){
            thunhap a = new thunhap(input.nextLine(), input.nextLine(),Integer.parseInt(input.nextLine()));
            if(a.chucvu().equals("GV")){
                System.out.println(a);
            }
            else if(a.chucvu().equals("HP")&& countHP < 2){
                System.out.println(a);
                countHP ++;
            }
            else if(a.chucvu().equals("HT")&& countHT<1){
                System.out.println(a);
                countHT++;
            }
        }
    }
}

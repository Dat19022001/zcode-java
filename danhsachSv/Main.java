package danhsachSv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("SINHVIEN.in"));
        int t = in.nextInt();
        int i = 0;
        in.nextLine();
        Sinhvien [] sv = new Sinhvien[t];
        while (in.hasNextLine()){
            String ma = in.nextLine();
            String hoten = in.nextLine();
            String lop = in.nextLine();
            String email = in.nextLine();
            String s1 = hoten.toLowerCase().trim();
            StringBuilder str = new StringBuilder(s1);
            for(int j = 0;j<str.length();j++){
                if(str.charAt(j)==' '&& str.charAt(j+1)==' '){
                    str.deleteCharAt(j);
                    j--;
                }
            }
            String a = new String(str);
            char [] character = a.toCharArray();
            boolean dc = true;
            for(int k = 0;k<a.length();k++){
                if(Character.isLetter(character[k])){
                    if(dc){
                        character[k]=Character.toUpperCase(character[k]);
                        dc = false;
                    }
                }
                else {
                    dc = true;
                }
            }
            a = String.valueOf(character);
            sv[i] = new Sinhvien(ma,a,lop,email);
            i++;
        }
        Arrays.sort(sv);
        for(Sinhvien j:sv){
            System.out.println(j);
        }
    }
}

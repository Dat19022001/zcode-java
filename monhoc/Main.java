package monhoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("MONHOC.in"));
        int t = input.nextInt();
        input.nextLine();
        Monhoc [] monhoc = new Monhoc[t];
        for (int i = 0;i < t;i++){
            monhoc[i] = new Monhoc(input.nextLine(), input.nextLine(), input.nextInt());
            input.nextLine();
        }
        Arrays.sort(monhoc);
        for(Monhoc i: monhoc){
            System.out.println(i);
        }
    }
}

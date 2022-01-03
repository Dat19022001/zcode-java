package sv;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner input = new Scanner(new File("SV.in"));
        int n = input.nextInt();
        input.nextLine();
        for(int i = 1;i<=n;i++){
            SV dat = new SV(i,input.nextLine(), input.nextLine(), input.nextLine(),Float.parseFloat(input.nextLine()));
            System.out.println(dat);
        }

    }
}

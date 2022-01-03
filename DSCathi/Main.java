package DSCathi;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner input = new Scanner(new File("CATHI.in"));
        ArrayList<DSCA> ds = new ArrayList<>();
        int t = Integer.parseInt(input.nextLine());
        for(int i =0;i<t;i++){
            ds.add(new DSCA(i, input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(ds);
        for(DSCA i:ds){
            System.out.println(i);
        }
    }
}

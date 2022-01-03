package J05032;

import java.lang.reflect.Array;
import java.text.ParseException;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<trenhat> ds = new ArrayList<>();
        for(int i = 0;i<n;i++){
            ds.add(new trenhat(input.next(),input.next()));
        }
        Collections.sort(ds);
        System.out.println(ds.get(ds.size()-1));
        System.out.println(ds.get(0));
    }
}

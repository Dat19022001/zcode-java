package J05011;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        choigame [] ds = new choigame[t];
        input.nextLine();
        for(int i=0;i<t;i++){
            String id = input.nextLine();
            String name = input.nextLine();
            String giovao = input.nextLine();
            String giora = input.nextLine();
            ds [i] = new choigame(id,name,giovao,giora);
        }
        Arrays.sort(ds);
        for(choigame i:ds){
            System.out.println(i);
        }
    }
}

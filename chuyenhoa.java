import java.util.Locale;
import java.util.Scanner;

public class chuyenhoa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ma = input.nextLine();

        String ma1 = ma.toLowerCase().trim();
        String [] tu = ma1.split("\\s+");
        StringBuilder d = new StringBuilder();
        for(String i:tu){
            d.append(Character.toUpperCase(i.charAt(0))).append(i.substring(1)).append(" ");
        }
        String a=d.toString().trim();
        System.out.println(a);
    }
}


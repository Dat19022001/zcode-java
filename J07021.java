import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class J07021 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("DATA.in"));
        while (input.hasNextLine()){
            String a = input.nextLine();
            if(a.equals("END")) break;
            String a1 = a.trim();
            String [] tu = a1.toLowerCase().split("\\s+");
            StringBuilder res = new StringBuilder();
            for(String i:tu){
                res.append(Character.toUpperCase(i.charAt(0))).append(i.substring(1)).append(" ");
            }
            System.out.println(res.toString().trim());
        }
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DATA {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("DATA.in"));
        while (input.hasNextLine()){
            String a = input.nextLine();
            System.out.println(a);
        }
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class hellofile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("Hello.txt"));
        while (input.hasNextLine()){
            String a = input.nextLine();
            System.out.println(a);
        }
    }
}

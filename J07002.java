import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("DATA.in"));
        long sum = 0;
        while (input.hasNext()){
            if(input.hasNextInt()){
                sum += input.nextInt();
            }
            else input.next() ;
        }
        System.out.println(sum);
    }
}

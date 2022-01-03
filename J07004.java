import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("DATA.in"));
        int [] dem = new int[1000]; // tao mang;
        while (input.hasNext()){
            int a = input.nextInt();
            dem[a] += 1;
        }
        for (int i = 0;i<1000;i++){
            if (dem[i] > 0){
                System.out.println(i +" "+dem[i]);
            }
        }
    }
}

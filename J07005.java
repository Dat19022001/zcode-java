import javax.xml.crypto.Data;
import java.io.*;
import java.util.Scanner;

public class J07005 {
    public static void main(String[] args) throws IOException {
        // file nhi phan
        DataInputStream input = new DataInputStream(new FileInputStream("DATA.in"));
        int [] dem = new int[1000];
        for (int i = 0; i < 100000;i++){
            dem[input.readInt()] += 1;
        }
        for (int i = 0; i < 1000;i++){
            System.out.println(i +" "+ dem[i]);
        }
    }
}

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class J07015 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //object file nhi phan
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        // tao arrlist
        ArrayList<Integer> prime = (ArrayList<Integer>) input.readObject();
        int [] dem = new int[10000];
        for (Integer i: prime){
            if (nguyento(i)){
                dem[i] += 1;
            }
        }
        for (int i = 0;i < 10000;i++){
            if (dem[i] > 0){
                System.out.println(i+" "+dem[i]);
            }
        }
    }
    static boolean nguyento(int n){
        if (n == 1 || n == 0){
            return false;
        }
        for(int i = 2;i<=Math.sqrt(n);i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

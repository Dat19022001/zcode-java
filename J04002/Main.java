package J04002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b;
        String color;
        Scanner  input = new Scanner(System.in);
        String [] arr = input.nextLine().split(" ");
        a = Double.parseDouble(arr[0]);
        b = Double.parseDouble(arr[1]);
        color = arr[2];
        if(a<=0||b<=0){
            System.out.println("INVALID");
        }
        else {
            Rectange s = new Rectange(a,b,color);
            System.out.println(s);
        }

    }
}

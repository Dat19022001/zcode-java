import java.util.Scanner;

public class tinhgio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int gio =(a/3600);
        System.out.println(gio+" "+a);
        int phut =(a/60);
        System.out.println(phut+" "+a);
        int s = a%60;
        System.out.println(s+" "+a);
    }
}

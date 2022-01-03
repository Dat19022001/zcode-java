import java.util.Scanner;

public class J01016 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dem4 = 0, dem7=0;
        String s = input.nextLine();
        for (int i =0;i<s.length();i++){
            if(s.charAt(i)=='4') dem4++;
            if(s.charAt(i)=='7') dem7++;
        }
        if(dem4+dem7==4||dem7+dem4==7){
            System.out.println("YES");
        }else System.out.println("NO");
    }
}

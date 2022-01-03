import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class chiahet {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("in.txt"));
        FileWriter d = new FileWriter("out.txt");
        while (in.hasNextInt()){
            int t = in.nextInt();
            String a =  String.valueOf(xuly(t));
            d.write(a+"\n");
        }
        d.close();
    }
    public static int xuly(int n){
        Queue<String> q = new LinkedList<>();
        q.add("9");
        while(!q.isEmpty()){
            String tmp = q.poll();
            long x = Long.parseLong(tmp);
            if(x % n == 0) {
                return (int) x;
            }
            q.add(tmp + "0");
            q.add(tmp + "9");
        }
        return n;
    }
}

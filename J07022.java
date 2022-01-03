import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class J07022 {
        public static void main(String[] args) throws FileNotFoundException {
            Scanner in = new Scanner(new File("DATA.in"));
            List<String> list = new LinkedList<>();
            while (in.hasNext()) {
                if(in.hasNextInt())
                    in.nextInt();
                else list.add(in.next());
            }
            Collections.sort(list);
            for (String i : list)
                System.out.print(i + " ");
        }
    }

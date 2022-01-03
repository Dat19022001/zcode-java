package lietkekhacnhau;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class WordSet {
    private SortedSet<String> dat = new TreeSet<>();

    public WordSet(String them) throws FileNotFoundException {
        Scanner input = new Scanner(new File(them));
        while (input.hasNext()){
            dat.add(input.next().toLowerCase());
        }
    }

    @Override
    public String toString() {
        for(String i :dat){
            System.out.println(i

            );
        }
        return "";
    }
}

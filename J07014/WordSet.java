package J07014;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class WordSet {
    private SortedSet<String> ds = new TreeSet<>();

    public WordSet(SortedSet<String> ds) {
        this.ds = ds;
    }

    public WordSet(String filename) throws FileNotFoundException {
        Scanner input = new Scanner(new File(filename));
        while (input.hasNext()){
            ds.add(input.next().toLowerCase());
        }
    }
    public WordSet union(WordSet a){
        SortedSet<String> hop = new TreeSet<>();
        for(String i:ds){
            hop.add(i);
        }
        for(String i:a.ds){
            hop.add(i);
        }
        WordSet res = new WordSet(hop);
        return res;
    }
    public WordSet intersection(WordSet a){
        SortedSet<String> giao = new TreeSet<>();
        for(String i:ds){
            if(a.ds.contains(i)){
                giao.add(i);
            }
        }
        WordSet res = new WordSet(giao);
        return res;
    }

    @Override
    public String toString() {
        for(String i:ds){
            System.out.print(i+" ");
        }
        return "";
    }
}

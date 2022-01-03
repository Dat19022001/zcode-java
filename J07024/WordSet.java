package J07024;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordSet {
    private SortedSet<String> ds = new TreeSet<>();

    public WordSet(SortedSet<String> ds) {
        this.ds = ds;
    }
    public WordSet(String nameFile) throws FileNotFoundException {
        Scanner ipnut = new Scanner(new File(nameFile));
        while (ipnut.hasNext()){
            ds.add(ipnut.next().toLowerCase());
        }
    }
    public WordSet difference(WordSet a){
        SortedSet<String> giao = new TreeSet<>() ;
        for(String i:ds){
            if(!a.ds.contains(i)){
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

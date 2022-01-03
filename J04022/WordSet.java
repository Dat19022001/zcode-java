package J04022;

import java.util.Locale;
import java.util.TreeSet;

public class WordSet {
    private String a;

    public WordSet(String a) {
        this.a = a;
    }

    public WordSet union(WordSet b){
        TreeSet<String> set = new TreeSet<>();
        String [] tu = a.toLowerCase().split("\\s+");
        String [] tu1 = b.a.toLowerCase().split("\\s+");
        for(String i:tu){
            set.add(i);
        }
        for(String i :tu1){
            set.add(i);
        }
        StringBuilder res = new StringBuilder();
        for(String i :set){
            res.append(i+" ");
        }
        WordSet a = new WordSet(res.toString().trim());
        return a;
    }
    public WordSet intersection(WordSet b){
        TreeSet<String> set = new TreeSet<>();
        TreeSet<String> set1 = new TreeSet<>();
        String [] tu = a.toLowerCase().split("\\s+");
        String [] tu1 = b.a.toLowerCase().split("\\s+");
        for(String i:tu){
            set.add(i);
        }
        for(String i :tu1){
            if(set.contains(i)){
                set1.add(i);
            }
        }
        StringBuilder res = new StringBuilder();
        for(String i :set1){
            res.append(i+" ");
        }
        WordSet a = new WordSet(res.toString().trim());
        return a;
    }

    @Override
    public String toString() {
        return a;
    }
}

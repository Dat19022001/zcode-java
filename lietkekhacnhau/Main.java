package lietkekhacnhau;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
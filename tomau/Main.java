package tomau;

import java.awt.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        NewFram f = new NewFram("hoi to mau");
        f.setSize(600, 600);
        f.setVisible(true); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

package tomau;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import  javax.swing.*;
import javax.swing.event.AncestorListener;

public class NewFram extends JFrame implements ActionListener {
    private  JPanel p = new JPanel();
    private JButton OK = new JButton("OK");
    private JButton newOK = new JButton("GREEN");
    private JComboBox<String> chon = new JComboBox<>();

    public NewFram(String title) throws HeadlessException {
        super(title);
        setLayout(new BorderLayout());
        add(p,BorderLayout.CENTER);

        JPanel ps= new JPanel();
        ps.setLayout(new FlowLayout());
        ps.add(OK); ps.add(newOK);ps.add(chon);
        chon.addItem("xanh");
        chon.addItem("do");
        chon.addItem("tim");
        chon.addItem("vang");
        chon.addItem("trang");
        chon.addItem("den");
        add(ps,BorderLayout.SOUTH);
        OK.addActionListener(this);
        newOK.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(OK)){
            String s = Objects.requireNonNull(chon.getSelectedItem()).toString();
            if(s.equals("xanh")) p.setBackground(Color.BLUE);
            if(s.equals("do")) p.setBackground(Color.red);
            if(s.equals("tim")) p.setBackground(Color.magenta);
            if(s.equals("vang")) p.setBackground(Color.yellow);
            if(s.equals("trang")) p.setBackground(Color.white);
            if(s.equals("den")) p.setBackground(Color.black);
        }
        else{
            p.setBackground(Color.green);
        }
    }
}

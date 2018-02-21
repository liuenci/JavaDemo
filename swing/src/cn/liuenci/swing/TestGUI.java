package cn.liuenci.swing;


import java.awt.Color;
import java.awt.FlowLayout;
 
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
  
public class TestGUI {
    public static void main(String[] args) {
  
        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
  
        f.setLayout(null);
  
        JPanel p1 = new JPanel();
        p1.setBounds(50, 50, 300, 60);
  
        p1.setBackground(Color.RED);
  
        p1.setLayout(new FlowLayout());
  
        JButton b1 = new JButton("Ó¢ÐÛ1");
        JButton b2 = new JButton("Ó¢ÐÛ2");
        JButton b3 = new JButton("Ó¢ÐÛ3");
  
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
  
        JPanel p2 = new JPanel();
        JButton b4 = new JButton("Ó¢ÐÛ4");
        JButton b5 = new JButton("Ó¢ÐÛ5");
        JButton b6 = new JButton("Ó¢ÐÛ6");
  
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
  
        p2.setBackground(Color.BLUE);
        p2.setBounds(10, 150, 300, 60);
  
        JTabbedPane tp = new JTabbedPane();
        tp.add(p1);
        tp.add(p2);
  
        // ÉèÖÃtabµÄ±êÌâ
        tp.setTitleAt(0, "ºìÉ«tab");
        tp.setTitleAt(1, "À¶É«tab");
         
        ImageIcon i = new ImageIcon("e:/project/j2se/j.png");
        tp.setIconAt(0,i );
        tp.setIconAt(1,i );
  
        f.setContentPane(tp);
  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
        f.setVisible(true);
    }
}

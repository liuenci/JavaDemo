package cn.liuenci.swing;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
public class Demo4 extends JFrame {
    MyJPanel mp;
    int index;
    ImageIcon[] imgs = {
            new ImageIcon("images/1.jpg"),
            new ImageIcon("images/2.jpg"),
            new ImageIcon("images/²É¹º¶©µ¥.png"),
            new ImageIcon("src/images/4.jpg"),
            new ImageIcon("src/images/5.jpg"),
            new ImageIcon("src/images/6.jpg"),
            new ImageIcon("src/images/7.jpg"),
            new ImageIcon("src/images/8.jpg"),
        };
    public Demo4() {
        mp = new MyJPanel();
        this.add(mp);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("´°¿Ú");
        this.setVisible(true);
        Timer timer = new Timer(500,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mp.repaint();
            }
        });
        timer.start();
    }
    public static void main(String[] args) {
        new Demo4();
    }
    class MyJPanel extends JPanel{
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.drawImage(imgs[index%imgs.length].getImage(), 0, 0,this);
            index++;
        }
    }
}
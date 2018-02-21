package cn.liuenci.swing;  
  
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;  
  
class MyCheckBox {  
    private JFrame frame = new JFrame("Beyole");// 定义窗体  
    private Container container = frame.getContentPane();// 得到窗体容器  
    private JCheckBox jcb1 = new JCheckBox("主站");// 定义一个复选框  
    private JCheckBox jcb2 = new JCheckBox("论坛");// 定义一个复选框  
    private JCheckBox jcb3 = new JCheckBox("博客");// 定义一个复选框  
    private JPanel panel = new JPanel();// 定义一个面板  
  
    public MyCheckBox() {  
        panel.setBorder(BorderFactory.createTitledBorder("请选择你最喜欢的网站"));// 定义一个面板的边框显示条  
        panel.setLayout(new GridLayout(1, 3));// 定义排版，1行3列  
        panel.add(this.jcb1);// 加入组件  
        panel.add(this.jcb2);// 加入组件  
        panel.add(this.jcb3);// 加入组件  
        container.add(panel);// 加入面板  
        this.frame.setSize(330, 80);// 定义窗体大小  
        this.frame.setVisible(true);// 显示窗体  
        this.frame.addWindowListener(new WindowAdapter() {  
            public void windowClosing(WindowEvent arg0)// 复写窗口关闭方法  
            {  
                System.exit(1);// 退出  
            }  
        });  
  
    }  
}  
  
public class JCheckBoxDemo01 {  
    public static void main(String[] args) {  
        new MyCheckBox();  
    }  
}  


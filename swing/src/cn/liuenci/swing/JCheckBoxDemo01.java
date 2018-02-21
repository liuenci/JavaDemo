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
    private JFrame frame = new JFrame("Beyole");// ���崰��  
    private Container container = frame.getContentPane();// �õ���������  
    private JCheckBox jcb1 = new JCheckBox("��վ");// ����һ����ѡ��  
    private JCheckBox jcb2 = new JCheckBox("��̳");// ����һ����ѡ��  
    private JCheckBox jcb3 = new JCheckBox("����");// ����һ����ѡ��  
    private JPanel panel = new JPanel();// ����һ�����  
  
    public MyCheckBox() {  
        panel.setBorder(BorderFactory.createTitledBorder("��ѡ������ϲ������վ"));// ����һ�����ı߿���ʾ��  
        panel.setLayout(new GridLayout(1, 3));// �����Ű棬1��3��  
        panel.add(this.jcb1);// �������  
        panel.add(this.jcb2);// �������  
        panel.add(this.jcb3);// �������  
        container.add(panel);// �������  
        this.frame.setSize(330, 80);// ���崰���С  
        this.frame.setVisible(true);// ��ʾ����  
        this.frame.addWindowListener(new WindowAdapter() {  
            public void windowClosing(WindowEvent arg0)// ��д���ڹرշ���  
            {  
                System.exit(1);// �˳�  
            }  
        });  
  
    }  
}  
  
public class JCheckBoxDemo01 {  
    public static void main(String[] args) {  
        new MyCheckBox();  
    }  
}  


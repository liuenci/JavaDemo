package liuenci.cn.package_20;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercise_4 extends JFrame {
	public void init() {
		this.setSize(250, 350);
		this.setLocation(600, 200);
		this.setResizable(false);
		this.addPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public void addPanel(){
		//�������
		JPanel panel = new JPanel();
		//�������ֶ���
		CardLayout cl = new CardLayout();
		//������岼��
		panel.setLayout(cl);
		//����ѡ����
		JPanel p1 = new JPanel();
		p1.setBackground(Color.red);
		JPanel p2 = new JPanel();
		p2.setBackground(Color.black);
		JPanel p3 = new JPanel();
		p3.setBackground(Color.BLUE);
		JPanel p4 = new JPanel();
		p4.setBackground(Color.green);
		
		
		//��ѡ������ӵ������
		panel.add(p1);
		panel.add(p2);
		panel.add(p3);
		panel.add(p4);
	
		
		//�����������
		JPanel btnp = new JPanel();
		//�����ĸ���ť
		JButton btn1 = new JButton("��һ��");
		JButton btn2 = new JButton("��һ��");
		JButton btn3 = new JButton("");
		JButton btn4 = new JButton("��һ��");
		
		//����ť��ӵ����
		
	}
	public static void main(String[] args) {

	}

}

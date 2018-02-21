package liuenci.cn.package_20;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercise_3 extends JFrame{
	public void init() {
		this.setSize(250, 350);
		this.setLocation(600, 200);
		this.setResizable(false);
		this.addPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public void addPanel(){
		JPanel panel = new JPanel();
		//�������Ӳ��ֶ���
		BoxLayout bl = new BoxLayout(panel, BoxLayout.Y_AXIS);
		panel.setLayout(bl);
		this.add(panel);
		
		//����������ť
		JButton button1 = new JButton("ȷ��");
		JButton button2 = new JButton("����");
		JButton button3 = new JButton("ȡ��");
		panel.add(button1);
		//���ü��
		panel.add(Box.createRigidArea(new Dimension(110,101)));
		panel.add(button2);
		panel.add(Box.createRigidArea(new Dimension(10,10)));
		panel.add(button3);
	}
	public static void main(String[] args) {
		new Exercise_3().init();
	}

}

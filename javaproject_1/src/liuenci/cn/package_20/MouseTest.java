package liuenci.cn.package_20;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseTest extends JFrame{
	//���ڹ��췽��
	public MouseTest(){
		this.init();
		this.addPanel();
		this.setVisible(true);
	}
	//���ڳ�ʼ��
	public void init(){
		this.setTitle("��ʾ�������");
		this.setSize(400,300);
		this.setLocation(600,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//������
	public void addPanel(){
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JLabel label1 = new JLabel("��ʾ�������");
		label1.setHorizontalAlignment(JLabel.CENTER);
		JLabel label2 = new JLabel("X:");
		label2.setHorizontalAlignment(JLabel.CENTER);
		JLabel label3 = new JLabel("Y:");
		label3.setHorizontalAlignment(JLabel.CENTER);
		panel.add(label1,BorderLayout.NORTH);
		panel.add(label2,BorderLayout.NORTH);
		panel.add(label3,BorderLayout.NORTH);
		this.add(panel);
		//���������¼�
		//panel.addMouseListener(new Mouse());
	}
	

	
	public static void main(String[] args) {
		MouseTest mouseTest = new MouseTest();
	}

}


package cn.liuenci.swing;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxLayoutDemo extends JFrame	{
	//���췽��
	public BoxLayoutDemo() {
		//��ʼ��
		init();
		addPanel();
	}
	//��ʼ��
	public void init() {
		this.setTitle("BoxLayout����");
		this.setSize(300,300);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	//������
	public void addPanel() {
		//�������
		JPanel p = new JPanel();
		//�������Ӳ��ֶ���
		BoxLayout bl = new BoxLayout(p, BoxLayout.Y_AXIS);
		//������岼��
		p.setLayout(bl);
		
		//�������ӵ�����
		this.add(p);
		
		//����������ť
		JButton btn1 = new JButton("ȷ��");
		JButton btn2 = new JButton("����");
		JButton btn3 = new JButton("ȡ��");
		
		//����ť��ӵ����
		p.add(btn1);
		//���ü��
		
		//��һ�����ֻ���±߾���Ч���Ժ����������±߾඼��Ч��
		p.add(Box.createVerticalStrut(30));
		//���ݴ��ڵĴ�С���ã�������֮��ľ����Զ�����
		//p.add(Box.createVerticalGlue());
		
		//100�ǰ�ť�ұߵĿ�ȣ�50�ǰ�ť����Ŀ��
		//p.add(Box.createRigidArea(new Dimension(100,50)));
		
		
		p.add(btn2);
		
		p.add(Box.createVerticalStrut(30));
		//p.add(Box.createRigidArea(new Dimension(100,50)));
		
		
		//ƽ������
		//p.add(Box.createVerticalGlue());
		
		
		//����ֵ���ü��
		p.add(Box.createVerticalStrut(30));
		p.add(btn3);
		//�������ӵ�����
		this.add(p);
	}
	public static void main(String[] args) {
		new BoxLayoutDemo();
	}

}

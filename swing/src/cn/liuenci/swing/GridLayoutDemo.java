package cn.liuenci.swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GridLayoutDemo extends JFrame{

	// ���췽��
	public GridLayoutDemo() {
		init();
		addPanel();

	}

	// ��ʼ������
	public void init() {
		this.setTitle("GridLayout");
		this.setSize(250, 350);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	//������
	public void addPanel() {
		//�������
		JPanel p = new JPanel();
		//������񲼾ֶ���
		GridLayout gl = new GridLayout();
		//���ò�������
		gl.setRows(4);
		gl.setColumns(4);
		gl.setHgap(10);
		gl.setVgap(10);
		//�������Ӳ���
		p.setLayout(gl);
		//������ʾ��
		JTextField jf = new JTextField(".0");
		//�����ı����Ҷ���
		jf.setHorizontalAlignment(JTextField.RIGHT);
		//��������
		jf.setFont(new Font("΢���ź�",Font.BOLD,36));
		//��������ӵ�����
		this.add(jf,BorderLayout.NORTH);
		
		//��Ӱ�ťԪ��
		String[] fh = new String[] {"0", "C", "+", "-", "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "="};
		JButton[] btns = new JButton[16];
		//ѭ����Ӱ�ť
		for(int i = 0;i<btns.length;i++) {
			btns[i] = new JButton(fh[i]);
			//���ð�ť����
			btns[i].setFont(new Font("΢���ź�",Font.BOLD,20));
			//��ÿ����ť��ӵ���¼�
			btns[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//ҵ�񷽷�
					JButton b = (JButton)e.getSource();
				}
			});
			//����ť��ӵ���� 
			p.add(btns[i]);
		}
		//�������ӵ�����
		this.add(p);
	}
	public static void main(String[] args) {
		new GridLayoutDemo();
	}

}

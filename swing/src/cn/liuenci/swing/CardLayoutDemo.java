package cn.liuenci.swing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class CardLayoutDemo extends JFrame {
	// �����ĸ���ť
	private JButton btn = new JButton("��һ��");
	private JButton btn2 = new JButton("��һ��");
	private JButton btn3 = new JButton("��һ��");
	private JButton btn4 = new JButton("���һ��");

	// �������
	JPanel p = new JPanel();
	// �������ֶ���
	CardLayout cl = new CardLayout();

	// ���췽��
	public CardLayoutDemo() {
		// ��ʼ��
		init();
		addPanel();
	}

	// ��ʼ������
	public void init() {
		this.setTitle("CardLayout");
		this.setSize(300, 300);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	//������岼��
	public void addPanel() {
		//������岼��
		p.setLayout(cl);
		
		//����ѡ����
		JPanel p1 = new JPanel();
		p1.setBackground(Color.red);
		JPanel p2 = new JPanel();
		p2.setBackground(Color.BLUE);
		JPanel p3 = new JPanel();
		p3.setBackground(Color.yellow);
		JPanel p4 = new JPanel();
		p4.setBackground(Color.pink);
		
		//��ѡ������ӵ������
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		
		//�����������
		JPanel btnp = new JPanel();
		//��������л�����
		CardAction ca = new CardAction();
		
		//���ĸ���ť����¼�
		btn.addActionListener(ca);
		btn2.addActionListener(ca);
		btn3.addActionListener(ca);
		btn4.addActionListener(ca);
		
		//���ĸ���ť��ӵ����
		btnp.add(btn);
		btnp.add(btn2);
		btnp.add(btn3);
		btnp.add(btn4);
		
		//�������ӵ�����
		this.add(btnp,BorderLayout.SOUTH);
		this.add(p);
	}
	/**
	 * ��ť�����������Ա�ڲ��ࣩ
	 */
	class CardAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//�����л��¼�
			if(e.getSource() == btn) {
				cl.first(p);
			}else if(e.getSource() == btn2) {
				cl.previous(p);
			}else if(e.getSource() == btn3) {
				cl.next(p);
			}else if(e.getSource() == btn4) {
				cl.last(p);
			}
		}
		
	}
	// ��������
	public static void setTheme() {
		setDefaultLookAndFeelDecorated(true);
		try {
			//��ͺ�
//			UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
			//ľ�ʸ�+xp���
//			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			//��Բ��ť+��ɫ��ť����
//			UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
			//��Բ��ť+��ɫ��ť����(������MAC)
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
			//��XP���
//			UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
			//��ɫ���
//			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
			//��ͨswing���+��ɫ�߿�
//			UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
			//��ɫ���
//			UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
			//��Բ��ť+����ɫ��ť����+�����ʸ�
//			UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
			//XP���·��
//			UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
			//���ʸ�+swing�����
//			UIManager.setLookAndFeel("com.jtattoo.plafacryl.AcrylLookAndFeel");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		//���������񣨸ķ����������ڴ�������֮ǰ���ã�
		setTheme();
		new CardLayoutDemo();
	}

}

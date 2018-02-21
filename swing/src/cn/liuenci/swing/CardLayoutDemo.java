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
	// 创建四个按钮
	private JButton btn = new JButton("第一个");
	private JButton btn2 = new JButton("上一个");
	private JButton btn3 = new JButton("下一个");
	private JButton btn4 = new JButton("最后一个");

	// 创建面板
	JPanel p = new JPanel();
	// 创建布局对象
	CardLayout cl = new CardLayout();

	// 构造方法
	public CardLayoutDemo() {
		// 初始化
		init();
		addPanel();
	}

	// 初始化窗口
	public void init() {
		this.setTitle("CardLayout");
		this.setSize(300, 300);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	//设置面板布局
	public void addPanel() {
		//设置面板布局
		p.setLayout(cl);
		
		//创建选项卡面板
		JPanel p1 = new JPanel();
		p1.setBackground(Color.red);
		JPanel p2 = new JPanel();
		p2.setBackground(Color.BLUE);
		JPanel p3 = new JPanel();
		p3.setBackground(Color.yellow);
		JPanel p4 = new JPanel();
		p4.setBackground(Color.pink);
		
		//将选项卡面板添加到面板中
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		
		//创建操作面板
		JPanel btnp = new JPanel();
		//创建面板切换对象
		CardAction ca = new CardAction();
		
		//给四个按钮添加事件
		btn.addActionListener(ca);
		btn2.addActionListener(ca);
		btn3.addActionListener(ca);
		btn4.addActionListener(ca);
		
		//将四个按钮添加到面板
		btnp.add(btn);
		btnp.add(btn2);
		btnp.add(btn3);
		btnp.add(btn4);
		
		//将面板添加到窗口
		this.add(btnp,BorderLayout.SOUTH);
		this.add(p);
	}
	/**
	 * 按钮点击操作（成员内部类）
	 */
	class CardAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//设置切换事件
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
	// 设置主题
	public static void setTheme() {
		setDefaultLookAndFeelDecorated(true);
		try {
			//柔和黑
//			UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
			//木质感+xp风格
//			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			//椭圆按钮+黄色按钮背景
//			UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
			//椭圆按钮+绿色按钮背景(类似于MAC)
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
			//纯XP风格
//			UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
			//黑色风格
//			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
			//普通swing风格+蓝色边框
//			UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
			//黄色风格
//			UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
			//椭圆按钮+翠绿色按钮背景+金属质感
//			UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
			//XP清新风格
//			UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
			//布质感+swing纯风格
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
		//设置主题风格（改方法必须正在创建对象之前调用）
		setTheme();
		new CardLayoutDemo();
	}

}

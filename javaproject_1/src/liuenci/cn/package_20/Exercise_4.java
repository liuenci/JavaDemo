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
		//创建面板
		JPanel panel = new JPanel();
		//创建布局对象
		CardLayout cl = new CardLayout();
		//设置面板布局
		panel.setLayout(cl);
		//创建选项卡面板
		JPanel p1 = new JPanel();
		p1.setBackground(Color.red);
		JPanel p2 = new JPanel();
		p2.setBackground(Color.black);
		JPanel p3 = new JPanel();
		p3.setBackground(Color.BLUE);
		JPanel p4 = new JPanel();
		p4.setBackground(Color.green);
		
		
		//将选项卡面板添加到面板中
		panel.add(p1);
		panel.add(p2);
		panel.add(p3);
		panel.add(p4);
	
		
		//创建操作面板
		JPanel btnp = new JPanel();
		//创建四个按钮
		JButton btn1 = new JButton("第一个");
		JButton btn2 = new JButton("下一个");
		JButton btn3 = new JButton("");
		JButton btn4 = new JButton("第一个");
		
		//将按钮添加到面板
		
	}
	public static void main(String[] args) {

	}

}

package cn.liuenci.swing;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxLayoutDemo extends JFrame	{
	//构造方法
	public BoxLayoutDemo() {
		//初始化
		init();
		addPanel();
	}
	//初始化
	public void init() {
		this.setTitle("BoxLayout布局");
		this.setSize(300,300);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	//添加面板
	public void addPanel() {
		//创建面板
		JPanel p = new JPanel();
		//创建盒子布局对象
		BoxLayout bl = new BoxLayout(p, BoxLayout.Y_AXIS);
		//设置面板布局
		p.setLayout(bl);
		
		//将面板添加到窗口
		this.add(p);
		
		//创建三个按钮
		JButton btn1 = new JButton("确定");
		JButton btn2 = new JButton("搜索");
		JButton btn3 = new JButton("取消");
		
		//将按钮添加到面板
		p.add(btn1);
		//设置间距
		
		//第一个组件只有下边距有效，以后的组件是上下边距都有效。
		p.add(Box.createVerticalStrut(30));
		//根据窗口的大小设置，最大化组件之间的距离自动扩大
		//p.add(Box.createVerticalGlue());
		
		//100是按钮右边的宽度，50是按钮下面的宽度
		//p.add(Box.createRigidArea(new Dimension(100,50)));
		
		
		p.add(btn2);
		
		p.add(Box.createVerticalStrut(30));
		//p.add(Box.createRigidArea(new Dimension(100,50)));
		
		
		//平均设置
		//p.add(Box.createVerticalGlue());
		
		
		//根据值设置间距
		p.add(Box.createVerticalStrut(30));
		p.add(btn3);
		//将面板添加到窗口
		this.add(p);
	}
	public static void main(String[] args) {
		new BoxLayoutDemo();
	}

}

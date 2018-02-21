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

	// 构造方法
	public GridLayoutDemo() {
		init();
		addPanel();

	}

	// 初始化窗口
	public void init() {
		this.setTitle("GridLayout");
		this.setSize(250, 350);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	//添加面板
	public void addPanel() {
		//创建面板
		JPanel p = new JPanel();
		//创建表格布局对象
		GridLayout gl = new GridLayout();
		//设置布局属性
		gl.setRows(4);
		gl.setColumns(4);
		gl.setHgap(10);
		gl.setVgap(10);
		//给面板添加布局
		p.setLayout(gl);
		//创建显示框
		JTextField jf = new JTextField(".0");
		//设置文本框右对齐
		jf.setHorizontalAlignment(JTextField.RIGHT);
		//设置字体
		jf.setFont(new Font("微软雅黑",Font.BOLD,36));
		//将窗口添加到窗口
		this.add(jf,BorderLayout.NORTH);
		
		//添加按钮元素
		String[] fh = new String[] {"0", "C", "+", "-", "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "="};
		JButton[] btns = new JButton[16];
		//循环添加按钮
		for(int i = 0;i<btns.length;i++) {
			btns[i] = new JButton(fh[i]);
			//设置按钮字体
			btns[i].setFont(new Font("微软雅黑",Font.BOLD,20));
			//给每个按钮添加点击事件
			btns[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//业务方法
					JButton b = (JButton)e.getSource();
				}
			});
			//将按钮添加到面板 
			p.add(btns[i]);
		}
		//将面板添加到窗口
		this.add(p);
	}
	public static void main(String[] args) {
		new GridLayoutDemo();
	}

}

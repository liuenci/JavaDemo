package liuenci.cn.package_20;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FrameTest extends JFrame{
	static FrameTest frameTest;;
	static FrameTest frameTest1;
	JPanel panel;;
	public FrameTest(String name){
		this.setTitle(name);
	}
	public void view(){
		this.init();
		//this.addButton();
		//this.addLabel();
		//this.addTextField();
		//this.addTextArea();
		this.addImage();
		this.setVisible(true);
	}
	public void init(){
		//设置窗口的大小
		this.setSize(1000,800);
		//设置面板的背景颜色
		panel = new JPanel();
		panel.setBackground(Color.black);
		this.add(BorderLayout.NORTH,panel);
	}
	public void addButton(){
		JButton button = new JButton("熊主席");
		this.add(BorderLayout.SOUTH,button);
	}
	public void addLabel(){
		JLabel label = new JLabel();
		String htm = "<html><a href='liuenci.cn'>博客</a><html>";
		label.setText(htm);
		this.add(label,BorderLayout.NORTH);
	}
	public void addTextField(){
		JTextField tf = new JTextField();
		tf.setText("请输入用户名:");
		tf.setBackground(Color.pink);
		this.add(BorderLayout.EAST,tf);
	}
	public void addTextArea(){
		JTextArea ta = new JTextArea();
		ta.setText("请在此输入:");
		ta.setLineWrap(true);
		JPanel panel1 = new JPanel();
		
		panel1.add(ta);
		panel1.setSize(200,200);
		this.add(BorderLayout.WEST,panel1);
	}
	public void addImage(){
		JLabel label = new JLabel("美女");
		Icon icon = new ImageIcon("images/1.jpg");
		label.setIcon(icon);
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setForeground(Color.black);
		this.add(label);
	}
	public static void main(String[] args) {
		frameTest = new FrameTest("小黑");
		frameTest1 = new FrameTest("小白");
		frameTest.view();
		frameTest1.view();
	}

}

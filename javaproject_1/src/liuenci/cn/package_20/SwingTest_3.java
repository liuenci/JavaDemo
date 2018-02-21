package liuenci.cn.package_20;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingTest_3 {

	public static void main(String[] args) {
		SwingTest_3 swingTest_3 = new SwingTest_3();
		swingTest_3.go();
	}

	public void go() {
		JFrame frame = new JFrame();
		
		JButton east = new JButton("east");
		JButton west = new JButton("west");
		JButton north = new JButton("north");
		JButton south = new JButton("south");
		JButton center = new JButton("center");
		//设置按钮的字体大小
//		Font bigFont = new Font("微软雅黑", Font.BOLD, 108);
//		button.setFont(bigFont);
		frame.getContentPane().add(BorderLayout.EAST, east);
		frame.getContentPane().add(BorderLayout.WEST, west);
		frame.getContentPane().add(BorderLayout.NORTH, north);
		frame.getContentPane().add(BorderLayout.SOUTH, south);
		frame.getContentPane().add(BorderLayout.CENTER, center);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
}
package liuenci.cn.package_20;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panell {

	public static void main(String[] args) {
		Panell panell = new Panell();
		panell.go();
	}
	public void go(){
		JFrame jFrame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		
		//更换布局管理器
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		//创建按钮对象
		JButton jButton = new JButton("click me");
		JButton jButton1 = new JButton("click me");
		JButton jButton2 = new JButton("click me");
		//将按钮添加到面板上
		panel.add(jButton);
		panel.add(jButton1);
		panel.add(jButton2);
		jFrame.getContentPane().add(BorderLayout.EAST, panel);
		jFrame.setSize(200,200);
		jFrame.setVisible(true);
	}
}

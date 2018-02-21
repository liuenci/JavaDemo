package liuenci.cn.package_20;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 定义JFrame派生的子类MyWindowDemo创建JFrame窗口 。类MyWindowDemo的构造方法有五个参数：
 * 窗口的标题名，加放窗口的组件，窗口的背景颜色以及窗口的高度和宽度。
 * 
 * @author 刘
 *
 */
public class SwingTest_2 {
	public static MyWindowDemo mw1;
	public static MyWindowDemo mw2;

	public static void main(String[] args) {
		JButton button = new JButton("按钮");
		mw1 = new MyWindowDemo("熊主席", button, Color.BLACK, 200, 200);
		mw1.add(button);
		System.out.println(button.getText());
		mw1.setVisible(true);
		mw2 = new MyWindowDemo("主席", button, Color.red, 200, 200);
		mw2.add(button);
		mw2.setVisible(true);
	}

}

class MyWindowDemo extends JFrame {
	public MyWindowDemo(String name, JButton button, Color c, int w, int h) {
		super();
		setTitle(name);
		setSize(w, h);
		Container con = getContentPane();
		con.add(button);
		con.setBackground(c);
	}
}

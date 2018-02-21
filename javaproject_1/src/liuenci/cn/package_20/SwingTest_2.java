package liuenci.cn.package_20;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * ����JFrame����������MyWindowDemo����JFrame���� ����MyWindowDemo�Ĺ��췽�������������
 * ���ڵı��������ӷŴ��ڵ���������ڵı�����ɫ�Լ����ڵĸ߶ȺͿ�ȡ�
 * 
 * @author ��
 *
 */
public class SwingTest_2 {
	public static MyWindowDemo mw1;
	public static MyWindowDemo mw2;

	public static void main(String[] args) {
		JButton button = new JButton("��ť");
		mw1 = new MyWindowDemo("����ϯ", button, Color.BLACK, 200, 200);
		mw1.add(button);
		System.out.println(button.getText());
		mw1.setVisible(true);
		mw2 = new MyWindowDemo("��ϯ", button, Color.red, 200, 200);
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

package liuenci.cn.package_20;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingTest {

	public static void main(String[] args) {
		// 创建一个JFrame窗口对象
		JFrame jFrame = new JFrame("熊主席的界面");
		// 设置窗口的大小
		jFrame.setSize(500, 500);
		// 设置窗口出现的位置
		jFrame.setLocation(100, 100);
		// 创建窗口的默认关闭状态
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 在窗口中创建面板
		// 创建面板对象
		JPanel jPanel = new JPanel();
		// 设置面板背景色
		jPanel.setBackground(Color.RED);

		// 创建一个JLabel组件
		JLabel jLabel = new JLabel("熊主席万岁");
	   	// 设置水平居中
		jLabel.setHorizontalAlignment(JLabel.CENTER);
		// 设置字体
		jLabel.setFont(new Font("微软雅黑", Font.BOLD, 36));
		// 设置字体颜色
		jLabel.setForeground(Color.pink);
		//创建按钮对象
		JButton jButton = new JButton("登录");
		jFrame.getContentPane().add(jButton);
		// 将面板添加到窗口中
		jFrame.add(jPanel,BorderLayout.NORTH);
		//将标签添加到窗口中
		jFrame.add(jLabel,BorderLayout.SOUTH);
		//设置窗口是否可以调整大小,默认可以调整大小
		jFrame.setResizable(false);
		// 设置窗口是否显示
		jFrame.setVisible(true);
	}

}

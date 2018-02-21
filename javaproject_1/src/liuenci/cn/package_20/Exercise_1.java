package liuenci.cn.package_20;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Exercise_1 {

	public static void main(String[] args) {
		//创建一个窗口对象
		JFrame frame = new JFrame("窗口程序");
		//设置窗口的大小
		frame.setSize(300,300);
		//设置窗口的默认关闭状态
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置窗口的默认显示位置
		frame.setLocation(500,200);
		//JFrame使用默认布局，会自动填充整个容器
		frame.setLayout(null);;
		
//		//创建一个JLabel组件
//		JLabel label = new JLabel("研发1701");
//		//设置标签水平居中
//		label.setHorizontalAlignment(JLabel.CENTER);
//		//设置字体
//		label.setFont(new Font("微软雅黑",Font.BOLD,36));
//		//设置字体颜色
//		label.setForeground(Color.BLUE);
//		label.setSize(200,100);
//		//设置标签不透明
//		label.setOpaque(true);
//		label.setBackground(Color.RED);
//		//将标签添加到窗口
//		frame.add(label);
		
		//显示图片
		
		//添加工具包
		Toolkit kit = Toolkit.getDefaultToolkit();
		//找到本地图片
		//Image img = kit.getImage("images/下载.jpg");
		Icon icon = new ImageIcon("images/1.jpg");
		//给标签设置图片
		JLabel label1 = new JLabel(icon,JLabel.CENTER);
		//
		//label1.setHorizontalTextPosition(SwingConstants.CENTER);
		label1.setForeground(Color.white);
		frame.add(label1);
		
		
		
		//设置窗口是否可见
		frame.setVisible(true);
	}

}

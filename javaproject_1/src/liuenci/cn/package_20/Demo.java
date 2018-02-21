package liuenci.cn.package_20;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class Demo extends JFrame {

	// 初始化窗口
	public void init() {

		// 设置窗口标题
		this.setTitle("主题风格");
		// 设置窗口大小
		this.setSize(300, 300);
		// 设置窗口显示的位置
		this.setLocation(200, 200);
		// 设置关闭状态
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addImageBtn();
		this.setVisible(true);

	}

	//添加图片按钮
	public void addImageBtn(){
		JButton button = new JButton("图片按钮");
		Icon icon = new ImageIcon("images/1.jpg");
		button.setIcon(icon);
		button.setHorizontalTextPosition(SwingConstants.CENTER);
		button.setForeground(Color.red);
		this.add(button);
	}
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.init();
	}

}

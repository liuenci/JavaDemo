package liuenci.cn.package_20;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class Demo extends JFrame {

	// ��ʼ������
	public void init() {

		// ���ô��ڱ���
		this.setTitle("������");
		// ���ô��ڴ�С
		this.setSize(300, 300);
		// ���ô�����ʾ��λ��
		this.setLocation(200, 200);
		// ���ùر�״̬
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addImageBtn();
		this.setVisible(true);

	}

	//���ͼƬ��ť
	public void addImageBtn(){
		JButton button = new JButton("ͼƬ��ť");
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

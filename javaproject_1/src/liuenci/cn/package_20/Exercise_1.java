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
		//����һ�����ڶ���
		JFrame frame = new JFrame("���ڳ���");
		//���ô��ڵĴ�С
		frame.setSize(300,300);
		//���ô��ڵ�Ĭ�Ϲر�״̬
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���ô��ڵ�Ĭ����ʾλ��
		frame.setLocation(500,200);
		//JFrameʹ��Ĭ�ϲ��֣����Զ������������
		frame.setLayout(null);;
		
//		//����һ��JLabel���
//		JLabel label = new JLabel("�з�1701");
//		//���ñ�ǩˮƽ����
//		label.setHorizontalAlignment(JLabel.CENTER);
//		//��������
//		label.setFont(new Font("΢���ź�",Font.BOLD,36));
//		//����������ɫ
//		label.setForeground(Color.BLUE);
//		label.setSize(200,100);
//		//���ñ�ǩ��͸��
//		label.setOpaque(true);
//		label.setBackground(Color.RED);
//		//����ǩ��ӵ�����
//		frame.add(label);
		
		//��ʾͼƬ
		
		//��ӹ��߰�
		Toolkit kit = Toolkit.getDefaultToolkit();
		//�ҵ�����ͼƬ
		//Image img = kit.getImage("images/����.jpg");
		Icon icon = new ImageIcon("images/1.jpg");
		//����ǩ����ͼƬ
		JLabel label1 = new JLabel(icon,JLabel.CENTER);
		//
		//label1.setHorizontalTextPosition(SwingConstants.CENTER);
		label1.setForeground(Color.white);
		frame.add(label1);
		
		
		
		//���ô����Ƿ�ɼ�
		frame.setVisible(true);
	}

}

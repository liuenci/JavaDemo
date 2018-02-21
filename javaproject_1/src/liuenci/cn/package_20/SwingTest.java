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
		// ����һ��JFrame���ڶ���
		JFrame jFrame = new JFrame("����ϯ�Ľ���");
		// ���ô��ڵĴ�С
		jFrame.setSize(500, 500);
		// ���ô��ڳ��ֵ�λ��
		jFrame.setLocation(100, 100);
		// �������ڵ�Ĭ�Ϲر�״̬
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// �ڴ����д������
		// ����������
		JPanel jPanel = new JPanel();
		// ������屳��ɫ
		jPanel.setBackground(Color.RED);

		// ����һ��JLabel���
		JLabel jLabel = new JLabel("����ϯ����");
	   	// ����ˮƽ����
		jLabel.setHorizontalAlignment(JLabel.CENTER);
		// ��������
		jLabel.setFont(new Font("΢���ź�", Font.BOLD, 36));
		// ����������ɫ
		jLabel.setForeground(Color.pink);
		//������ť����
		JButton jButton = new JButton("��¼");
		jFrame.getContentPane().add(jButton);
		// �������ӵ�������
		jFrame.add(jPanel,BorderLayout.NORTH);
		//����ǩ��ӵ�������
		jFrame.add(jLabel,BorderLayout.SOUTH);
		//���ô����Ƿ���Ե�����С,Ĭ�Ͽ��Ե�����С
		jFrame.setResizable(false);
		// ���ô����Ƿ���ʾ
		jFrame.setVisible(true);
	}

}

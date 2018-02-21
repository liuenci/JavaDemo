package cn.liuenci.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * ������ʽ����
 * @author LuckyJavaCi
 *
 */
public class FlowLayoutDemo extends JFrame{
	
	//���췽��
	public FlowLayoutDemo() {
		//���ó�ʼ������
		init();
		addPanel();
	}
	//��ʼ������
	public void init() {
		this.setTitle("FlowLayout");
		this.setSize(300,300);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	//������
	public void addPanel() {
		JPanel jp = new JPanel();
		//�������ֶ���
		FlowLayout fl = new FlowLayout();
		//�������������Ķ��뷽ʽ
		fl.setAlignment(FlowLayout.LEFT);
		//�������ˮƽ���
		fl.setHgap(20);
		//���ô�ֱ�������
		fl.setVgap(20);
		//������岼��
		jp.setLayout(fl);
		
		//����������ʮ��Label
		String[] str = { "լ��", "��ǽ��", "������ţ",
				"˹�İ���", "С���", "С����",
				"С����", "С����", "С�ʹ�", "С����" };
		JLabel[] lb = new JLabel[10];
		Color[] c = new Color[] { Color.red, Color.yellow, 
				Color.BLUE, Color.gray,
				Color.green, Color.black,
				Color.white };
		
		for(int i=0;i<lb.length;i++) {
			//�����ɫ
			Random rand = new Random();
			//����label����
			lb[i] = new JLabel(str[i]);
			lb[i].setForeground(c[rand.nextInt(7)]);
			lb[i].setSize(500,20);
			
			//java��labelĬ������Ϊ͸����
			lb[i].setOpaque(true);
			lb[i].setBackground(c[rand.nextInt(7)]);
			//����ǩ��ӵ����
			jp.add(lb[i]);
		}
		//�������ӵ�����
		this.add(jp);
	}
	public static void main(String[] args) {
		new FlowLayoutDemo();
	}

}

package liuenci.cn.package_20;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FlowLayoutTest extends JFrame{
	
	//��ʼ��
	public void init(){
		this.setSize(600,400);
		this.setResizable(false);
		this.addPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	//������
	public void addPanel(){
		JPanel panel = new JPanel();
		
		//����������
		FlowLayout fl = new FlowLayout();
		//���ò��������Ķ��뷽ʽ
		fl.setAlignment(FlowLayout.LEFT);
		//���ò��ֵ�ˮƽ�ʹ�ֱ����
		fl.setHgap(20);
		fl.setVgap(20);
		//�������Ĳ���
		panel.setLayout(fl);
		//����������ʮ��label
		String[] str = {"�ɸ�һ��","�ɸ����","�ɸ�����","�ɸ��ĺ�","�ɸ����","�ɸ�����","�ɸ��ߺ�",};
		//������ǩ����
		JLabel[] label = new JLabel[7];
		//������ť����
		JButton[] button = new JButton[7];
		
		//��������
		for(int i=0;i<label.length;i++){
			label[i] = new JLabel(str[i]);
			button[i] = new JButton(str[i]);
			button[i].setBounds(20, 10, 200, 10);
			//�������������ɫ
			Color[] color = new Color[]{Color.RED,
					Color.DARK_GRAY,
					Color.BLUE,
					Color.PINK,
					Color.black};
			int color1 = (int) Math.floor(Math.random()*5);
 			label[i].setForeground(color[color1]);
 			button[i].setForeground(color[color1]);
 			panel.add(button[i]);
			panel.add(label[i]);
		}
		//�������ӵ�����
		this.add(panel);
	}
	public static void main(String[] args) {
		FlowLayoutTest flowLayoutTest = new FlowLayoutTest();
		flowLayoutTest.init();
	}

}

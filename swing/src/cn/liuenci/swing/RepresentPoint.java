package cn.liuenci.swing;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RepresentPoint extends JFrame{
	//������ǩ
	JLabel lb = new JLabel("��ʾ�������");
	
	//���췽��
	public RepresentPoint() {
		//���ó�ʼ������
		init();
		addPanel();
	}
	
	//��ʼ������
	public void init() {
		this.setTitle("��ʾ�������");
		this.setSize(300,300);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	//������
	public void addPanel() {
		//����������
		JPanel jp = new JPanel();
		//��label��ӵ����
		jp.add(lb);
		//���������¼�
		jp.addMouseListener(new Mouse());
		//�������ӵ�����
		this.add(jp);
	}
	class Mouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			/**
			 * ������¼�
			 * 1.��ȡ�������
			 * 2.�޸����ı���ɫ
			 */
			//����������
			Point mpoint = MouseInfo.getPointerInfo().getLocation();
			//��label���¸�ֵ
			lb.setText("X:"+mpoint.x+" Y:"+mpoint.y);
			//����¼�Դ����
			JPanel p = (JPanel)e.getSource();
			//������ɫ����
			Color[] color = new Color[] {Color.black,Color.BLUE,Color.DARK_GRAY,Color.GRAY,Color.GREEN};
			//���������
			int num = (int)Math.floor(Math.random()*5);
			//�޸���屳��ɫ
			p.setBackground(color[num]);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	public static void main(String[] args) {
		new RepresentPoint();
	}

}

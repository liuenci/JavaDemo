package liuenci.cn.package_20;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ActionListener extends JFrame{
	public ActionListener(String title){
		this.setTitle(title);
	}
	public static void main(String[] args) {
		ActionListener actionListener = new ActionListener("����ϯ");
		actionListener.addFrame();
		
	}
	/**
	 * ���ô�������
	 */
	public void addFrame(){
		//���ô��ڴ�С
		this.setSize(1366,768);
		//����������
		this.addPanel();
		
		this.setVisible(true);
	}
	public void addPanel(){
		//�������
		JPanel panel = new JPanel();
		//������ǩ
		JLabel label = new JLabel();
		//����������굥���¼�
		panel.addMouseListener(new Mouse());
		panel.add(label);
		this.add(panel);
	}
	
	
}
class Mouse implements MouseListener{

	@Override
	//��굥���¼�
	public void mouseClicked(MouseEvent e) {
		Point point = MouseInfo.getPointerInfo().getLocation();
		JLabel label = new JLabel();
		label.setText(point.x+" "+point.y);
		JPanel panel = (JPanel) e.getSource();
		Color[] color = new Color[]{Color.RED,
				Color.DARK_GRAY,
				Color.BLUE,
				Color.PINK,
				Color.black};
		int color1 = (int)Math.floor((Math.random()*5));
		panel.setBackground(color[color1]);
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
	
}
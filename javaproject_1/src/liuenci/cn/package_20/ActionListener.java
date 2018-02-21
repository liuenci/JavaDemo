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
		ActionListener actionListener = new ActionListener("熊主席");
		actionListener.addFrame();
		
	}
	/**
	 * 设置窗口属性
	 */
	public void addFrame(){
		//设置窗口大小
		this.setSize(1366,768);
		//窗口添加面板
		this.addPanel();
		
		this.setVisible(true);
	}
	public void addPanel(){
		//创建面板
		JPanel panel = new JPanel();
		//创建标签
		JLabel label = new JLabel();
		//给面板添加鼠标单击事件
		panel.addMouseListener(new Mouse());
		panel.add(label);
		this.add(panel);
	}
	
	
}
class Mouse implements MouseListener{

	@Override
	//鼠标单击事件
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
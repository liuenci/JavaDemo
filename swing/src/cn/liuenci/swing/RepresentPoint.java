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
	//创建标签
	JLabel lb = new JLabel("显示鼠标坐标");
	
	//构造方法
	public RepresentPoint() {
		//调用初始化方法
		init();
		addPanel();
	}
	
	//初始化窗口
	public void init() {
		this.setTitle("显示鼠标坐标");
		this.setSize(300,300);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	//添加面板
	public void addPanel() {
		//创建面板对象
		JPanel jp = new JPanel();
		//将label添加到面板
		jp.add(lb);
		//给面板添加事件
		jp.addMouseListener(new Mouse());
		//将面板添加到窗口
		this.add(jp);
	}
	class Mouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			/**
			 * 鼠标点击事件
			 * 1.获取鼠标坐标
			 * 2.修改面板的背景色
			 */
			//获得鼠标坐标
			Point mpoint = MouseInfo.getPointerInfo().getLocation();
			//给label重新赋值
			lb.setText("X:"+mpoint.x+" Y:"+mpoint.y);
			//获得事件源对象
			JPanel p = (JPanel)e.getSource();
			//创建颜色数组
			Color[] color = new Color[] {Color.black,Color.BLUE,Color.DARK_GRAY,Color.GRAY,Color.GREEN};
			//创建随机数
			int num = (int)Math.floor(Math.random()*5);
			//修改面板背景色
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

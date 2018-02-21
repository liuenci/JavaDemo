package cn.liuenci.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 测试流式布局
 * @author LuckyJavaCi
 *
 */
public class FlowLayoutDemo extends JFrame{
	
	//构造方法
	public FlowLayoutDemo() {
		//调用初始化方法
		init();
		addPanel();
	}
	//初始化窗口
	public void init() {
		this.setTitle("FlowLayout");
		this.setSize(300,300);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	//添加面板
	public void addPanel() {
		JPanel jp = new JPanel();
		//创建布局对象
		FlowLayout fl = new FlowLayout();
		//创建布局容器的对齐方式
		fl.setAlignment(FlowLayout.LEFT);
		//设置组件水平间隔
		fl.setHgap(20);
		//设置垂直间隔距离
		fl.setVgap(20);
		//设置面板布局
		jp.setLayout(fl);
		
		//在面板中添加十个Label
		String[] str = { "宅男", "翻墙男", "技术大牛",
				"斯文败类", "小宽宽", "小禁禁",
				"小明明", "小松松", "小赐赐", "小晨晨" };
		JLabel[] lb = new JLabel[10];
		Color[] c = new Color[] { Color.red, Color.yellow, 
				Color.BLUE, Color.gray,
				Color.green, Color.black,
				Color.white };
		
		for(int i=0;i<lb.length;i++) {
			//随机颜色
			Random rand = new Random();
			//创建label对象
			lb[i] = new JLabel(str[i]);
			lb[i].setForeground(c[rand.nextInt(7)]);
			lb[i].setSize(500,20);
			
			//java的label默认设置为透明的
			lb[i].setOpaque(true);
			lb[i].setBackground(c[rand.nextInt(7)]);
			//将标签添加到面板
			jp.add(lb[i]);
		}
		//将面板添加到窗口
		this.add(jp);
	}
	public static void main(String[] args) {
		new FlowLayoutDemo();
	}

}

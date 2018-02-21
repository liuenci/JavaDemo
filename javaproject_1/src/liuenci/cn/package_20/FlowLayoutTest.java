package liuenci.cn.package_20;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FlowLayoutTest extends JFrame{
	
	//初始化
	public void init(){
		this.setSize(600,400);
		this.setResizable(false);
		this.addPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	//添加面板
	public void addPanel(){
		JPanel panel = new JPanel();
		
		//创建面板对象
		FlowLayout fl = new FlowLayout();
		//设置布局容器的对齐方式
		fl.setAlignment(FlowLayout.LEFT);
		//设置布局的水平和垂直距离
		fl.setHgap(20);
		fl.setVgap(20);
		//设置面板的布局
		panel.setLayout(fl);
		//在面板中添加十个label
		String[] str = {"松哥一号","松哥二号","松哥三号","松哥四号","松哥五号","松哥六号","松哥七号",};
		//创建标签数组
		JLabel[] label = new JLabel[7];
		//创建按钮数组
		JButton[] button = new JButton[7];
		
		//创建对象
		for(int i=0;i<label.length;i++){
			label[i] = new JLabel(str[i]);
			button[i] = new JButton(str[i]);
			button[i].setBounds(20, 10, 200, 10);
			//设置字体随机颜色
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
		//将面板添加到窗口
		this.add(panel);
	}
	public static void main(String[] args) {
		FlowLayoutTest flowLayoutTest = new FlowLayoutTest();
		flowLayoutTest.init();
	}

}

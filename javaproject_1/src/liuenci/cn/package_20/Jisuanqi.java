package liuenci.cn.package_20;

import java.awt.BorderLayout;

import java.awt.Color;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.JTextField;

import javax.swing.SwingConstants;

public class Jisuanqi extends JFrame implements ActionListener {

	/**
	
	 * 
	
	 */

	private static final long serialVersionUID = 1L;

	Result result = new Result(); // 定义text的面板

	Number_Key number_key = new Number_Key(); // 定义按钮面板

	// 当点击按钮+、-、*、/时，com = true

	boolean com = false;

	// 当i=0时说明是我们第一次输入，字符串text不会累加

	int i = 0;

	// 存放text的内容

	String text = "";

	// 存放点击按钮+、-、*、/之前的数值

	double defbutton = 0;

	// +、-、*、/的代号分别为1，2，3，4

	int symbol = 0;

	// 构造函数

	Jisuanqi() {

		super("WangJiao"); // 设定标题

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设定关闭窗体时退出程序

		JPanel pane = new JPanel(); // 定义主面板

		pane.setLayout(new BorderLayout());

		setBounds(380, 220, 30, 80); // 前两个参数是在屏幕上显示的坐标，后两个是大小

		// 替换图标

		ImageIcon icon = new ImageIcon("F:1.GIF");

		// Jisuanqi.class.getResource("APPLE.GIF")

		// );

		setIconImage(icon.getImage());

		pane.add(result, BorderLayout.NORTH);

		pane.add(number_key, BorderLayout.CENTER);

		pane.add(number_key.equal, BorderLayout.SOUTH);

		number_key.one.addActionListener(this); // 对1按钮添加监听事件

		number_key.two.addActionListener(this); // 对2按钮添加监听事件

		number_key.three.addActionListener(this); // 对3按钮添加监听事件

		number_key.four.addActionListener(this); // 对4按钮添加监听事件

		number_key.five.addActionListener(this); // 对5按钮添加监听事件

		number_key.six.addActionListener(this); // 对6按钮添加监听事件

		number_key.seven.addActionListener(this); // 对7按钮添加监听事件

		number_key.eight.addActionListener(this); // 对8按钮添加监听事件

		number_key.nine.addActionListener(this); // 对9按钮添加监听事件

		number_key.zero.addActionListener(this); // 对0按钮添加监听事件

		number_key.ce.addActionListener(this); // 对置零按钮添加监听事件

		number_key.plus.addActionListener(this); // 对+按钮添加监听事件

		number_key.equal.addActionListener(this); // 对=按钮添加监听事件

		number_key.sub.addActionListener(this); // 对-按钮添加监听事件

		number_key.mul.addActionListener(this); // 对*按钮添加监听事件

		number_key.div.addActionListener(this); // 对/按钮添加监听事件

		number_key.point.addActionListener(this); // 对.按钮添加监听事件

		setContentPane(pane);

		pack(); // 初始化窗体大小为正好盛放所有按钮

	}

	// 各个按钮触发的事件

	public void actionPerformed(ActionEvent e) {

		/*
		 * 
		 * 如果是点击数字按钮那么先要判断是否在此之前点击了+、-、*、/、=，如果是那么com=true 如果没有com=
		 * 
		 * false;或者是否点击数字键，如果是i = 1,如果没有 i = 0;
		 * 
		 */

		if (e.getSource() == number_key.one) {

			if (com || i == 0) {

				result.text.setText("1");

				com = false;

				i = 1;

			} else {

				text = result.text.getText();

				result.text.setText(text + "1");

			}

		} else if (e.getSource() == number_key.two) {

			if (com || i == 0) {

				result.text.setText("2");

				com = false;

				i = 1;

			} else {

				text = result.text.getText();

				result.text.setText(text + "2");

			}

		} else if (e.getSource() == number_key.three) {

			if (com || i == 0) {

				result.text.setText("3");

				com = false;

				i = 1;

			} else {

				text = result.text.getText();

				result.text.setText(text + "3");

			}

		} else if (e.getSource() == number_key.four) {

			if (com || i == 0) {

				result.text.setText("4");

				com = false;

				i = 1;

			} else {

				text = result.text.getText();

				result.text.setText(text + "4");

			}

		} else if (e.getSource() == number_key.five) {

			if (com || i == 0) {

				result.text.setText("5");

				com = false;

				i = 1;

			} else {

				text = result.text.getText();

				result.text.setText(text + "5");

			}

		} else if (e.getSource() == number_key.six) {

			if (com || i == 0) {

				result.text.setText("6");

				com = false;

				i = 1;

			} else {

				text = result.text.getText();

				result.text.setText(text + "6");

			}

		} else if (e.getSource() == number_key.seven) {

			if (com || i == 0) {

				result.text.setText("7");

				com = false;

				i = 1;

			} else {

				text = result.text.getText();

				result.text.setText(text + "7");

			}

		} else if (e.getSource() == number_key.eight) {

			if (com || i == 0) {

				result.text.setText("8");

				com = false;

				i = 1;

			} else {

				text = result.text.getText();

				result.text.setText(text + "8");

			}

		} else if (e.getSource() == number_key.nine) {

			if (com || i == 0) {

				result.text.setText("9");

				com = false;

				i = 1;

			} else {

				text = result.text.getText();

				result.text.setText(text + "9");

			}

		}

		/*
		 * 
		 * 对于0这个按钮有一定的说法，在我的程序里不会出现如00000这样的情况，我加了判断条件就是
		 * 
		 * 如果text中的数值=0就要判断在这个数值中是否有.存在?如果有那么就在原来数值基础之上添 加0;否则保持原来的数值不变
		 * 
		 */

		else if (e.getSource() == number_key.zero) { // result.text.getText()是得到text里内容的意思

			if (com || i == 0) {

				result.text.setText("0");

				com = false;

				i = 1;

			} else {

				text = result.text.getText();

				if (Float.parseFloat(text) > 0 || Float.parseFloat(text) < 0) { // Float.parseFloat(text)就是类型转换了，下面都是一样

					result.text.setText(text + "0");

				} else {

					if (text.trim().indexOf(".") == -1) {

						result.text.setText(text);

					} else {

						result.text.setText(text + "0");

					}

				}

			}

		} else if (e.getSource() == number_key.ce) {

			result.text.setText("0");

			i = 0;

			com = true;

			// text = "";

			defbutton = 0;

		}

		/*
		 * 
		 * 本程序不会让一个数值中出现2个以上的小数点.具体做法是:判断是否已经存在.存在就不添加, 不存在就添加.
		 * 
		 */

		else if (e.getSource() == number_key.point) {

			if (com || i == 0) {

				result.text.setText("0.");

				com = false;

				i = 1;

			} else {

				text = result.text.getText();

				if (text.trim().indexOf(".") == -1) {

					result.text.setText(text + ".");

				} else {

					result.text.setText(text);

				}

			}

		} // 获得点击+之前的数值

		else if (e.getSource() == number_key.plus) {

			com = true;

			i = 0;

			defbutton = Double.parseDouble(result.text.getText());

			symbol = 1;

		} // 获得点击-之前的数值

		else if (e.getSource() == number_key.sub) {

			com = true;

			i = 0;

			defbutton = Double.parseDouble(result.text.getText());

			symbol = 2;

		} // 获得点击*之前的数值

		else if (e.getSource() == number_key.mul) {

			com = true;

			i = 0;

			defbutton = Double.parseDouble(result.text.getText());

			System.out.println(defbutton);

			symbol = 3;

		} // 获得点击/之前的数值

		else if (e.getSource() == number_key.div) {

			com = true;

			i = 0;

			defbutton = Double.parseDouble(result.text.getText());

			symbol = 4;

		} else if (e.getSource() == number_key.equal) {

			switch (symbol) {

			case 1: { // 计算加法

				double ad = defbutton

						+ Double.parseDouble(result.text.getText());

				result.text.setText(ad + "");

				i = 0;

				text = "";

				break;

			}

			case 2: { // 计算减法

				double ad = defbutton

						- Double.parseDouble(result.text.getText());

				result.text.setText(String.valueOf(ad));

				i = 0;

				text = "";

				break;

			}

			case 3: { // 计算乘法

				double ad = defbutton

						* Double.parseDouble(result.text.getText());

				result.text.setText(ad + "");

				i = 0;

				text = "";

				break;

			}

			case 4: { // 计算除法

				double ad = defbutton

						/ Double.parseDouble(result.text.getText());

				result.text.setText(ad + "");

				i = 0;

				text = "";

				break;

			}

			}

			System.out.println(com);

		}

		System.out.println(result.text.getText());

	}

	@SuppressWarnings("deprecation")

	public static void main(String[] args) {

		Jisuanqi loveyou = new Jisuanqi();

		loveyou.show();

	}

}

// 计算器数字按钮定义面板

class Number_Key extends JPanel {

	/**
	
	 * 
	
	 */

	private static final long serialVersionUID = 1L;

	JButton zero = new JButton("0"); // 数字键0

	JButton one = new JButton("1"); // 数字键1

	JButton two = new JButton("2"); // 数字键2

	JButton three = new JButton("3"); // 数字键3

	JButton four = new JButton("4"); // 数字键4

	JButton five = new JButton("5"); // 数字键5

	JButton six = new JButton("6"); // 数字键6

	JButton seven = new JButton("7"); // 数字键7

	JButton eight = new JButton("8"); // 数字键8

	JButton nine = new JButton("9"); // 数字键9

	JButton plus = new JButton("+");

	JButton sub = new JButton("-");

	JButton mul = new JButton("*");

	JButton div = new JButton("/");

	JButton equal = new JButton("=");

	JButton ce = new JButton("清零"); // 置零键

	JButton point = new JButton(".");

	Number_Key() {

		setLayout(new GridLayout(4, 4, 1, 1)); // 定义布局管理器为网格布局

		setBackground(Color.blue); // 设置背景颜色

		// 添加按钮

		add(one);

		add(two);

		add(three);

		add(four);

		add(five);

		add(six);

		add(seven);

		add(eight);

		add(nine);

		add(zero);

		add(plus);

		add(sub);

		add(mul);

		add(div);

		add(point);

		add(equal);

		add(ce);

	}

}

// 计算器显示结果的窗体

class Result extends JPanel {

	/**
	
	 * 
	
	 */

	private static final long serialVersionUID = 1L;

	// text先是输入和结果

	JTextField text = new JTextField("0");

	@SuppressWarnings("deprecation")

	Result() { // 讲输入的数字或得到的结果在text的右边显示

		text.setHorizontalAlignment(SwingConstants.RIGHT);

		text.enable(false); // 文本框不能编辑

		setLayout(new BorderLayout()); // 设定布局管理器边框布局

		add(text, BorderLayout.CENTER); // text放置在窗体的中间

	}

}
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

	Result result = new Result(); // ����text�����

	Number_Key number_key = new Number_Key(); // ���尴ť���

	// �������ť+��-��*��/ʱ��com = true

	boolean com = false;

	// ��i=0ʱ˵�������ǵ�һ�����룬�ַ���text�����ۼ�

	int i = 0;

	// ���text������

	String text = "";

	// ��ŵ����ť+��-��*��/֮ǰ����ֵ

	double defbutton = 0;

	// +��-��*��/�Ĵ��ŷֱ�Ϊ1��2��3��4

	int symbol = 0;

	// ���캯��

	Jisuanqi() {

		super("WangJiao"); // �趨����

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �趨�رմ���ʱ�˳�����

		JPanel pane = new JPanel(); // ���������

		pane.setLayout(new BorderLayout());

		setBounds(380, 220, 30, 80); // ǰ��������������Ļ����ʾ�����꣬�������Ǵ�С

		// �滻ͼ��

		ImageIcon icon = new ImageIcon("F:1.GIF");

		// Jisuanqi.class.getResource("APPLE.GIF")

		// );

		setIconImage(icon.getImage());

		pane.add(result, BorderLayout.NORTH);

		pane.add(number_key, BorderLayout.CENTER);

		pane.add(number_key.equal, BorderLayout.SOUTH);

		number_key.one.addActionListener(this); // ��1��ť��Ӽ����¼�

		number_key.two.addActionListener(this); // ��2��ť��Ӽ����¼�

		number_key.three.addActionListener(this); // ��3��ť��Ӽ����¼�

		number_key.four.addActionListener(this); // ��4��ť��Ӽ����¼�

		number_key.five.addActionListener(this); // ��5��ť��Ӽ����¼�

		number_key.six.addActionListener(this); // ��6��ť��Ӽ����¼�

		number_key.seven.addActionListener(this); // ��7��ť��Ӽ����¼�

		number_key.eight.addActionListener(this); // ��8��ť��Ӽ����¼�

		number_key.nine.addActionListener(this); // ��9��ť��Ӽ����¼�

		number_key.zero.addActionListener(this); // ��0��ť��Ӽ����¼�

		number_key.ce.addActionListener(this); // �����㰴ť��Ӽ����¼�

		number_key.plus.addActionListener(this); // ��+��ť��Ӽ����¼�

		number_key.equal.addActionListener(this); // ��=��ť��Ӽ����¼�

		number_key.sub.addActionListener(this); // ��-��ť��Ӽ����¼�

		number_key.mul.addActionListener(this); // ��*��ť��Ӽ����¼�

		number_key.div.addActionListener(this); // ��/��ť��Ӽ����¼�

		number_key.point.addActionListener(this); // ��.��ť��Ӽ����¼�

		setContentPane(pane);

		pack(); // ��ʼ�������СΪ����ʢ�����а�ť

	}

	// ������ť�������¼�

	public void actionPerformed(ActionEvent e) {

		/*
		 * 
		 * ����ǵ�����ְ�ť��ô��Ҫ�ж��Ƿ��ڴ�֮ǰ�����+��-��*��/��=���������ôcom=true ���û��com=
		 * 
		 * false;�����Ƿ������ּ��������i = 1,���û�� i = 0;
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
		 * ����0�����ť��һ����˵�������ҵĳ����ﲻ�������00000������������Ҽ����ж���������
		 * 
		 * ���text�е���ֵ=0��Ҫ�ж��������ֵ���Ƿ���.����?�������ô����ԭ����ֵ����֮���� ��0;���򱣳�ԭ������ֵ����
		 * 
		 */

		else if (e.getSource() == number_key.zero) { // result.text.getText()�ǵõ�text�����ݵ���˼

			if (com || i == 0) {

				result.text.setText("0");

				com = false;

				i = 1;

			} else {

				text = result.text.getText();

				if (Float.parseFloat(text) > 0 || Float.parseFloat(text) < 0) { // Float.parseFloat(text)��������ת���ˣ����涼��һ��

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
		 * �����򲻻���һ����ֵ�г���2�����ϵ�С����.����������:�ж��Ƿ��Ѿ�����.���ھͲ����, �����ھ����.
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

		} // ��õ��+֮ǰ����ֵ

		else if (e.getSource() == number_key.plus) {

			com = true;

			i = 0;

			defbutton = Double.parseDouble(result.text.getText());

			symbol = 1;

		} // ��õ��-֮ǰ����ֵ

		else if (e.getSource() == number_key.sub) {

			com = true;

			i = 0;

			defbutton = Double.parseDouble(result.text.getText());

			symbol = 2;

		} // ��õ��*֮ǰ����ֵ

		else if (e.getSource() == number_key.mul) {

			com = true;

			i = 0;

			defbutton = Double.parseDouble(result.text.getText());

			System.out.println(defbutton);

			symbol = 3;

		} // ��õ��/֮ǰ����ֵ

		else if (e.getSource() == number_key.div) {

			com = true;

			i = 0;

			defbutton = Double.parseDouble(result.text.getText());

			symbol = 4;

		} else if (e.getSource() == number_key.equal) {

			switch (symbol) {

			case 1: { // ����ӷ�

				double ad = defbutton

						+ Double.parseDouble(result.text.getText());

				result.text.setText(ad + "");

				i = 0;

				text = "";

				break;

			}

			case 2: { // �������

				double ad = defbutton

						- Double.parseDouble(result.text.getText());

				result.text.setText(String.valueOf(ad));

				i = 0;

				text = "";

				break;

			}

			case 3: { // ����˷�

				double ad = defbutton

						* Double.parseDouble(result.text.getText());

				result.text.setText(ad + "");

				i = 0;

				text = "";

				break;

			}

			case 4: { // �������

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

// ���������ְ�ť�������

class Number_Key extends JPanel {

	/**
	
	 * 
	
	 */

	private static final long serialVersionUID = 1L;

	JButton zero = new JButton("0"); // ���ּ�0

	JButton one = new JButton("1"); // ���ּ�1

	JButton two = new JButton("2"); // ���ּ�2

	JButton three = new JButton("3"); // ���ּ�3

	JButton four = new JButton("4"); // ���ּ�4

	JButton five = new JButton("5"); // ���ּ�5

	JButton six = new JButton("6"); // ���ּ�6

	JButton seven = new JButton("7"); // ���ּ�7

	JButton eight = new JButton("8"); // ���ּ�8

	JButton nine = new JButton("9"); // ���ּ�9

	JButton plus = new JButton("+");

	JButton sub = new JButton("-");

	JButton mul = new JButton("*");

	JButton div = new JButton("/");

	JButton equal = new JButton("=");

	JButton ce = new JButton("����"); // �����

	JButton point = new JButton(".");

	Number_Key() {

		setLayout(new GridLayout(4, 4, 1, 1)); // ���岼�ֹ�����Ϊ���񲼾�

		setBackground(Color.blue); // ���ñ�����ɫ

		// ��Ӱ�ť

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

// ��������ʾ����Ĵ���

class Result extends JPanel {

	/**
	
	 * 
	
	 */

	private static final long serialVersionUID = 1L;

	// text��������ͽ��

	JTextField text = new JTextField("0");

	@SuppressWarnings("deprecation")

	Result() { // ����������ֻ�õ��Ľ����text���ұ���ʾ

		text.setHorizontalAlignment(SwingConstants.RIGHT);

		text.enable(false); // �ı����ܱ༭

		setLayout(new BorderLayout()); // �趨���ֹ������߿򲼾�

		add(text, BorderLayout.CENTER); // text�����ڴ�����м�

	}

}
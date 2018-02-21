package liuenci.cn.package_20;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 表格布局 计算器
 * 
 * @author 刘
 *
 */
public class Exercise_2 extends JFrame implements ActionListener {
	/** 计算器上的键的显示名字 */
	private final String[] KEYS = { "0", "C", "=", "+", "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-" };
	/** 计算器上键的按钮 */
	private JButton keys[] = new JButton[KEYS.length];
	/** 计算结果文本框 */
	private JTextField resultText = new JTextField("0");
	// 标志用户按的是否是整个表达式的第一个数字,或者是运算符后的第一个数字
	private boolean firstDigit = true;
	// 计算的中间结果。
	private double resultNum = 0.0;
	// 当前运算的运算符
	private String operator = "=";
	// 操作是否合法
	private boolean operateValidFlag = true;
	// 构造函数
	public Exercise_2() {
		// 初始化计算器
		init();
		// 设置计算器的背景颜色
		this.setBackground(Color.LIGHT_GRAY);
		this.setTitle("计算器");
		//设置计算器的大小
		this.setSize(300,400);
		// 在屏幕(500, 300)坐标处显示计算器
		this.setLocation(500, 300);
		// 不许修改计算器的大小
		this.setResizable(false);
		// 使计算器中各组件大小合适
		this.pack();
	}

	// 初始化
	public void init() {
		// 文本框中的内容采用右对齐方式
		resultText.setHorizontalAlignment(JTextField.RIGHT);
		// 不允许修改结果文本框
		resultText.setEditable(false);
		// 设置文本框背景颜色为白色
		resultText.setBackground(Color.white);
		//新建一个面板存放文本框
		JPanel TextPanel = new JPanel();
		TextPanel.setLayout(new BorderLayout());
		TextPanel.add(resultText);
		
		// 初始化计算器上键的按钮，将键放在一个画板内
		JPanel calckeysPanel = new JPanel();
		// 用网格布局器，4行，4列的网格，网格之间的水平方向间隔为8个象素，垂直方向间隔为8个象素
		calckeysPanel.setLayout(new GridLayout(4, 5, 8, 8));
		for (int i = 0; i < KEYS.length; i++) {
			keys[i] = new JButton(KEYS[i]);
			calckeysPanel.add(keys[i]);
			keys[i].setForeground(Color.blue);
		}
		// 运算符键用红色标示，其他键用蓝色表示
		keys[1].setForeground(Color.red);
		keys[2].setForeground(Color.red);
		keys[3].setForeground(Color.red);
		keys[7].setForeground(Color.red);
		keys[11].setForeground(Color.red);
		keys[15].setForeground(Color.red);
		
		//进行计算器的整体布局
		this.getContentPane().add(TextPanel,BorderLayout.NORTH);
		this.getContentPane().add(calckeysPanel,BorderLayout.CENTER);
		
		
		// 为各按钮添加事件侦听器  
        // 都使用同一个事件侦听器，即本对象。本类的声明中有implements ActionListener  
        for (int i = 0; i < KEYS.length; i++) {  
            keys[i].addActionListener(this);  
        }   
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//获取源的标签
		String label = e.getActionCommand();
		if("0123456789.".indexOf(label)>=0){
			// 用户按了数字键或者小数点键  
            handleNumber(label);
		}else if(label.equals("C")){
			handleC();
		}else{
			handleOperator(label);
		}
		// 以后输入的肯定不是第一个数字了  
        firstDigit = false;
	}

	/** 
     * 处理数字键被按下的事件 
     *  
     * @param key 
     */  
    private void handleNumber(String key) {  
        if (firstDigit) {  
            // 输入的第一个数字 
            resultText.setText(key);  
        } else if ((key.equals(".")) && (resultText.getText().indexOf(".") < 0)) {  
            // 输入的是小数点，并且之前没有小数点，则将小数点附在结果文本框的后面  
            resultText.setText(resultText.getText() + ".");  
        } else if (!key.equals(".")) {  
            // 如果输入的不是小数点，则将数字附在结果文本框的后面  
            resultText.setText(resultText.getText() + key);  
        }  
        // 以后输入的肯定不是第一个数字了  
        firstDigit = false;  
    } 
    /** 
     * 处理C键被按下的事件 
     */  
    private void handleC() {  
        // 初始化计算器的各种值  
        resultText.setText("0");  
        firstDigit = true;  
        operator = "=";  
    }
    /** 
     * 处理运算符键被按下的事件 
     *  
     * @param key 
     */  
    private void handleOperator(String key) {
        if (operator.equals("/")) {  
            // 除法运算  
            // 如果当前结果文本框中的值等于0  
            if (getNumberFromText() == 0.0) {  
                // 操作不合法  
                operateValidFlag = false;  
                resultText.setText("除数不能为零");  
            } else {  
                resultNum /= getNumberFromText();  
            }  
        }  else if (operator.equals("+")) {  
            // 加法运算  
            resultNum += getNumberFromText();  
        } else if (operator.equals("-")) {  
            // 减法运算  
            resultNum -= getNumberFromText();  
        } else if (operator.equals("*")) {  
            // 乘法运算  
            resultNum *= getNumberFromText();  
        } else if (operator.equals("+/-")) {  
            // 正数负数运算  
            resultNum = resultNum * (-1);  
        } else if (operator.equals("=")) {  
            // 赋值运算  
            resultNum = getNumberFromText();  
        }  
        if (operateValidFlag) {  
            // 双精度浮点数的运算  
            long t1;  
            double t2;  
            t1 = (long) resultNum;  
            t2 = resultNum - t1;  
            if (t2 == 0) {  
                resultText.setText(String.valueOf(t1));  
            } else {  
                resultText.setText(String.valueOf(resultNum));  
            }  
        }  
        // 运算符等于用户按的按钮  
        operator = key;  
        firstDigit = true;  
        operateValidFlag = true;  
    }
    /** 
     * 从结果文本框中获取数字 
     *  
     * @return 
     */  
    private double getNumberFromText() {  
        double result = 0;  
        try {  
            result = Double.valueOf(resultText.getText()).doubleValue();  
        } catch (NumberFormatException e) {  
        }  
        return result;  
    }
	public static void main(String[] args) {
		Exercise_2 exercise_2 = new Exercise_2();
		exercise_2.setVisible(true);
	}

	

}

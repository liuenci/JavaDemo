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
 * ��񲼾� ������
 * 
 * @author ��
 *
 */
public class Exercise_2 extends JFrame implements ActionListener {
	/** �������ϵļ�����ʾ���� */
	private final String[] KEYS = { "0", "C", "=", "+", "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-" };
	/** �������ϼ��İ�ť */
	private JButton keys[] = new JButton[KEYS.length];
	/** �������ı��� */
	private JTextField resultText = new JTextField("0");
	// ��־�û������Ƿ����������ʽ�ĵ�һ������,�������������ĵ�һ������
	private boolean firstDigit = true;
	// ������м�����
	private double resultNum = 0.0;
	// ��ǰ����������
	private String operator = "=";
	// �����Ƿ�Ϸ�
	private boolean operateValidFlag = true;
	// ���캯��
	public Exercise_2() {
		// ��ʼ��������
		init();
		// ���ü������ı�����ɫ
		this.setBackground(Color.LIGHT_GRAY);
		this.setTitle("������");
		//���ü������Ĵ�С
		this.setSize(300,400);
		// ����Ļ(500, 300)���괦��ʾ������
		this.setLocation(500, 300);
		// �����޸ļ������Ĵ�С
		this.setResizable(false);
		// ʹ�������и������С����
		this.pack();
	}

	// ��ʼ��
	public void init() {
		// �ı����е����ݲ����Ҷ��뷽ʽ
		resultText.setHorizontalAlignment(JTextField.RIGHT);
		// �������޸Ľ���ı���
		resultText.setEditable(false);
		// �����ı��򱳾���ɫΪ��ɫ
		resultText.setBackground(Color.white);
		//�½�һ��������ı���
		JPanel TextPanel = new JPanel();
		TextPanel.setLayout(new BorderLayout());
		TextPanel.add(resultText);
		
		// ��ʼ���������ϼ��İ�ť����������һ��������
		JPanel calckeysPanel = new JPanel();
		// �����񲼾�����4�У�4�е���������֮���ˮƽ������Ϊ8�����أ���ֱ������Ϊ8������
		calckeysPanel.setLayout(new GridLayout(4, 5, 8, 8));
		for (int i = 0; i < KEYS.length; i++) {
			keys[i] = new JButton(KEYS[i]);
			calckeysPanel.add(keys[i]);
			keys[i].setForeground(Color.blue);
		}
		// ��������ú�ɫ��ʾ������������ɫ��ʾ
		keys[1].setForeground(Color.red);
		keys[2].setForeground(Color.red);
		keys[3].setForeground(Color.red);
		keys[7].setForeground(Color.red);
		keys[11].setForeground(Color.red);
		keys[15].setForeground(Color.red);
		
		//���м����������岼��
		this.getContentPane().add(TextPanel,BorderLayout.NORTH);
		this.getContentPane().add(calckeysPanel,BorderLayout.CENTER);
		
		
		// Ϊ����ť����¼�������  
        // ��ʹ��ͬһ���¼����������������󡣱������������implements ActionListener  
        for (int i = 0; i < KEYS.length; i++) {  
            keys[i].addActionListener(this);  
        }   
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//��ȡԴ�ı�ǩ
		String label = e.getActionCommand();
		if("0123456789.".indexOf(label)>=0){
			// �û��������ּ�����С�����  
            handleNumber(label);
		}else if(label.equals("C")){
			handleC();
		}else{
			handleOperator(label);
		}
		// �Ժ�����Ŀ϶����ǵ�һ��������  
        firstDigit = false;
	}

	/** 
     * �������ּ������µ��¼� 
     *  
     * @param key 
     */  
    private void handleNumber(String key) {  
        if (firstDigit) {  
            // ����ĵ�һ������ 
            resultText.setText(key);  
        } else if ((key.equals(".")) && (resultText.getText().indexOf(".") < 0)) {  
            // �������С���㣬����֮ǰû��С���㣬��С���㸽�ڽ���ı���ĺ���  
            resultText.setText(resultText.getText() + ".");  
        } else if (!key.equals(".")) {  
            // �������Ĳ���С���㣬�����ָ��ڽ���ı���ĺ���  
            resultText.setText(resultText.getText() + key);  
        }  
        // �Ժ�����Ŀ϶����ǵ�һ��������  
        firstDigit = false;  
    } 
    /** 
     * ����C�������µ��¼� 
     */  
    private void handleC() {  
        // ��ʼ���������ĸ���ֵ  
        resultText.setText("0");  
        firstDigit = true;  
        operator = "=";  
    }
    /** 
     * ����������������µ��¼� 
     *  
     * @param key 
     */  
    private void handleOperator(String key) {
        if (operator.equals("/")) {  
            // ��������  
            // �����ǰ����ı����е�ֵ����0  
            if (getNumberFromText() == 0.0) {  
                // �������Ϸ�  
                operateValidFlag = false;  
                resultText.setText("��������Ϊ��");  
            } else {  
                resultNum /= getNumberFromText();  
            }  
        }  else if (operator.equals("+")) {  
            // �ӷ�����  
            resultNum += getNumberFromText();  
        } else if (operator.equals("-")) {  
            // ��������  
            resultNum -= getNumberFromText();  
        } else if (operator.equals("*")) {  
            // �˷�����  
            resultNum *= getNumberFromText();  
        } else if (operator.equals("+/-")) {  
            // ������������  
            resultNum = resultNum * (-1);  
        } else if (operator.equals("=")) {  
            // ��ֵ����  
            resultNum = getNumberFromText();  
        }  
        if (operateValidFlag) {  
            // ˫���ȸ�����������  
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
        // ����������û����İ�ť  
        operator = key;  
        firstDigit = true;  
        operateValidFlag = true;  
    }
    /** 
     * �ӽ���ı����л�ȡ���� 
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

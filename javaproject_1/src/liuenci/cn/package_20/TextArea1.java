package liuenci.cn.package_20;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class TextArea1 implements ActionListener{
	
	JTextArea text;
	public static void main(String[] args) {
		TextArea1 textArea1 = new TextArea1();
		textArea1.go();
	}
	public void go(){
		JFrame jFrame = new JFrame();
		JPanel jPanel = new JPanel();
		JButton jButton = new JButton("Just clack it");
		jButton.addActionListener(this);
		//10�иߣ�20�ֿ�
		text = new JTextArea(10,20);
		//������������
		text.setText("the first text \n");
		//�����Զ�����
		text.setLineWrap(true);
		
		//������������
		JScrollPane scorrller = new JScrollPane(text);
		//ָ��ֻʹ�ô�ֱ������
		scorrller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scorrller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		//��Ӵ����ı���Ĺ��������������ı���
		jPanel.add(scorrller);
		
		//�������ӵ����
		jFrame.getContentPane().add(BorderLayout.NORTH,jPanel);
		jFrame.getContentPane().add(BorderLayout.SOUTH,jButton);
		//���ô��ڴ�С
		jFrame.setSize(400,400);
		//���ô����Ƿ�ɼ�
		jFrame.setVisible(true);
		
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		text.append("button clicked \n");
	}
}

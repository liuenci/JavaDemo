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
		//10行高，20字宽
		text = new JTextArea(10,20);
		//设置文字内容
		text.setText("the first text \n");
		//启动自动换行
		text.setLineWrap(true);
		
		//创建滚动对象
		JScrollPane scorrller = new JScrollPane(text);
		//指定只使用垂直滚动条
		scorrller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scorrller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		//添加带有文本域的滚动条，而不是文本域
		jPanel.add(scorrller);
		
		//将组件添加到面板
		jFrame.getContentPane().add(BorderLayout.NORTH,jPanel);
		jFrame.getContentPane().add(BorderLayout.SOUTH,jButton);
		//设置窗口大小
		jFrame.setSize(400,400);
		//设置窗口是否可见
		jFrame.setVisible(true);
		
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		text.append("button clicked \n");
	}
}

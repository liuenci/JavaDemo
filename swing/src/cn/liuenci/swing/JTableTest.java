package cn.liuenci.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class JTableTest extends JFrame {

	public JTableTest() {
		init();
		addTable();
		
		setVisible(true);
	}

	// 初始化
	public void init() {
		this.setTitle("JTable");
		this.setSize(300, 400);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// 添加tabless
	public void addTable() {
		// 创建面板
		JPanel panel = new JPanel();

		// 创建JTable
		Object[] colname = { "班级", "姓名", "成绩" };
		Object[][] rows = { { "AA", "AA", "AA" }, { "AA", "AA", "AA" }, { "AA", "AA", "AA" }, { "AA", "AA", "AA" },
				{ "AA", "AA", "AA" }, { "AA", "AA", "AA" }, { "AA", "AA", "AA" }, { "AA", "AA", "AA" },
				{ "AA", "AA", "AA" } };
		//创建一个表模型对象
		DefaultTableModel tm = new DefaultTableModel(rows, colname);
		JTable table = new JTable(rows, colname);

		// 将表格添加到面板
		panel.add(table);
		// 创建滚动面板
		JScrollPane sc = new JScrollPane(panel);
		sc.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		// 将面板添加到窗口
		this.add(sc);
		
		//创建按钮面板
		JPanel btnPanel = new JPanel();
		//创建按钮
		JButton btn1 = new JButton("增加");
		JButton btn2 = new JButton("删除");
		JButton btn3 = new JButton("修改");
		//创建文本框
		JTextField jf = new JTextField("00000");
		
		//给按钮添加点击事件
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {				
			}
		});
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {				
			}
		});
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				int col = table.getSelectedColumn();
				//判断单元格内容
				if(row!=-1) {
					tm.setValueAt(jf.getText(), row, col);
				}
			}
		});
		
		//将文本框和按钮添加到面板
		btnPanel.add(jf);
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		btnPanel.add(btn3);
		//将面板添加到窗口
		this.add(btnPanel,BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		new JTableTest();
		
	}

}

package cn.liuenci.JTable;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Demo extends JFrame {

	// 构造方法
	public Demo() {
		// 设置窗口标题
		setTitle("表格使用");
		// 设置窗口大小
		setSize(400, 300);
		// 设置窗口关闭
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 添加表格
		addTableModel();
		// 设置窗口可见
		setVisible(true);
	}

	// 添加表格方法
	public void addTable() {
		Object[] colname = { "班级", "姓名", "成绩" };
		Object[][] rows = { { "AA", "AA", "AA" }, { "AA", "AA", "AA" }, { "AA", "AA", "AA" } };
		// 创建表格
		JTable table = new JTable(rows, colname);
		// 将表格添加到窗口
		this.add(table);
	}

	// 通过表模型创建表格
	public void addTableModel() {
		// 创建一个文本框
		JTextField tf = new JTextField("修改内容");
		// 创建按钮
		JButton btn = new JButton("修改");
		JButton delbtn = new JButton("删除");
		JButton addbtn = new JButton("添加");
		// 数据源
		Object[] colname = { "班级", "姓名", "成绩" };
		Object[][] rows = { { "BB", "BB", "BB" }, { "BB", "BB", "BB" }, { "AA", "AA", "AA" } };

		// 创建表模型
		DefaultTableModel tm = new DefaultTableModel(rows, colname);
		// 创建表
		JTable tb = new JTable(tm);
		// 创建面板
		JPanel p = new JPanel();
		// 把文本框和按钮添加到面板
		p.add(tf);
		p.add(btn);
		p.add(delbtn);
		p.add(addbtn);
		// 将面板添加到窗口
		this.add(tb);
		this.add(p, BorderLayout.SOUTH);
		// 给表格添加点击事件
		tb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 获取选中的行索引
				int row = tb.getSelectedRow();
				// 获取选中的列索引
				int col = tb.getSelectedColumn();
				// 设置文本框的值
				tf.setText(tb.getValueAt(row, col).toString());
			}
		});
		// 给修改按钮添加点击事件
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 获取选中的行索引
				int row = tb.getSelectedRow();
				// 获取选中的列索引
				int col = tb.getSelectedColumn();
				// 判断是否选中
				if (row != -1) {
					tm.setValueAt(tf.getText(), row, col);
				}
			}
		});
		// 给添加按钮添加点击事件
		addbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Object[] rs = { "yf1701", "松哥", "90" };
				// 添加数据
				tm.addRow(rs);
			}
		});
		// 给删除按钮添加点击事件
		delbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 获取选中的行索引
				int row = tb.getSelectedRow();
				// // 第一种，直接删除
				// tm.removeRow(row);
				// 第二种，返回按钮的操作，返回0或1
				// int index = JOptionPane.showConfirmDialog(p, "你真的要删除吗", "删除",
				// JOptionPane.YES_NO_CANCEL_OPTION);
				// if (index != -1) {
				// tm.removeRow(row);
				// }
				//第三种，返回选项内容
				String[] str = {"上网","睡觉","打球"};
				JOptionPane.showInputDialog(null,"请选择内容：\n","爱好",JOptionPane.PLAIN_MESSAGE,null,str,"");
			}
		});

	}

	public static void main(String[] args) {
		new Demo();
	}

}

package cn.liuenci.Toolbar;

import java.awt.BorderLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class ToolBarTest extends JFrame {

	public ToolBarTest() {
		init();
		setToolBar();
		setMenuBar();
		setVisible(true);
	}
	// 初始化
	public void init() {
		this.setTitle("JTable");
		this.setSize(300, 400);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	//给窗口设置工具栏
	public void setToolBar() {
		//创建一个面板
		JPanel p = new JPanel();
		p.setLayout(null);
		JToolBar tb = new JToolBar();
		tb.setBounds(0, 0, 1000, 500);
		//创建工具菜单
		JButton addBtn = new JButton();
		Icon icon = new ImageIcon("images/1.jpg");
		
		addBtn.setBounds(10, 10, 500, 500);
		addBtn.setIcon(icon);
		//将边框的四周设置为0
		addBtn.setMargin(new Insets(0, 0, 0, 0));
		JButton saveBtn = new JButton();
		saveBtn.setBounds(600, 10, 500, 500);
		saveBtn.setIcon(icon);
		saveBtn.setIconTextGap(0);
		tb.add(addBtn);
		tb.add(saveBtn);
		p.add(tb);
		this.add(p);
	}
	//给窗口添加菜单栏
	public void setMenuBar() {
		JMenuBar jm = new JMenuBar();
		
		JMenu file = new JMenu("文件");
		JMenu edit = new JMenu("编辑");
		jm.add(file);
		jm.add(edit);
		//创建菜单项
		JMenuItem minew = new JMenuItem("添加");
		JMenuItem miopen = new JMenuItem("打开");
		JMenuItem misave = new JMenuItem("保存");
		file.add(minew);
		file.add(miopen);
		file.add(misave);
		
		//给菜单项添加事件
		minew.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(ToolBarTest.this, "想不到吧");
			}
		});
		this.add(jm,BorderLayout.NORTH);
	}
	//给窗口添加面板
	public void addPanel() {
		
	}
	public static void main(String[] args) {
		new ToolBarTest();
	}

}

package cn.iotek.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class NotePadDemo {

	public static void main(String[] args) {
		new MyFrame("记事本");
	}

}

class MyFrame extends JFrame {
	private JTextArea tv_area = null;
	// 带滚动条的面板
	private JScrollPane s_pane = null;
	// 菜单栏
	private JMenuBar mb = null;
	// 文件菜单
	private JMenu m_file = null;
	// 帮助菜单
	private JMenu m_help = null;
	// 新建
	private JMenuItem item_new = null;
	// 打开
	private JMenuItem item_open = null;
	// 推出
	private JMenuItem item_exit = null;
	// 关于
	private JMenuItem item_about = null;

	public MyFrame(String title) {
		super(title);
		init();
		registerListener();
	}

	// 初始化相关的组件
	private void init() {
		tv_area = new JTextArea();
		s_pane = new JScrollPane(tv_area);
		// 设置水平滚动条
		s_pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		Container cpane = this.getContentPane();
		cpane.add(s_pane, BorderLayout.CENTER);
		this.setSize(500, 300);

		// 初始化菜单
		mb = new JMenuBar();
		m_file = new JMenu("文件");
		item_new = new JMenuItem("新建");
		item_open = new JMenuItem("打开");
		item_exit = new JMenuItem("退出");
		m_file.add(item_new);
		m_file.add(item_open);
		m_file.add(item_exit);
		m_help = new JMenu("帮助");
		item_about = new JMenuItem("关于");
		m_help.add(item_about);
		mb.add(m_file);
		mb.add(m_help);
		this.setJMenuBar(mb);

		this.setVisible(true);
		// 关闭应用程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		// 窗口居中显示
		Toolkit kit = Toolkit.getDefaultToolkit();
		// 得到 屏幕大小
		Dimension screenSize = kit.getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		int windowWidth = this.getWidth();
		int windowHeight = this.getHeight();
		this.setLocation((screenWidth - windowWidth) / 2, (screenHeight - windowHeight) / 2);
	}

	// 给相关的组件设置事件监听器
	public void registerListener() {
		item_new.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				newFile();
			}
		});
		item_open.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				openFile();
			}
		});
		item_exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				exit();
			}
		});
		item_about.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new AboutDialog(MyFrame.this, "关于-记事本", true);
			}
		});
	}

	// 新建的功能
	private void newFile() {
		if (!tv_area.getText().equals("")) {
			int res = JOptionPane.showConfirmDialog(null, "是否保存？", "提示信息 ", JOptionPane.YES_NO_OPTION);
			if (res == JOptionPane.YES_OPTION) {
				// 文件保存对话框
				FileDialog fd = new FileDialog(this, "保存文件", FileDialog.SAVE);
				fd.setVisible(true);
			} else {

				tv_area.setText("");
			}
		}
	}

	// 打开文件
	private void openFile() {
		FileDialog fd = new FileDialog(this, "打开文件", FileDialog.LOAD);
		fd.setVisible(true);
	}

	// 退出的功能
	private void exit() {
		newFile();
		System.exit(0);
	}
}

class AboutDialog extends JDialog {
	private JLabel desc = null;
	private JPanel panel = null;
	public JButton btn = null;

	public AboutDialog(Frame frame, String title, boolean modal) {
		super(frame, title, modal);
		init();
		registerListener();
	}

	public void init() {
		desc = new JLabel();
		desc.setText("<html>这是一个自定义的记事本，开发初期阶段，还得<br/>继续完善阶段</html>");
		desc.setHorizontalAlignment(JLabel.CENTER);
		panel = new JPanel();
		btn = new JButton("OK");
		panel.add(btn);
		// 默认放在布局管理器的中间
		this.add(desc);
		this.add(panel, BorderLayout.SOUTH);
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	public void registerListener() {
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				AboutDialog.this.dispose();
			}
		});
		
		// 窗口居中显示
		Toolkit kit = Toolkit.getDefaultToolkit();
		// 得到 屏幕大小
		Dimension screenSize = kit.getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		int windowWidth = this.getWidth();
		int windowHeight = this.getHeight();
		this.setLocation((screenWidth - windowWidth) / 2, (screenHeight - windowHeight) / 2);
		this.setVisible(true);
	}
}

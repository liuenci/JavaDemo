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
		new MyFrame("���±�");
	}

}

class MyFrame extends JFrame {
	private JTextArea tv_area = null;
	// �������������
	private JScrollPane s_pane = null;
	// �˵���
	private JMenuBar mb = null;
	// �ļ��˵�
	private JMenu m_file = null;
	// �����˵�
	private JMenu m_help = null;
	// �½�
	private JMenuItem item_new = null;
	// ��
	private JMenuItem item_open = null;
	// �Ƴ�
	private JMenuItem item_exit = null;
	// ����
	private JMenuItem item_about = null;

	public MyFrame(String title) {
		super(title);
		init();
		registerListener();
	}

	// ��ʼ����ص����
	private void init() {
		tv_area = new JTextArea();
		s_pane = new JScrollPane(tv_area);
		// ����ˮƽ������
		s_pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		Container cpane = this.getContentPane();
		cpane.add(s_pane, BorderLayout.CENTER);
		this.setSize(500, 300);

		// ��ʼ���˵�
		mb = new JMenuBar();
		m_file = new JMenu("�ļ�");
		item_new = new JMenuItem("�½�");
		item_open = new JMenuItem("��");
		item_exit = new JMenuItem("�˳�");
		m_file.add(item_new);
		m_file.add(item_open);
		m_file.add(item_exit);
		m_help = new JMenu("����");
		item_about = new JMenuItem("����");
		m_help.add(item_about);
		mb.add(m_file);
		mb.add(m_help);
		this.setJMenuBar(mb);

		this.setVisible(true);
		// �ر�Ӧ�ó���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		// ���ھ�����ʾ
		Toolkit kit = Toolkit.getDefaultToolkit();
		// �õ� ��Ļ��С
		Dimension screenSize = kit.getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		int windowWidth = this.getWidth();
		int windowHeight = this.getHeight();
		this.setLocation((screenWidth - windowWidth) / 2, (screenHeight - windowHeight) / 2);
	}

	// ����ص���������¼�������
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
				new AboutDialog(MyFrame.this, "����-���±�", true);
			}
		});
	}

	// �½��Ĺ���
	private void newFile() {
		if (!tv_area.getText().equals("")) {
			int res = JOptionPane.showConfirmDialog(null, "�Ƿ񱣴棿", "��ʾ��Ϣ ", JOptionPane.YES_NO_OPTION);
			if (res == JOptionPane.YES_OPTION) {
				// �ļ�����Ի���
				FileDialog fd = new FileDialog(this, "�����ļ�", FileDialog.SAVE);
				fd.setVisible(true);
			} else {

				tv_area.setText("");
			}
		}
	}

	// ���ļ�
	private void openFile() {
		FileDialog fd = new FileDialog(this, "���ļ�", FileDialog.LOAD);
		fd.setVisible(true);
	}

	// �˳��Ĺ���
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
		desc.setText("<html>����һ���Զ���ļ��±����������ڽ׶Σ�����<br/>�������ƽ׶�</html>");
		desc.setHorizontalAlignment(JLabel.CENTER);
		panel = new JPanel();
		btn = new JButton("OK");
		panel.add(btn);
		// Ĭ�Ϸ��ڲ��ֹ��������м�
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
		
		// ���ھ�����ʾ
		Toolkit kit = Toolkit.getDefaultToolkit();
		// �õ� ��Ļ��С
		Dimension screenSize = kit.getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		int windowWidth = this.getWidth();
		int windowHeight = this.getHeight();
		this.setLocation((screenWidth - windowWidth) / 2, (screenHeight - windowHeight) / 2);
		this.setVisible(true);
	}
}

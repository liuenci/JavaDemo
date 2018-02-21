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
	// ��ʼ��
	public void init() {
		this.setTitle("JTable");
		this.setSize(300, 400);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	//���������ù�����
	public void setToolBar() {
		//����һ�����
		JPanel p = new JPanel();
		p.setLayout(null);
		JToolBar tb = new JToolBar();
		tb.setBounds(0, 0, 1000, 500);
		//�������߲˵�
		JButton addBtn = new JButton();
		Icon icon = new ImageIcon("images/1.jpg");
		
		addBtn.setBounds(10, 10, 500, 500);
		addBtn.setIcon(icon);
		//���߿����������Ϊ0
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
	//��������Ӳ˵���
	public void setMenuBar() {
		JMenuBar jm = new JMenuBar();
		
		JMenu file = new JMenu("�ļ�");
		JMenu edit = new JMenu("�༭");
		jm.add(file);
		jm.add(edit);
		//�����˵���
		JMenuItem minew = new JMenuItem("���");
		JMenuItem miopen = new JMenuItem("��");
		JMenuItem misave = new JMenuItem("����");
		file.add(minew);
		file.add(miopen);
		file.add(misave);
		
		//���˵�������¼�
		minew.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(ToolBarTest.this, "�벻����");
			}
		});
		this.add(jm,BorderLayout.NORTH);
	}
	//������������
	public void addPanel() {
		
	}
	public static void main(String[] args) {
		new ToolBarTest();
	}

}

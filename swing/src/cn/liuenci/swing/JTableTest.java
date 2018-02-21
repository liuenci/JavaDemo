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

	// ��ʼ��
	public void init() {
		this.setTitle("JTable");
		this.setSize(300, 400);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// ���tabless
	public void addTable() {
		// �������
		JPanel panel = new JPanel();

		// ����JTable
		Object[] colname = { "�༶", "����", "�ɼ�" };
		Object[][] rows = { { "AA", "AA", "AA" }, { "AA", "AA", "AA" }, { "AA", "AA", "AA" }, { "AA", "AA", "AA" },
				{ "AA", "AA", "AA" }, { "AA", "AA", "AA" }, { "AA", "AA", "AA" }, { "AA", "AA", "AA" },
				{ "AA", "AA", "AA" } };
		//����һ����ģ�Ͷ���
		DefaultTableModel tm = new DefaultTableModel(rows, colname);
		JTable table = new JTable(rows, colname);

		// �������ӵ����
		panel.add(table);
		// �����������
		JScrollPane sc = new JScrollPane(panel);
		sc.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		// �������ӵ�����
		this.add(sc);
		
		//������ť���
		JPanel btnPanel = new JPanel();
		//������ť
		JButton btn1 = new JButton("����");
		JButton btn2 = new JButton("ɾ��");
		JButton btn3 = new JButton("�޸�");
		//�����ı���
		JTextField jf = new JTextField("00000");
		
		//����ť��ӵ���¼�
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
				//�жϵ�Ԫ������
				if(row!=-1) {
					tm.setValueAt(jf.getText(), row, col);
				}
			}
		});
		
		//���ı���Ͱ�ť��ӵ����
		btnPanel.add(jf);
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		btnPanel.add(btn3);
		//�������ӵ�����
		this.add(btnPanel,BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		new JTableTest();
		
	}

}

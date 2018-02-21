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

	// ���췽��
	public Demo() {
		// ���ô��ڱ���
		setTitle("���ʹ��");
		// ���ô��ڴ�С
		setSize(400, 300);
		// ���ô��ڹر�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ��ӱ��
		addTableModel();
		// ���ô��ڿɼ�
		setVisible(true);
	}

	// ��ӱ�񷽷�
	public void addTable() {
		Object[] colname = { "�༶", "����", "�ɼ�" };
		Object[][] rows = { { "AA", "AA", "AA" }, { "AA", "AA", "AA" }, { "AA", "AA", "AA" } };
		// �������
		JTable table = new JTable(rows, colname);
		// �������ӵ�����
		this.add(table);
	}

	// ͨ����ģ�ʹ������
	public void addTableModel() {
		// ����һ���ı���
		JTextField tf = new JTextField("�޸�����");
		// ������ť
		JButton btn = new JButton("�޸�");
		JButton delbtn = new JButton("ɾ��");
		JButton addbtn = new JButton("���");
		// ����Դ
		Object[] colname = { "�༶", "����", "�ɼ�" };
		Object[][] rows = { { "BB", "BB", "BB" }, { "BB", "BB", "BB" }, { "AA", "AA", "AA" } };

		// ������ģ��
		DefaultTableModel tm = new DefaultTableModel(rows, colname);
		// ������
		JTable tb = new JTable(tm);
		// �������
		JPanel p = new JPanel();
		// ���ı���Ͱ�ť��ӵ����
		p.add(tf);
		p.add(btn);
		p.add(delbtn);
		p.add(addbtn);
		// �������ӵ�����
		this.add(tb);
		this.add(p, BorderLayout.SOUTH);
		// �������ӵ���¼�
		tb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// ��ȡѡ�е�������
				int row = tb.getSelectedRow();
				// ��ȡѡ�е�������
				int col = tb.getSelectedColumn();
				// �����ı����ֵ
				tf.setText(tb.getValueAt(row, col).toString());
			}
		});
		// ���޸İ�ť��ӵ���¼�
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// ��ȡѡ�е�������
				int row = tb.getSelectedRow();
				// ��ȡѡ�е�������
				int col = tb.getSelectedColumn();
				// �ж��Ƿ�ѡ��
				if (row != -1) {
					tm.setValueAt(tf.getText(), row, col);
				}
			}
		});
		// ����Ӱ�ť��ӵ���¼�
		addbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Object[] rs = { "yf1701", "�ɸ�", "90" };
				// �������
				tm.addRow(rs);
			}
		});
		// ��ɾ����ť��ӵ���¼�
		delbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// ��ȡѡ�е�������
				int row = tb.getSelectedRow();
				// // ��һ�֣�ֱ��ɾ��
				// tm.removeRow(row);
				// �ڶ��֣����ذ�ť�Ĳ���������0��1
				// int index = JOptionPane.showConfirmDialog(p, "�����Ҫɾ����", "ɾ��",
				// JOptionPane.YES_NO_CANCEL_OPTION);
				// if (index != -1) {
				// tm.removeRow(row);
				// }
				//�����֣�����ѡ������
				String[] str = {"����","˯��","����"};
				JOptionPane.showInputDialog(null,"��ѡ�����ݣ�\n","����",JOptionPane.PLAIN_MESSAGE,null,str,"");
			}
		});

	}

	public static void main(String[] args) {
		new Demo();
	}

}

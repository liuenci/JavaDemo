package cn.liuenci.swing.JComboBox;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JComboBoxTest extends JFrame {

	// ���췽��
	public JComboBoxTest() {
		init();
		addPanel();
		this.setVisible(true);
	}

	// ��ʼ������
	public void init() {
		this.setTitle("CardLayout");
		this.setSize(300, 300);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	// ������
	public void addPanel() {
		// ����������
		JPanel p = new JPanel();
		// ������ǩ
		JLabel lbsf = new JLabel("ʡ��:");
		JLabel lbcity = new JLabel("����:");
		// ����ʡ���б�
		JComboBox cb = new JComboBox();
		// ���б����ѡ��
		cb.addItem("����");
		cb.addItem("����");
		cb.addItem("�㶫");

		// ���������б�
		JComboBox cbcity = new JComboBox();
		cbcity.addItem("��ɳ");
		cbcity.addItem("����");
		cbcity.addItem("��̶");

		// ��ʡ���б�����¼�
		cb.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					String sf = e.getItem().toString();
					// ��ճ����б�������Ԫ��
					cbcity.removeAllItems();
					if (sf.equals("����")) {
						cbcity.addItem("��ɳ");
						cbcity.addItem("����");
						cbcity.addItem("��̶");
					} else if (sf.equals("����")) {
						cbcity.addItem("�人");
						cbcity.addItem("���");
						cbcity.addItem("����");
					} else if (sf.equals("�㶫")) {
						cbcity.addItem("����");
						cbcity.addItem("����");
						cbcity.addItem("��ݸ");
					}
				}
			}
		});
		;

		// ���б���ӵ����
		p.add(lbsf);
		p.add(cb);
		p.add(lbcity);
		p.add(cbcity);
		// �������ӵ�����
		this.add(p);
	}

	public static void main(String[] args) {
		new JComboBoxTest();
	}

}

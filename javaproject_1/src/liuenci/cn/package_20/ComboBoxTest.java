package liuenci.cn.package_20;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComboBoxTest extends JFrame{

	//��ʼ��
	public void init(){
		this.setSize(300,400);
		this.addPanel();
		this.setVisible(true);
	}
	//�������
	public void addPanel(){
		JPanel panel = new JPanel();
		JLabel lbaddress = new JLabel("��ַ:");
		
		JComboBox cb = new JComboBox();
		//���б����ѡ��
		cb.addItem("����");
		cb.addItem("����");
		cb.addItem("��ͥ��");
		cb.addItem("۶����");
		
		//���������б�
		JComboBox cb1 = new JComboBox();
		//���б����ѡ��
		cb1.addItem("����");
		cb1.addItem("��ɳ");
		cb1.addItem("��̶");
		cb1.addItem("����");
		
		
		//���б�ѡ������¼�
		cb.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED){
					String sf = e.getItem().toString();
					//��ճ����б�
					cb1.removeAllItems();
					if(sf.equals("����")){
						cb1.addItem("����");
						cb1.addItem("��ɳ");
						cb1.addItem("��̶");
						cb1.addItem("����");
					}else if(sf.equals("����")){
						cb1.addItem("����һ��");
						cb1.addItem("��ɳһ��");
						cb1.addItem("��̶һ��");
						cb1.addItem("����һ��");
					}else if(sf.equals("��ͥ��")){
						cb1.addItem("���޶���");
						cb1.addItem("��ɳ����");
						cb1.addItem("��̶����");
						cb1.addItem("��������");
					}else{
						cb1.addItem("��������");
						cb1.addItem("��ɳ����");
						cb1.addItem("��̶����");
						cb1.addItem("��������");
					}
				}
			}
		});
		
		
		//���б���ӵ����
		panel.add(lbaddress);
		panel.add(cb);
		panel.add(cb1);
		//�������ӵ�����
		this.add(panel);
	}
	public static void main(String[] args) {
		new ComboBoxTest().init();
	}

}

package cn.liuenci.swing.JComboBox;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JComboBoxTest extends JFrame {

	// 构造方法
	public JComboBoxTest() {
		init();
		addPanel();
		this.setVisible(true);
	}

	// 初始化窗口
	public void init() {
		this.setTitle("CardLayout");
		this.setSize(300, 300);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	// 添加面板
	public void addPanel() {
		// 创建面板对象
		JPanel p = new JPanel();
		// 创建标签
		JLabel lbsf = new JLabel("省份:");
		JLabel lbcity = new JLabel("城市:");
		// 创建省份列表
		JComboBox cb = new JComboBox();
		// 给列表添加选项
		cb.addItem("湖南");
		cb.addItem("湖北");
		cb.addItem("广东");

		// 创建城市列表
		JComboBox cbcity = new JComboBox();
		cbcity.addItem("长沙");
		cbcity.addItem("株洲");
		cbcity.addItem("湘潭");

		// 给省份列表添加事件
		cb.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					String sf = e.getItem().toString();
					// 清空城市列表中所有元素
					cbcity.removeAllItems();
					if (sf.equals("湖南")) {
						cbcity.addItem("长沙");
						cbcity.addItem("株洲");
						cbcity.addItem("湘潭");
					} else if (sf.equals("湖北")) {
						cbcity.addItem("武汉");
						cbcity.addItem("武昌");
						cbcity.addItem("汉口");
					} else if (sf.equals("广东")) {
						cbcity.addItem("广州");
						cbcity.addItem("深圳");
						cbcity.addItem("东莞");
					}
				}
			}
		});
		;

		// 将列表添加到面板
		p.add(lbsf);
		p.add(cb);
		p.add(lbcity);
		p.add(cbcity);
		// 将面板添加到窗口
		this.add(p);
	}

	public static void main(String[] args) {
		new JComboBoxTest();
	}

}

package liuenci.cn.package_20;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComboBoxTest extends JFrame{

	//初始化
	public void init(){
		this.setSize(300,400);
		this.addPanel();
		this.setVisible(true);
	}
	//创建面板
	public void addPanel(){
		JPanel panel = new JPanel();
		JLabel lbaddress = new JLabel("地址:");
		
		JComboBox cb = new JComboBox();
		//给列表添加选项
		cb.addItem("湖南");
		cb.addItem("湖北");
		cb.addItem("洞庭湖");
		cb.addItem("鄱阳湖");
		
		//创建城市列表
		JComboBox cb1 = new JComboBox();
		//给列表添加选项
		cb1.addItem("株洲");
		cb1.addItem("长沙");
		cb1.addItem("湘潭");
		cb1.addItem("衡阳");
		
		
		//给列表选项添加事件
		cb.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED){
					String sf = e.getItem().toString();
					//清空城市列表
					cb1.removeAllItems();
					if(sf.equals("湖南")){
						cb1.addItem("株洲");
						cb1.addItem("长沙");
						cb1.addItem("湘潭");
						cb1.addItem("衡阳");
					}else if(sf.equals("湖北")){
						cb1.addItem("株洲一号");
						cb1.addItem("长沙一号");
						cb1.addItem("湘潭一号");
						cb1.addItem("衡阳一号");
					}else if(sf.equals("洞庭湖")){
						cb1.addItem("株洲二号");
						cb1.addItem("长沙二号");
						cb1.addItem("湘潭二号");
						cb1.addItem("衡阳二号");
					}else{
						cb1.addItem("株洲三号");
						cb1.addItem("长沙三号");
						cb1.addItem("湘潭三号");
						cb1.addItem("衡阳三号");
					}
				}
			}
		});
		
		
		//将列表添加到面板
		panel.add(lbaddress);
		panel.add(cb);
		panel.add(cb1);
		//将面板添加到窗口
		this.add(panel);
	}
	public static void main(String[] args) {
		new ComboBoxTest().init();
	}

}

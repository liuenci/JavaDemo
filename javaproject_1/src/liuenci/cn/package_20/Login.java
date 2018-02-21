package liuenci.cn.package_20;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
	JTextField userNameText;
	JPasswordField passwordText;
	//初始化
	public void init(){
		this.setSize(400,300);
		this.setLocation(600,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addPanel();
		this.setVisible(true);
	}
	//添加面板
	public void addPanel(){
		JPanel panel = new JPanel();
		
		panel.setLayout(null);
		
		JLabel userName = new JLabel("用户名:");
		userName.setFont(new Font("微软雅黑",Font.BOLD,18));
		userName.setBounds(60, 20, 60, 60);
		JLabel password = new JLabel("密码:");
		password.setBounds(60, 80, 60, 60);
		password.setFont(new Font("微软雅黑",Font.BOLD,18));
		
		userNameText = new JTextField();
		userNameText.setBounds(140, 40, 160, 26);
		passwordText = new JPasswordField();
		passwordText.setBounds(140, 100, 160, 26);
		
		
		JButton btnLogin = new JButton("登录");
		btnLogin.setBounds(60, 140, 60, 30);
		
		//给登录设置点击事件
		btnLogin.addActionListener(this);
		JButton btnreg = new JButton("注册");
		btnreg.setBounds(240, 140, 60, 30);
		panel.add(userName);
		panel.add(password);
		panel.add(userNameText);
		panel.add(passwordText);
		panel.add(btnLogin);
		panel.add(btnreg);
		this.add(panel);
	}
	public static void main(String[] args) {
		new Login().init();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String label = e.getActionCommand();
		if(label.equals("登录")){
			System.out.println("用户名:"+userNameText.getText());
			System.out.println("密码:"+passwordText.getText());
		}else{
			
		}
	}

}

package cn.liuenci.swing;

import java.awt.Dimension;

import javax.swing.JDialog;

public class JDialogTest extends JDialog{

	public JDialogTest() {
		this.setSize(300,200);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new JDialog();
	}

}

package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex06_2 extends JFrame {
	JPanel jp1 ;
	String name ;
	public Ex06_2(String name) {
		this.name = name ;
		jp1 = new JPanel() ;
		jp1.add(new JLabel(name+"님 환영합니다.")) ;
		add(jp1);
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize() ;
		setBounds(ds.width/2-100, ds.height/2-100, 200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
}

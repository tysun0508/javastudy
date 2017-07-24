package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex06_1 extends JFrame {
	JPanel jp1 ;
	
	public Ex06_1() {
		
		jp1 = new JPanel() ;
		jp1.add(new JLabel("회원가입창입니다!")) ;
		add(jp1);
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize() ;
		setBounds(ds.width/2-100, ds.height/2-100, 200, 200);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	
	
	}
	
}
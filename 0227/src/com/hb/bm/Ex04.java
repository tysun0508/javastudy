	package com.hb.bm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex04 extends JFrame {
	
	public Ex04() {
		setTitle("����4");
		JPanel jp1 = new JPanel() ;
		JTextField jtf1 = new JTextField(20);
		jp1.add(jtf1);
		
		JPanel jp2 = new JPanel() ;
		jp2.setLayout(new GridLayout(5, 3, 5, 5));
		
		JButton jb1 = new JButton(" 1 ");
		JButton jb2 = new JButton(" 2 ");
		JButton jb3 = new JButton(" 3 ");
		JButton jb4 = new JButton(" 4 ");
		JButton jb5 = new JButton(" 5 ");
		JButton jb6 = new JButton(" 6 ");
		JButton jb7 = new JButton(" 7 ");
		JButton jb8 = new JButton(" 8 ");
		JButton jb9 = new JButton(" 9 ");
		JButton jb10 = new JButton(" 0 ");
		JButton jb11= new JButton(" + ");
		JButton jb12= new JButton(" - ");
		JButton jb13= new JButton(" * ");
		JButton jb14= new JButton(" / ");
		JButton jb15 = new JButton(" = ");
		
		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		jp2.add(jb6);
		jp2.add(jb7);
		jp2.add(jb8);
		jp2.add(jb9);
		jp2.add(jb10);
		jp2.add(jb11);
		jp2.add(jb12);
		jp2.add(jb13);
		jp2.add(jb14);
		jp2.add(jb15);
		
		add(jp1,BorderLayout.NORTH);
		add(jp2,BorderLayout.CENTER);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize() ;
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Ex04() ;
	}
}

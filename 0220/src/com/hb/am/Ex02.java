package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Ex02 extends JFrame {
	
	public Ex02() {
		setTitle("�����ֹ���");
		//jp1
		JPanel jp1 = new JPanel();
		jp1.add(new JLabel("�ڹ� ���ڿ� ���Ű��� ȯ���մϴ�."));
		//jp2
		JPanel jp2 = new JPanel();
		JButton jb1 = new JButton("�ֹ�");
		JButton jb2 = new JButton("���");
		JTextField jtf1 = new JTextField(15);
		jtf1.setEditable(false);
		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jtf1);
				
		//jp3		
		JPanel jp3 = new JPanel();
		ButtonGroup bg = new ButtonGroup();
		JRadioButton jrb1 = new JRadioButton("�޺�", true);
		JRadioButton jrb2 = new JRadioButton("��������", true);
		JRadioButton jrb3 = new JRadioButton("�Ұ��", true);
		jp3.setLayout(new GridLayout(3, 0));
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		jp3.add(jrb1);
		jp3.add(jrb2);
		jp3.add(jrb3);
		
		jp3.setBorder(BorderFactory.createTitledBorder("����"));
		
		//jp4
		JPanel jp4 = new JPanel();
		ButtonGroup bg2 = new ButtonGroup();
		JRadioButton jrb4 = new JRadioButton("�Ǹ�", true);
		JRadioButton jrb5 = new JRadioButton("ġ��", true);
		JRadioButton jrb6 = new JRadioButton("����δ�", true);
		JRadioButton jrb7 = new JRadioButton("����Ŀ", true);
		jp4.setLayout(new GridLayout(4, 0));
		bg2.add(jrb4);
		bg2.add(jrb5);
		bg2.add(jrb6);
		bg2.add(jrb7);
		jp4.add(jrb4);
		jp4.add(jrb5);
		jp4.add(jrb6);
		jp4.add(jrb7);
		
		jp4.setBorder(BorderFactory.createTitledBorder("�߰�����"));
		
		//jp5
		JPanel jp5 = new JPanel();
		ButtonGroup bg3 = new ButtonGroup();
		JRadioButton jrb8 = new JRadioButton("small", true);
		JRadioButton jrb9 = new JRadioButton("medium", true);
		JRadioButton jrb10 = new JRadioButton("large", true);
		
		jp5.setLayout(new GridLayout(3, 0));
		bg3.add(jrb8);
		bg3.add(jrb9);
		bg3.add(jrb10);
		
		jp5.add(jrb8);
		jp5.add(jrb9);
		jp5.add(jrb10);
		
		jp5.setBorder(BorderFactory.createTitledBorder("������"));
		
		
		add(jp1, BorderLayout.NORTH);
		add(jp2, BorderLayout.SOUTH);
		add(jp3, BorderLayout.WEST);
		add(jp4, BorderLayout.CENTER);
		add(jp5, BorderLayout.EAST);
		
		
				
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize() ;
		setBounds(ds.width/2-200, ds.height/2-150, 400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
}

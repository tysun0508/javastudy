package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex02_4 extends JFrame {
	public Ex02_4() {
		setTitle("����");
		JPanel jp1 = new JPanel() ;
		JPanel jp2 = new JPanel() ;
		JPanel jp3 = new JPanel() ;
		
		
		
		
		
		JLabel jl1 = new JLabel("�̸�") ;		
		JLabel jl2 = new JLabel("����") ;	
		JLabel jl3 = new JLabel("����") ;	
		JLabel jl4 = new JLabel("����") ;	
		

		
	
		JTextField jtf1 = new JTextField(4) ;
		JTextField jtf2 = new JTextField(4) ;
		JTextField jtf3 = new JTextField(4) ;
		JTextField jtf4 = new JTextField(4) ;
		
		
		
		JTextArea jta = new JTextArea(14, 27);
		jta.setLineWrap(true);
		jta.setEditable(false);
		
		JScrollPane jsp = new JScrollPane(jta,  //��ũ���� ��ġ�� ������Ʈ
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,   //���� ��ũ��
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER) ;   //���� ��ũ��
		
		JButton jb1 = new JButton("���") ;
		JButton jb2 = new JButton("����") ;
		JButton jb3 = new JButton("���") ;
		
		
		
		jp1.add(jl1) ;
		jp1.add(jtf1) ;
		jp2.add(jl2) ;
		jp2.add(jtf2) ;
		jp2.add(jl3) ;
		jp2.add(jtf3) ;
		jp2.add(jl4) ;
		jp2.add(jtf4) ;
		jp2.add(jsp);
		jp3.add(jb1) ;
		jp3.add(jb2) ;
		jp3.add(jb3) ;
		
		add(jp1,BorderLayout.NORTH) ;
		add(jp2, BorderLayout.CENTER);
		add(jp3, BorderLayout.SOUTH);
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize() ;
		setBounds(ds.width/2-180, ds.height/2-200, 360, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex02_4() ;
	}
}

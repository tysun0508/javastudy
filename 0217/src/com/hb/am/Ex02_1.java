package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex02_1 extends JFrame {
	public Ex02_1() {
		setTitle("����1");
		JPanel jp = new JPanel() ;
		
		
		JLabel jl1 = new JLabel("��1 : ") ;		
		JLabel jl2 = new JLabel("��2 : ") ;		
		JLabel jl3 = new JLabel("������ : ") ;
		
		JTextField jtf1 = new JTextField(4) ;
		JTextField jtf2 = new JTextField(4) ;
		JTextField jtf3 = new JTextField(4) ;
		
		
		JTextArea jta = new JTextArea(16, 25);
		jta.setLineWrap(true);
		jta.setEditable(false); //���� �Ұ���
		
		JScrollPane jsp = new JScrollPane(jta,  //��ũ���� ��ġ�� ������Ʈ
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,   //���� ��ũ��
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER) ;   //���� ��ũ��
		
		JButton jb1 = new JButton("���") ;
		JButton jb2 = new JButton("����") ;
		JButton jb3 = new JButton("���") ;
		
		
		
		jp.add(jl1) ;
		jp.add(jtf1) ;
		jp.add(jl2) ;
		jp.add(jtf2) ;
		jp.add(jl3) ;
		jp.add(jtf3) ;
		jp.add(jsp);
		jp.add(jb1) ;
		jp.add(jb2) ;
		jp.add(jb3) ;
		
	
		add(jp) ;
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize() ;
		setBounds(ds.width/2-250, ds.height/2-250, 350, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex02_1() ;
	}
}

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

public class Ex02_3 extends JFrame {
	public Ex02_3() {
		setTitle("����3");
		JPanel jp = new JPanel() ;
		
		
		
		String[] items = {"�����ϼ���", "+", "-", "*","/"} ;
		JComboBox jcb = new JComboBox(items) ;
		
		
		JLabel jl1 = new JLabel("��1 : ") ;		
		JLabel jl2 = new JLabel("��2 : ") ;		
		

		
	
		JTextField jtf1 = new JTextField(4) ;
		JTextField jtf2 = new JTextField(4) ;
		
		
		
		JTextArea jta = new JTextArea(14, 27);
		jta.setLineWrap(true);
		jta.setEditable(false);
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
		jp.add(jcb) ;
	
		jp.add(jsp);
		jp.add(jb1) ;
		jp.add(jb2) ;
		jp.add(jb3) ;
		
		add(jp) ;
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize() ;
		setBounds(ds.width/2-180, ds.height/2-200, 360, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex02_3() ;
	}
}

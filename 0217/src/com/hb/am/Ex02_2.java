package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex02_2 extends JFrame {
	public Ex02_2() {
		setTitle("����2");
		JPanel jp = new JPanel() ;
		
		// �׷�ȭ ���Ѿ� �ϳ��� ���ð���
		ButtonGroup bg = new ButtonGroup() ;
		
		JRadioButton jrb1 = new JRadioButton("+");
		JRadioButton jrb2 = new JRadioButton("-");
		JRadioButton jrb3 = new JRadioButton("*");
		JRadioButton jrb4 = new JRadioButton("/");
		
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		
		
		
		JLabel jl1 = new JLabel("��1 : ") ;		
		JLabel jl2 = new JLabel("��2 : ") ;		
		JLabel jl3 = new JLabel("������ : ");

		
	
		JTextField jtf1 = new JTextField(3) ;
		JTextField jtf2 = new JTextField(3) ;
		
		
		
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
		jp.add(jl3);
		jp.add(jrb1);
		jp.add(jrb2);
		jp.add(jrb3);
		jp.add(jrb4);
		jp.add(jsp);
		jp.add(jb1) ;
		jp.add(jb2) ;
		jp.add(jb3) ;
		
		add(jp) ;
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize() ;
		setBounds(ds.width/2-180, ds.height/2-200, 360, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex02_2() ;
	}
}

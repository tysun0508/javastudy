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

public class Ex02_5 extends JFrame {
	public Ex02_5() {
		setTitle("ī��");
		setLayout(new FlowLayout());
		JPanel jp1 = new JPanel() ;
		JPanel jp2 = new JPanel() ;
		JPanel jp3 = new JPanel() ;
		JPanel jp4 = new JPanel() ;
		JPanel jp5 = new JPanel() ;
		
		ButtonGroup bg = new ButtonGroup() ;
		
		JRadioButton jrb1 = new JRadioButton("�Ƹ޸�ī��(3000)");
		JRadioButton jrb2 = new JRadioButton("ī���ī(4000)");
		JRadioButton jrb3 = new JRadioButton("ī���(3500)");
		JRadioButton jrb4 = new JRadioButton("�����꽺(3000)");
		
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		
		
		
		
		JLabel jl1 = new JLabel("���ϴ� Ŀ�� ����") ;		
		JLabel jl2 = new JLabel("����: ") ;
		JLabel jl3 = new JLabel("�Աݾ� : ") ;
		

		
	
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
		
		
		
		jp1.add(jl1) ;
		jp2.add(jrb1);
		jp2.add(jrb2);
		jp2.add(jrb3);
		jp2.add(jrb4);
		jp3.add(jl2) ;
		jp3.add(jtf1) ;
		jp3.add(jl3) ;
		jp3.add(jtf2) ;
		jp4.add(jsp);
		jp5.add(jb1);
		jp5.add(jb2);
		jp5.add(jb3);
		
		
		
		
		
		add(jp1);
		add(jp2);
		add(jp3);
		add(jp4);
		add(jp5);
	
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize() ;
		setBounds(ds.width/2-250, ds.height/2-240, 500, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex02_5() ;
	}
}

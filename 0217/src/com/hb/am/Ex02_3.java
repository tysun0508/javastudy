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
		setTitle("계산기3");
		JPanel jp = new JPanel() ;
		
		
		
		String[] items = {"선택하세요", "+", "-", "*","/"} ;
		JComboBox jcb = new JComboBox(items) ;
		
		
		JLabel jl1 = new JLabel("수1 : ") ;		
		JLabel jl2 = new JLabel("수2 : ") ;		
		

		
	
		JTextField jtf1 = new JTextField(4) ;
		JTextField jtf2 = new JTextField(4) ;
		
		
		
		JTextArea jta = new JTextArea(14, 27);
		jta.setLineWrap(true);
		jta.setEditable(false);
		JScrollPane jsp = new JScrollPane(jta,  //스크롤을 설치할 컴포넌트
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,   //세로 스크롤
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER) ;   //가로 스크롤
		
		JButton jb1 = new JButton("계산") ;
		JButton jb2 = new JButton("종료") ;
		JButton jb3 = new JButton("취소") ;
		
		
		
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

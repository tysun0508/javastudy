package com.hb.am;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Ex05_3 extends JPanel implements ActionListener {
	JPanel jp1 ;
	JButton jb1 ;
	CardLayout card ;
	public Ex05_3() {
		
	}
	
	public Ex05_3(CardLayout card) {
		setBackground(Color.BLUE);
		this.card = card ;
		jp1 = new JPanel() ;
		jb1 = new JButton("�ڷΰ���") ;
		jp1.add(jb1) ;
		
		add(jp1) ;
		
		jb1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		card.first(getParent());
		
	}
	
	
	
}

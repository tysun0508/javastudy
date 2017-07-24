package com.hb.am;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Ex05_1 extends JPanel implements ActionListener{
	JButton jb1, jb2 ;
	JPanel jp1 ;
	CardLayout card ;
	//Ex05_main test ;
	
	public Ex05_1() { }
	
	public Ex05_1(CardLayout card){
		//this.test = test ;
		this.card = card ;
		jp1 = new JPanel() ;
		
		jb1 = new JButton("ȸ������") ;
		jb2 = new JButton("�α���") ;
		
		jp1.add(jb1) ;
		jp1.add(jb2);
		add(jp1) ;
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton)(e.getSource()) ;
		
		if(jb==jb1){
			card.show(getParent(), "second");
		}else if(jb==jb2){
			card.show(getParent(), "third");
		}
		
	}

}

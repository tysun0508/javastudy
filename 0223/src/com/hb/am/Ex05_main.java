package com.hb.am;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex05_main extends JFrame {
	JPanel cards ;
	CardLayout card ;
	
	public Ex05_main() {
		setTitle("카드레이아웃2");
		card = new CardLayout() ;
		cards = new JPanel(card) ;
		
		//각 패널을 생성하고 cards에 넣는다.
		Ex05_1 first = new Ex05_1(card) ;
		Ex05_2 second = new Ex05_2(card) ;
		Ex05_3 third = new Ex05_3(card) ;
		
		
		cards.add(first, "first") ;
		cards.add(second, "second") ;
		cards.add(third, "third") ;
		
		add(cards) ;
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize() ;
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new Ex05_main();
	}

	
}

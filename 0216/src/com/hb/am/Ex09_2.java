package com.hb.am;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class Ex09_2 extends JPanel {

	public Ex09_2() {
		String[] items = {"좋아하는 운동", "축구", "야구", "농구","배구"} ;
		JComboBox jcb = new JComboBox(items) ;
		
		add(jcb) ;
		
		
	}
	@Override
	public void setBackground(Color arg0) {
		
		super.setBackground(arg0);
	}

}

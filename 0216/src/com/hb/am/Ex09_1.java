package com.hb.am;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class Ex09_1 extends JPanel {

	public Ex09_1() {
		JToggleButton jtb1 = new JToggleButton() ;
		jtb1.setText("�౸");
		
		JToggleButton jtb2 = new JToggleButton("�߱�");
		jtb2.setSelected(true);
		
		JToggleButton jtb3 = new JToggleButton("�豸", true);
		JToggleButton jtb4 = new JToggleButton("��");
		
		add(jtb1);
		add(jtb2);
		add(jtb3);
		add(jtb4);
		
		
	}
	@Override
	public void setBackground(Color arg0) {
		
		super.setBackground(arg0);
	}

}

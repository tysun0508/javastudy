package com.hb.am;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class Ex09_2 extends JPanel {

	public Ex09_2() {
		String[] items = {"�����ϴ� �", "�౸", "�߱�", "��","�豸"} ;
		JComboBox jcb = new JComboBox(items) ;
		
		add(jcb) ;
		
		
	}
	@Override
	public void setBackground(Color arg0) {
		
		super.setBackground(arg0);
	}

}

package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class Ex06 extends JFrame {
	
	public Ex06() {
			super("����Ʈ");
			JPanel jp = new JPanel() ;
			
			String[] items = {"�����ϴ� �", "�౸", "�߱�", "��","�豸"} ;
			JList jList = new JList(items) ;
			
			
			jp.add(jList) ;
			
			add(jp) ;
			
			//Ư���׸��� ���� ������ �ϴ� ���
			//jList.setSelectedIndex(2);
			
			Dimension ds =Toolkit.getDefaultToolkit().getScreenSize() ;
			setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			
	}
	
	public static void main(String[] args) {
		new Ex06();
	}
}

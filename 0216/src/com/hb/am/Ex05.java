	package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex05 extends JFrame {
	
	public Ex05() {
			super("�޺��ڽ�");
			JPanel jp = new JPanel() ;
			
			String[] items = {"�����ϴ� �", "�౸", "�߱�", "��","�豸"} ;
			JComboBox jcb = new JComboBox(items) ;
			
			jp.add(jcb) ;
			
			add(jp) ;
			
			//Ư���׸��� ���� ������ �ϴ� ���
			//jcb.setSelectedItem("�豸");
			//jcb.setSelectedIndex(2);
			
			Dimension ds =Toolkit.getDefaultToolkit().getScreenSize() ;
			setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			
	}
	
	public static void main(String[] args) {
		new Ex05();
	}
}

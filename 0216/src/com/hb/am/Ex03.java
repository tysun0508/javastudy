package com.hb.am;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class Ex03 extends JFrame {
	
	public Ex03() {
		setTitle("������ư") ;
		
		// �г� : �����̳�
		JPanel jp = new JPanel() ;
		
		//������ư�� �ݵ�� ��ư �׷쿡 �ҼӵǾ�� �Ѵ�
			ButtonGroup bg = new ButtonGroup() ;
		
		
		// ������Ʈ
		JRadioButton jrb1 = new JRadioButton("�߱�");
		JRadioButton jrb2 = new JRadioButton("�౸", true);
		JRadioButton jrb3 = new JRadioButton("�豸");
		JRadioButton jrb4 = new JRadioButton("��", true);
		
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		
		
		//������Ʈ�� �����̳ʿ��� ���δ�.
		jp.add(jrb1);
		jp.add(jrb2);
		jp.add(jrb3);
		jp.add(jrb4);
		
		
		
		//��輱 ����� : Border, createLineBorder
		//					 TitleBorder, createTitleBorder
		TitledBorder border = BorderFactory.createTitledBorder("�����ϴ� �") ;
		jp.setBorder(border);
		
		
		
		// �����̳ʸ� ������(�����̳�)�� ���δ�.
		add(jp) ;
		
		setSize(300, 300);
		setLocation(0, 0);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
			new Ex03();
	}
}

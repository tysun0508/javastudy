package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class Ex04 extends JFrame {
	public Ex04() {
		super("��۹�ư");
		
		JPanel jp = new JPanel() ;
		
		JToggleButton jtb1 = new JToggleButton() ;
		jtb1.setText("�౸");
		
		JToggleButton jtb2 = new JToggleButton("�߱�");
		jtb2.setSelected(true);
		
		JToggleButton jtb3 = new JToggleButton("�豸", true);
		JToggleButton jtb4 = new JToggleButton("��");
		
		jp.add(jtb1);
		jp.add(jtb2);
		jp.add(jtb3);
		jp.add(jtb4);
		
		add(jp);
		
		/*setSize(300, 300);
		setLocation(0, 0);
		setVisible(true);*/
		
		// â�� ȭ�� �߾ӿ� ����
		//ȭ�鿡 ũ�⸦ ������
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize() ;
		//setSize(300, 300);
		//setLocation(ds.width/2-150, ds.height/2-150);
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setVisible(true);
		setResizable(false);//ȭ��ũ������
		//�������� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		
	}
	public static void main(String[] args) {
		new Ex04();
	}
}

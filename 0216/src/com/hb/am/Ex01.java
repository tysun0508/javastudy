package com.hb.am;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex01 extends JFrame {
	
	public Ex01() {
		setTitle("üũ�ڽ�") ;
		
		// �г� : �����̳�
		JPanel jp = new JPanel() ;
		
		// ������Ʈ
		JCheckBox jcb1 = new JCheckBox() ;
		jcb1.setText("�߱�");
		JCheckBox jcb2 = new JCheckBox("�౸");
		JCheckBox jcb3 = new JCheckBox("�豸", true) ;
		JCheckBox jcb4 = new JCheckBox("��");
		
		//������Ʈ�� �����̳ʿ��� ���δ�.
		jp.add(jcb1);
		jp.add(jcb2);
		jp.add(jcb3);
		jp.add(jcb4);
		
		// �����̳ʸ� ������(�����̳�)�� ���δ�.
		add(jp) ;
		
		setSize(300, 300);
		setLocation(0, 0);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
			new Ex01();
	}
}

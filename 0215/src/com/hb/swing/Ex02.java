	package com.hb.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex02 {
	public static void main(String[] args) {
		JFrame jf = new JFrame("��ư ������Ʈ2") ;
			
		//������Ʈ
		JButton jb1 = new JButton("ù��°");
		JButton jb2 = new JButton("�ι�°");
		JButton jb3 = new JButton("����°");
		JButton jb4 = new JButton("�׹�°");
		JButton jb5 = new JButton("�ټ���°");
		
		//�����̳�
		JPanel jp = new JPanel();
		
		//������Ʈ�� �����̳ʿ��� ����
		jp.add(jb1) ;
		jp.add(jb2) ;
		jp.add(jb3) ;
		jp.add(jb4) ;
		jp.add(jb5) ;	
		
		//������Ʈ�� ���� �����̳ʸ� �����̳�(������)�� ���δ�
		jf.add(jp) ;
		
		jf.setSize(300, 300);
		jf.setLocation(0, 0) ;
		jf.setVisible(true);
	}


}

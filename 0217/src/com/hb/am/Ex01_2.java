package com.hb.am;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// ������Ʈ�� ȭ�鿡 ��ġ�ϴ� ��� => Layout
// Layout ���� => ��ġ������ (Layout Manager)
// ��ġ�ϴ� ��� : 
// FlowLayout : ��� �߾� ���� ��ġ ex) JPanel
// BorderLaout : ��, ��, ��, ��, �߾� ��ġ
//					 ��, ��, ��, ��, �߾��� ǥ������ ������ ������ ������Ʈ�� ȭ���� ä���. ex) JFrame
// GridLayout : ��������
// BoxLayout => �ϳ��� ��, �ϳ��� ���� �����.
// ������ǥ => ������Ʈ���� ��ǥ�� �����ؼ� ��ġ�ϴ� ���
// CardLayout : �������� ī�带 �׾Ƶ� �� �ϳ��� �����ִ� ����
//				    �������� �ִٰ� �̺�Ʈ�� �߻��ϸ� �ϳ��� �����ִ� ����
public class Ex01_2 extends JFrame {
	
	public Ex01_2() {
		setTitle("FlowLayout");
		//JPanel�� ��ġ������(FlowLayout)�� �̿��ؼ� �������İ� ������ ������ �غ���
		JPanel jp = new JPanel() ;
		jp.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10)) ;
		
		JButton jb1 = new JButton("��ư1") ;
		JButton jb2 = new JButton("��ư2") ;
		JButton jb3 = new JButton("��ư3") ;
		JButton jb4 = new JButton("��ư4") ;
		JButton jb5 = new JButton("��ư5") ;
		JButton jb6 = new JButton("��ư6") ;
		
		// JPanel�� ��ġ�����ڴ� Ư���� �������� ������
		// FlowLayout���� ��� �߾ӿ� ������Ʈ���� ��ġ�Ѵ�
		jp.add(jb1) ;
		jp.add(jb2) ;
		jp.add(jb3) ;
		jp.add(jb4) ;
		jp.add(jb5) ;
		jp.add(jb6) ;
		
		// JFrame �� ��ġ�����ڴ� Ư���� �������� ������
		//  BorderLayout �ε� ���� BorderLayout�� ��, ��, ��, ��, �߾��� ������ 
		//  �����ؼ� ������Ʈ �����̳ʸ� ��ġ�ϴµ� 
		//  ������ �������� ������ ������ ������Ʈ�� �����̳ʸ� ȭ����ü�� ��ġ�Ѵ�.
		add(jp) ;
		setLayout(new FlowLayout()) ;
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize() ;
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new Ex01_2() ;
	}
}

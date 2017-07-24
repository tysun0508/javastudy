	package com.hb.am;

import java.awt.BorderLayout;
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
public class Ex01_3 extends JFrame {
	
	public Ex01_3() {
		setTitle("FlowLayout");
		
		// JFrame�� ������ BorderLayout �ε� FlowLayout���� ����
		//setLayout(new FlowLayout());
		
		
		
		JButton jb1 = new JButton("��ư1") ;
		JButton jb2 = new JButton("��ư2") ;
		JButton jb3 = new JButton("��ư3") ;
		JButton jb4 = new JButton("��ư4") ;
		JButton jb5 = new JButton("��ư5") ;
		//JButton jb6 = new JButton("��ư6") ;
		
		// JPanel�� ��ġ�����ڴ� Ư���� �������� ������
		// FlowLayout���� ��� �߾ӿ� ������Ʈ���� ��ġ�Ѵ�
		
		// BorderLayout�� ���� 5������ ������ �� �ִ�.
		add(jb1, BorderLayout.EAST) ;
		add(jb2, BorderLayout.WEST) ;
		add(jb3, BorderLayout.SOUTH) ;
		add(jb4, BorderLayout.NORTH) ;		
		add("Center", jb5) ;
		//add(jb6) ;
		
		// JFrame �� ��ġ�����ڴ� Ư���� �������� ������
		//  BorderLayout �ε� ���� BorderLayout�� ��, ��, ��, ��, �߾��� ������ 
		//  �����ؼ� ������Ʈ �����̳ʸ� ��ġ�ϴµ� 
		//  ������ �������� ������ ������ ������Ʈ�� �����̳ʸ� ȭ����ü�� ��ġ�Ѵ�.
		//add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize() ;
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new Ex01_3() ;
	}
}

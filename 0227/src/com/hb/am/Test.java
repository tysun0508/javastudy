package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JFrame {
	JPanel jp1 ;
	JButton jb1, jb2, jb3 ;
	
	public Test() {
		setTitle("����Ŭ��������");
		jp1 = new JPanel();
		jb1 = new JButton("Ȯ��");
		jb2 = new JButton("���");
		jb3 = new JButton("����");
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		add(jp1) ;
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb1.addActionListener(new EventTest1());
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("���Ŭ��");
				
			}
		});
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("���� Ŭ��");
			}
		});
		
	}
	
	
	public static void main(String[] args) {
		new Test();
	}
	
	class EventTest1 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {	
			System.out.println("Ȯ�� Ŭ��");
			
		}
		
	}
	
}






















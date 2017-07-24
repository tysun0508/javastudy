package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex04_1 extends JFrame {
	
	JPanel jp1 ;
	CanvasTest ct = new CanvasTest();
	ButtonGroup bg ;
	JRadioButton jrb1, jrb2 ;
	Toolkit toolkit = getToolkit() ;
	Image img ;	
	public Ex04_1() {
		setTitle("������ư1");
		
		jp1 = new JPanel();
		
		bg = new ButtonGroup();
		jrb1 = new JRadioButton("�׸�1");
		jrb2 = new JRadioButton("�׸�2");
		
		bg.add(jrb1);
		bg.add(jrb2);
		jp1.add(jrb1);
		jp1.add(jrb2);
		
		add(jp1, BorderLayout.NORTH);
		add(ct, BorderLayout.CENTER);
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 // â ũ�⸦ �����̸� �ٽ� �׷�����.
		 setResizable(false);
		 setVisible(true);
		 
		 jrb1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==e.SELECTED){
					img = toolkit.getImage("src/img/image1.gif");
				}
				
			}
		});
		 
		 jrb2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==e.SELECTED){
					img = toolkit.getImage("src/img/image2.gif");
				}
				
			}
		});
	}
	
	private class CanvasTest extends JPanel{
		@Override
		public void paint(Graphics g) {
			g.clearRect(0, 0, getWidth(), getHeight());
			g.drawImage(img, getWidth()/2-50, getHeight()/2-50,100,100, this);
			// �׸��� �ٽ� �׸���
			repaint();
		}
	}
	public static void main(String[] args) {
		new Ex04_1();
	}
}

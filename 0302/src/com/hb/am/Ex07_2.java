package com.hb.am;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex07_2 extends JFrame {
	Ex07_can can = new Ex07_can();
	Toolkit toolkit = getToolkit();
	int x=-30; int y=-30; int wh=30;
	
	public Ex07_2() {
		setTitle("Canvas 연습");
		
		add(can);
		
		Dimension ds = toolkit.getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		can.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			//클릭한 위치값
			can.x=e.getX();
			can.y=e.getY();
			can.repaint();
		}
					
		});
		
	}
	
	public static void main(String[] args) {
		new Ex07_2();
	}
}

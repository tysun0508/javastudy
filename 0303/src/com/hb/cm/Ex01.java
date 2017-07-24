package com.hb.cm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex01 extends JFrame {
	JPanel jp ;
	JButton jb ;
	Toolkit toolkit = getToolkit();
	CanvasTest ct = new CanvasTest() ;
	int x ;
	public Ex01() {
		setTitle("°ø³îÀÌ1");
		jp = new JPanel();
		
		jb= new JButton("¡æ");
		
		jp.add(jb);
		
		add(jp, BorderLayout.NORTH);
		add(ct, BorderLayout.CENTER);
		
		Dimension ds = toolkit.getScreenSize();
		setBounds(ds.width/2-350, ds.height/2-300, 700, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				while(x < ct.getWidth()-30){
					x +=1 ;
					ct.repaint();
				}
				
			}
		});
	}
	
	private class CanvasTest extends JPanel{
		@Override
		public void paint(Graphics g) {
			g.clearRect(0, 0, getWidth(), getHeight());
			Color color = new Color((int)(Math.random()*255), (int)(Math.random()*255),(int)(Math.random()*255));
			g.setColor(color);
			g.fillOval(x, 50, 30, 30);
		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}

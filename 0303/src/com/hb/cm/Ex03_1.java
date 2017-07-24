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

public class Ex03_1 extends JFrame {
	JPanel jp ;
	JButton jb1, jb2 ;
	Toolkit toolkit = getToolkit();
	CanvasTest ct = new CanvasTest();
	int x;
	int y;
	
	public Ex03_1() {
		setTitle("°ø³îÀÌ2");
		jp = new JPanel();
		
		jb1 = new JButton("¡æ");
		jb2 = new JButton("¡é");
		
		jp.add(jb1);
		jp.add(jb2);
		
		add(jp, BorderLayout.NORTH);
		add(ct, BorderLayout.CENTER);
		
		Dimension ds = toolkit.getScreenSize();
		setBounds(ds.width/2-350, ds.height/2-300, 700, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable() {
					
					class Task extends Thread{
						String s ;
						public Task(){}
						public Task(String s){
							this.s = s ;
						}
					}
					
					
					@Override
					public void run() {
						
						
					}
				}).start();
				
			}
		});
		
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
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
			g.fillOval(650, y, 30, 30);
		}
	}
	
	public static void main(String[] args) {
		new Ex03_1();
	}
}
	
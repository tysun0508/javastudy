package com.hb.am;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.plaf.basic.BasicLabelUI;

public class Ex11 extends JFrame {
	
	int x = 0 ; 
	int y = 0 ; 
	int wh = 30 ;
	
	CanvasTest ct = new CanvasTest();
	Toolkit toolkit = getToolkit();
	boolean bRight = true ; // 좌우
	boolean bDown = true ; //상하
	int ball_speed =10; // 0.01 타머 간격
	int ball_gan = 5 ; // 이동간격
	
	public Ex11() {
		
		setTitle("공놀이");
		
		add(ct);
		Dimension ds = toolkit.getScreenSize();
		setBounds(ds.width/2-200, ds.height/2-300, 400, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		Timer timer = new Timer(ball_speed, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//x +=ball_gan;
				//y +=ball_gan;
				ct.repaint();
				
				//좌우
				if(bRight){
					x += ball_gan;
				}else{
					x -= ball_gan;
				}
				
				//왼쪽 벽 
				if(x<0) bRight = true ;
				
				//오른쪽 벽
				if(x+30 > 400) bRight = false;
				
				// 상하
				if(bDown){
					y += ball_gan;
				}else{
					y -= ball_gan;
				}
				// 왼쪽벽
				if(y<0) bDown = true ;
				// 오른쪽 벽
				if(y+30 > 600) bDown = false;
				ct.repaint();
			}
						
		});
		timer.start();
	}
	
	
	private class CanvasTest extends JPanel{
		@Override
		public void paint(Graphics g) {
			g.clearRect(0, 0, getWidth(), getHeight());
			Color color = new Color((int)(Math.random()*255), (int)(Math.random()*255),(int)(Math.random()*255));
			g.setColor(color);
			g.fillOval(x, y, wh, wh);
		}
	}
	
	public static void main(String[] args) {
		new Ex11();
	}
}

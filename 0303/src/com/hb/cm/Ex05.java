package com.hb.cm;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Ex05 extends JFrame{
	JPanel jp;
	JButton jb;
	JProgressBar jpb1, jpb2 ;
	int cnt1;
	int cnt2;
	public Ex05() {
		setTitle("Progress Bar 2");
		jp = new JPanel();
		
		jb = new JButton("Ω√¿€");
		
		jpb1 = new JProgressBar();
		jpb2 = new JProgressBar();
		
		jp.add(jb);
		jp.add(jpb1);
		jp.add(jpb2);
		
		add(jp);
		
		pack();
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize() ;
		setBounds(ds.width/2-200, ds.height/2-50, 400, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true) ;
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						cnt1 = 0;
						while(cnt1<=jpb1.getMaximum()){
							cnt1 = cnt1 + (int)(Math.random()*10);
							try {
								Thread.sleep(300);
							} catch (InterruptedException e) {
								
								e.printStackTrace();
							}
							jpb1.setValue(cnt1);
						}
						
					}
				}).start();
				
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						cnt2 = 0;
						while(cnt2<=jpb2.getMaximum()){
							cnt2 = cnt2 + (int)(Math.random()*10);
							try {
								Thread.sleep(300);
							} catch (InterruptedException e) {
								
								e.printStackTrace();
							}
							jpb2.setValue(cnt2);
						}
						
					}
				}).start();
			}
		});
		
	}
	
	public static void main(String[] args) {
		new Ex05();
	}
}

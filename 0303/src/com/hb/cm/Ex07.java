package com.hb.cm;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex07 extends JFrame{
	JPanel jp;
	JButton jb;
	Toolkit toolkit = getToolkit();
	Canvas canvas ;
	// 공들의 집합소
	ArrayList<Ex08> list ;
	public Ex07() {
		setTitle("공내리기");
		
		list = new ArrayList<>();
		
		jp = new JPanel();
		
		jb = new JButton("↓");
		
		jp.add(jb);
		
		add(jp, BorderLayout.NORTH);
		add(canvas = new Canvas(){
			@Override
			public void paint(Graphics g) {
				// list에 있는 공을 출력하기
				for(int i=0; i<list.size(); i++){
						Ex08 k = list.get(i);
					Color color = new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
					g.setColor(color);
					g.fillOval(k.x, k.y, 30, 30);
				}
				
			}
		},BorderLayout.CENTER);
		
		Dimension ds = toolkit.getScreenSize();
		setBounds(ds.width/2-300, ds.height/2-300, 600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼을 누르면 공을 생성
				// 각각의 공은 객체이다. => list에 저장시킨다.
				// 내부클래스 타입은 this를 사용못함.
				Ex08 k = new Ex08(Ex07.this);
				k.x = (int)(Math.random()*canvas.getWidth())-30;
				list.add(k);
				k.start();
				
			}
		});
		
	}

	public static void main(String[] args) {
		new Ex07();
	}
}

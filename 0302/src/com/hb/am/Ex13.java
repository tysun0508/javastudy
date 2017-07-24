package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex13 extends JFrame {
	JPanel jp;
	JButton jb;
	Image[] image = new Image[45];
	Toolkit toolkit = getToolkit();
	//Set<Integer> set = new HashSet<>();
	CanvasTest ct = new CanvasTest();
	int[] su = new int[6];
	public Ex13() {
		setTitle("�ζ�2");
		jp = new JPanel();
		jb = new JButton("��ȣ ����");
		jp.add(jb);

		add(jp, BorderLayout.EAST);
		add(ct, BorderLayout.CENTER);

		setBounds(100, 100, 850, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ct.repaint();
				
			}
			
		});
		
		
	}

	private class CanvasTest extends Canvas {
		public CanvasTest() {
			// �̹��� �ֱ�
			for (int i = 0; i < image.length; i++) {
				image[i] = toolkit.getImage("src/imagesLotto/"+(i+1)+".gif");
			}
		}
		@Override
		public void paint(Graphics g) {
			// ���ڸ� ���� ��
			for (int i = 0; i < su.length; i++) {
				su[i] = ((int)(Math.random()*45)+1);
				for(int j=0; j<i; j++){
					if(su[i]==su[j]){
						i--;
						break;
					}
						
				}
			}
			// ���ڸ� �׸����� �ٲٱ�
			for(int i=0; i<6; i++){
				g.drawImage(image[su[i]-1], (i*120), 25, this);
			}
		}
	}
	public static void main(String[] args) {
		new Ex13();
	}

}

	package com.hb.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex02 {
	public static void main(String[] args) {
		JFrame jf = new JFrame("버튼 컴포넌트2") ;
			
		//컴포넌트
		JButton jb1 = new JButton("첫번째");
		JButton jb2 = new JButton("두번째");
		JButton jb3 = new JButton("세번째");
		JButton jb4 = new JButton("네번째");
		JButton jb5 = new JButton("다섯번째");
		
		//컨테이너
		JPanel jp = new JPanel();
		
		//컴포넌트를 컨테이너에게 붙임
		jp.add(jb1) ;
		jp.add(jb2) ;
		jp.add(jb3) ;
		jp.add(jb4) ;
		jp.add(jb5) ;	
		
		//컴포넌트를 가진 컨테이너를 컨테이너(프레임)에 붙인다
		jf.add(jp) ;
		
		jf.setSize(300, 300);
		jf.setLocation(0, 0) ;
		jf.setVisible(true);
	}


}

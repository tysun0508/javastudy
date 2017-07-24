package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex06_main extends JFrame implements ActionListener {
	JPanel jp1 ;
	JButton jb1, jb2 ;
	String name ="태양" ;
	public Ex06_main() {
		jp1 = new JPanel() ;
		
		jb1 = new JButton("회원가입") ;
		jb2 = new JButton("로그인") ;
		
		jp1.add(jb1);
		jp1.add(jb2);
		
		add(jp1);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize() ;
		setBounds(ds.width/2-200, ds.height/2-150, 400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
	
	}
	public static void main(String[] args) {
		new Ex06_main() ;
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton)(e.getSource()) ;
		
		if(jb==jb1){
			new Ex06_1() ;
		}else if(jb==jb2){
			new Ex06_2(name) ;
		}
		
	}

}
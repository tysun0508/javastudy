package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Ex03 extends JFrame implements KeyListener {
	JTextArea jta ;
	JScrollPane jsp ;
	
	public Ex03() {
		setTitle("키 이벤트") ;
		jta = new JTextArea() ;
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);
		
		add(jsp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize() ;
		setBounds(ds.width/2-200, ds.height/2-150, 400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true) ;
		
		jta.addKeyListener(this);
		
	}
	
	public static void main(String[] args) {
		new Ex03() ;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==e.VK_LEFT){
			jta.append(" ← \n");
		}else if(e.getKeyCode()==e.VK_RIGHT){
			jta.append(" → \n");
		}else if(e.getKeyCode()==e.VK_UP){
			jta.append(" ↑ \n");
		}else if(e.getKeyCode()==e.VK_DOWN){
			jta.append(" ↓ \n");
		}
			
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
}

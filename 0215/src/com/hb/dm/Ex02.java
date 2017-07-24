package com.hb.dm;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;



public class Ex02 extends JFrame implements WindowListener {

	public Ex02() {
		setTitle("세번째 연습");
		setSize(300, 300);
		setLocation(0, 0);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new Ex02() ;
	}
	
	@Override
	public void windowActivated(WindowEvent e) {

		
	}

	@Override
	public void windowClosed(WindowEvent e) {

		
	}

	@Override
	public void windowClosing(WindowEvent e) {
	
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	
		
	}

	@Override
	public void windowIconified(WindowEvent e) {

		
	}

	@Override
	public void windowOpened(WindowEvent e) {
	
		
	}

}

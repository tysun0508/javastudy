package com.hb.bm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.ScrollPane;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex04 extends JFrame {
	
	JPanel jp;
	JTextField jtf;
	JTextArea jta;
	JButton jb;
	JScrollPane jsp;
	FileReader fr;
	BufferedReader br;
	String msg ;
	public Ex04() {
		
		setTitle("파일읽기");
		
		jp = new JPanel();
		jtf = new JTextField(25);
		jta = new JTextArea(40,50);
		jb = new JButton("열기");
		jsp = new JScrollPane(jta, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jp.add(new Label("파일경로"));
		jp.add(jtf);
		jp.add(jb);
		
		add(jp, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-300, ds.height/2-300, 600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				prn();
				
			}
		});
		
		jtf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				prn();
				
			}
		});
	}
	public void prn(){	
		
		try {
			fr = new FileReader(jtf.getText().trim());
			br = new BufferedReader(fr);
			
			while((msg=br.readLine()) != null){
				jta.append(msg + "\n");
			}
		} catch (Exception e) {
			
		}finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				
			}
		}
	}
	
	
	public static void main(String[] args) {
		new Ex04();
	}
}






















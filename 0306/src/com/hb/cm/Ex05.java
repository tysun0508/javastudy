package com.hb.cm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.ScrollPane;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex05 extends JFrame {
	
	JPanel jp;
	JTextField jtf;
	JTextArea jta;
	JButton jb;
	JScrollPane jsp;
	public Ex05() {
		
		setTitle("���ϰ��");
		
		jp = new JPanel();
		jtf = new JTextField(25);
		jta = new JTextArea(40,50);
		jb = new JButton("����");
		jsp = new JScrollPane(jta, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jp.add(new Label("���ϰ��"));
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
		FileInputStream fis = null;
		File file = new File(jtf.getText().trim());
		int size = (int)file.length();
		byte[] b = new byte[size];
		
		try {
			fis = new FileInputStream(file);
			fis.read(b);
			jta.append(new String(b).trim());
			jtf.setText("");
		} catch (Exception e) {
			
		}finally {
			try {
				fis.close();
			} catch (Exception e2) {
				
			}
		}
	}
	
	
	public static void main(String[] args) {
		new Ex05();
	}
}






















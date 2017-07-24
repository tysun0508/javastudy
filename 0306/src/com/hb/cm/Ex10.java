package com.hb.cm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex10 extends JFrame {
	
	JPanel jp1;
	JButton jb1, jb2;
	FileInputStream fis = null;
	FileOutputStream fos = null;
	byte[] b = null;
	public Ex10() {
		setTitle("�����ϱ�");
		
		jp1 = new JPanel();
		
		jb1 = new JButton("�ҷ�����");
		jb2 = new JButton("�����ϱ�");
		
		
		jp1.add(jb1);	
		jp1.add(jb2);
		
		
		add(jp1);
		
		
		 setBounds(100, 100, 200, 65);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setResizable(false);
		 setVisible(true);
		
		// ������ ����
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileDialog fd = new FileDialog((Frame) getParent(), "�ҷ�����", FileDialog.LOAD);
				fd.setVisible(true);
				try {
					fis = new FileInputStream(fd.getDirectory()+fd.getFile());
					File f = new File(fd.getDirectory()+fd.getFile());
					int size = (int)f.length();
					b = new byte[size];
					fis.read(b);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		// ������ ���� ���� ����
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileDialog fd = new FileDialog((Frame) getParent(), "�����ϱ�", FileDialog.SAVE);
				fd.setVisible(true);
				try {
					fos = new FileOutputStream(fd.getDirectory()+fd.getFile());
					fos.write(b);
					fos.flush();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
	}
	
	public static void main(String[] args) {
		new Ex10();
	}
}

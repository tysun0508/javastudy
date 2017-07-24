package com.hb.cm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex11 extends JFrame{
	
	JPanel jp1, jp2;
	JButton jb1;
	JTextField jtf1, jtf2;
	FileInputStream fis = null;
	FileOutputStream fos = null;
	
	public Ex11() {
		setTitle("�����ϱ�");
		jp1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		jtf1 = new JTextField(15);
		jtf2 = new JTextField(15);
		
		jb1 = new JButton("����");
		
		jp1.add(new JLabel("������ġ : "));
		jp1.add(jtf1);
		jp2.add(new JLabel("�纻��ġ : "));
		jp2.add(jtf2);
		jp2.add(jb1);
		
		setLayout(new GridLayout(2,1));
		add(jp1);
		add(jp2);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-160, ds.height/2-50, 320, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String input = jtf1.getText().trim();
				String output = jtf2.getText().trim();
				int b= 0;
				try {
					fis = new FileInputStream(input);
					fos = new FileOutputStream(output);
					while((b=fis.read()) != -1){
						fos.write(b);
						fos.flush();
					}
					jtf1.setText("");
					jtf2.setText("");
				} catch (Exception e2) {
					// TODO: handle exception
				} finally {
					try {
						
					} catch (Exception e3) {
						// TODO: handle exception
					}
				}
				
			}
		});
	}
	
	public static void main(String[] args) {
		new Ex11();
	}
}

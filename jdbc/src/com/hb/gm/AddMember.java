package com.hb.gm;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.ScrollPaneLayout;

public class AddMember extends JFrame{
	JPanel jp1, jp2, jp3, jp4, jp5, jp6,jp7,jp8;
	JPanel bg1, bg2, bg3, bg4;
	JTextField t_id, t_pw, t_name, t_subject;
	JTextArea t_content;
	JScrollPane jsp;
	JButton jb1, jb2, jb3, jb4;
	
	boolean id_success = false;
	
	// ���ε�
	FileInputStream fis ;
	BufferedInputStream bis;
	FileOutputStream fos;
	BufferedOutputStream bos;
	int b;
	String path;
	String filename;
	
	// DB
	Connection conn;
	PreparedStatement ptmt;
	ResultSet rs ;
	
	public AddMember() {
		setTitle("ȸ������â");
		jp1 = new JPanel();
		jp2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp6 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp7 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		jp8 = new JPanel(new FlowLayout(FlowLayout.CENTER));

		bg1 = new JPanel(new GridLayout(4, 1));
		bg2 = new JPanel(new BorderLayout());
		bg3 = new JPanel(new BorderLayout());
		bg4 = new JPanel(new BorderLayout());
		
		t_id = new JTextField(15);
		t_pw = new JTextField(15);
		t_name = new JTextField(15);
		t_subject = new JTextField(15);
		
		jb1 = new JButton("÷������");
		jb2 = new JButton("ȸ������");
		jb3 = new JButton("���");
		jb4 = new JButton("�ߺ��˻�");
		
		jp1.add(new JLabel("ȸ������â"));
		
		jp2.add(new JLabel("I D : "));
		jp2.add(t_id);
		jp2.add(jb4);
		
		jp3.add(new JLabel("P W : "));
		jp3.add(t_pw);
		jp4.add(new JLabel("NAME : "));
		jp4.add(t_name);
		jp5.add(new JLabel("SUBJECT : "));
		jp5.add(t_subject);
		jp6.add(new JLabel("CONTENT"));
		t_content = new JTextArea();
		t_content.setLineWrap(true);
		jsp = new JScrollPane(t_content,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		jp7.add(new JLabel("ATTACH : "));
		jp7.add(jb1);
		jp8.add(jb2);
		jp8.add(jb3);
	   	
		bg1.add(jp2);
		bg1.add(jp3);
		bg1.add(jp4);
		bg1.add(jp5);
		
		bg2.add(jp6,BorderLayout.NORTH);
		bg2.add(jsp,BorderLayout.CENTER);
		bg2.add(jp7,BorderLayout.SOUTH);
		
		bg3.add(jp8);
		
		bg4.add(bg1,BorderLayout.NORTH);
		bg4.add(bg2,BorderLayout.CENTER);
		bg4.add(bg3,BorderLayout.SOUTH);
		add(jp1,BorderLayout.NORTH);
		add(bg4,BorderLayout.CENTER);
		
		setBounds(100, 100, 400, 600);
		setResizable(false);
		setVisible(true);
		// ÷��
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FileDialog fd 
				= new FileDialog((Frame) getParent(), "���ε�", FileDialog.LOAD);
				fd.setVisible(true);
				
				filename = fd.getFile().trim();
				// ���ε��� ������ ��ġ
				path = fd.getDirectory()+fd.getFile();
			}
		});
		//ȸ������
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(id_success){
					try {
						connet();
						String sql = "insert into testmember2 values(testmember2_seq.nextval,?,?,?,?,?,?)";
						ptmt = conn.prepareStatement(sql);
						ptmt.setString(1, t_id.getText().trim());
						ptmt.setString(2, t_pw.getText().trim());
						ptmt.setString(3, t_name.getText().trim());
						ptmt.setString(4, t_subject.getText().trim());
						ptmt.setString(5, t_content.getText().trim());
						ptmt.setString(6, filename);
						int res = ptmt.executeUpdate();
						if(res>0){
							if(filename==null){
								JOptionPane.showMessageDialog(getParent(), "���Ͼ��ε��ϼ���");
							}else{
							   // ���� ���ε�
							  // ���̵�� ���� �����
							  File file = new File("c:/util/testmember/"+t_id.getText().trim());
							  file.mkdirs();
							  // ������ġ �� �̸�
							  String savepath = file+"/"+filename;
							  
							  fis = new FileInputStream(path);
							  bis = new BufferedInputStream(fis);
							  fos = new FileOutputStream(savepath);
							  bos = new BufferedOutputStream(fos);
							  
							  while((b=bis.read()) != -1){
								    bos.write(b);
								    bos.flush();
							  }
							  JOptionPane.showMessageDialog(getParent(), "���Լ���");
							}
						}else{
							JOptionPane.showMessageDialog(getParent(), "���Խ���1");
						}
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(getParent(), "���Խ���2");
					} finally {
						try {
							rs.close();
							ptmt.close();
							conn.close();
						} catch (Exception e3) {
						}
					}
				}else{
					JOptionPane.showMessageDialog(getParent(), "�ߺ��˻��ϼ���");
				}
			}
		});
		// ���
		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				t_id.setText("");
				t_pw.setText("");
				t_name.setText("");
				t_subject.setText("");
				t_content.setText("");
			}
		});
		// �ߺ��˻�
		jb4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String u_id = t_id.getText().trim();
				if(u_id.length()>0){
					try{
						connet();
						String sql ="select * from testmember2 where id = ? ";
						ptmt = conn.prepareStatement(sql);
						ptmt.setString(1, u_id);
						rs = ptmt.executeQuery();
						boolean res = rs.next();
						if(res){ // �ִ�.
							JOptionPane.showMessageDialog(getParent(), "������� ���̵�");
							t_id.setText("");
							t_id.requestFocus();
						}else{ // ����.
							JOptionPane.showMessageDialog(getParent(), "��밡���� ���̵�");
							id_success = true;
						}
					}catch (Exception e2) {
					}finally {
						try {
							rs.close();
							ptmt.close();
							conn.close();
						} catch (Exception e2) {
						}
					}
				}else{
					JOptionPane.showMessageDialog(getParent(), "���̵� �Է�");
					t_id.requestFocus();
				}
			}
		});
	}
	public void connet(){
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "1111";
			conn =  DriverManager.getConnection(url, user, password);
		}catch (Exception e) {
		}
	}
}

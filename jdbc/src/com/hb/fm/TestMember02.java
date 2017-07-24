package com.hb.fm;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TestMember02 extends JFrame {
	
	JPanel pNorth, pCenter,pSouth, jp1, jp2, jp3, jp4;
	JButton jb1, jb2, jb3;
	JTextField tid, tphone;
	JPasswordField tpassword1, tpassword2;
	
	Connection conn;
	PreparedStatement ptmt ;
	ResultSet rs;
	
	boolean id_chk = true;
	boolean id_success = false;
	
	public TestMember02() {
		
		setTitle("ȸ������");
		pNorth = new JPanel();
		pCenter = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pSouth = new JPanel();
		jp1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		// button����
		jb1 = new JButton("ȸ������");
		jb2 = new JButton("���");
		jb3 = new JButton("�ߺ�Ȯ��");

		// textfield����
		tid = new JTextField(15);
		tpassword1 = new JPasswordField(15);
		tpassword2 = new JPasswordField(15);
		tphone = new JTextField(15);
		
		pNorth.add(new JLabel("ȸ������"));
		
		jp1.add(new JLabel("���̵�            "));
		jp1.add(tid);
		jp1.add(jb3);

		jp2.add(new JLabel("��й�ȣ        "));
		jp2.add(tpassword1);

		jp3.add(new JLabel("��й�ȣȮ��"));
		jp3.add(tpassword2);

		jp4.add(new JLabel("��ȭ��ȣ        "));
		jp4.add(tphone);

		pCenter.add(jp1);
		pCenter.add(jp2);
		pCenter.add(jp3);
		pCenter.add(jp4);

		pSouth.add(jb1);
		pSouth.add(jb2);
		
		add(pNorth,BorderLayout.NORTH);
		add(pCenter,BorderLayout.CENTER);
		add(pSouth,BorderLayout.SOUTH);
		
		setBounds(300, 300, 400, 270);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		// �ߺ�Ȯ��
		jb3.addActionListener(new ActionListener() { 
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String u_id = tid.getText().trim();
				if(u_id.length()>0){
					try {
						connet();
						String sql = "select * from testMember where id = ?";
						ptmt  = conn.prepareStatement(sql);
						ptmt.setString(1, u_id);
						rs = ptmt.executeQuery();
						boolean res = rs.next();
						if(res){ // �ִ�.
							JOptionPane.showMessageDialog(getParent(), "���̵� �����մϴ�");
							tid.setText("");
							tid.requestFocus(); // Ŀ�� ���ٳ���
							id_chk = false;
						}else{ // ����.
							JOptionPane.showMessageDialog(getParent(), "��밡���� ���̵��Դϴ�");
							id_success = true;
						}
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}else{
					JOptionPane.showMessageDialog(getParent(), "���̵� �Է��ϼ���");
				}
			}
		});
		// ���
		jb2.addActionListener(new ActionListener() { 
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tid.setText("");
				tpassword1.setText("");
				tpassword2.setText("");
				tphone.setText("");
				tid.requestFocus();
				
			}
		});
		// ȸ������
		jb1.addActionListener(new ActionListener() { 
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(id_success){
					//����˻�
					String p1 = new String(tpassword1.getPassword()).trim();
					String p2 = new String(tpassword2.getPassword()).trim();
					if(p1.equals(p2)){
						try {
							connet();
							String sql = "insert into testMember values(testmember_seq.nextval, ?, ?, ?)";
							ptmt = conn.prepareStatement(sql);
							ptmt.setString(1, tid.getText().trim());
							ptmt.setString(2, p1);
							ptmt.setString(3, tphone.getText().trim());
							int su = ptmt.executeUpdate();
							if(su>0){
								JOptionPane.showMessageDialog(getParent(), "���强��");
								
							}else{
								JOptionPane.showMessageDialog(getParent(), "�������");
							}
							id_success = false;
							tid.setText("");
							tpassword1.setText("");
							tpassword2.setText("");
							tphone.setText("");
						} catch (Exception e2) {
							// TODO: handle exception
						}
						
					}else{
						JOptionPane.showMessageDialog(getParent(), "��й�ȣ�� �ٸ��ϴ�");
						tpassword1.setText("");
						tpassword2.setText("");
						tpassword1.requestFocus();
					}
				}else{
					id_chk = true;
					JOptionPane.showMessageDialog(getParent(), "���̵�üũ ����");
					tid.requestFocus();
				}
				
			}
		});
		
	}
	
	public void connet(){
		try {
			// 1. JDBC ����̹� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			// 2. DB ����
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		new TestMember02();
	}
}

package com.hb.fm;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TestMember extends JFrame {
	
	JPanel pNorth, pCenter,pSouth, jp1, jp2, jp3, jp4, jp5;
	JButton jb1, jb2, jb3;
	JTextField tid, tphone;
	JPasswordField tpassword1, tpassword2;
	
	String path;
	File file;
	FileInputStream fis;
	FileOutputStream fos;
	ObjectInputStream ois;
	ObjectOutputStream oos;
	
	boolean id_chk = true;
	boolean id_success = false;
	
	public TestMember() {
		
		setTitle("ȸ������");
		pNorth = new JPanel();
		pCenter = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pSouth = new JPanel();
		jp1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
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
		
		// 1. VOŬ������ �̿��ؼ� ArrayListó��
		ArrayList<TestMemberVO> list = new ArrayList<>();
		
		// ����ȭ
		try {
			file = new File("c:/util/testmember.txt");
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(list);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				oos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
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
		
		// �ߺ�Ȯ��
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ����� ���̵� ��������
				String u_id = tid.getText().trim();
				if(u_id.length()>0){
					try {
						fis = new FileInputStream(file);
						ois = new ObjectInputStream(fis);
						ArrayList<TestMemberVO> list = (ArrayList<TestMemberVO>)ois.readObject();
						
						// list Ȯ�� ������ ������ ������ ����
						if(list==null || list.size()==0){						
							id_success = true;
						}
							
						
				
						// �ڷᰡ ������ 
						for(TestMemberVO k : list){
							// ���� ���̵� �����ϸ�
							if(k.getId().equals(u_id)){
								JOptionPane.showMessageDialog(getParent(), "������� ���̵��Դϴ�");
								tid.setText("");
								tid.requestFocus();
								id_chk = false;
								break;
							}
															
						}
						if(id_chk){
							JOptionPane.showMessageDialog(getParent(), "��밡�ɾ��̵�");
							id_success = true;
						}
						
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}else{
					JOptionPane.showMessageDialog(getParent(), "���̵� �Է��ϼ���");
					tid.requestFocus();
				}
				
			}
		});
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ���̵� �˻��ߴ��� üũ
				if(id_success){
						// ����˻�
						String p1 = new String(tpassword1.getPassword()).trim();
						String p2 = new String(tpassword2.getPassword()).trim();
						if(p1.equals(p2)){
							TestMemberVO tvo = new TestMemberVO();
							tvo.setId(tid.getText().trim());
							tvo.setPassword(p1);
							tvo.setPhone(tphone.getText().trim());
							
							// ���Ϸ� ����� ���� ���� ������ �����ͼ� �߰� �Ѵ�.
							try {
								fis = new FileInputStream(file);
								ois = new ObjectInputStream(fis);
								
								ArrayList<TestMemberVO> list = (ArrayList<TestMemberVO>)ois.readObject();
								list.add(tvo);
								
								// ����ȭ
								fos = new FileOutputStream(file);
								oos = new ObjectOutputStream(fos);
								
								oos.writeObject(list);
								oos.flush();
								
								tid.setText("");
								tpassword1.setText("");
								tpassword2.setText("");
								tphone.setText("");
								
								id_success = false;
								JOptionPane.showMessageDialog(getParent(), "����Ϸ�");
								
								
							} catch (Exception e2) {
								System.out.println(e2);
							}
							
						}else{
							JOptionPane.showMessageDialog(getParent(), "����� �ٸ��׿�");
							tpassword1.setText("");
							tpassword2.setText("");
							tpassword1.requestFocus();
						}
					
					
				}else{
					id_chk = true;
					JOptionPane.showMessageDialog(getParent(), "���̵� üũ�ϼ���");
					tid.requestFocus();
				}
				
			}
		});
		
	}
	
	
	public static void main(String[] args) {
		new TestMember();
	}
}

package com.hb.am;

import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ex01 extends JFrame implements ActionListener {
	
	JPanel jp ;
	JButton jb1, jb2, jb3, jb4, jb5, jb6 ;
	
	
	public Ex01() {
		setTitle("���̾� �α� ����");
		
		jp = new JPanel() ;
		
		jb1 = new JButton("�޼���");
		jb2 = new JButton("Ȯ��");
		jb3 = new JButton("�Է�");
		jb4 = new JButton("�ɼ�");
		jb5 = new JButton("���Ͽ���");
		jb6 = new JButton("��������");
		
		
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jb6);
		
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-225, ds.height/2-35, 550, 70);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		jb6.addActionListener(this);
				
	}
	public static void main(String[] args) {
		new Ex01();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton)(e.getSource());
		
		if(jb==jb1){
			// �޼��� : ����ڿ��� �˸��� ������ �Ѵ�.
			//JOptionPane.showMessageDialog("�θ�������Ʈ", "�޼���");
			//JOptionPane.showMessageDialog(jp, "�氡�氡");
			//JOptionPane.showMessageDialog(getParent(), "�氡�氡");
			//JOptionPane.showMessageDialog(parentComponent, message, title, messageType);
			//messageType => INFORMATION_MESSAGE, WARNING_MESSAGE, 
			//				 QUESTION_MESSAGE, PLAIN_MESSAGE, ERROR_MESSAGE
			JOptionPane.showMessageDialog(getParent(), "�氡�氡", "�޼��� ���̾�α�", JOptionPane.INFORMATION_MESSAGE);
		}else if(jb==jb2){
			//Ȯ�� : ��=>0  �ƴϿ�=>1  ���=>2
			//int res = JOptionPane.showConfirmDialog(getParent(), "�����?");
			//System.out.println(res);
			//JOptionPane.showConfirmDialog(parentComponent, message, title, optionType);
			//optionType => 
			JOptionPane.showConfirmDialog(getParent(), "�������?", "����", JOptionPane.YES_NO_CANCEL_OPTION);
			//JOptionPane.showConfirmDialog(parentComponent, message, title, optionType, messageType);
		}else if(jb==jb3){
			//�Է� : ����ڿ��� ������ ������ ���
			//String name = JOptionPane.showInputDialog("����� �̸���?");
			JOptionPane.showInputDialog(getParent(), "����� �̸���?");
			//System.out.println(name);
			//JOptionPane.showInputDialog(message, �ʱⰪ);
			//JOptionPane.showInputDialog("��Ӵ��� ������?", "�Ѹ�");
		}else if(jb==jb4){
			//����� ���̾� �α�(����ڰ� ����� ��)
			JOptionPane.showOptionDialog(getParent(), "���������", "����", JOptionPane.YES_NO_CANCEL_OPTION,
										 JOptionPane.INFORMATION_MESSAGE, null, null, null);
		}else if(jb==jb5){//INPUT
			FileDialog fd = new FileDialog(this, "���Ͽ���", FileDialog.LOAD);
			fd.setVisible(true);
			//����ڰ� ���� I/O �ؾ��Ѵ�
		}else if(jb==jb6){//OUTPUT
			FileDialog fd = new FileDialog(this, "��������", FileDialog.SAVE);
			fd.setVisible(true);
		}
		
	}
}

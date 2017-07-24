package com.hb.bm;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.SynchronousQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//	�̺�Ʈ : ����ڰ� ��� �ൿ, ���� �ϴ� ���� ����
//	��  ��	 : �̺�Ʈ�� �߻��Ǵ� ������Ʈ (��ư, üũ�ڽ�, ������ư,...)
//	������ : �̺�Ʈ�� ����, �̺�Ʈ�� �߻��Ǹ� ���������� �̺�Ʈ�� ó��
//			   �� �� �ֵ��� ���� �������̽� 
//	�ڵ鷯 : �����ʿ� ���޵� �̺�Ʈ�� ������ ó���� �� �ֵ��� 
//			   �̺�Ʈ �����ʿ� ���� �Ǿ��ִ� �߻� �޼ҵ带 �������Ͽ�
//			   ������ ó���ϴ� ���

//	Action Event : ������Ʈ�� �����ų� ���õǾ����� �߻��ϴ� �̺�Ʈ
//	Action Listener : Action�̺�Ʈ ����
//	addActionListener => Action�̺�Ʈ�� �����ϰ� ������ �̺�Ʈ ��ü�� �����ϴ� ����

public class Ex01 extends JFrame /*implements ActionListener*/ {
	JButton jb1, jb2, jb3 ;
	public Ex01() {
		setTitle("Action Event");
		
		JPanel jp1 = new JPanel();
		
		jb1 = new JButton("input");
		jb2 = new JButton("output");
		jb3 = new JButton("exit");
		
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		
		add(jp1);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize() ;
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		/*jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);*/
		
		Ex02 test = new Ex02() ;
		jb1.addActionListener(test);
		jb2.addActionListener(test);
		jb3.addActionListener(test);
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
	//	�̺�Ʈ�� �߻��ϸ� ������ ������ �޼ҵ�
	/*
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("��ư������");
		
		//�̺�Ʈ �߻� ��� ã��
		//getActionCommand() => �̺�Ʈ ����� text�� �˷��ش�.
		
		���1)
		String msg = e.getActionCommand();
		//System.out.println(msg);
		
		if(msg.equals(jb1.getText())){
			System.out.println("input ������");
		}else if (msg.equals(jb2.getText())){
			System.out.println("output ������");
		}else if (msg.equals(jb3.getText())){
			System.out.println("exit ������");
		}
		
		//���3)
		JButton jb = (JButton)(e.getSource());
		if(jb==jb1){
			system.out.println("input ������");
		}else if (jb==jb2){
			system.out.println("output ������");
		}else if (jb==jb3){
			system.out.println("exit ������");
		}
				
	}*/
}

class Ex02 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		//String msg = e.getActionCommand();
		//System.out.println(msg + "������");
		
		//���2)
		String msg = ((JButton)(e.getSource())).getText();
		System.out.println(msg + "������");
		
	}
	
}







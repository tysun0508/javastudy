package com.hb.bm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.SynchronousQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

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

public class Ex03 extends JFrame implements ActionListener {
	JButton jb1, jb2, jb3 ;
	JTextArea jta ;
	JPanel jp1 ;
	JScrollPane jsp ;
	public Ex03() {
		setTitle("Action Event2");
		
		jp1 = new JPanel();
		
		jb1 = new JButton("input");
		jb2 = new JButton("output");
		jb3 = new JButton("exit");
		
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		
		jta = new JTextArea() ;
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
				);		
		jta.setLineWrap(true); //�ڵ� �ٹٲ�
		jta.setEditable(false); //�����Ұ�
		
		add(jp1,BorderLayout.NORTH);
		add(jsp,BorderLayout.CENTER);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize() ;
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		// �̺�Ʈ ó��
		jb1.addActionListener(this); //����Ŭ������ ������ this
		jb2.addActionListener(this); 
		jb3.addActionListener(this); 
		
	}
	
	public static void main(String[] args) {
		new Ex03();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton)(e.getSource());
		if(jb==jb1){
			jta.append("input Ŭ�� \n");
		}else if(jb==jb2){
			jta.append("output Ŭ�� \n");
		}else if(jb==jb3){
			//���α׷� ����
			System.exit(0);
			
		}
	
	}
		
}







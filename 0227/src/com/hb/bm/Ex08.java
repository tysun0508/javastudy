package com.hb.bm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex08 extends JFrame implements ActionListener {
	
	JPanel jp1, jp2, jp3 ;
	JButton jb1, jb2, jb3 ;
	JTextField output ;
	JTextField info ;
	
	
	public Ex08() {
		
		setTitle("���� ���� ��");
		jp1 = new JPanel() ;
		jp1.setLayout(new GridLayout(0, 3));
		
		jb1 = new JButton("����");
		jb2 = new JButton("����");
		jb3 = new JButton("��");
		
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		
		output = new JTextField(20);
		info = new JTextField("�Ʒ��� ��ư �߿��� �ϳ��� Ŭ�� �Ͻÿ�");
		
		add(info, BorderLayout.NORTH);
		add(jp1, BorderLayout.CENTER);
		add(output, BorderLayout.SOUTH);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension ds = tk.getScreenSize();
		setBounds(ds.width / 2 - 150, ds.height / 2 - 100, 300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
	}
	
	
	public static void main(String[] args) {
		new Ex08();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		int com = (int)(Math.random()*3) ;			// 0:����	1:����	 2:��
		JButton user = (JButton)(e.getSource());
		String msg = "" ;
		if(user==jb1){		//����
				if(com==0){ 		//����
					msg = "���" ;
				}else if(com==1){ //����
					msg = "��" ;
				}else if(com==2){ //��
					msg = "�̱�" ;
				}
			
		}else if (user==jb2){ //����
				if(com==0){
					msg = "�̱�" ;
				}else if(com==1){
					msg = "���" ;
				}else if(com==2){
					msg = "��" ;
				}
		}else if (user==jb3){ //��
				if(com==0){
					msg = "��" ;
				}else if(com==1){
					msg = "�̱�" ;
				}else if(com==2){
					msg = "���" ;
				}
		}
		
		output.setText("");
		output.setText(msg);
		
	}
}

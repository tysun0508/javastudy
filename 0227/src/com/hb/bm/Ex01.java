package com.hb.bm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex01 extends JFrame {
	JPanel jp ;
	JLabel jl1, jl2, jl3 ;
	JTextField jtf1, jtf2, jtf3 ;
	JTextArea jta ;
	JScrollPane jsp ;
	JButton jb1, jb2, jb3 ;
	public Ex01() {
		setTitle("����1");
		 jp = new JPanel() ;
		
		
		 jl1 = new JLabel("��1 : ") ;		
		 jl2 = new JLabel("��2 : ") ;		
		 jl3 = new JLabel("������ : ") ;
		
		 jtf1 = new JTextField(4) ;
		 jtf2 = new JTextField(4) ;
		 jtf3 = new JTextField(4) ;
		
		
		 jta = new JTextArea(16, 25);
		 jta.setLineWrap(true);
		 jta.setEditable(false); //���� �Ұ���
		 
		 jsp = new JScrollPane(jta,  //��ũ���� ��ġ�� ������Ʈ
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,   //���� ��ũ��
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER) ;   //���� ��ũ��
		
		 jb1 = new JButton("���") ;
		 jb2 = new JButton("����") ;
		 jb3 = new JButton("���") ;
		
		
		
		 jp.add(jl1) ;
		 jp.add(jtf1) ;
		 jp.add(jl2) ;
		 jp.add(jtf2) ;
		 jp.add(jl3) ;
		 jp.add(jtf3) ;
		 jp.add(jsp);
		 jp.add(jb1) ;
		 jp.add(jb2) ;
		 jp.add(jb3) ;
		
	
		add(jp) ;
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize() ;
		setBounds(ds.width/2-250, ds.height/2-250, 350, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
					JButton jb = (JButton)e.getSource() ;
					if(jb==jb1){
						if(jtf1.getText().length()==0 || 
						   jtf2.getText().length()==0 || 
						   jtf3.getText().length()==0 ){
						  
						   jta.append("����� �Է��ϼ���\n");
							
							}else{
					
								int su1 = Integer.parseInt(jtf1.getText());
								int su2 = Integer.parseInt(jtf2.getText());
								String op = jtf3.getText();
								int res = 0 ;
							
								switch (op) {
								case "+": res = su1 + su2	; break;
								case "-": res = su1 - su2	; break;
								case "*": res = su1 * su2	; break;
								case "/": res = su1 / su2	; break;
					
								//default:
								//break;
								}
								jta.append(su1 + op + su2 + "=" + res +"\n");
								}
							}
				
				
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jtf1.setText("");
				jtf2.setText("");
				jtf3.setText("");
				jta.setText("");
				jtf1.requestFocus();
				
			}
		});
		
	}
	
	public static void main(String[] args) {
		new Ex01() ;
	}

	
}

package com.hb.bm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex03 extends JFrame {
	JComboBox jcb ;
	JPanel jp ;
	JLabel jl1, jl2, jl3 ;
	JTextField jtf1, jtf2 ;
	String[] items = {"�����ϼ���", "+", "-", "*","/"} ;
	JTextArea jta ;
	JScrollPane jsp ;
	JButton jb1, jb2, jb3 ;
	String op = "" ;
	public Ex03() {
		setTitle("����3");
		jp = new JPanel() ;
		
		
		
		
		jcb = new JComboBox(items) ;
		
		
		jl1 = new JLabel("��1 : ") ;		
		jl2 = new JLabel("��2 : ") ;		
		jl3 = new JLabel("������ : ");

		
	
		jtf1 = new JTextField(4) ;
		jtf2 = new JTextField(4) ;
		
		
		
		jta = new JTextArea(14, 27);
		jta.setLineWrap(true);
		jta.setEditable(false);
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
		jp.add(jcb) ;
	
		jp.add(jsp);
		jp.add(jb1) ;
		jp.add(jb2) ;
		jp.add(jb3) ;
		
		add(jp) ;
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize() ;
		setBounds(ds.width/2-180, ds.height/2-200, 360, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setResizable(false);
		setVisible(true);
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton jb = (JButton)(e.getSource());
				if(jb==jb1){
						if(jtf1.getText().length()==0 || jtf2.getText().length()==0){
						jta.append("����� �Է��ϼ���\n");
						}else if(op.length()==0 || op==null){
							jta.append("�����ڸ� �����ϼ���\n");
						}else{
							int res = 0 ;
							int su1 = Integer.parseInt(jtf1.getText());
							int su2 = Integer.parseInt(jtf2.getText());
							switch (op) {
								case "+": res = su1 + su2	; break;
								case "-": res = su1 - su2	; break;
								case "*": res = su1 * su2	; break;
								case "/": res = su1 / su2	; break;
							}
							 jta.append(su1 + op + su2 + "=" + res + "\n");
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
				jta.setText("");
				op = "" ;
				jtf1.requestFocus();
				jcb.setSelectedIndex(0);
				
			}
		});
		
		jcb.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==e.SELECTED) op = (String)(e.getItem());

				
			}
		});
		
	}
	
	public static void main(String[] args) {
		new Ex03() ;
	}


}

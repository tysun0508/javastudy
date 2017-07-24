package com.hb.bm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

public class Ex05 extends JFrame {
	JPanel jp1, jp2, jp3 ;
	JLabel jl1, jl2, jl3, jl4 ;
	JTextField jtf1, jtf2, jtf3, jtf4 ;
	JTextArea jta ;
	JScrollPane jsp ;
	JButton jb1, jb2, jb3 ;
	public Ex05() {
		setTitle("성적");
		jp1 = new JPanel() ;
		jp2 = new JPanel() ;
		jp3 = new JPanel() ;
		
		
		jl1 = new JLabel("이름") ;		
		jl2 = new JLabel("국어") ;	
		jl3 = new JLabel("영어") ;	
		jl4 = new JLabel("수학") ;	
		
		
		jtf1 = new JTextField(4) ;
		jtf2 = new JTextField(4) ;
		jtf3 = new JTextField(4) ;
		jtf4 = new JTextField(4) ;
		
		
		
		jta = new JTextArea(14, 27);
		jta.setLineWrap(true);
		jta.setEditable(false);
		
		jsp = new JScrollPane(jta,  //스크롤을 설치할 컴포넌트
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,   //세로 스크롤
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER) ;   //가로 스크롤
		
		jb1 = new JButton("계산") ;
		jb2 = new JButton("종료") ;
		jb3 = new JButton("취소") ;
		
		
		
		jp1.add(jl1) ;
		jp1.add(jtf1) ;
		jp2.add(jl2) ;
		jp2.add(jtf2) ;
		jp2.add(jl3) ;
		jp2.add(jtf3) ;
		jp2.add(jl4) ;
		jp2.add(jtf4) ;
		jp2.add(jsp);
		jp3.add(jb1) ;
		jp3.add(jb2) ;
		jp3.add(jb3) ;
		
		add(jp1,BorderLayout.NORTH) ;
		add(jp2, BorderLayout.CENTER);
		add(jp3, BorderLayout.SOUTH);
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize() ;
		setBounds(ds.width/2-180, ds.height/2-200, 360, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton jb = (JButton)e.getSource();
				if(jb==jb1){
						if(jtf1.getText().length()==0 || 
						  jtf2.getText().length()==0 ||
						  jtf3.getText().length()==0 ||
						  jtf4.getText().length()==0){
						  jta.append("제대로 입력하세요");
						}else{
							String name = jtf1.getText();
							int kor = Integer.parseInt(jtf2.getText());
							int eng = Integer.parseInt(jtf3.getText());
							int math = Integer.parseInt(jtf4.getText());
							
							int sum = kor+eng+math ;
							double avg = sum / 3.0 ;
							String hak = null ;
							
							if(avg>=90){
								hak = "A학점";
							}else if(avg>=80){
								hak = "B학점" ;
							}else{
								hak = "F학점" ;
							}
							
							double r_avg = Math.floor(avg*100)/100 ;
							jta.append("이름 : " + name + "\n");
							jta.append("총점 : " + sum + "\n");
							jta.append("평균 : " + r_avg + "\n");
							jta.append("학점 : " + hak + "\n");
							
							
							
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
				jtf4.setText("");
				jta.setText("");
				jtf1.requestFocus();
				
			}
		});
		
		
	}
	
	public static void main(String[] args) {
		new Ex05() ;
	}

}

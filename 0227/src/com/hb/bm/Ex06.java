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

public class Ex06 extends JFrame {
	
	JPanel jp1, jp2, jp3, jp4, jp5 ;
	ButtonGroup bg ;
	JRadioButton jrb1, jrb2, jrb3, jrb4 ;
	JLabel jl1, jl2, jl3 ;
	JTextField jtf1, jtf2 ;
	JTextArea jta ;
	JScrollPane jsp ;
	JButton jb1, jb2, jb3 ;
	String coffeeStr = "" ;
	int coffeeInt = 0 ;
	public Ex06() {
		setTitle("카페");
		setLayout(new FlowLayout());
		jp1 = new JPanel() ;
		jp2 = new JPanel() ;
		jp3 = new JPanel() ;
		jp4 = new JPanel() ;
		jp5 = new JPanel() ;
		
		bg = new ButtonGroup() ;
		
		jrb1 = new JRadioButton("아메리카노(3000)");
		jrb2 = new JRadioButton("카페모카(4000)");
		jrb3 = new JRadioButton("카페라떼(3500)");
		jrb4 = new JRadioButton("과일쥬스(3000)");
		
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		
		
		jl1 = new JLabel("원하는 커피 선택") ;		
		jl2 = new JLabel("수량: ") ;
		jl3 = new JLabel("입금액 : ") ;
		
		jtf1 = new JTextField(4) ;
		jtf2 = new JTextField(4) ;
		
		
		
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
		jp2.add(jrb1);
		jp2.add(jrb2);
		jp2.add(jrb3);
		jp2.add(jrb4);
		jp3.add(jl2) ;
		jp3.add(jtf1) ;
		jp3.add(jl3) ;
		jp3.add(jtf2) ;
		jp4.add(jsp);
		jp5.add(jb1);
		jp5.add(jb2);
		jp5.add(jb3);
		
		
		
		
		
		add(jp1);
		add(jp2);
		add(jp3);
		add(jp4);
		add(jp5);
	
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize() ;
		setBounds(ds.width/2-250, ds.height/2-240, 500, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton jb = (JButton)(e.getSource());
				if(jb==jb1){
						if(jtf1.getText().length()==0 || jtf1.getText().length()==0){
							jta.append("제대로 입력하세요\n");
						}else if(coffeeInt==0){
							jta.append("선택을 하세요\n");
						}else{
							int sum = Integer.parseInt(jtf1.getText()) * coffeeInt ;
							int vat = (int)(sum*0.1);
							int total = sum + vat ;
							int output = Integer.parseInt(jtf2.getText()) - total ;
							
							jta.append("커피종류 : " + coffeeStr + "\n");
							jta.append("단가 : " + coffeeInt + "\n");
							jta.append("수량 : " + jtf1.getText() + "\n");
							jta.append("부가세 : " + vat + "\n");
							jta.append("총금액 : " + total + "\n");
							jta.append("입금액 	: " + jtf2.getText() + "\n");
							jta.append("잔돈 : " + output + "\n");
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
				bg.clearSelection();
				jtf1.requestFocus();
				
			}
		});
		
		jrb1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
					coffeeStr = "아메리카노" ;
					coffeeInt = 3000 ;
				
			}
		});
		jrb2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				coffeeStr = "카페모카";
				coffeeInt = 4000 ;
				
			}
		});
		jrb3.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				coffeeStr = "카페라떼";
				coffeeInt = 3500 ;
				
			}
		});
		jrb4.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				coffeeStr = "과일쥬스";
				coffeeInt = 3000 ;
				
			}
		});
		
		
	}
	
	public static void main(String[] args) {
		new Ex06() ;
	}
	

}

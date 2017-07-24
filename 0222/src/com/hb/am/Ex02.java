package com.hb.am;

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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex02 extends JFrame implements ActionListener, ItemListener {
	ButtonGroup bg ;
	JRadioButton jrb1, jrb2, jrb3, jrb4 ;
	JLabel jl1, jl2, jl3 ;
	JTextField jtf1, jtf2 ;
	JTextArea jta ;
	JScrollPane jsp ;
	JButton jb1, jb2, jb3 ;
	String op = "" ;
	
	public Ex02() {
		setTitle("계산기2");
		JPanel jp = new JPanel() ;
		
		// 그룹화 시켜야 하나씩 선택가능
		bg = new ButtonGroup() ;
		
		jrb1 = new JRadioButton("+");
		jrb2 = new JRadioButton("-");
		jrb3 = new JRadioButton("*");
		jrb4 = new JRadioButton("/");
		
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		
		
		
		jl1 = new JLabel("수1 : ") ;		
		jl2 = new JLabel("수2 : ") ;		
		jl3 = new JLabel("연산자 : ");

		
	
		jtf1 = new JTextField(3) ;
		jtf2 = new JTextField(3) ;
		
		
		
		jta = new JTextArea(14, 27);
		jta.setLineWrap(true);
		jta.setEditable(false);
		
		jsp = new JScrollPane(jta,  //스크롤을 설치할 컴포넌트
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,   //세로 스크롤
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER) ;   //가로 스크롤
		
		jb1 = new JButton("계산") ;
		jb2 = new JButton("종료") ;
		jb3 = new JButton("취소") ;
		
		
		
		jp.add(jl1) ;
		jp.add(jtf1) ;
		jp.add(jl2) ;
		jp.add(jtf2) ;
		jp.add(jl3);
		jp.add(jrb1);
		jp.add(jrb2);
		jp.add(jrb3);
		jp.add(jrb4);
		jp.add(jsp);
		jp.add(jb1) ;
		jp.add(jb2) ;
		jp.add(jb3) ;
		
		add(jp) ;
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize() ;
		setBounds(ds.width/2-180, ds.height/2-200, 360, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jrb1.addItemListener(this);
		jrb2.addItemListener(this);
		jrb3.addItemListener(this);
		jrb4.addItemListener(this);
	}
	
	public static void main(String[] args) {
		new Ex02() ;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton)e.getSource() ;
		if(jb==jb1){
				if(jtf1.getText().length()==0 || 
				   jtf2.getText().length()==0){
					
					myinit() ;	
				  jta.append("제대로 입력하세요\n");
					
				}else if(op.length()==0 || op==null){
					jta.append("연산자 입력하세요\n");
				}else if((jtf2.getText().equals("0")&&
							   jrb4.getText().equals("/"))){
						 myinit();
						jta.append("0으로는 나눌 수가 없네요\n"); 
				}else{
					int su1 = Integer.parseInt(jtf1.getText());
					int su2 = Integer.parseInt(jtf2.getText());
					int res = 0 ;
					
					switch (op) {
						case "+": res = su1 + su2	; break;
						case "-": res = su1 - su2	; break;
						case "*": res = su1 * su2	; break;
						case "/": res = su1 / su2	; break;
				}
				jta.append(su1 + op + su2 + "=" + res + "\n" );
				}
		}else if(jb==jb2){
			System.exit(0);
		}else if(jb==jb3){
			myinit();
		}
		

	}

	private void myinit() {
		jtf1.setText("");
		jtf2.setText("");
		jta.setText("");
		op = "" ;
		jtf1.requestFocus();
		bg.clearSelection();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if(e.getStateChange()==e.SELECTED){
			op = ((JRadioButton)(e.getItem())).getText() ;
		}
		
	}
	
}	
	

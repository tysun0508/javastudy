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

//	이벤트 : 사용자가 어떠한 행동, 동작 하는 것을 말함
//	소  스	 : 이벤트가 발생되는 컴포넌트 (버튼, 체크박스, 라디오버튼,...)
//	리스너 : 이벤트를 감지, 이벤트가 발생되면 실제적으로 이벤트를 처리
//			   할 수 있도록 만든 인터페이스 
//	핸들러 : 리스너에 전달된 이벤트를 실제로 처리할 수 있도록 
//			   이벤트 리스너에 포함 되어있는 추상 메소드를 재정의하여
//			   실제로 처리하는 기능

//	Action Event : 컴포넌트를 눌렀거나 선택되었을때 발생하는 이벤트
//	Action Listener : Action이벤트 감지
//	addActionListener => Action이벤트를 감지하고 실제로 이벤트 객체를 전달하는 역할

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
		jta.setLineWrap(true); //자동 줄바꿈
		jta.setEditable(false); //편집불가
		
		add(jp1,BorderLayout.NORTH);
		add(jsp,BorderLayout.CENTER);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize() ;
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		// 이벤트 처리
		jb1.addActionListener(this); //같은클래스에 있을땐 this
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
			jta.append("input 클릭 \n");
		}else if(jb==jb2){
			jta.append("output 클릭 \n");
		}else if(jb==jb3){
			//프로그램 종료
			System.exit(0);
			
		}
	
	}
		
}







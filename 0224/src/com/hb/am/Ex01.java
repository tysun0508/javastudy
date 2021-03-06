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
		setTitle("다이얼 로그 연습");
		
		jp = new JPanel() ;
		
		jb1 = new JButton("메세지");
		jb2 = new JButton("확인");
		jb3 = new JButton("입력");
		jb4 = new JButton("옵션");
		jb5 = new JButton("파일열기");
		jb6 = new JButton("파일저장");
		
		
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
			// 메세지 : 사용자에게 알리는 역할을 한다.
			//JOptionPane.showMessageDialog("부모컴포넌트", "메세지");
			//JOptionPane.showMessageDialog(jp, "방가방가");
			//JOptionPane.showMessageDialog(getParent(), "방가방가");
			//JOptionPane.showMessageDialog(parentComponent, message, title, messageType);
			//messageType => INFORMATION_MESSAGE, WARNING_MESSAGE, 
			//				 QUESTION_MESSAGE, PLAIN_MESSAGE, ERROR_MESSAGE
			JOptionPane.showMessageDialog(getParent(), "방가방가", "메세지 다이얼로그", JOptionPane.INFORMATION_MESSAGE);
		}else if(jb==jb2){
			//확인 : 예=>0  아니오=>1  취소=>2
			//int res = JOptionPane.showConfirmDialog(getParent(), "배고파?");
			//System.out.println(res);
			//JOptionPane.showConfirmDialog(parentComponent, message, title, optionType);
			//optionType => 
			JOptionPane.showConfirmDialog(getParent(), "밥먹을려?", "제목", JOptionPane.YES_NO_CANCEL_OPTION);
			//JOptionPane.showConfirmDialog(parentComponent, message, title, optionType, messageType);
		}else if(jb==jb3){
			//입력 : 사용자에게 정보를 받을때 사용
			//String name = JOptionPane.showInputDialog("당신의 이름은?");
			JOptionPane.showInputDialog(getParent(), "당신의 이름은?");
			//System.out.println(name);
			//JOptionPane.showInputDialog(message, 초기값);
			//JOptionPane.showInputDialog("어머님이 누구니?", "둘리");
		}else if(jb==jb4){
			//사용자 다이얼 로그(사용자가 만드는 것)
			JOptionPane.showOptionDialog(getParent(), "사용자정의", "제목", JOptionPane.YES_NO_CANCEL_OPTION,
										 JOptionPane.INFORMATION_MESSAGE, null, null, null);
		}else if(jb==jb5){//INPUT
			FileDialog fd = new FileDialog(this, "파일열기", FileDialog.LOAD);
			fd.setVisible(true);
			//사용자가 직접 I/O 해야한다
		}else if(jb==jb6){//OUTPUT
			FileDialog fd = new FileDialog(this, "파일저장", FileDialog.SAVE);
			fd.setVisible(true);
		}
		
	}
}

package com.hb.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// ������Ʈ : Ư���� ��� �Ǵ� ���õ� ����� �����ϴ� �ϳ��� ��ü
// 				ȭ���� �����ϴ� ��ü
// 				ex) ���̺�, �޺��ڽ�, ����Ʈ, ������ư, üũ�ڽ�, �����̳�, ....

// �����̳� : �ڱ��� ������ ������Ʈ�� ���Խ�Ű�� �����ϴ� ������ �ϸ�,
// 				�ٸ� �����̳ʸ� ���� ��ų ���� �ִ� ��ü
// 				ex) �г�, ���̾� �α�, ������, ��ũ�� ����, ....

// ������ : �ϳ��� â
// â�� ���� : ��ǻ�� | â(������=�����̳�) | �г�(�����̳�) | ������Ʈ | ��� 


public class Ex01 extends JFrame {
	
	public Ex01() {
		super("��ư ������Ʈ") ;
		
		//������Ʈ
		JButton jb1 = new JButton() ;
		jb1.setText("ù��° ��ư");
		
		JButton jb2 = new JButton("�ι�° ��ư") ;
		JButton jb3 = new JButton("����° ��ư") ;
		JButton jb4 = new JButton("�׹�° ��ư") ;
		JButton jb5 = new JButton("�ټ���° ��ư") ;
		
		//�����̳�
		JPanel jp = new JPanel() ;
		
		//������Ʈ�� �����̳ʿ��� ���϶� ����ϴ� �޼ҵ� : add
		jp.add(jb1) ;
		jp.add(jb2) ;
		jp.add(jb3) ;
		jp.add(jb4) ;
		jp.add(jb5) ;
		
		//������Ʈ�� ���� �����̳ʸ� �����̳�(������)�� ���δ�.
		add(jp) ;
		
		//add(jb1) ;
		//add(jb2) ;
		
		setSize(300, 300);
		setLocation(0, 0) ;
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex01() ;
	}
}

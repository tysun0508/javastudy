package com.hb.bm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex10 extends JFrame {
	JPanel jp;
	JLabel jLabel;
	JTextField jtf;
	JButton jb1, jb2;
	JTextArea jta;
	JScrollPane jsp;
	Map<String, String> map = new HashMap<>();

	public Ex10() {
		setTitle("���� �˾ƺ���");
		jp = new JPanel();
		jLabel = new JLabel("�����Է� : ");
		jtf = new JTextField(15);
		jb1 = new JButton("Ȯ��");
		// jb1.setEnabled(false);
		jb2 = new JButton("���");
		jta = new JTextArea(5, 20);
		jta.setLineWrap(true);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jp.add(jLabel);
		jp.add(jtf);
		jp.add(jb1);
		jp.add(jb2);

		add(jp, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();

		setBounds(ds.width / 2 - 250, ds.height / 2 - 150, 500, 320);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				prn();
			}
		});
		jtf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==e.VK_ENTER){
					prn();
				}
			}
		});
		
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jtf.setText("");
				jta.setText("");
				jtf.requestFocus();
			}
		});
	}
	public void prn(){
		map.put("���ѹα�", "����");
		map.put("�ѱ�", "����");
		map.put("ĳ����", "��Ÿ��");
		map.put("����", "����");
		map.put("������", "����");
		map.put("ȣ��", "ĵ����");
		
		Set<String> keys = map.keySet();
	   if(jtf.getText().length()==0){
		   jta.append("�����͸� �Է��ϼ���\n");
	   }else{
		   String str = jtf.getText();
		   if(keys.contains(str)){
			   String res = map.get(str);
			   jta.append(str+"�� ������ "+res+"�Դϴ�.");
		   }else{
			  jta.append("�����Ϳ� ���� �����Դϴ�.\n");
		   }
	   }
	   jtf.setText("");
	}
	public static void main(String[] args) {
		new Ex10();
	}
}

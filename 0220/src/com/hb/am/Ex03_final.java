package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex03_final extends JFrame {
	public Ex03_final() {
		setTitle("ȸ������");
		
		JPanel jp1 = new JPanel();
		JTextField jtf1 = new JTextField(10);
		ButtonGroup bg = new ButtonGroup();
		JRadioButton jrb1 = new JRadioButton("��");
		JRadioButton jrb2 = new JRadioButton("��");
		bg.add(jrb1);
		bg.add(jrb2);
		jp1.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp1.add(new JLabel("��   ��"));
		jp1.add(jtf1);
		jp1.add(new JLabel("��   ��"));
		jp1.add(jrb1);
		jp1.add(jrb2);
		
		
		JPanel jp2 = new JPanel();
		JTextField jtf2 = new JTextField(6);
		jp2.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp2.add(new JLabel("�������"));
		jp2.add(jtf2);
		
		
		JPanel jp3 = new JPanel();
		JTextField jtf3 = new JTextField(15);
		jp3.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp3.add(new JLabel("�ּ�"));
		jp3.add(jtf3);
		
		JPanel jp4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		//�޺��ڽ��� �׸����
		String[] items = {"�μ�", "��ȹ��", "�ѹ���", "������", "�����"	};
		JComboBox jcom = new JComboBox<>(items);
		jp4.add(new JLabel("��  ��  �� : "));
		jp4.add(jcom);
		
		JPanel jp5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JCheckBox jcb1 = new JCheckBox("�");
		JCheckBox jcb2 = new JCheckBox("��ȭ");
		JCheckBox jcb3 = new JCheckBox("����");
		JCheckBox jcb4 = new JCheckBox("��ǻ��");
		
		jp5.add(new JLabel("��  �� : "));
		jp5.add(jcb1);
		jp5.add(jcb2);
		jp5.add(jcb3);
		jp5.add(jcb4);
		
		JPanel jp6 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp6.add(new JLabel("�� �� �� ��"));
		
		JTextArea jta = new JTextArea(5,20);
		jta.setLineWrap(true);
		
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JPanel jp7 = new JPanel();
		JButton jb1 = new JButton("����");
		JButton jb2 = new JButton("����");
		JButton jb3 = new JButton("���");
		jp7.add(jb1);
		jp7.add(jb2);
		jp7.add(jb3);
		
		JPanel pg1 = new JPanel(new BorderLayout());
		JPanel pg2 = new JPanel(new BorderLayout());
		JPanel pg3 = new JPanel(new BorderLayout());
		
		pg1.add(jp1, BorderLayout.NORTH);
		pg1.add(jp2, BorderLayout.CENTER);
		pg1.add(jp3, BorderLayout.SOUTH);
		
		pg2.add(jp4, BorderLayout.NORTH);
		pg2.add(jp5, BorderLayout.CENTER);
		pg2.add(jp6, BorderLayout.SOUTH);
		
		pg3.add(jsp, BorderLayout.CENTER);
		pg3.add(jp7, BorderLayout.SOUTH);
		
		add(pg1, BorderLayout.NORTH);
		add(pg2, BorderLayout.CENTER);
		add(pg3, BorderLayout.SOUTH);
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize() ;
		setBounds(ds.width/2-200, ds.height/2-185, 400, 390);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		
		
		
			
	}
	
	public static void main(String[] args) {
		new Ex03_final();
	}
}

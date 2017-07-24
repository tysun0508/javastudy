package com.hb.bm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

// ������ư�� ���������� ITemListener ��� => üũ�ڽ�
public class Ex06 extends JFrame implements ActionListener, ItemListener {
	JPanel jp1,jp2,jp3,jp4 ;
	JCheckBox jcb1,jcb2,jcb3,jcb4 ;
	JButton jb ;
	JTextArea jta ;
	JScrollPane jsp ;
	public Ex06() {
		
		setTitle("üũ �ڽ�(Action)");
		
		jp1 = new JPanel();
		
		
		jcb1 = new JCheckBox("�౸");
		jcb2 = new JCheckBox("�߱�");
		jcb3 = new JCheckBox("��");
		jcb4 = new JCheckBox("�豸");
		
		
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		jp1.add(jcb4);
		
		jp2 = new JPanel();
		
		jb = new JButton("exit");
		
		jp2.add(jb);
		
		
		jp3 = new JPanel();
		jta = new JTextArea(10,25);
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
				);
		jta.setLineWrap(true);
		jta.setEditable(false);
		jp3.add(jsp);
		
		jp4 = new JPanel();
		jp4.setLayout(new BoxLayout(jp4, BoxLayout.Y_AXIS));
		jp4.add(jp1);
		jp4.add(jp2);
		jp4.add(jp3);

		add(jp4);
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize() ;
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb.addActionListener(this);
		jcb1.addItemListener(this);
		jcb2.addItemListener(this);
		jcb3.addItemListener(this);
		jcb4.addItemListener(this);
		
	}
	
	public static void main(String[] args) {
		new Ex06();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JCheckBox jcb = (JCheckBox)(e.getItem());
		
		if(e.getStateChange()==e.SELECTED){
			jta.append(jcb.getText()+"���� \n");
		}else if(e.getStateChange()== e.DESELECTED){
			jta.append(jcb.getText()+"���� \n");
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		
	}
}

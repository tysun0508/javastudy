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
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;

// 라디오버튼과 마찬가지로 ITemListener 사용 => 체크박스
public class Ex07 extends JFrame implements ActionListener, ItemListener {
	JPanel jp1,jp2,jp3,jp4 ;
	JToggleButton jtb1,jtb2,jtb3,jtb4 ;
	JButton jb ;
	JTextArea jta ;
	JScrollPane jsp ;
	public Ex07() {
		
		setTitle("체크 박스(Action)");
		
		jp1 = new JPanel();
		
		
		jtb1 = new JToggleButton("축구");
		jtb2 = new JToggleButton("야구");
		jtb3 = new JToggleButton("농구");
		jtb4 = new JToggleButton("배구");
		
		
		jp1.add(jtb1);
		jp1.add(jtb2);
		jp1.add(jtb3);
		jp1.add(jtb4);
		
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
		jtb1.addItemListener(this);
		jtb2.addItemListener(this);
		jtb3.addItemListener(this);
		jtb4.addItemListener(this);
		
	}
	
	public static void main(String[] args) {
		new Ex07();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JToggleButton jtb = (JToggleButton)(e.getItem());
		
		if(e.getStateChange()==e.SELECTED){
			jta.append(jtb.getText()+"선택 \n");
		}else if(e.getStateChange()== e.DESELECTED){
			jta.append(jtb.getText()+"해제 \n");
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		
	}
}

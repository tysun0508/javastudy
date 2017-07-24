package com.hb.bm;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Ex08 extends JFrame implements ActionListener, ItemListener {
	
	JPanel jp1, jp2, jp3 ;
	JComboBox jcb;
	JButton jb1 ;
	JTextArea jta ;
	JScrollPane jsp ;
	public Ex08() {
		setTitle("콤보박스");
		
		jp1 = new JPanel();
		
		String items[] = {"선택하세요", "축구", "야구", "농구", "배구"} ;
		jcb= new JComboBox<>(items);
		jp1.add(jcb);
		
		jb1 = new JButton("exit");
		jp1.add(jb1);
		
		jp2 = new JPanel() ;
		jta =new JTextArea(10,25);
		jsp=new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
				);
		jta.setLineWrap(true);
		jta.setEditable(false);
		jp2.add(jsp);
		
		jp3 = new JPanel();
		jp3.setLayout(new BoxLayout(jp3, BoxLayout.Y_AXIS));
		jp3.add(jp1);
		jp3.add(jp2);
		
		add(jp3);
		
		
			
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize() ;
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb1.addActionListener(this);
		jcb.addItemListener(this);
		
	}
	
	public static void main(String[] args) {
		new Ex08();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String msg = (String)e.getItem();
		
		if(e.getStateChange()==e.SELECTED){
			jta.append(msg+ "선택 \n");
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		
	}
}

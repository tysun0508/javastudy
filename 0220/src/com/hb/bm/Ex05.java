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
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Ex05 extends JFrame implements ActionListener, ItemListener {
	JPanel jp1,jp2,jp3,jp4 ;
	ButtonGroup bg ;
	JRadioButton jrb1, jrb2, jrb3, jrb4 ;
	JButton jb1 ;
	JTextArea jta ;
	JScrollPane jsp ;
	public Ex05() {
		
		setTitle("���� ��ư2(Action");
		
		jp1 = new JPanel();
		
		bg = new ButtonGroup();
		jrb1 = new JRadioButton("�౸");
		jrb2 = new JRadioButton("�߱�");
		jrb3 = new JRadioButton("��");
		jrb4 = new JRadioButton("�豸");
		
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		jp1.add(jrb1);
		jp1.add(jrb2);
		jp1.add(jrb3);
		jp1.add(jrb4);
		
		jp2 = new JPanel();
		
		jb1 = new JButton("exit");
		
		jp2.add(jb1);
		
		
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
		
		jrb1.addItemListener(this);
		jrb2.addItemListener(this);
		jrb3.addItemListener(this);
		jrb4.addItemListener(this);
		
		jb1.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		new Ex05();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JRadioButton jrb = (JRadioButton)(e.getItem());
			
		/*if(jrb==jrb1){
			jta.append(jrb1.getText()+"���� \n");
		}else if(jrb==jrb2){
			jta.append(jrb2.getText()+"���� \n");
		}else if(jrb==jrb3){
			jta.append(jrb3.getText()+"���� \n");
		}else if(jrb==jrb4){
			jta.append(jrb4.getText()+"���� \n");
		}*/
		
		if(e.getStateChange() == e.SELECTED){
			
			/*if(jrb==jrb1){
				jta.append(jrb1.getText()+"���� \n");
			}else if(jrb==jrb2){
				jta.append(jrb2.getText()+"���� \n");
			}else if(jrb==jrb3){
				jta.append(jrb3.getText()+"���� \n");
			}else if(jrb==jrb4){
				jta.append(jrb4.getText()+"���� \n");
			}*/
			
			jta.append(jrb.getText()+"���� \n") ;
		}		
			
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton)(e.getSource());
		if(jb==jb1){
			System.exit(0);
		}
		
	}

}

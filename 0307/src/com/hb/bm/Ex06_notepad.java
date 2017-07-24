package com.hb.bm;

import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

// �޴��ۼ���
// �����޴�(JMenuItem)
// �޴��� ���̱�
// �޴��ٸ� â�� ���̱�
// �����ӿ� ���̱�
public class Ex06_notepad extends JFrame implements ActionListener{

	JTextArea jta ;
	JScrollPane jsp ;
	JMenuItem jmi1, jmi2, jmi3, jmi4, jmi5, jmi6, jmi7, jmi8, jmi9 ;
	JMenu jm1, jm2, jm3, jm4 ;
	JMenuBar jmb ;
	
	public Ex06_notepad() {
		setTitle("Simple Notepad ver0.1");
		
		jta = new JTextArea();
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER) ;
		jta.setLineWrap(true);
		
		jmi1 = new JMenuItem("������");
		jmi2 = new JMenuItem("��   ��");
		jmi3 = new JMenuItem("��   ��");
		jmi4 = new JMenuItem("��   ��");
		jmi5 = new JMenuItem("����, ����,30");
		jmi6 = new JMenuItem("�ü�, ����,40");
		jmi7 = new JMenuItem("����, �⺻,50");
		jmi8 = new JMenuItem("����");
		jmi9 = new JMenuItem("�޸�������");
		
		jm1 = new JMenu("�� ��");
		jm2 = new JMenu("�� ��");
		jm3 = new JMenu("����");
		jm4 = new JMenu("���ڼ���");
		
		jmb = new JMenuBar();
		
		//�����޴��� �޴���
		jm1.add(jmi1);
		jm1.add(jmi2);
		jm1.add(jmi3);
		jm1.addSeparator(); //���߱� ���õ� �� ������ ����
		jm1.add(jmi4);
		
		jm4.add(jmi5);
		jm4.add(jmi6);
		jm4.add(jmi7);
		
		jm2.add(jm4);
		
		jm3.add(jmi8);
		jm3.addSeparator();
		jm3.add(jmi9);
		
		//�޴��� �޴��ٿ� �ֱ�
		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);
		
		//�޴��ٸ� ������ �޴��ٿ� ���̱�
		setJMenuBar(jmb);
		
		add(jsp) ;
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-300, ds.height/2-300, 600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		setVisible(true);
		
		jmi1.addActionListener(this);
		jmi2.addActionListener(this);
		jmi3.addActionListener(this);
		jmi4.addActionListener(this);
		jmi5.addActionListener(this);
		jmi6.addActionListener(this);
		jmi7.addActionListener(this);
		jmi8.addActionListener(this);
		jmi9.addActionListener(this);
		
		
	}
	public static void main(String[] args) {
		new Ex06_notepad();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem jmi = (JMenuItem)e.getSource();
		
		if(jmi==jmi1){	//������
			int size = jta.getText().length();
			if(size==0){
				jta.setText("");
			}else{
				int res = JOptionPane.showConfirmDialog(getParent(), "�����ұ��");
				if(res==0){
					FileDialog fd = new FileDialog(this, "�����ϱ�", FileDialog.SAVE );
					fd.setVisible(true);
				//������(I/O) �� ����	
					String path = fd.getDirectory()+fd.getFile();
					String msg = jta.getText().replace("\n", "\r\n");
					byte[] b = msg.getBytes();
					FileOutputStream fos = null;
					try {
						fos = new FileOutputStream(path);
						fos.write(b);
						fos.flush();
						jta.setText("");
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else if(res==1){
					jta.setText("");
				}
			}
		}else if(jmi==jmi2){	//����
			FileDialog fd = new FileDialog(this, "�ҷ�����", FileDialog.LOAD);
			fd.setVisible(true);
			
			// ���� ���̾�α׿��� ������ ������ �о����
			//System.out.println(fd.getDirectory()+ ", " + fd.getFile());
			
			String path = fd.getDirectory() + fd.getFile();
			FileInputStream fis = null;
			File file = new File(path);		
			int size = (int)file.length();
			byte[] b = new byte [size];
			try {
				fis = new FileInputStream(file);
				fis.read(b);
				jta.setText("");
				jta.append(new String(b).trim());
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}else if(jmi==jmi3){	//����
			FileDialog fd = new FileDialog(this, "�����ϱ�", FileDialog.SAVE );
			fd.setVisible(true);
			String path = fd.getDirectory()+fd.getFile();
			String msg = jta.getText().replace("\n", "\r\n");
			byte[] b = msg.getBytes();
			FileOutputStream fos = null;
			try {
				fos = new FileOutputStream(path);
				fos.write(b);
				fos.flush();
				jta.setText("");
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if(jmi==jmi4){	//����
			System.exit(0);
		}else if(jmi==jmi5){	//����, ����,30
			// �۲�(Font)
			Font font = new Font("����", Font.ITALIC, 30);
			jta.setFont(font);
		}else if(jmi==jmi6){	//�ü�, ����,40
			Font font = new Font("�ü�", Font.BOLD, 40);
			jta.setFont(font);
		}else if(jmi==jmi7){	//����, �⺻,50
			Font font = new Font("����", Font.PLAIN, 50);
			jta.setFont(font);
		}else if(jmi==jmi8){	//����
			JOptionPane.showMessageDialog(getParent(), "����");
		}else if(jmi==jmi9){	//�޸�������
			JOptionPane.showMessageDialog(getParent(), "Simple Notepad ver0.1");
		}
		
	}
}

package com.hb.am;

import javax.swing.table.AbstractTableModel;

public class Ex10_1 extends AbstractTableModel {

	//ǥ�� �� �÷��� 
	String[] name = {"���̵�", "�̸�", "��й�ȣ", "����"} ;
	
	//ǥ�� �� �����ʹ� 2���� �迭
	String[][] data = {
			{"one", "ȫ�浿", "12", "����ģ��"},
			{"two", "�̱浿", "15", "ģ��"},
			{"three", "��浿", "22", "ȸ��ģ��"},
			{"four", "��浿", "10", "��������ģ��"},
			
	};
	
	//���� �ڷ����� �ٸ��� Object�� ������
	Object[][] data2 = {
			{"one", "ȫ�浿", "12", "����ģ��"},
			{"two", "�̱浿", "15", "ģ��"},
			{"three", "��浿", new Integer(22), "ȸ��ģ��", new Boolean(false)},
			{"four", "��浿", "10", "��������ģ��"},
			
	};
	
	//���� ����
	@Override
	public int getColumnCount() {
		
		return name.length ;
	}
	//���� ����
	@Override
	public int getRowCount() {
		
		return data.length ;
	}
	
	//����ä���
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		return data[rowIndex][columnIndex] ;
	}
	
	//�÷��� ���� ��Ű��
	@Override
	public String getColumnName(int column) {
		
		return name[column];
	}
	
	//�� ǥ���� �� �� �ֵ��� Ŀ�� �ֱ�
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
	
		return (columnIndex !=0) ? true : false ;
		//return true ; // ��ü ��ġ�� ����
	}
	
	//�� ���� �����ϰ� �ϱ�
	//(Object ��ĥ����, int ����ġ, int ����ġ) �޾Ƽ� ��ħ
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		//System.out.println(aValue);
		//System.out.println(rowIndex);
		//System.out.println(columnIndex);
		data[rowIndex][columnIndex] = (String) (aValue) ;
	}
	
	
	
}

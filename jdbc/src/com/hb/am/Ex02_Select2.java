package com.hb.am;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex02_Select2 {
	public static void main(String[] args) {
		
		Connection conn = null ;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		try {
			// 1.JDBC ����̹� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			// 2. DB����
			String url ="jdbc:oracle:thin:@localhost:1521:xe" ;
			String user ="hr" ;
			String password = "1111" ;
			conn = DriverManager.getConnection(url, user, password);
			// 3. SQL�� ���� �� DB�� ����
			String sql = "select * from hbmember where id='hong' and pwd='1234'" ;
			//String sql2 = "select * from hbmember where name = '����' " ;
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql) ;
			System.out.println(rs.getRow());
			
			while(rs.next()){
				System.out.print(rs.getInt("idx")+"\t");
				System.out.print(rs.getString("id")+"\t");
				System.out.print(rs.getString("pwd")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getInt("age")+"\t");
				System.out.println(rs.getString("addr")+"\n");
				
			}
			if(0==rs.getRow()){
				System.out.println("�α��� ����");
				System.out.println("���̵� �н����尡 Ʋ�Ƚ��ϴ�.");
			}
			
			
		} catch (Exception e) {
		
		}finally{
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				
			}
		}
	}
}

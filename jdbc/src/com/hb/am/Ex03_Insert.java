package com.hb.am;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex03_Insert {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;		
		ResultSet rs = null ;
		try {
			//JDBC ����̹� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			//DB����
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			String user ="hr";
			String password="1111";
			
			conn = DriverManager.getConnection(url, user, password);
			//sql ����
			String sql = "insert into hbmember values(hbmember_seq.nextval,"+"'lim','1111','�Ӳ���','14','��û��')";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			if(result>0){
				System.out.println("���Լ���");
				sql = "select * from hbmember order by idx asc" ;
				rs = stmt.executeQuery(sql) ;
				System.out.println("idx\tid\tpwd\tname\tage\taddr");
				while(rs.next()){
					System.out.print(rs.getInt(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\t");
					System.out.print(rs.getInt(5)+"\t");
					System.out.println(rs.getString(6));
				}
			}else{
				
				System.out.println("���Խ���");
			}
			
		} catch (Exception e) {
			
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				
			}
		}
	}
}

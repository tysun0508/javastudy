package com.hb.em;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//  DB �����ؼ� ���� SQLó���ϴ� Ŭ����
//  SQL ���� �޼ҵ带 ������ �����.  
public class HBDAO {
	Connection conn;
	Statement stmt;
	ResultSet rs;
	HBVO[] hvo = new HBVO[10];

	public HBDAO() {
		// DB ����
		try {
			// 1. JDBC ����̹� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			// 2. DB ����
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public HBVO[] getSelect() {
		try {
			String sql = "select * from hbmember order by idx";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			int cnt = 0;
			while (rs.next()) {
				HBVO vo = new HBVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setId(rs.getString(2));
				vo.setPwd(rs.getString(3));
				vo.setName(rs.getString(4));
				vo.setAge(rs.getInt(5));
				vo.setAddr(rs.getString(6));
				hvo[cnt] = vo;
				cnt++;
			}
		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return hvo;
	}

	// select�� ��� �ϳ��϶��� ������ �϶� ��� �迭�� ��´�.
	public HBVO[] getSelectOne(String id) {
		try {
			String sql = "select * from hbmember where id = '" + id + "'";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			int cnt = 0;
			while (rs.next()) {
				HBVO vo = new HBVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setId(rs.getString(2));
				vo.setPwd(rs.getString(3));
				vo.setName(rs.getString(4));
				vo.setAge(rs.getInt(5));
				vo.setAddr(rs.getString(6));
				hvo[cnt] = vo;
				cnt++;
			}
		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return hvo;
	}

	// ���� �޼ҵ�
	public int getInsert(String id, String pwd, String name, int age, String addr) {
		int res = 0;
		try {
			String sql = "insert into hbmember values(hbmember_seq.nextval,'" + id + "', '" + pwd + "', '" + name
					+ "', " + age + ", '" + addr + "')";
			stmt = conn.createStatement();
			res = stmt.executeUpdate(sql);

		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return res;
	}

	// ���� �޼ҵ�
	public int getDelete(String id, String pwd) {
		int res = 0;
		try {
			String sql = "delete from hbmember where id = '" + id + "' and pwd = '" + pwd + "'";
			stmt = conn.createStatement();
			res = stmt.executeUpdate(sql);
		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return res;
	}

	// �����ϱ����� �˻� �޼ҵ�
	public HBVO getUpdate1(String id) {
		HBVO vo = null;
		try {
			String sql = "select * from hbmember where id = '" + id + "'";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			vo = new HBVO();
			while (rs.next()) {
				vo.setPwd(rs.getString(3));
				vo.setName(rs.getString(4));
				vo.setAge(rs.getInt(5));
				vo.setAddr(rs.getString(6));
			}

		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return vo;
	}

	// ������ ���� �޼ҵ�
	public int getUpdate2(String id, String pwd,String name, int age, String addr) {
		int res = 0;
		try {
			String sql = "update hbmember set name='"+name+"', age="+age+", addr='"
		    +addr+"' where id='"+id+"' and pwd='"+pwd+"'";
			stmt = conn.createStatement();
			res = stmt.executeUpdate(sql);
		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return res;
	}
}

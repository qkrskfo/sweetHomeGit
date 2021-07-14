package com.itwill07.dao.phonebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PhoneBookDao {
	
	public void insert(PhoneBook phonebook) throws Exception {
		/**************DB 접속 정보*************/
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper2";
		String password = "javadeveloper2";
		/**************************************/
		
		String insertSql = "insert into phonebook values(phonebook_no_seq.nextval,'" + 
				phonebook.getName() + "','" + 
				phonebook.getPhone() + "')";
		
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		int insertRowCount = stmt.executeUpdate(insertSql);
		System.out.println(">> "+insertRowCount+"행 insert");
		
		stmt.close();
		con.close();
		
	}
	
	public void updateByPk(PhoneBook phonebook) throws Exception {
		/**************DB 접속 정보*************/
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper2";
		String password = "javadeveloper2";
		/**************************************/
		
		String updateSql = "update phonebook set name='" + phonebook.getName() + "',phone='" + phonebook.getPhone() + "' where no='" + phonebook.getNo() + "'";
		// update 테이블명 set 컬럼명1='(string)값', 컬럼명2=(int)값 where 컬럼명3 = (int)값;
		// 테이블의 컬럼명3 조건에 해당하는 컬럼명1과 2의 값을 update
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		int updateRowCount = stmt.executeUpdate(updateSql);
		System.out.println(">> "+updateRowCount+"행 update");
		System.out.println("update sql: "+updateSql);

		stmt.close();
		con.close();
		
	}
	
	public void deleteByPk(int num) throws Exception {

		/**************DB 접속 정보*************/
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper2";
		String password = "javadeveloper2";
		/**************************************/
		
		String deleteSql = "delete from phonebook where no="+num;
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		int deleteRowCount = stmt.executeUpdate(deleteSql);
		System.out.println(">> "+deleteRowCount+"행 delete");

		stmt.close();
		con.close();
		
	}

	public void selectByPk(int num) throws Exception {
		
		/**************DB 접속 정보*************/
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper2";
		String password = "javadeveloper2";
		/**************************************/

		String selectSql = "select no, name, phone from phonebook where no =" + num;
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(selectSql);
		
		if(rs.next()) {
			int no = rs.getInt("NO");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			System.out.println("\t"+no + "\t" + name + "\t" + phone);
		}
		
		rs.close();
		stmt.close();
		con.close();
		
	}

	public void selectAll() throws Exception {
		
		/**************DB 접속 정보*************/
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper2";
		String password = "javadeveloper2";
		/**************************************/
		
		String selectSql = "select no, name, phone from phonebook";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(selectSql);
		
		while(rs.next()) {
			int no = rs.getInt("NO");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			System.out.println("\t"+no + "\t" + name + "\t" + phone);
		}
		
		rs.close();
		stmt.close();
		con.close();

	}
	
	
}
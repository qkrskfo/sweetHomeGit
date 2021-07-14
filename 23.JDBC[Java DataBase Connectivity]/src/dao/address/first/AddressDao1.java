package dao.address.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
Dao(Data Access Object)
 - Address들의 데이터를 저장하고있는 Address테이블에
   CRUD(Create, Read, Update, Delete) 작업을 할수있는
   단위 메쏘드를 가지고있는 클래스

 - AddressService객체 의 요청(메쏘드호출)을 받아서 
   Data Access(File, DB)에 관련된 단위기능(CRUD)을
   수행하는 객체
 */


public class AddressDao1 {

	public void insert() throws Exception {
		/**************DB 접속 정보*************/
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper2";
		String password = "javadeveloper2";
		/**************************************/
		
		String insertSql = "insert into address values(address_no_seq.nextval,'guard','김경호','123-4568','경기도 성남시')";

		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		int insertRowCount = stmt.executeUpdate(insertSql);
		System.out.println(">> "+insertRowCount+"행이 insert된다");
			
		stmt.close();
		con.close();
	}
	
	public void deleteByNo() throws Exception {
		
		/**************DB 접속 정보*************/
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper2";
		String password = "javadeveloper2";
		/**************************************/

		String deleteSql = "delete from address where no=3";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		int deleteRowCount = stmt.executeUpdate(deleteSql);
		System.out.println(">> "+deleteRowCount+"행 delete");

		stmt.close();
		con.close();
	}
	
	public void updateByNo() throws Exception {
		
		/**************DB 접속 정보*************/
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper2";
		String password = "javadeveloper2";
		/***************************************/

		String updateSql = "update address set id='xxx',name='김경호',phone='899-9999',address='서울시 강남구' where no = 6";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		int updateRowCount = stmt.executeUpdate(updateSql);
		System.out.println(">> "+updateRowCount+"행 update");

		stmt.close();
		con.close();
	}
	
	public void selectByNo() throws Exception {
		
		/**************DB 접속 정보*************/
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper2";
		String password = "javadeveloper2";
		/**************************************/

		String selectSql = "select no,id,name,phone,address from address where no = 6";
		
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(selectSql);
		
		if(rs.next()) {
			int no = rs.getInt("NO");
			String id = rs.getString("id");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String address = rs.getString("address");
			System.out.println(no + "\t" + id + "\t" + name + "\t" + phone + "\t" + address);
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

		String selectSql = "select no,id,name,phone,address from address";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(selectSql);
		
		while(rs.next()) {
			int no = rs.getInt("NO");
			String id = rs.getString("id");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String address = rs.getString("address");
			System.out.println(no + "\t" + id + "\t" + name + "\t" + phone + "\t" + address);
		}
		
		rs.close();
		stmt.close();
		con.close();
	}
	
	
}

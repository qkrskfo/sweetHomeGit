package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressUpdateByNoMain {

	public static void main(String[] args) throws Exception{
		
		/**************DB 접속 정보*************/
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper2";
		String password = "javadeveloper2";
		/***************************/

		String updateSql = "update address set id='xxx',name='김경호',phone='899-9999',address='서울시 강남구' where no = 6";
		
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		int updateRowCount = stmt.executeUpdate(updateSql);
		System.out.println(">> "+updateRowCount+"행 update");


		stmt.close();
		con.close();
	}

}

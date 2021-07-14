package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddressSelectByNoMain {

	public static void main(String[] args) throws Exception {
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
		// 인터페이스임! 주황색 글씨!
		
		/* Retrieving Result
		 * 		before first BOF
		 * 		after last   EOF
		 */
	
		if(rs.next()) {
			int no = rs.getInt("NO");
			String id = rs.getString("id");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String address = rs.getString("address");
			System.out.println(no + "\t" + id + "\t" + name + "\t" + phone + "\t" + address);
		}
		
		/*
		 * DB number -> int, double
		 * varchar2 -> String
		 * date -> Date
		 * XXX var = rs.getXXX("컬럼이름")
		 */
		
	}

}

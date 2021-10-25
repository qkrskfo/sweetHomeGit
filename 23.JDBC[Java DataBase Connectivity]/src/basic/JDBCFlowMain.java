package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCFlowMain {

	public static void main(String[] args) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper0";
		String password = "javadeveloper0";
		String selectSql = "select * from dept";//semicolon있으면 애로사항발생~~~~
		/*
		 1.Driver Class loading
		    - A.Driver클래스객체생성
		    - B.DriverManager객체에 등록
		 */
		Class.forName(driverClass);
		System.out.println("1.Driver Class loading");
		/*
		 * 2.Connection객체생성(DBServer에연결객체)
		 */
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2.Connection객체생성(DBServer에연결):" + con);
		/*
		 * 3.Statement객체생성(SQL문전송객체)
		 */
		Statement stmt = con.createStatement();
		System.out.println("3.Statement객체생성(SQL문전송객체):" + stmt);
		/*
		 * 4.SQL문 전송
		 * 5.ResultSet얻기
		 */
		ResultSet rs = stmt.executeQuery(selectSql);
		System.out.println("4.SQL문 전송:" + selectSql);
		System.out.println("5.ResultSet(결과집합)얻기:" + rs);
		System.out.println("--------------------------------------------");
		while (rs.next()) {
			int deptno = rs.getInt("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.println(deptno + "\t" + dname + "\t" + loc);
		}
		/*
		 * 6.resource해지
		 */
		rs.close();
		stmt.close();
		con.close();
		System.out.println("6.resource해지 close()");
	}
}

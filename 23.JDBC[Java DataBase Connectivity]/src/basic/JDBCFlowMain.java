package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCFlowMain {

	public static void main(String[] args) throws Exception {
		
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe"; // 선생님IP
		String user = "javadeveloper2";
		String password = "javadeveloper2";
		
		String selectSql = "select * from dept";
		// 세미콜론 넣으면 안돼요 여기선~!
		
		/*
		 * 1. Driver Class loading 
		 */		
		Class.forName(driverClass);
		System.out.println("1. Driver Class loading ");
		
		
		/*
		 * 2. Connection 객체 생성 (DB Server에 연결)
		 */		
		Connection con = DriverManager.getConnection(url, user, password);
		// java.sql 에 있는 인터페이스 Connection을 선택해야함.
		System.out.println("2. Connection 객체 생성 (DB Server에 연결): "+con);
		
		
		/*
		 * 3. Statement 객체 생성(SQL전송객체)
		 */
		Statement stmt = con.createStatement();
		// java.sql에 있는 인터페이스 Statement를 선택해야함.
		System.out.println("3. Statement 객체 생성(SQL전송객체): "+stmt);
		
		
		/*
		 * 4. SQL문 전송
		 * 5. ResultSet 얻기
		 */
		
		 ResultSet rs = stmt.executeQuery(selectSql);
		 // java.sql에 있는 인터페이스 ResultSet을 선택해야함.
		 System.out.println("4. SQL문 전송: "+selectSql);
		 System.out.println("5. ResultSet(결과집합) 얻기: "+rs);
		 
		 System.out.println("-----------------------------------");
		 
		 // rs.next()는 iterator.hasnext() 처럼 rs에서 커서를 움직여주는것.
		 while(rs.next()) {
			 int deptno = rs.getInt("deptno"); // 컬럼이름
			 String dname = rs.getString("dname");
			 String loc = rs.getString("loc");
			 System.out.println(deptno+"\t"+dname+"\t"+loc);
		 }
	}

}

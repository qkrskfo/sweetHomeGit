package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressInsertMain {

	public static void main(String[] args) throws Exception {
		/***************************/
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper2";
		String password = "javadeveloper2";
		/***************************/
		String insertSql = "insert into address values(address_no_seq.nextval,'guard','김경호','123-4568','경기도 성남시')";
		// 세미콜론 넣으면 안돼요 여기선~!		
		
		/*
		 * 1. Driver Class loading
		 * 2. Connection 객체 생성 (DB Server에 연결)
		 * 3. Statement 객체 생성(SQL전송객체)
		 * 4. Statement객체를 사용해 SQL문 전송(DML)
		 * 5. 실행결과 (ResultSet, 영향받은 행의 수)
		*/
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		/*
		 * 4. Statement 객체를 사용해 SQL문 전송 (DML)
		 *  - SELECT일 때 구분됨
		 */
		
		int insertRowCount = stmt.executeUpdate(insertSql);
		System.out.println(">> "+insertRowCount+"행이 insert된다");
		
		
		

	}

}

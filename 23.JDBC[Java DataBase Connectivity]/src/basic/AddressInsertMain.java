package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressInsertMain {

	public static void main(String[] args) throws Exception {
		/*********************************************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper0";
		String password = "javadeveloper0";
		/*******************************************/
		String insertSql = "insert into address values(address_no_seq.nextval,'guard','김경호','123-4568','경기도 성남시')";//semicolon있으면 애로사항발생~~~~
		/*
		 1.Driver Class loading
		 2.Connection객체생성(DBServer에연결)
		 3.Statement객체생성(SQL 전송객체)
		 4.Statement객체를 사용해 SQL문전송(DML)
		 5.실행결과(Resultset,영향받은 행의수)
		 */

		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		/*
		  * 4. Statement 객체를 사용해 SQL문 전송 (DML)
		  *  - SELECT일 때 구분됨
		int executeUpdate(String sql) throws SQLException
			- Executes the given SQL statement, which may be an INSERT, UPDATE, or DELETE statement 
			  or an SQL statement that returns nothing, such as an SQL DDL statement.
		Parameters:
			sql - an SQL Data Manipulation Language (DML) statement, 
				such as INSERT, UPDATE or DELETE; or an SQL statement that returns nothing, 
				such as a DDL statement.
			Returns:
				either (1) the row count for SQL Data Manipulation Language (DML) statements 
				or (2) 0 for SQL statements that return nothing
		 * 
		 */
		int insertRowCount = stmt.executeUpdate(insertSql);
		System.out.println(">> " + insertRowCount + " 행 insert");
		// sql developer로 하면 commit, rollback 등을 해줘야 트랜잭션이 끝나지만
		// java에서 하면 바로 커밋이 됨. 여러개의 문장을 한개의 트랜잭션으로 묶으려면
		// 오토 트랜잭션? 오토 커밋? 을 꺼줘야되나봐
		stmt.close();
		con.close();
	}

}

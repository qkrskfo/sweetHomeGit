package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StatementMain {

	public static void main(String[] args) throws Exception {

		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper2";
		String password = "javadeveloper2";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		// Statement에 대해서 알아보려고~
		
		/*
		내가 전송할 문장이 select인지 update인지 모를 땐 execute를 실행하면되지만, 추천하진 않음!
		stmt.execute();
		stmt.executeQuery();
		stmt.executeUpdate();
		*/
		
	}

}

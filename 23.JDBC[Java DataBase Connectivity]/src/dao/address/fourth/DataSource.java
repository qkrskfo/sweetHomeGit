package dao.address.fourth;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Connection을 생성하고 해지하는 역할을 하는 클래스
 *  - connection factory, connection tool라고도 함
 *	- DAO 객체들이 사용 (커넥션이 필요하기 때문에) 
 */

public class DataSource {

	public Connection getConnection() throws Exception {
		/**************DB 접속 정보*************/
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper32";
		String password = "javadeveloper32";
		/**************************************/
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		
		return con;
	}
	
	public void releaseConnection(Connection con) throws Exception {
		con.close();
	}
}






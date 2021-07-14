package basic.driver;

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
		String selectSql = "insert into address values(address_no_seq.nextval,'guard','김경호','123-4568','경기도 성남시')";
		// 세미콜론 넣으면 안돼요 여기선~!		
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		

	}

}

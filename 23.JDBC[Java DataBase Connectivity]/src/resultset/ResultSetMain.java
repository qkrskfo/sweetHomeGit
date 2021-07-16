package resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ResultSetMain {

	public static void main(String[] args) throws Exception {
		
		/*
		
		이름         널?       유형            
		---------- -------- ------------- 
		NO         NOT NULL NUMBER(7)     
		NAME                VARCHAR2(50)  
		SHORT_DESC          VARCHAR2(255) 
		PRICE               NUMBER(10,3)  
		IPGO_DATE           DATE    
		
		 */
		
		/**************DB 접속 정보*************/
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper32";
		String password = "javadeveloper32";
		/**************************************/
			
		String selectSql = "select no, name, short_desc, price, ipgo_date from s_product";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		
		PreparedStatement pstmt = con.prepareStatement(selectSql);
		ResultSet rs = pstmt.executeQuery();
		
		
		System.out.println("-- ResultSet.get타입(컬럼이름) rs.getInt(\"컬럼이름\") --");
		
		while(rs.next()) {
			int no = rs.getInt("NO"); // 괄호안에는 컬럼이름 쓰는거야.
			System.out.println(no);
		}

	
	}

}

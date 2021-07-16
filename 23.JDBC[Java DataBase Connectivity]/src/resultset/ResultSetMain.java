package resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

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
			String name = rs.getString("name"); // 알리아스 줬으면 알리아스로 뽑아야함
			String short_desc = rs.getString("short_desc");
			double price = rs.getDouble("price");
			Date ipgo_date = rs.getDate("ipgo_date"); // Date는 util로 뽑아!
			
			System.out.println(no + "\t" + name + "\t" + short_desc + "\t" + price + "\t" + new SimpleDateFormat("yyyy년 MM월 dd일").format(ipgo_date));
		}
		rs.close();
		
		 
				
		System.out.println("-- ResultSet.get타입(컬럼index) --");
		rs = pstmt.executeQuery();
		while(rs.next()) {
			int no = rs.getInt(1); 
			String name = rs.getString(2);
			String short_desc = rs.getString(3);
			double price = rs.getDouble(4);
			Date ipgo_date = rs.getDate(5); // selectSql의 select 뒤에 있는 컬럼명들 순서대로! selectSql에 select no from 으로 no밖에 없으면 인덱스는 1밖에 없음
			
			
			System.out.println(no + "\t" + name + "\t" + short_desc + "\t" + price + "\t" + new SimpleDateFormat("yyyy년 MM월 dd일").format(ipgo_date));
		}
		rs.close();
		
		
		
		
		
		System.out.println("-- ResultSet.getString(컬럼이름) --");
		
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			String no = rs.getString("NO"); // 괄호안에는 컬럼이름 쓰는거야.
			String name = rs.getString("name"); // 알리아스 줬으면 알리아스로 뽑아야함
			String short_desc = rs.getString("short_desc");
			String price = rs.getString("price");
			String ipgo_date = rs.getString("ipgo_date"); 
			
			System.out.println(no + "\t" + name + "\t" + short_desc + "\t" + price + "\t" + ipgo_date);
		}
		rs.close();
		
		
		
		System.out.println("-- ResultSet.getObject(컬럼이름) --");
		
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			Object no = rs.getObject("NO"); // 괄호안에는 컬럼이름 쓰는거야.
			Object name = rs.getObject("name"); // 알리아스 줬으면 알리아스로 뽑아야함
			Object short_desc = rs.getObject("short_desc");
			Object price = rs.getObject("price");
			Object ipgo_date = rs.getObject("ipgo_date"); 
			// Object no, Object price 에 들어가는건 wrapper임. 숫자는 BigDecimal 형태로 들어옴
			/*
			 * 기본데이타형으로는 int,boolean,double 등이 제공됩니다.
			 * 이런 기본데이타형을 객체로 사용할 수 있는 방법으로 Wrapper 클래스가 제공됩니다.
			 */
			// 나머지 원래 스트링이었던 애들에는 string이 들어감
			System.out.println(no + "\t" + name + "\t" + short_desc + "\t" + price + "\t" + ipgo_date);
		}
		rs.close();
	
		
		
		
		
		
		
		
	}

}

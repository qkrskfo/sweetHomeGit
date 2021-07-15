package statement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
<<PreparedStatement>>
	1. sql문작성
	    - ?(파라메타)를 사용해서 나중에 외부에서 데이타를 받을수있게한다.
	      ex> insert into emp(empno,ename,job,manager,hiredate,sal,comm,deptno) values(?,?,?,?,?,?,?,?)	
	    - 테이블이름,컬럼이름등은 ? 를 사용해서 외부에서 입력 받을 수 없다.
	      ex> select * from ? 
	          select ?,? from emp    
	          
	2. PreparedStatement 객체 생성 후 인자로 sql문을 넣어서 생성한다.
	   ex> PreparedStatement pstmt = con.prepareStatement(sql);
	   
	3. 생성된 PreparedStatement 객체에 파라메타를 setting 한다.
	    - sql 좌측 물음표?(1번 예시에 있는) 부터 1,2,3...
	   ex> 	pstmt.setInt(1,1234);              
	 	   	pstmt.setString(2,"KIM");              
	   		pstmt.setString(3,"MANAGER");              
	  		pstmt.setInt(4,7839);              
	   		pstmt.setDate(5,sysdate);              
	   		pstmt.setDouble(6,1000.12);              
	   		pstmt.setInt(7,0);              
	   		pstmt.setInt(8,10);            
	   		  
	 4.  실행
	    - 실행 시 sql문을 인자로 넣지 않는다.
	    ex> pstmt.executeUpdate();         
	        pstmt.executeQuery();         
*/

public class PreparedStatementMain {
	
	public static void main(String[] args) throws Exception {
	
		/***** DB 접속정보 *****/
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper2";
		String password = "javadeveloper2";
		/**********************/
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		
		System.out.println("--- insert(PreparedStatement) ---");
		String insertSql1 = "insert into emp values(?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement pstmt1 = con.prepareStatement(insertSql1);
		pstmt1.setInt(1, 7000);
		pstmt1.setString(2, "JIM");
		pstmt1.setString(3, "SINGER");
		pstmt1.setInt(4, 7369);
		pstmt1.setDate(5, new Date(System.currentTimeMillis())); //현재시간 들어감
		pstmt1.setDouble(6, 8000.34);
		pstmt1.setInt(7, 0);
		pstmt1.setInt(8, 40);
		
		int insertRowCount = pstmt1.executeUpdate();
		System.out.println(insertRowCount+"행 insert");
		
		String insertSql2 = "insert into emp values(?, ?, ?, ?, sysdate, ?, ?, ?)";
		String insertSql3 = "insert into emp values(?, ?, ?, ?, to_date('YYYY/MM/DD',?), ?, ?, ?)";
		String insertSql4 = "insert into emp values(?, ?, ?, ?, ?, ?, ?, ?)";
		
		
		
	}

}









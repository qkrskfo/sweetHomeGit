package statement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.text.SimpleDateFormat;

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
		/* 게속 실행하면 에러나니까 잠깐 주석처리~
		PreparedStatement pstmt1 = con.prepareStatement(insertSql1);
		pstmt1.setInt(1, 7000);
		pstmt1.setString(2, "JIM");
		pstmt1.setString(3, "SINGER");
		pstmt1.setInt(4, 7369);
		
//		pstmt1.setDate(5, new Date(System.currentTimeMillis())); //현재시간 들어감
// 		pstmt1.setDate(5, new SimpleDateFormat("YYYY-MM-DD").parse("2003-09-07"); 
		// 이렇게 넣을 수도 있음. 그러나 util 데이터임. sql데이터가 되어야하는데..
		
		// java.util.Date --> java.sql.Date 변경
		java.util.Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse("2003-09-07"); // 포매터 대문자 소문자 구분 잘해!!
		long milliSEc = utilDate.getTime();
		pstmt1.setDate(5, new java.sql.Date(milliSEc));
		
		pstmt1.setDouble(6, 8000.34);
		pstmt1.setInt(7, 0);
		pstmt1.setInt(8, 40);
		
		int insertRowCount = pstmt1.executeUpdate();
		System.out.println(insertRowCount+"행 insert");
		*/
		
		
		
		String insertSql2 = "insert into emp values(?, ?, ?, ?, sysdate, ?, ?, ?)";
		/* 게속 실행하면 에러나니까 잠깐 주석처리~
		PreparedStatement pstmt2 = con.prepareStatement(insertSql2);
		pstmt2.setInt(1, 7001);
		pstmt2.setString(2, "ALICE");
		pstmt2.setString(3, "CLERK");
		pstmt2.setInt(4, 7369);
		// 5번이 sysdate라고 5번을 빼면 안됨. 6번이 5번으로 밀려옴
		pstmt2.setDouble(5, 7000.99);
		pstmt2.setInt(6, 400);
		pstmt2.setInt(7, 30);
		
		int insertRowCount2 = pstmt2.executeUpdate();
		System.out.println(insertRowCount2 +"행 insert");
		*/
		
		
		
		String insertSql3 = "insert into emp values(?, ?, ?, ?, to_date(?,?), ?, ?, ?)";
		/* 게속 실행하면 에러나니까 잠깐 주석처리~
		PreparedStatement pstmt3 = con.prepareStatement(insertSql3);
		pstmt3.setInt(1, 7002);
		pstmt3.setString(2, "ALICE");
		pstmt3.setString(3, "CLERK");
		pstmt3.setInt(4, 7369);
		// 5번이 date function 이라고 5번을 빼면 안됨. 앞쪽이 포매터 뒤쪽이 실제데이터 -> 5번, 6번으로 들어가는 것
		pstmt3.setString(5, "1998/03/07");
		pstmt3.setString(6, "YYYY/MM/DD");
		pstmt3.setDouble(7, 3400.66);
		pstmt3.setInt(8, 800);
		pstmt3.setInt(9, 10);
		
		int insertRowCount3 = pstmt3.executeUpdate();
		System.out.println(insertRowCount3 +"행 insert");
		*/
		
		
		String insertSql4 = "insert into emp values(?, ?, ?, ?, ?, ?, ?, ?)";
		/* 게속 실행하면 에러나니까 잠깐 주석처리~
		PreparedStatement pstmt4 = con.prepareStatement(insertSql4);
		pstmt4.setInt(1, 7003);
		pstmt4.setString(2, null);
		pstmt4.setNull(3, Types.VARCHAR); // string의 null
		pstmt4.setNull(4, Types.INTEGER); // integer의 null
		pstmt4.setNull(5, Types.DATE);
		pstmt4.setNull(6, Types.DOUBLE);
		pstmt4.setNull(7, Types.INTEGER);
		pstmt4.setNull(8, Types.INTEGER); // null 을 허용하지 않는 곳엔 들어가지 않음.
		
		int insertRowCount = pstmt4.executeUpdate();
		System.out.println(insertRowCount+"행 insert");
		*/
		
		
		
		int startSal = 1000;
		int endSal = 5000;
		String job = "CLERK";
		
		
		System.out.println("--- select(Statement) ---");
		String selectSql1 = "select * from emp where sal >="+startSal+" and sal <="+endSal+"and job = '"+job+"' ";
		Statement stmt = con.createStatement();
		ResultSet rs1 = stmt.executeQuery(selectSql1);
		
		while(rs1.next()) {
			int empno = rs1.getInt("empno");
			String name = rs1.getString("ename");
			String jobStr = rs1.getString("job");
			double sal = rs1.getDouble("sal");
			Date hireDate = rs1.getDate("hiredate");
			String hireDateStr = new SimpleDateFormat("yyyy/MM/dd").format(hireDate);
			System.out.println(empno + "\t" + name + "\t" + jobStr + "\t\t" + sal);
			
		}
		
		
		// 이걸 preparedStatement로 작성하면 물음표만 있으면 돼~!
		System.out.println("--- select(preparedStatement) ---");
		String selectSql2 = "select * from emp where sal >=? and sal <=? and job =?";
		PreparedStatement pstmt = con.prepareStatement(selectSql2);
		pstmt.setInt(1, startSal);
		pstmt.setInt(2, endSal);
		pstmt.setString(3, job); // 다 미리 준비해놓은 변수로!
		ResultSet rs2 = pstmt.executeQuery(); // 얘는 파라메터에 아무것도 넣지 않음 
		
		while(rs2.next()) {
			int empno = rs2.getInt("empno");
			String name = rs2.getString("ename");
			String jobStr = rs2.getString("job");
			double sal = rs2.getDouble("sal");
			Date hireDate = rs2.getDate("hiredate");
			String hireDateStr = new SimpleDateFormat("yyyy/MM/dd").format(hireDate);
			System.out.println(empno+"\t"+name+"\t"+jobStr+"\t\t"+sal);
			
		}
		
	}

}









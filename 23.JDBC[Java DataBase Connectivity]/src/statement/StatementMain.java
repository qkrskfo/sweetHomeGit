package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementMain {

	public static void main(String[] args) throws Exception {

		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper2";
		String password = "javadeveloper2";
		
		String selectSql = "select * from emp order by sal desc";
		/*
		이름       널?       유형           
		-------- -------- ------------ 
		EMPNO    NOT NULL NUMBER(4)    
		ENAME             VARCHAR2(10) 
		JOB               VARCHAR2(9)  
		MGR               NUMBER(4)    
		HIREDATE          DATE         
		SAL               NUMBER(7,2)  
		COMM              NUMBER(7,2)  
		DEPTNO            NUMBER(2)  
		*/
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		// Statement에 대해서 알아보려고~
		
		ResultSet rs = stmt.executeQuery(selectSql);
		// rs의 cursor(커서)
		while(rs.next()) {
			System.out.println(rs.getInt("empno")+"\t"+rs.getString("ename")+"\t"+rs.getString("job")+"\t\t"+rs.getDouble("sal")+"\t\t"+rs.getDate("hiredate"));
		}
		
		/*
		내가 전송할 문장이 select인지 update인지 모를 땐 execute를 실행하면되지만, 추천하진 않음!
		stmt.execute();
		stmt.executeQuery();
		stmt.executeUpdate();
		*/
		
	}

}

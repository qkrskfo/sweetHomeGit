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
		
		/*
		<<ResultSet의 행의수제한>>
		void java.sql.Statement.setMaxRows(int max) throws SQLException
		 - Sets the limit for the maximum number of rows 
		 	that any ResultSet object generated by this Statement object 
		 	can contain to the given number.
		 - If the limit is exceeded, the excess rows are silently dropped.
		
		Parameters: max the new max rows limit; 
		            zero means there is no limit
		 */
		
		
		System.out.println("stmt.setMaxRows(3)-------");		
		/*
		 * ResultSet의 행의 수 제한
		 */
		stmt.setMaxRows(3); // 3행까지만 뽑아봐
		
		
		
		System.out.println("stmt.executeQuery()-------");
		
		ResultSet rs = stmt.executeQuery(selectSql);
		// rs의 cursor(커서)
		while(rs.next()) {
			System.out.println(rs.getInt("empno")+"\t"+rs.getString("ename")+"\t"+rs.getString("job")+"\t\t"+rs.getDouble("sal")+"\t\t"+rs.getDate("hiredate"));
		}
		
		rs.close();
		
		
		
		
		System.out.println("stmt.executeUpdate()-----");
		
		/*
		 	insert into emp values(9000, 'KIM', ' MANAGER', null, to_date('2020/01/01', 'YYYY/MM/DD'), 7700, null, 40);
			update emp set sal = 6788.98 where empno>=7369 and empno <=7600;
			delete from emp where empno = 7844;
		 */
		
		
		String insertSql = "insert into emp values(9000, 'KIM', ' MANAGER', null, to_date('2020/01/01', 'YYYY/MM/DD'), 7700, null, 40)";
		String updateSql = "update emp set sal = 6788.98 where empno>=7369 and empno <=7600";
		String deleteSql = "delete from emp where empno = 9000";
	
		
		int rowCount = stmt.executeUpdate(insertSql);
		System.out.println(rowCount+"행 insert");
		rowCount = stmt.executeUpdate(updateSql);
		System.out.println(rowCount+"행 update");
		rowCount = stmt.executeUpdate(deleteSql);
		System.out.println(rowCount+"행 delete");
		
		
		/*
		String anySql="";
		boolean isSelect = true;
		if(isSelect) {
			anySql = selectSql;// SELECT
		}else {
			anySql = updateSql; //DML
		}
		
		stmt.execute(anySql);
		*/
		
		
		System.out.println("------stmt.execute()----------");
		
		String anySql=updateSql;
		
		/*
		 boolean execute(String sql) throws SQLException;
			Executes the given SQL statement, which may return multiple results.
			In some (uncommon) situations, a single SQL statement may return multiple result sets and/or update counts. 
			
			Parameters:sql - any SQL statement
			
			Returns:true if the first result is a ResultSet object; 
					false if it is an update count or there are no results
		 */		
		
		boolean isResultSet = stmt.execute(anySql);
		
		if(isResultSet) {
			System.out.println("sql:"+anySql);
			//ResultSet
			ResultSet rs1 = stmt.getResultSet();
			while(rs1.next()) {
				System.out.println(rs1.getInt("empno")+"\t"+
				rs1.getString("ename")+"\t"+
				rs1.getString("job")+"\t\t"+
				rs1.getDouble("sal")+"\t\t"+
				rs1.getDate("hiredate"));
			}
		} else {
			System.out.println("sql:"+anySql);
			//update count
			int rowCounts = stmt.getUpdateCount();
			System.out.println("update count: "+rowCounts);
			
		}
		
		
		stmt.close();
		con.close();
		
		/*
		내가 전송할 문장이 select인지 update인지 모를 땐 execute를 실행하면되지만, 추천하진 않음!
		stmt.execute();
		stmt.executeQuery();
		stmt.executeUpdate();
		*/
		
		
	}

}

package statement;

/*
<<PreparedStatement>>
	1. sql문작성
	    - ?(파라메타)를 사용해서 나중에 외부에서 데이타를 받을수있게한다.
	      ex> insert into emp(empno,ename,job,manager,hiredate,sal,comm,deptno) values(?,?,?,?,?,?,?,?)	
	    - 테이블이름,컬럼이름등은 ? 를 사용해서 외부에서 입력 받을 수 없다.
	      ex> select * from ? 
	          select ?,? from emp    
	          
	2. PreparedStatement 객체 생성 시 인자로 sql문을 넣어서 생성한다.
	   ex> PreparedStatement pstmt = con.prepareStatement(sql);
	   
	3. 생성된 PreparedStatement 객체에 파라메타를 setting 한다.
	    - sql 좌측 ? 부터 1,2,3...
	   ex> 	pstmt.setInt(1,1234);              
	 	   	pstmt.setString(2,'KIM');              
	   		pstmt.setString(3,'MANAGER');              
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
	
	public static void main(String[] args) {
		
	}

}

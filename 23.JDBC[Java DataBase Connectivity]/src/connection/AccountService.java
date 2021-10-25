package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class AccountService {
	private static String driverClass="oracle.jdbc.OracleDriver";
	private static String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
	private static String user="javadeveloper100";
	private static String password="javadeveloper100";
	
	public void updateBalance(int balance) {
		Connection con=null;
		PreparedStatement pstmt=null;
		String updateSql="update accounta set acc_balance  = acc_balance + ? where acc_no=?";
		int updateRowCount=-1;
		boolean exceptionCondition=true;
		try {
			Class.forName(driverClass);
			con=DriverManager.getConnection(url,user,password);
			/*
			 * 1. con.setAutoCommit(false)
			 */
			//con.setAutoCommit(false);
			/*
			 * transaction start
			 */
			System.out.println("-----------updateBalance transaction start--------------");
			pstmt = con.prepareStatement(updateSql);
			pstmt.setInt(1, balance);
			pstmt.setInt(2, 1);
			updateRowCount = pstmt.executeUpdate();
			System.out.println("1 번계좌 updateRowCount:"+updateRowCount);
			
			
			pstmt = con.prepareStatement(updateSql);
			pstmt.setInt(1, balance);
			pstmt.setInt(2, 2);
			updateRowCount = pstmt.executeUpdate();
			System.out.println("2 번계좌 updateRowCount:"+updateRowCount);
		
			pstmt = con.prepareStatement(updateSql);
			pstmt.setInt(1, balance);
			pstmt.setInt(2, 3);
			updateRowCount = pstmt.executeUpdate();
			System.out.println("3 번계좌 updateRowCount"+updateRowCount);
			
			/*
			 * 예외발생
			 */
			if(exceptionCondition) {
				throw new Exception("모든잔고갱신예외");
			}
			
			pstmt = con.prepareStatement(updateSql);
			pstmt.setInt(1, balance);
			pstmt.setInt(2, 4);
			updateRowCount = pstmt.executeUpdate();
			System.out.println("4 번계좌 updateRowCount"+updateRowCount);
			
			pstmt = con.prepareStatement(updateSql);
			pstmt.setInt(1, balance);
			pstmt.setInt(2, 5);
			updateRowCount = pstmt.executeUpdate();
			System.out.println("5 번계좌 updateRowCount"+updateRowCount);
			
			pstmt = con.prepareStatement(updateSql);
			pstmt.setInt(1, balance);
			pstmt.setInt(2, 6);
			updateRowCount = pstmt.executeUpdate();
			System.out.println("6 번계좌 updateRowCount"+updateRowCount);
			
			
			System.out.println("-----------updateBalance transaction end[commit]--------------");
			//con.commit();
		}catch (Exception e) {
			try {
				System.out.println("99.예외발생:"+e.getMessage());
				//System.out.println("-----------updateBalance transaction end[rollback]--------------");
				//con.rollback();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			
		}
		
	}
	
}

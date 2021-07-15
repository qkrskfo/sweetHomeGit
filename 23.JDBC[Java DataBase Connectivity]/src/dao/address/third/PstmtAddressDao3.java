package dao.address.third;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;



public class PstmtAddressDao3 {
public PstmtAddress selectByNo(int num) throws Exception {
		
		/**************DB 접속 정보*************/
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper2";
		String password = "javadeveloper2";
		/**************************************/
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		
		PstmtAddress pstmtFindAddress = null; //-- void 대신 Address로 받게되면
		
		String selectSql = "select no,id,name,phone,address from address where no = ?";
		
		PreparedStatement pstmt = con.prepareStatement(selectSql);
		pstmt.setInt(1, num);
		ResultSet rs = pstmt.executeQuery();
		
		
		while(rs.next()) {
			int no = rs.getInt("NO");
			String id = rs.getString("id");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String address = rs.getString("address");
			pstmtFindAddress = new PstmtAddress(num, id, name, phone, address);
		}
		
		rs.close();
		pstmt.close();
		con.close();
		return pstmtFindAddress;
	}
	
	public ArrayList<PstmtAddress> selectAll() throws Exception {
		
		/**************DB 접속 정보*************/
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper2";
		String password = "javadeveloper2";
		/**************************************/

		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		
		//-- void 대신 Address로 받게되는데. 여러개니까 arraylist로 받는 것.
		ArrayList<PstmtAddress> pstmtAddressList = new ArrayList<PstmtAddress>();
		
		String selectSql = "select * from address";
		
		PreparedStatement pstmt = con.prepareStatement(selectSql);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			int no = rs.getInt("NO");
			String id = rs.getString("id");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String address = rs.getString("address");
			PstmtAddress tempAddress = new PstmtAddress(no, id, name, phone, address);
			pstmtAddressList.add(tempAddress);
		}
		
		rs.close();
		pstmt.close();
		con.close();
		return pstmtAddressList;
		
	}
	
	
	public void deleteByNo(int num) throws Exception {
			
		/**************DB 접속 정보*************/
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper2";
		String password = "javadeveloper2";
		/**************************************/
	
		String deleteSql = "delete from address where no=?";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt = con.prepareStatement(deleteSql);
		pstmt.setInt(1, num);
		
		int deleteRowCount = pstmt.executeUpdate();
		System.out.println(">> "+deleteRowCount+"행 delete");
	
		pstmt.close();
		con.close();
	}
	
	
	public void insert(PstmtAddress pstmtAddress) throws Exception {
		/**************DB 접속 정보*************/
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper2";
		String password = "javadeveloper2";
		/**************************************/
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		
		String insertSql = "insert into address values(address_no_seq.nextval, ?, ?, ?, ?)";
		
		PreparedStatement pstmt = con.prepareStatement(insertSql);
		
		pstmt.setString(1, pstmtAddress.getId());
		pstmt.setString(2, pstmtAddress.getName());
		pstmt.setString(3, pstmtAddress.getPhone());
		pstmt.setString(4, pstmtAddress.getAddress());
		
		int insertRowCount = pstmt.executeUpdate();
		System.out.println(">> "+insertRowCount+"행이 insert된다");
			
		pstmt.close();
		con.close();
	}
	
	
	public void updateByNo(PstmtAddress updateAddress) throws Exception {
		
		/**************DB 접속 정보*************/
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper2";
		String password = "javadeveloper2";
		/***************************************/

		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		
		String updateSql = "update address set id=?, name=?, phone=?, address=? where no=?";
		
		PreparedStatement pstmt = con.prepareStatement(updateSql);
		pstmt.setString(1, updateAddress.getId());
		pstmt.setString(2, updateAddress.getName());
		pstmt.setString(3, updateAddress.getPhone());
		pstmt.setString(4, updateAddress.getAddress());
		pstmt.setInt(5, updateAddress.getNum());
		
		int updateRowCount = pstmt.executeUpdate();
		System.out.println(">> "+updateRowCount+"행 update");
		
		pstmt.close();
		con.close();
		
	}
	
}

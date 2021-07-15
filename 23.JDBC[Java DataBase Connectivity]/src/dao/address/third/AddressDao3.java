package dao.address.third;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;



public class AddressDao3 {
public Address selectByNo(int num) throws Exception {
		
		/**************DB 접속 정보*************/
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper2";
		String password = "javadeveloper2";
		/**************************************/
		
		Address findAddress = null; //-- void 대신 Address로 받게되면
		
		String selectSql = "select no,id,name,phone,address from address where no ="+num;
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(selectSql);
		
		// if였는데 강사님이 while로 고치셨네..
		while(rs.next()) {
			int no = rs.getInt("NO");
			String id = rs.getString("id");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String address = rs.getString("address");
			findAddress = new Address(num, id, name, phone, address);
			// System.out.println(no + "\t" + id + "\t" + name + "\t" + phone + "\t" + address);
		}
		
		rs.close();
		stmt.close();
		con.close();
		return findAddress;
	}
	
	public ArrayList<Address> selectAll() throws Exception {
		
		/**************DB 접속 정보*************/
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper2";
		String password = "javadeveloper2";
		/**************************************/

		//-- void 대신 Address로 받게되는데. 여러개니까 arraylist로 받는 것.
		ArrayList<Address> addressList = new ArrayList<Address>();
		
		String selectSql = "select no,id,name,phone,address from address";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(selectSql);
		
		while(rs.next()) {
			int no = rs.getInt("NO");
			String id = rs.getString("id");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String address = rs.getString("address");
			// System.out.println(no + "\t" + id + "\t" + name + "\t" + phone + "\t" + address);
			Address tempAddress = new Address(no, id, name, phone, address);
			addressList.add(tempAddress);
		}
		
		rs.close();
		stmt.close();
		con.close();
		return addressList;
		
	}
	
	
	
	
	
	
	public void insert(Address address) throws Exception {
		/**************DB 접속 정보*************/
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper2";
		String password = "javadeveloper2";
		/**************************************/
		
		String insertSql = "insert into address values(address_no_seq.nextval,'" +	address.getId() + "','" + address.getName() + "','" + 
				address.getPhone() + "','" + 
				address.getAddress() + "')";

		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		int insertRowCount = stmt.executeUpdate(insertSql);
		System.out.println(">> "+insertRowCount+"행이 insert된다");
			
		stmt.close();
		con.close();
	}
	
	public void insert(String id, String name, String phone, String address) throws Exception {
		/**************DB 접속 정보*************/
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper2";
		String password = "javadeveloper2";
		/**************************************/
		
		String insertSql = "insert into address values(address_no_seq.nextval,'" + id + "','" + name + "','" + phone + "','" + address + "')";

		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		int insertRowCount = stmt.executeUpdate(insertSql);
		System.out.println(">> "+insertRowCount+"행이 insert된다");
			
		stmt.close();
		con.close();
	}
	
	
	public void deleteByNo(int num) throws Exception {
		
		/**************DB 접속 정보*************/
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper2";
		String password = "javadeveloper2";
		/**************************************/

		String deleteSql = "delete from address where no="+num;
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		int deleteRowCount = stmt.executeUpdate(deleteSql);
		System.out.println(">> "+deleteRowCount+"행 delete");

		stmt.close();
		con.close();
	}
	
	public void updateByNo(Address updateAddress) throws Exception {
		
		/**************DB 접속 정보*************/
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper2";
		String password = "javadeveloper2";
		/***************************************/

		String updateSql = "update address set id='"+updateAddress.getId()+"',name='"+updateAddress.getName()+"',phone='"+updateAddress.getPhone()+"',address='"+updateAddress.getAddress()+ "' where no='" + updateAddress.getNum() + "'";
		
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		int updateRowCount = stmt.executeUpdate(updateSql);
		System.out.println(">> "+updateRowCount+"행 update");
		System.out.println("update sql: "+updateSql); // -> 팔팔팔 잘 됐는지 확인

		stmt.close();
		con.close();
		
	}
	/*
	public void updateByNoId(int no, String id) {}
	public void updateByNoName(int no, String name) {}
	public void updateByNoAddress(int no, String address) {}
	public void updateByNoPhone(int no, String phone) {}
	*/
	
	public void updateByNo(int num, String id, String name, String phone, String address) throws Exception {
		
		/**************DB 접속 정보*************/
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper2";
		String password = "javadeveloper2";
		/***************************************/

		String updateSql = "update address set id='"+id+"',name='"+name+"',phone='"+phone+"',address='"+address+"' where no = " + num;
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		int updateRowCount = stmt.executeUpdate(updateSql);
		System.out.println(">> "+updateRowCount+"행 update");
		System.out.println("update sql: "+updateSql); // -> 팔팔팔 잘 됐는지 확인

		stmt.close();
		con.close();
	}
	
	
}

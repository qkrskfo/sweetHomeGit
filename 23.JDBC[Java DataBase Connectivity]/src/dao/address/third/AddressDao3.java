package dao.address.third;
/*
Dao(Data Access Object)
 - Address들의 데이터를 저장하고있는 Address 테이블에
   CRUD(Create, Read, Update, Delete) 작업을 할수있는
   단위(???)메쏘드를 가지고있는 클래스
 - AddressService객체의 요청(메쏘드호출)을 받아서 
   Data Access(DB)에 관련된 단위기능(CRUD)을
   수행하는 객체
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class AddressDao3 {
	public Address selectByNo(int no) throws Exception {
		/*********************DB접속정보*********************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper0";
		String password = "javadeveloper0";
		/*******************************************/
		Address findAddres = null;
		String selectSql = "select no,id,name,phone,address from address where no=" + no;//semicolon있으면 애로사항발생~~~~
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectSql);

		while (rs.next()) {

			int n = rs.getInt("no");
			String id = rs.getString("id");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String address = rs.getString("address");
			findAddres = new Address(n, id, name, phone, address);
			//System.out.println(n + "\t" + id + "\t" + name + "\t" + phone + "\t" + address);
		}

		rs.close();
		stmt.close();
		con.close();
		return findAddres;
	}

	public ArrayList<Address> selectAll() throws Exception {
		/*********************DB접속정보*********************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper2";
		String password = "javadeveloper2";
		/*******************************************/
		
		//-- void 대신 Address로 받게되는데. 여러개니까 arraylist로 받는 것.
		ArrayList<Address> addressList = new ArrayList<Address>();
		String selectSql = "select no,id,name,phone,address from address";//semicolon있으면 애로사항발생~~~~
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery(selectSql);

		while (rs.next()) {
			int no = rs.getInt("no");
			String id = rs.getString("id");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String address = rs.getString("address");
			//System.out.println(no + "\t" + id + "\t" + name + "\t" + phone + "\t" + address);
			Address tempAddress = new Address(no, id, name, phone, address);
			addressList.add(tempAddress);
		}
		rs.close();
		stmt.close();
		con.close();
		return addressList;
	}

	public int insert(Address address) throws Exception {
		/*********************DB접속정보*********************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper0";
		String password = "javadeveloper0";
		/*******************************************/
		String insertSql = "insert into address values(address_no_seq.nextval,'" + address.getId() + "','"
				+ address.getName() + "','" + address.getPhone() + "','" + address.getAddress() + "')";//semicolon있으면 애로사항발생~~~~
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int insertRowCount = stmt.executeUpdate(insertSql);
		System.out.println(">> " + insertRowCount + " 행 insert");
		stmt.close();
		con.close();
		return insertRowCount;
	}

	public int insert(String id, String name, String phone, String address) throws Exception {
		/*********************DB접속정보*********************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper0";
		String password = "javadeveloper0";
		/*******************************************/
		String insertSql = "insert into address values(address_no_seq.nextval,'" + id + "','" + name + "','" + phone
				+ "','" + address + "')";//semicolon있으면 애로사항발생~~~~
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int insertRowCount = stmt.executeUpdate(insertSql);
		System.out.println(">> " + insertRowCount + " 행 insert");
		stmt.close();
		con.close();
		return insertRowCount;
	}

	public int deleteByNo(int no) throws Exception {
		/*********************DB접속정보*********************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper0";
		String password = "javadeveloper0";
		/*******************************************/
		String deleteSql = "delete from address where no=" + no;//semicolon있으면 애로사항발생~~~~
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();

		int deleteRowCount = stmt.executeUpdate(deleteSql);
		System.out.println(">> " + deleteRowCount + " 행 delete");
		stmt.close();
		con.close();
		return deleteRowCount;
	}

	public int updateByNo(Address updateAdress) throws Exception {
		/*********************DB접속정보*********************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper0";
		String password = "javadeveloper0";
		/*******************************************/
		String updateSql = "update address set id='" + updateAdress.getId() + "',name='" + updateAdress.getName()
				+ "',phone='" + updateAdress.getPhone() + "',address='" + updateAdress.getAddress() + "' where no = "
				+ updateAdress.getNo();//semicolon있으면 애로사항발생~~~~

		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();

		int updateRowCount = stmt.executeUpdate(updateSql);
		System.out.println(">> " + updateRowCount + " 행 update");
		System.out.println("update sql:" + updateSql);
		stmt.close();
		con.close();
		return updateRowCount;
	}

	/*
	public void updateByNoId(int no, String id) {}
	public void updateByNoName(int no, String name) {}
	public void updateByNoAddress(int no, String address) {}
	public void updateByNoPhone(int no, String phone) {}
	*/
	public int updateByNo(int no, String id, String name, String phone, String address) throws Exception {
		/*********************DB접속정보*********************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper0";
		String password = "javadeveloper0";
		/*******************************************/
		String updateSql = "update address set id='" + id + "',name='" + name + "',phone='" + phone + "',address='"
				+ address + "' where no = " + no;//semicolon있으면 애로사항발생~~~~

		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();

		int updateRowCount = stmt.executeUpdate(updateSql);
		System.out.println(">> " + updateRowCount + " 행 update");
		System.out.println("update sql:" + updateSql);
		stmt.close();
		con.close();
		return updateRowCount;
	}

}

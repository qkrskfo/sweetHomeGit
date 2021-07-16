package dao.address.fourth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


// 모든 DAO객체는 dataSource를 멤버변수로 갖고 있어.
public class AddressDao {
	
	private DataSource dataSource; // addressdao가 datasource의 참조를 가지고 있으면 밑에 connection에서 쓸 수 있음 //1★
	
	public AddressDao() { //2★
		this.dataSource = new DataSource();
	}
	
	public Address selectByNo(int num) throws Exception {
			
			Address findAddress = null; //-- void 대신 Address로 받게되면
			String selectSql = "select no,id,name,phone,address from address where no =?";
			
			Connection con = dataSource.getConnection(); // dataSource로 부터 커넥션을 받아서 쓰라고 하는 것. 리턴해야 에러 없어짐 //3★
			PreparedStatement pstmt = con.prepareStatement(selectSql); //4 얘네 세트야 ★
			pstmt.setInt(1, num);
			ResultSet rs = pstmt.executeQuery();
			
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
			pstmt.close();
		//	con.close(); 닫는거 여기서 하지마
			dataSource.releaseConnection(con); // 이렇게 닫아!
			return findAddress;
		}
	
	public ArrayList<Address> selectAll() throws Exception {

		ArrayList<Address> addressList = new ArrayList<Address>();
		
		String selectSql = "select no,id,name,phone,address from address";
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(selectSql);
		
		ResultSet rs = pstmt.executeQuery();
		
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
		pstmt.close();
		dataSource.releaseConnection(con); // 이렇게 닫아!
		return addressList;
		
	}
	
	
	
	
	public int insert(Address address) throws Exception {
		
		String insertSql = "insert into address values(address_no_seq.nextval, ?, ?, ?, ?)";

		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(insertSql);
		
		int insertRowCount = pstmt.executeUpdate();
		
		pstmt.setString(1, address.getId());
		pstmt.setString(2, address.getName());
		pstmt.setString(3, address.getPhone());
		pstmt.setString(4, address.getAddress());
			
		pstmt.close();
		dataSource.releaseConnection(con); // 이렇게 닫아!
		return insertRowCount;
	}
	
	
	public int deleteByNo(int num) throws Exception {

		String deleteSql = "delete from address where no=?";
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(deleteSql);
		pstmt.setInt(1, num);
		int deleteRowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.releaseConnection(con); // 이렇게 닫아!
		return deleteRowCount;
	}
	
	public int updateByNo(Address updateAddress) throws Exception {

		String updateSql = "update address set id=?, name=?, phone=? ,address=? where no=?";
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(updateSql);
		pstmt.setString(1, updateAddress.getId());
		pstmt.setString(2, updateAddress.getName());
		pstmt.setString(3, updateAddress.getPhone());
		pstmt.setString(4, updateAddress.getAddress());
		pstmt.setInt(5, updateAddress.getNum());
		
		int updateRowCount = pstmt.executeUpdate();

		pstmt.close();
		dataSource.releaseConnection(con); // 이렇게 닫아!
		return updateRowCount;
		
	}
	
	
}

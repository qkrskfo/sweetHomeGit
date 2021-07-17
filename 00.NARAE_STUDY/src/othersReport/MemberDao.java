package othersReport;

//백상열님꺼 - 날짜 넣는거 보려고

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

// import dao.common.DataSource;  요거 안됨
/*
Dao(Data Access Object)
 - 회원들의 데이터를 저장하고있는 테이블에
   CRUD(Create, Read, Update, Delete) 작업을 할수있는
   단위메쏘드를 가지고있는 클래스
 - MemberService객체 의 요청(메쏘드호출)을 받아서 
   Data Access(File, DB)에 관련된 단위기능(CRUD)을
   수행하는 객체
 - DataSource 객체를 멤버로 가진다.
 */
public class MemberDao {
	
	private DataSource dataSource;
	
	public MemberDao() {
		this.dataSource = new DataSource();
	}
	
	public int insert(Member member) throws Exception{
		String insertSql = "INSERT INTO member (m_id, m_password, m_name, m_address, m_age, m_married, m_regdate) VALUES (?, ?, ?, ?, ?, ?, ?)";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(insertSql);
		pstmt.setString(1, member.getM_id());
		pstmt.setString(2, member.getM_password());
		pstmt.setString(3, member.getM_name());
		pstmt.setString(4, member.getM_address());
		pstmt.setInt(5, member.getM_age());
		pstmt.setString(6, member.getM_married());
		pstmt.setDate(7, new Date(member.getM_regdate().getTime()));
		int insertRowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.releaseConnection(con);
		return insertRowCount;
	}
	
	public int deleteById(String m_id) throws Exception{
		String deleteSql = "delete member where m_id = ?";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(deleteSql);
		pstmt.setString(1, m_id);
		int deleteRowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.releaseConnection(con);
		return deleteRowCount;
	}
	
	public int updateById(Member member) throws Exception{
		String updateSql = "update member set m_password = ?, m_name = ?, m_address = ?, m_age = ?, m_married = ?, m_regdate = ? where m_id = ?";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(updateSql);
		pstmt.setString(1, member.getM_password());
		pstmt.setString(2, member.getM_name());
		pstmt.setString(3, member.getM_address());
		pstmt.setInt(4, member.getM_age());
		pstmt.setString(5, member.getM_married());
		pstmt.setDate(6, new Date(member.getM_regdate().getTime()));
		pstmt.setString(7, member.getM_id());
		int updateRowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.releaseConnection(con);
		return updateRowCount;
	}
	
	public Member selectById(String m_id) throws Exception{
		Member findMember = null;
		String selectSql = "select * from member where m_id = ?";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(selectSql);
		pstmt.setString(1, m_id);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			String id = rs.getString("m_id");
			String password = rs.getString("m_password");
			String name = rs.getString("m_name");
			String address = rs.getString("m_address");
			int age = rs.getInt("m_age");
			String married = rs.getString("m_married");
			Date regdate = rs.getDate("m_regdate");
			findMember = new Member(id, password, name, address, age, married, regdate);
		}
		pstmt.close();
		dataSource.releaseConnection(con);
		return findMember;
	}
	
	public ArrayList<Member> selectAll() throws Exception{
		ArrayList<Member> memberList = new ArrayList<Member>();
		String selectSql = "select * from member";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(selectSql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			String id = rs.getString("m_id");
			String password = rs.getString("m_password");
			String name = rs.getString("m_name");
			String address = rs.getString("m_address");
			int age = rs.getInt("m_age");
			String married = rs.getString("m_married");
			Date regdate = rs.getDate("m_regdate");
			memberList.add(new Member(id, password, name, address, age, married, regdate));
		}
		pstmt.close();
		dataSource.releaseConnection(con);
		return memberList;
	}
}
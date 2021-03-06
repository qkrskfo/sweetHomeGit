package com.itwill07.dao.member;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.itwill07.dao.common.DataSource;

public class MemberDao {
	
	private DataSource dataSource;

	public MemberDao() {
		dataSource = new DataSource();
	}
	
	public int insert(Member member) throws Exception {
		
		String insertSql = "insert into member values(?, ?, ?, ?, ?, ?, sysdate)";
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(insertSql);
		
		pstmt.setString(1, member.getM_id());
		pstmt.setString(2, member.getM_password());
		pstmt.setString(3, member.getM_name());
		pstmt.setString(4, member.getM_address());
		pstmt.setInt(5, member.getM_age());
		pstmt.setString(6, member.getM_married());
		//date 넣기 어려움ㅠㅠ★
		
		int insertRowCount = pstmt.executeUpdate();
		
		pstmt.close();
		dataSource.releaseConnection(con);
		
		return insertRowCount;
	}
	
	public int deleteById(String m_id) throws Exception {
		String deleteSql = "delete from member where m_id=?";
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(deleteSql);
		
		pstmt.setString(1, m_id);
		
		int deleteRowCount = pstmt.executeUpdate();
		
		pstmt.close();
		dataSource.releaseConnection(con);
		
		return deleteRowCount;
	}
	
	public int updateById(Member member) throws Exception {
		String updateSql = "update member set m_password=?, m_name=?, m_address=?, m_age=?, m_married=? where m_id=? ";
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(updateSql);
		
		pstmt.setString(1, member.getM_password());
		pstmt.setString(2, member.getM_name());
		pstmt.setString(3, member.getM_address());
		pstmt.setInt(4, member.getM_age());
		pstmt.setString(5, member.getM_married());
		pstmt.setString(6, member.getM_id());
		
		int updateRowCount = pstmt.executeUpdate();
		
		pstmt.close();
		dataSource.releaseConnection(con);
		
		return updateRowCount;
	}
	
	public Member selectById(String m_id) throws Exception {
		
		String selectSql = "select * from member where m_id = ?";
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(selectSql);
		
		Member findMember = null;
		
		pstmt.setString(1, m_id);
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			String id = rs.getString("m_id");
			String password = rs.getString("m_password");
			String name = rs.getString("m_name");
			String address = rs.getString("m_address");
			int age = rs.getInt("m_age");
			String married = rs.getString("m_married");
			Date date = rs.getDate("m_regidate");
			findMember = new Member(id, password, name, address, age, married, date);
		}
		
		rs.close();
		pstmt.close();
		dataSource.releaseConnection(con);
		
		return findMember;
	}
	
	public ArrayList<Member> selectAll() throws Exception {
		
		String selectAllSql = "select * from member";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(selectAllSql);
								
		ArrayList<Member> memberList = new ArrayList<Member>();
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			String id = rs.getString("m_id");
			String password = rs.getString("m_password");
			String name = rs.getString("m_name");
			String address = rs.getString("m_address");
			int age = rs.getInt("m_age");
			String married = rs.getString("m_married");
			Date date = rs.getDate("m_regidate");
			Member tempMember = new Member(id, password, name, address, age, married, date);
			memberList.add(tempMember);
		}
		
		rs.close();
		pstmt.close();
		dataSource.releaseConnection(con);
		
		return memberList;
	}
	
}

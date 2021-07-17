package com.itwill07.dao.guest;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.itwill07.dao.common.DataSource;

public class GuestDao {
	private DataSource dataSource;

	public GuestDao() {
		dataSource = new DataSource();
	}

	/*
		 이름             널?       유형             
	-------------- -------- -------------- 
	GUEST_NO       NOT NULL NUMBER(10)     
	GUEST_NAME     NOT NULL VARCHAR2(100)  
	GUEST_DATE     NOT NULL DATE           
	GUEST_EMAIL             VARCHAR2(100)  
	GUEST_HOMEPAGE          VARCHAR2(100)  
	GUEST_TITLE    NOT NULL VARCHAR2(255)  
	GUEST_CONTENT  NOT NULL VARCHAR2(4000) 
		 
	 */
	
	public int insertGuest(Guest guest) throws Exception {
		String insertSql = "insert into guest values(guest_no_seq.nextval, ?, sysdate, ?, ?, ?, ?)";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(insertSql);
		
		pstmt.setString(1, guest.getGuest_name());
		pstmt.setString(2, guest.getGuest_email());
		pstmt.setString(3, guest.getGuest_homepage());
		pstmt.setString(4, guest.getGuest_title());
		pstmt.setString(5, guest.getGuest_content());
		
		int insertRowCount = pstmt.executeUpdate();
		
		pstmt.close();
		dataSource.releaseConnection(con);
		
		return insertRowCount;
	}

	public Guest selectByNo(int num) throws Exception {
		
		Guest findGuest = null;
		
		String selectSql = "select * from guest where guest_no = ?";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(selectSql);
		
		pstmt.setInt(1, num);
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			int no = rs.getInt("guest_no");
			String name = rs.getString("guest_name");
			Date date = rs.getDate("guest_date");
			String dateStr = new SimpleDateFormat("yyyy/MM/dd").format(date);
			String email =rs.getString("guest_email");
			String homepage =rs.getString("guest_homepage");
			String title =rs.getString("guest_title");
			String content =rs.getString("guest_content");
			findGuest = new Guest(no, name, dateStr, email, homepage, title, content);
		}
		
		rs.close();
		pstmt.close();
		dataSource.releaseConnection(con);
		return findGuest;
	}

	public ArrayList<Guest> selectAll() throws Exception {
		
		ArrayList<Guest> guestList = new ArrayList<Guest>();
		
		String selectAllSql = "select * from guest";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(selectAllSql);
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			int no = rs.getInt("guest_no");
			String name = rs.getString("guest_name");
			Date date = rs.getDate("guest_date");
			String dateStr = new SimpleDateFormat("yyyy/MM/dd").format(date);
			String email =rs.getString("guest_email");
			String homepage =rs.getString("guest_homepage");
			String title =rs.getString("guest_title");
			String content =rs.getString("guest_content");
			Guest tempGuest = new Guest(no, name, dateStr, email, homepage, title, content);
			guestList.add(tempGuest);
		}
		
		rs.close();
		pstmt.close();
		dataSource.releaseConnection(con);
		
		return guestList;
		
	}

	public int updateGuest(Guest guest) throws Exception {
		String updateSql = "update guest set guest_name=?, guest_email=?, guest_homepage=?, guest_title=?, guest_content=? where guest_no=?";
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(updateSql);
		
		pstmt.setString(1, guest.getGuest_name());
		pstmt.setString(2, guest.getGuest_email());
		pstmt.setString(3, guest.getGuest_homepage());
		pstmt.setString(4, guest.getGuest_title());
		pstmt.setString(5, guest.getGuest_content());
		pstmt.setInt(6, guest.getGuest_no());
		
		int updateRowCount = pstmt.executeUpdate();
		
		pstmt.close();
		dataSource.releaseConnection(con);
		
		return updateRowCount;
	}

	public int deleteGuest(int num) throws Exception {
		
		String deleteSql = "delete from guest where guest_no = ?";
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(deleteSql);
		
		pstmt.setInt(1, num);
		
		int deleteRowCount = pstmt.executeUpdate();
		
		pstmt.close();
		dataSource.releaseConnection(con);
		
		return deleteRowCount;
	}

}
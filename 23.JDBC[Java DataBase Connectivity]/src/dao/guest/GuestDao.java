package dao.guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import dao.common.DataSource;
import dao.member.Member;

public class GuestDao {
	private DataSource dataSource;

	public GuestDao() throws Exception {
		dataSource = new DataSource();
	}

	public int insertGuest(Guest guest) throws Exception {
		String insertSql = "";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(insertSql);
		
		return 0;
	}

	public Guest selectByNo(int no) throws Exception {
		String selectSql = "";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(selectSql);
		
		// RO MAPPING : 관계형 DB 객체를 매핑한다고?
		Guest findGuest = null;
		
		return findGuest;
	}

	public ArrayList<Guest> selectAll() throws Exception {
		return null;
	}

	public int updateGuest(Guest guest) throws Exception {
		String updateSql = "";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(updateSql);
		
		return 0;
	}

	public int deleteGuest(int no) throws Exception {
		String deleteSql = "";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(deleteSql);
		
		return 0;
	}

}
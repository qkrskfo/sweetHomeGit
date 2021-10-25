package dao.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import dao.common.DataSource;

/*
Dao(Data Access Object)
 - member 들의 데이터를 저장하고있는 member 테이블에
   CRUD(Create, Read, Update, Delete) 작업을 할수있는
   단위(???)메쏘드를 가지고있는 클래스
 - MemberService객체의 요청(메쏘드호출)을 받아서 
   Data Access(DB)에 관련된 단위기능(CRUD)을
   수행하는 객체
 - DataSource객체를 멤버로가진다.  
 */

public class MemberDao {
	private DataSource dataSource;

	public MemberDao() {
		dataSource = new DataSource();
	}

	public int insert(Member member) throws Exception {
		String insertSql = "";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(insertSql);

		return 0;
	}

	public int deleteById(String m_id) throws Exception {
		String deleteSql = "";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(deleteSql);

		return 0;
	}

	public int updateById(Member member) throws Exception {
		String updateSql = "";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(updateSql);
		return 0;
	}

	public Member selectById(String m_id) throws Exception {
		String selectSql = "";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(selectSql);
		Member findMember = null;
		return findMember;
	}

	public ArrayList<Member> selectAll() throws Exception {
		String selectSql = "";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(selectSql);

		ArrayList<Member> memberList = new ArrayList<Member>();

		return memberList;
	}
}

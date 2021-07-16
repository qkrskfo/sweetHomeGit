package dao.member;

import dao.common.DataSource;

/*
Dao(Data Access Object)
 - member 들의 데이터를 저장하고있는 member테이블에
   CRUD(Create, Read, Update, Delete) 작업을 할 수 있는
   단위 메쏘드를 가지고있는 클래스

 - MemberService객체의 요청(메쏘드호출)을 받아서 
   Data Access(File, DB)에 관련된 단위기능(CRUD)을 수행하는 객체
   
 - DataSource객체를 멤버로 가진다
 */

public class MemberDao {
	
	private DataSource dataSource;

	public MemberDao() {
		dataSource = new DataSource();
	}
	
	public int insert() throws Exception {
		return 0;
	}
	
	public int deleteById() throws Exception {
		return 0;
	}
	
	public int updateById() throws Exception {
		return 0;
	}
	
	public void selectById() throws Exception {
		
	}
	
	public void selectAll() throws Exception {
		
	}
	
}

package dao.guest;

import java.util.ArrayList;

import dao.common.DataSource;

public class GuestDao {
	private DataSource dataSource;

	public GuestDao() throws Exception {
		dataSource = new DataSource();
	}

	public int insertGuest(Guest guest) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public Guest selectByNo(int no) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Guest> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateGuest(Guest guest) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteGuest(int no) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}

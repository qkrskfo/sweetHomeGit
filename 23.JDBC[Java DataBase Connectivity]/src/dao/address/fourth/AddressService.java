package dao.address.fourth;

import java.util.ArrayList;

/*
Service 객체
 	- 주소록 비즈니스로직(업무)을 수행하는 클래스
 	- Presentation객체(서블릿,JSP)에서 직접접근(메쏘드호출)하는 클래스
 	- AddressDao 객체를 멤버변수로 가지고 있음
 	- 주소록 업무수행 메소드에서 database접근(CRUD)이 필요하면 Dao를 사용한다.
*/

public class AddressService {
	private AddressDao addressDao;
	public AddressService() {
		addressDao = new AddressDao();
	}
	
	public Address selectByNo(int num) throws Exception {
		Address address = addressDao.selectByNo(num);
		return address;
	}
	
	public ArrayList<Address> selectAll() throws Exception {
		ArrayList<Address> addressList = addressDao.selectAll();
		return addressList;
	}
	
	public int insert(Address address) throws Exception {
		int insertRowCount = addressDao.insert(address);
		return insertRowCount;
	}
	
	public int deleteByNo(int num) throws Exception {
		return addressDao.deleteByNo(num);
	}
	
	public int updateByNo(Address updateAddress) throws Exception {
		return addressDao.updateByNo(updateAddress);
	}
	
	
}

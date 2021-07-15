package dao.address.third;

import java.util.ArrayList;

public class PstmtAddressDao3Main {

	public static void main(String[] args) throws Exception {
		
		PstmtAddressDao3 pstmtAddressDao3 = new PstmtAddressDao3();
		
		System.out.println(">> selectByNo");
		PstmtAddress pstmtFindAddress = pstmtAddressDao3.selectByNo(5);
		System.out.println(pstmtFindAddress);
			

		System.out.println(">> selectAll");
		ArrayList<PstmtAddress> pstmtAddressList = pstmtAddressDao3.selectAll();
		for (PstmtAddress pstmtAddress : pstmtAddressList) {
			System.out.println(pstmtAddressList);
		}
		
		System.out.println(">> delete");
		pstmtAddressDao3.deleteByNo(4);
		
		System.out.println(">> insert1");
		PstmtAddress insertAddress1 = new PstmtAddress(0, "vvv", "김부이", "111-9090", "제주시민");
		pstmtAddressDao3.insert(insertAddress1);
		
		System.out.println(">> insert2");
		PstmtAddress insertAddress2 = new PstmtAddress(0, "ccc", "김수미", "234-7690", "부산시 강서구");
		pstmtAddressDao3.insert(insertAddress2);
		
		
		System.out.println(">> update");
		PstmtAddress updateAddress = new PstmtAddress(3, "summer", "박나래", "777-8888", "부산시 강서구");
		pstmtAddressDao3.updateByNo(updateAddress);
		
		
		
		
		
		
		
		
		
	}

}

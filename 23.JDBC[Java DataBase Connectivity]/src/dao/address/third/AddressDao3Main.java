package dao.address.third;

import dao.address.second.AddressDao2;

public class AddressDao3Main {

	public static void main(String[] args) throws Exception {
		AddressDao3 addressDao3 = new AddressDao3();
		
		System.out.println(">> delete");
		addressDao3.deleteByNo(4);
		
		System.out.println(">> selectByNo");
		addressDao3.selectByNo(9);
		
		System.out.println(">> selectAll");
		addressDao3.selectAll();
		
		System.out.println(">> insert");
		addressDao3.insert("zzz", "김수로", "888-9090", "서울시 양천구");
		// index는 외부에서 핸들링하지 않음
		addressDao3.insert("ccc", "김수미", "234-7690", "부산시 강서구");
		// addressdao2에 싱글쿼테이션, 더블쿼테이션을 다 써야하나봄.
		
		System.out.println(">> update");
		addressDao3.updateByNo(8, "eight", "팔팔팔", "888-8888", "수원시 팔달구");
		// 선택적 수정이 안되고 각 항목 모두 수정되야 함..
	}

}

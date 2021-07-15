package dao.address.third;

public class AddressDao3Main {

	public static void main(String[] args) throws Exception {
		
		AddressDao3 addressDao3 = new AddressDao3();
		
		
		
		System.out.println(">> delete");
		addressDao3.deleteByNo(4);
		
		
		
		/***** select *****/	
		System.out.println(">> selectByNo");
		addressDao3.selectByNo(9);
		
		System.out.println(">> selectAll");
		addressDao3.selectAll();
		
		
		

		/*****case 1 *****/		
		System.out.println(">> insert");
		addressDao3.insert("zzz", "김수로", "888-9090", "서울시 양천구");
		// index는 외부에서 핸들링하지 않음
		addressDao3.insert("ccc", "김수미", "234-7690", "부산시 강서구");
		// addressdao3에 싱글쿼테이션, 더블쿼테이션을 다 써야하나봄.
		
		System.out.println(">> update");
		addressDao3.updateByNo(8, "eight", "팔팔팔", "888-8888", "수원시 팔달구");
		// 선택적 수정이 안되고 각 항목 모두 수정되야 함..
		
		
		
		/*****case 2 (DTO Address)*****/
		Address insertAddress = new Address(0, "vvv", "김부이", "111-9090", "제주시민");
		addressDao3.insert(insertAddress);
		
		
		System.out.println(">> update");
		Address updateAddress = new Address(9, "nine", "구구구", "999-9999", "서울시 구로구");
		addressDao3.updateByNo(updateAddress);
		// 선택적 수정이 안되고 각 항목 모두 수정되야 함..
		
		
		
		
		
		
		
		
	}

}

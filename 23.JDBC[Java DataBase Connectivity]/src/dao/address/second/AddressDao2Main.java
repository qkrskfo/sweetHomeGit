package dao.address.second;

public class AddressDao2Main {

	public static void main(String[] args) throws Exception {

		AddressDao2 addressDao2 = new AddressDao2();
		
		System.out.println(">> delete");
		addressDao2.deleteByNo(4);
		
		System.out.println(">> selectByNo");
		addressDao2.selectByNo(9);
		
		System.out.println(">> selectAll");
		addressDao2.selectAll();
		
		System.out.println(">> insert");
		addressDao2.insert("zzz", "김수로", "888-9090", "서울시 양천구");
		// index는 외부에서 핸들링하지 않음
		
	}

}

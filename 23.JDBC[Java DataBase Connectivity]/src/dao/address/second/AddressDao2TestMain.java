package dao.address.second;

public class AddressDao2TestMain {

	public static void main(String[] args) throws Exception {
		AddressDao2 addressDao2 = new AddressDao2();
		System.out.println(">> delete");
		addressDao2.deleteByNo(11);
		System.out.println(">> selectByNo");
		addressDao2.selectByNo(15);
		System.out.println(">> selectAll");
		addressDao2.selectAll();
		System.out.println(">> insert");
		addressDao2.insert("zzz", "김수로", "888-9090", "서울시민");
		System.out.println(">> update");
		addressDao2.updateByNo(12, "eight", "팔팔팔", "888-8888", "팔도시");

	}

}

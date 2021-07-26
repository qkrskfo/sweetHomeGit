package dao.address.fourth;

public class addressServiceTestMain {

	public static void main(String[] args) throws Exception {

		AddressService addressService = new AddressService();
		System.out.println("1. insert --> " + addressService.insert(new Address(0, "ooo", "왜안들어가는거야?", "555-5555", "오정리")));
		System.out.println("2. update --> " + addressService.updateByNo(new Address(1, "first", "일일일", "111-1111", "일산")));
		System.out.println("3. select By No --> " + addressService.selectByNo(6));
		System.out.println("4. delete By No --> " + addressService.deleteByNo(10));
		System.out.println("5. selectAll --> " + addressService.selectAll());
		
	}

}

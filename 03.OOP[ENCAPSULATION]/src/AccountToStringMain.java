
public class AccountToStringMain {

	public static void main(String[] args) {

		Account account1 = new Account();
		account1.setAccountData(1, "PARK", 900000, 2.5);
		String account1Str = account1.toString();
		System.out.println(account1Str); // --> 재정의가 안되어 있으면 출력값 : Account@15db9742
	}

}

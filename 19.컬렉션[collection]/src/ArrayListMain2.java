import java.util.ArrayList;

public class ArrayListMain2 {

	public static void main(String[] args) {

		System.out.println("object[]");
		Object[] anyTypeArray = new Object[5];
		System.out.println(anyTypeArray);
		Account acc1 = new Account(1111, "bidd", 33000, 0.5);
		Account acc2 = new Account(1111, "bidd", 33000, 0.5);
		Account acc3 = new Account(1111, "bidd", 33000, 0.5);
		Account acc4 = new Account(1111, "bidd", 33000, 0.5);
		Account acc5 = new Account(1111, "bidd", 33000, 0.5);
		
		anyTypeArray[0] = acc1;
		anyTypeArray[1] = acc2;
		anyTypeArray[2] = acc3;
		anyTypeArray[3] = acc4;
		anyTypeArray[4] = acc5;
		
		for (int i = 0; i < anyTypeArray.length; i++) {
			Account tempAccount = (Account)anyTypeArray[i];
			tempAccount.print();
		}
		
		System.out.println("  ");
		ArrayList accountList = new ArrayList();
		System.out.println("ArrayList의 size: "+accountList.size());
		
	}

}

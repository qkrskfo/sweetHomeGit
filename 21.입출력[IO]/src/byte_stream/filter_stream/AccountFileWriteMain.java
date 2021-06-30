package byte_stream.filter_stream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class AccountFileWriteMain {

	public static void main(String[] args) throws Exception {

		/*
		 * Account객체 --> 파일로 저장
		 */
		
		 Account account1 = new Account(1111, "KIM", 20900, 1.2);
		 Account account2 = new Account(2222, "PARK", 1650900, 3.7);
		 
		 DataOutputStream dos = new DataOutputStream(new FileOutputStream("account.ser"));
		 // 빨대를 만들었쬬
		 
		 dos.writeInt(account1.getNo());
		 dos.writeUTF(account1.getOwner());
		 dos.writeInt(account1.getBalance());
		 dos.writeDouble(account1.getInterest());
		 
		 dos.writeInt(account2.getNo());
		 dos.writeUTF(account2.getOwner());
		 dos.writeInt(account2.getBalance());
		 dos.writeDouble(account2.getInterest());
		 
		 dos.close();
		 
		 System.out.println(">>> Account 객체데이터 --> accounts.dat ");
	}
	
}

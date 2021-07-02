package byte_stream.filter_stream;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class AccountArrayListFileReadMain {

	public static void main(String[] args) throws Exception {
		/*
		 * 파일(accountList.ser) --> List<Account>[Quiz]
		 */

		System.out.println("파일(accountList.ser)을 읽어서 --> List<Account> 를 만들기");
		
		DataInputStream dis = new DataInputStream(new FileInputStream("accountList.ser"));
		
		List<Account> accountList = new ArrayList<Account>();
		
		while(true) {
			try {
				accountList.add(new Account(dis.readInt(), dis.readUTF(), dis.readInt(), dis.readDouble()));
			} catch (EOFException e) {
				System.out.println("EOFException 발생"); 
				// EOFException이 발생하면 다 읽은거야. 그만해.
				break;
			} /*finally {
				dis.close();
			}
			*/
		} // end while
		
		dis.close();
		
		Account.headerPrint();
		for (Account account : accountList) {
			// 위에 while로 읽었으니까, 이제 찍어보자
			account.print();
		}
	}

}
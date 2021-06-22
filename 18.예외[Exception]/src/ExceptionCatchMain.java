import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class ExceptionCatchMain {

	public static void main(String[] args) {
		
		System.out.println("stmt1-1");
		
		try {
			System.out.println("smtm1-2");
			Class.forName("First");
			System.out.println("smtm1-3");
			
		} catch (ClassNotFoundException e) {
			// 정상이면 catch를 실행하지 않음.
			
			/*
			 *  catch block --> 예외 발생 시 실행되는 블록
			 *    - 메시지출력
			 *    - 프로그램 정상 실행을 위한 코드 기술
			 *    
			 */
			System.out.println("stmt1-4[catch block]");
			String errorMsg = e.getMessage();
			System.out.println("catch 안에 들어오는 msg: "+errorMsg);
			System.out.println("stmt1-5[catch block]");
			
			// JOptionPane.showMessageDialog(null, "호갱님 죄송합니다.");
			
		} finally {
			/*
			 *  예외 발생과 관계없이 항상 실행하는 블록 (finally)
			 *    - 반드시 실행해야하는 코드 기술(resource를 해지한다던지)
			 */
			System.out.println("smtm1-6[finally]");
		}
		
		System.out.println("stmt2-1");
		try {
			System.out.println("stmt2-2");
			Socket socekt = new Socket("www.daum.net", 80);
			System.out.println("stmt2-3");
		} catch (IOException e) {
			System.out.println("stmt2-4[catch-block]");
			e.printStackTrace();
			System.out.println("stmt2-5[catch-block]");
		}


		System.out.println("stmt3-1");
		First first = new First();
		try {
			System.out.println("stmt3-2");
			first.method1();
			System.out.println("stmt3-3");
		} catch (Exception e) {
			System.out.println("stmt3-4[catch]");
			System.out.println("catch msg: "+e.getMessage());
			System.out.println("stmt3-5[catch]");
		}
		
		
		
		
		System.out.println("stmt99");
	}

}

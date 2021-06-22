import javax.swing.JOptionPane;

public class ExceptionCatchMain2 {

public static void main(String[] args) {
		
		System.out.println("stmt1-1");
		
		try {
			System.out.println("smtm1-2");
			Class.forName("Firstsss");
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
			
		}
		
		System.out.println("stmt4");
	}

}

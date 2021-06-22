import java.io.IOException;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ExceptionMultiCatchMain {
/*
	public static void main(String[] args) { // throws RunTimeException 이게 생략되어있데

		try {
			System.out.println("stmt1");
			Class.forName("First"); // 클래스가 실제로 로딩됨
			System.out.println("stmt2");
			Socket socket = new Socket("www.naver.com", 80);
			
			String str = null;
			str.length();
			
			System.out.println("stmt3");
			First first = new First();
			first.method1();
			System.out.println("stmt4 return");
		} catch (ClassNotFoundException e) {
			System.out.println("catch ClassNotFoundException Start");
			System.out.println("catch msg: "+e.getMessage());
			System.out.println("catch ClassNotFoundException End");
//			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (IOException e) {
			System.out.println("catch IOException Strat");			
			System.out.println("catch msg: "+e.getMessage());
			System.out.println("catch IOException End");
//			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (Exception e) {
			// 이게 상위에 있으면 먼저 잡히니까 밑으로 빼야해
			// 내가 모르는건데 혹시나 있으면 잡아줘
			System.out.println("catch Exception Strat");			
			System.out.println("catch msg: "+e.getMessage());
			System.out.println("catch Exception End");
//			JOptionPane.showMessageDialog(null, "잘 모르는 애로사항이 발생했다");
		}
	}
*/
	
	public static void main(String[] args) { // throws RunTimeException 이게 생략되어있데

		try {
			System.out.println("stmt1");
			Class.forName("First"); // 클래스가 실제로 로딩됨
			System.out.println("stmt2");
			Socket socket = new Socket("www.naver.com", 80);
			
			String str = null;
			str.length();
			
			System.out.println("stmt3");
			First first = new First();
			first.method1();
			System.out.println("stmt4 return");
			
		} catch (Exception e) {
			// 이게 상위에 있으면 먼저 잡히니까 밑으로 빼야해
			// 내가 모르는건데 혹시나 있으면 잡아줘
			System.out.println("catch Exception Strat");			
			System.out.println("catch msg: "+e.getMessage());
			System.out.println("catch Exception End");
			JOptionPane.showMessageDialog(null, "잘 모르는 애로사항이 발생했다");
		}
	}
	
	
}

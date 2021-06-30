package byte_stream.filter_stream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamMain {

	public static void main(String[] args) throws Exception {
		/*
		 * PrintStream
		 * 자바의 모든 데이터를 문자로 출력하는 기능(필터)을 하는 스트림
		 */

		PrintStream ps = new PrintStream(new FileOutputStream("print.txt"));
		
		ps.write(65); // write는 필터링을 하지 않음 --> print.txt에 A가 나오네
		ps.write('A');
		
		ps.print(65); // 필터링을 함. 보이는 그대로 문자로 나타나게 해줌. 
		// --> print.txt에 65가 나옴.
		ps.write('6');
		ps.write('5');
		// --> 이렇게해야 65가 나옴.
		
		ps.print(123456789);
		ps.write('1');
		ps.write('2');
		ps.write('3');
		ps.write('4');
		ps.write('5');
		ps.write('6');
		ps.write('7');
		ps.write('8');
		ps.write('9');
		
		ps.print(true);
		ps.write('t');
		ps.write('r');
		ps.write('u');
		ps.write('e');
		
		ps.print(3.141592);
		ps.write('3');
		ps.write('.');
		ps.write('1');
		ps.write('4');
		ps.write('1');
		ps.write('5');
		ps.write('9');
		ps.write('2');
		
		ps.print(12345);
		ps.write(49); // --> 1의 아스키코드가 49야
		ps.write(50);
		ps.write(51);
		ps.write(52);
		ps.write(53); 
		
		// '김', '박' 등을 write에 쓰면 깨짐. 
		
		System.out.println("--- PrintStream.print() --> print.txt ---");
	}

}

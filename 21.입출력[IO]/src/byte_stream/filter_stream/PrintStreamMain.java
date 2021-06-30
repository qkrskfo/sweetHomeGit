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
		
		ps.write(65); // write는 필터링을 하지 않음
		ps.write('A'); 
	}

}

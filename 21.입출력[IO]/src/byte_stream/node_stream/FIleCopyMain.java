package byte_stream.node_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FIleCopyMain {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("filebig.lnk");
		FileOutputStream fos = new FileOutputStream("filebig_copy.lnk");
		
		int count = 0; // copy가 얼마나 됐는지 찍으려고
		int starCount = 0;
		
		// 시간측정도 할 수 있엉
		// 
		long startTime = System.currentTimeMillis();
		
		while(true) {
			int readByte = fis.read(); // 읽은 데이터를
			if(readByte == -1) break;
			fos.write(readByte); // 바로 써라
			count++; // 1byte를 썼다! 빵~
			if(count%1024==0) {
				System.out.print("★");
				starCount++;
				if(starCount%10==0) {
					System.out.println();
				}
			}
		}
		long endTime = System.currentTimeMillis();
		
		fis.close();
		fos.close(); // 빨대는 해제해주느게 좋아요
		
		System.out.println();
		System.out.println(">> FileCopy: "+count+"bytes copied");
		System.out.println(">> take "+(endTime - startTime/1000)+"seconds");
	}

}

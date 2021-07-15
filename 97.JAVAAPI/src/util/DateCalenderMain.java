package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCalenderMain {

	public static void main(String[] args) {

		/*
		 * java.util.Date
		 * - The class Date represents a specific instant in time, with millisecond precision.
		 */
		
		Date now = new Date();
		// java.util 에 있는 Date를 선택해야함!
		
		String nowStr = now.toString();
		System.out.println(nowStr);
		
		String nowLocaleStr = now.toLocaleString();
		// The method toLocaleString() from the type Date is deprecated
		System.out.println(nowLocaleStr);
		
		System.out.println("-- 시간 저장 형식 --");
		long curretnTimeMillis1 = now.getTime();
		// Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this Date object.
		
		System.out.println(curretnTimeMillis1);
		
		long curretnTimeMillis2 = System.currentTimeMillis();
		// Returns:the difference, measured in milliseconds, between the current time and midnight, January 1, 1970 UTC.
		
		System.out.println(curretnTimeMillis2);
		
		// date를 string으로 변경하는 함수
		System.out.println("-- SimpleDateFormat [Date -> String] --");
		
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		sdf1.applyPattern("yyyy년 MM월 dd일"); // 대소문자 구분해서 써야함.
		String formatStr1 = sdf1.format(now); // return type = String
		System.out.println(formatStr1);
		
	}

}

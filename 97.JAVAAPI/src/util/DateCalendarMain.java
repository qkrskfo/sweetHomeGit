package util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalendarMain {

	public static void main(String[] args) throws Exception {

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
		
		sdf1.applyPattern("yyyy/MM/dd HH:mm:ss.SSSS"); // 대소문자 구분해서 써야함.
		String formatStr2 = sdf1.format(now);
		System.out.println(formatStr2);
		
		// 책 513p에 나와있데.. 
		
		sdf1.applyPattern("yyyy");
		String yearStr = sdf1.format(now);
		System.out.println(yearStr);
		
		System.out.println(Integer.parseInt(yearStr));
		System.out.println("-- SimpleDateFormat [String -> Date] --");
		
		SimpleDateFormat sdf2 = new SimpleDateFormat();
		sdf2.applyPattern("yyyy-MM-dd");
		Date myBirthDay = sdf2.parse("2000-06-03");
		sdf2.applyPattern("yyyy/MM/dd HH:mm:ss");
		Date yourBirthDay = sdf2.parse("1998/05/04 04:12:30");
		
		/*
		 * java.util.Calendar
		 */
		
		Calendar cal1 = Calendar.getInstance();
		System.out.println(cal1.getCalendarType());
		long currentTimeMillis3 = cal1.getTimeInMillis();
		System.out.println(currentTimeMillis3);
		
		int year0 = cal1.get(0);
		System.out.println(year0);
		int year1 = cal1.get(1);
		System.out.println(year1);
		
		int year = cal1.get(Calendar.YEAR);
		int month = cal1.get(Calendar.MONTH) + 1;
		/*
		 *  Field number for get and set indicating the month. 
		 *  This is a calendar-specific value. 
		 *  The first month of the year in the Gregorian and Julian calendars is JANUARY which is 0; 
		 *  the last depends on the number of months in a year.
		 */
		int day = cal1.get(Calendar.DAY_OF_MONTH);
		int hour = cal1.get(Calendar.HOUR);
		int minute = cal1.get(Calendar.MINUTE);
		int second = cal1.get(Calendar.SECOND);
		int millisecond = cal1.get(Calendar.MILLISECOND);
		System.out.println(year+"/"+month+"/"+day+"/"+hour+":"+minute+":"+second+"."+millisecond);
		
		Calendar cal2 = Calendar.getInstance();
		cal2.clear(); // 기존 데이터를 다 지우고 다시 셋팅하기 위해서
//		cal2.set(year, month, day, hour, minute, millisecond);
		cal2.set(2021, Calendar.AUGUST, 8, 8, 36, 59);
		// 월은 숫자로 쓰면 +1을 해줘야하기 때문에 Calendar.월(영문) 으로 작성하는게 좋음.
		System.out.println(cal2);
		
		
		Calendar cal3 = Calendar.getInstance();
		cal3.clear();
		cal3.set(Calendar.YEAR, 2021);
		cal3.set(Calendar.MONTH, Calendar.JANUARY); // 이런식으로 개별적으로도 셋팅할 수 있음
		System.out.println(cal3);
		
		Calendar cal4 = Calendar.getInstance();
		cal4.setTimeInMillis(System.currentTimeMillis());
		System.out.println(cal4);
		
		System.out.println("--- Date <--> Calendar ---");
		Date date1 = new SimpleDateFormat("yyyy/MM/dd HH:mm").parse("2021/05/01 10:39");
		Calendar calendar1 = Calendar.getInstance();
		calendar1.setTimeInMillis(date1.getTime());
		
		Calendar calendar2 = Calendar.getInstance();
		calendar2.clear();
		calendar2.set(2019, Calendar.JANUARY, 3);
		Date date2 = new Date(calendar2.getTimeInMillis());
		
		
		/******* Calendar 객체 메쏘드 ********/
		System.out.println("-- Calendar 객체 메쏘드 --");
		
		Calendar calendar3 = Calendar.getInstance();
		calendar3.clear();
		calendar3.set(2019,  Calendar.MAY, 20);
		
		Calendar calendar4 = Calendar.getInstance();
		calendar4.clear();
		calendar4.set(2019,  Calendar.MAY, 20);
		
		Calendar calendar5 = Calendar.getInstance();
		calendar5.clear();
		calendar5.set(2019,  Calendar.JANUARY, 5);
		
		System.out.println("compareTo: "+calendar3.compareTo(calendar4));
		System.out.println("eqauls: "+calendar3.equals(calendar4));
		System.out.println(calendar3.compareTo(calendar5));
		System.out.println(calendar3.equals(calendar5));
		System.out.println(calendar5.compareTo(calendar3));
		
		System.out.println("원래날짜 : "+calendar3.get(Calendar.YEAR)+"년 "+(calendar3.get(Calendar.MONTH)+1)+"월 "+calendar3.get(Calendar.DAY_OF_MONTH)+"일");
		calendar3.add(Calendar.DATE, 5); // 며칠후(양수로)
		System.out.println("5일 후 : "+calendar3.get(Calendar.YEAR)+"년 "+(calendar3.get(Calendar.MONTH)+1)+"월 "+calendar3.get(Calendar.DAY_OF_MONTH)+"일");
		
		calendar3.add(Calendar.DATE, -10); // 며칠전(음수로)
		System.out.println("10일 전 : "+calendar3.get(Calendar.YEAR)+"년 "+(calendar3.get(Calendar.MONTH)+1)+"월 "+calendar3.get(Calendar.DAY_OF_MONTH)+"일");
		
		calendar3.add(Calendar.MONTH, 6); // 6개월 후
		System.out.println("6개월 후(month) : "+calendar3.get(Calendar.YEAR)+"년 "+(calendar3.get(Calendar.MONTH)+1)+"월 "+calendar3.get(Calendar.DAY_OF_MONTH)+"일");
		
		calendar3.add(Calendar.MONDAY, 6); // 6개월 후?? monday랑 month랑 무슨 차이임? 몰라 values가 같네;;
		System.out.println("6개월 후(monday) : "+calendar3.get(Calendar.YEAR)+"년 "+(calendar3.get(Calendar.MONTH)+1)+"월 "+calendar3.get(Calendar.DAY_OF_MONTH)+"일");
		
		calendar3.add(Calendar.YEAR, 1); // 1년후
		System.out.println("1년 후 : "+calendar3.get(Calendar.YEAR)+"년 "+(calendar3.get(Calendar.MONTH)+1)+"월 "+calendar3.get(Calendar.DAY_OF_MONTH)+"일");
		
		
		/******* Date 객체 메쏘드 ********/
		System.out.println("-- Date 객체 메쏘드 --");
		Date date3 = new SimpleDateFormat("yyyy-MM-dd").parse("2021-07-07");
		Date date4 = new SimpleDateFormat("yyyy-MM-dd").parse("2021-07-07");
		Date date5 = new SimpleDateFormat("yyyy-MM-dd").parse("2021-08-08");
		
		System.out.println("eqauls: "+date3.equals(date4));
		System.out.println("compareTo: "+date3.compareTo(date4));
		System.out.println("compareTo: "+date3.compareTo(date5)); // 현재보다 가까운 날짜에 음수가 나옴. Calendar는 가까운 날짜에 양수가 나왔었어! 
		System.out.println("compareTo: "+date5.compareTo(date3));
		
		// date 객체는 add가 없어서 Calendar와 같이 써야 함.

		
		
		
	}

}

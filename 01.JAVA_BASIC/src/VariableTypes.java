public class VariableTypes {

	public static void main(String[] args) {
		/*
		 * 논리형(1byte)
		 *   - 논리형변수
		 *   - 논리형리터럴(값,데이타) : true,false
		 */
		boolean bool1;
		boolean bool2;
		boolean bool3;
		boolean bool4;
		bool1 = true;
		bool2 = false;
		bool3 = true;
		bool4 = bool3;
		/* <<한줄복사>>
		 *  ctrl + alt + down arrow
		 */
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println(bool3);
		System.out.println(bool4);
		
		/*
		 * 문자한개형(2byte) 
		 *   - 문자형변수
		 *   - 문자형리터럴(값,데이타):'A','R','C','1'
		 *   - 65,536개 문자 저장 가능
		 *   - 범위: 0 ~ 65536 // 음수 불가
		 */
		char munja1,munja2,munja3,munja4,munja5,munja6,munja7,munja8,munja9;
		munja1='A';
		munja2='B';
		munja3='김';
		munja4='경';
		munja5='1';
		munja6=65; // char는 문자열 인코딩 테이블을 참조하기때문. 65 = A 인거지.
		munja7='A';
		munja8=44608; // 한글 '김'
		munja9=munja2;
		
		
		System.out.println(munja1);
		System.out.println(munja2);
		System.out.println(munja3);
		System.out.println(munja4);
		System.out.println(munja5);
		System.out.println(munja6);
		System.out.println(munja7);
		System.out.println(munja8);
		System.out.println(munja9);
		
		/*
		 * 숫자형
		 *   1.정수형(byte,short,int,long)
		 *      - 정수형 리터럴: 1, 2, 45, -90, 880 등
		 *   2.실수형(float,double)
		 *      - 실수형 리터럴: 1.3, 2.35, 3.141592, 0.12, .1, 1000.0 등
		 */

		// io, 네트워크 등에서 사용하지만 거의 사용x
		byte b1 = -128;
		byte b2 = 127; // 이 이상의 숫자는 에러 발생
		byte b3 = 0b01111111; // b = 바이너리, 2진 // b2 = b3

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

		short s1 = 766;
		short s2 = -32768;
		short s3 = 32767; // 이 범위 이상의 숫자는 에러 발생
		short s4 = 0b0111111111111111;
		System.out.println(s3);
		System.out.println(s4);
		
		int i1,i2,i3,i4;
		i1 = 90;
		i2 = 0b01111111111111111111111111111111;
		i3 = -2147483648;
		i4 = 2147483647;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		
		// long 타입은 int 범위를 초과하는 값에는 반드시 뒤에 L 또는 l을 넣어야함
		long l1 = 2147483648l;
		long l2 = -9890;
		long l3 = 0b0111111111111111111111111111111111111111111111111111111111111111l;
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		
		// float 타입도 반드시 뒤에 f 또는 F 넣어야함.
		// 실수형리터럴은 기본적으로 8바이트에 들어가는데 float은 4바이트짜리기 때문임.
		float f1, f2, f3;
		f1 = 0.1f;
		f2 = 1000.0f;
		System.out.println(f1);
		System.out.println(f2);
		
		
		// 자리수 16자리 가능
		double d1,d2,d3;
		d1 = 3.141592;
		d2 = 12345678912345678.0;
		d3 = 1.2345678912345678;	
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
			
		
		
		
		System.out.println("---------------------문자열형(String)------------------------");
		
		String str1="오늘은";
		String str2="금요일";
		String str3="변수를  공부합니다.";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(str1+" "+str2+" "+str3);
		System.out.println(str1+" 월요일 연산자를 공부합니다" );
		
		String name="김경호";
		int age=33;
		String address="서울시민";
		char gender='M';
		
		
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("주소:"+address);
		System.out.println("성별:"+gender);
		

	}

}
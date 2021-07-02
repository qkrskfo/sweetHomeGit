public class DuoMemberInfoPrint {

	public static void main(String[] args) {
		
		/* 
		 * DuoMember 1명 데이터를 담을 변수 선언
		 * DuoMember 1명 데이터를 변수에 대입
		 * DuoMember 1명 데이터를 화면에 출력
		 */
		
		int memNum;
		String memName;
		String memCode; 
		String memGender;
		int memMarriage;
		boolean memSmoke;
		
		memNum = 181818;
		memName = "홍길동";
		memCode = "201212-3495039";
		memGender = "male";
		memMarriage = 0;
		memSmoke = true;
		
		System.out.println("*************************");
		System.out.println("회원번호 : "+memNum);
		System.out.println("이   름 : "+memName);
		System.out.println("주민번호 : "+memCode);
		System.out.println("성   별 : "+memGender);
		System.out.println("결혼횟수 : "+memMarriage);
		System.out.println("흡연여부 : "+memSmoke);
		System.out.println("*************************");

	}

}
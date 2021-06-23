package wrapper;

public class WrapperClassCompareMain {

	public static void main(String[] args) {

		Integer wi1 = new Integer(89);
		Integer wi2 = new Integer(89);
		Integer wi3 = wi1;
		/*
		 * ref1 == ref2
		 * Wrapper, String 객체
		 *   - 비교 연산자 ( == ) 사용하면 주소 비교가 되기때문에 사용하지X
		 *   - equals 메소드 사용 (멤버필드의 기본형값을 비교)
		 *     [ object의 equals가 재정의 되어 있기 때문 ]
		 * 
		 
		if(wi1 == wi2) {
			System.out.println("wi1과 wi2의 주소가 같다.");
		} else {
			System.out.println("wi1와 wi2의 주소가 다릅니다.");
		}
		if(wi1 == wi3) {
			System.out.println("wi1과 wi3의 주소가 같다.");
		} else {
			System.out.println("wi1와 wi3의 주소가 다릅니다.");
		}
		*/
		
		if(wi1.equals(wi2)) {
			System.out.println("wi1과 wi2 멤버변수의 절대값이 동일하다.");
		} 
		if(wi1.equals(wi3)) {
			System.out.println("wi1과 wi3 멤버변수의 절대값이 동일하다.");
		} 
		if(wi2.equals(wi3)) {
			System.out.println("wi2과 wi3 멤버변수의 절대값이 동일하다.");
		} 
		
		System.out.println("*************");
		// 이렇게 비교는 가능
		// 89를 우선으로 해서 wi1을 언박싱해서 비교함
		if(wi1 == 89) {
			System.out.println("wi1.intValue()와 89는 동일하다.");		
		}
		
		if(wi1 > 68) {
			System.out.println("wi1.intValue()는 68보다 크다.");	
		}
		// 이것도 된데
		// 주소가 아니라 절대값을 비교하게 된데...
		if(wi1 >= wi2) {
			System.out.println("wi1.intValue() >= wi2.intValue()");
		}
		
	}

}

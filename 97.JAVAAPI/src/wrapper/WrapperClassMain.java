package wrapper;

import java.util.Iterator;

/*
- Wrapper 클래스

	자바데이타형은 기본데이타형과 레퍼런스 데이타형으로 구분됩니다.
	기본데이타형으로는 int,boolean,double 등이 제공됩니다.
	이런 기본데이타형을 객체로 사용할 수 있는 방법으로 Wrapper 클래스가 제공됩니다.
	Wrapper클래스는 각종유용한 기능들을 메서드로 제공받을 수 있다는 장점이 있습니다.
	
	Integer,Boolean,Double,Character,Float,Long,Byte,Short
	
 */

public class WrapperClassMain {

	public static void main(String[] args) {

		/*
		 * 컬렉션 프레임웤에 들어가기 위해서 객체로 변경하는 것
		 * 
		 * Wrapper객체 형태
		 */
		Integer intWrapper = new Integer(123);
		// --> final int value 123이 객체에 들어가있어
		System.out.println("Integer 객체 멤버필드 int value의 값"+intWrapper.intValue());
		
		Boolean boolWrapper = new Boolean(true);
		System.out.println("Boolean 객체 멤버필드 boolean value의 값"+boolWrapper.booleanValue());
		
		/*
		 * Wrapper 객체 생성
		 */
		
		// Boxing 기본형 데이터를 객체로 만드는 것 (int --> Integer)
		Integer wi1 = null;
		wi1 = new Integer(89); // 기본형 데이터 89
		Integer wi2 = new Integer("89"); // 스트링도 가능함. 그러나 큰따옴표 안에 숫자가 들어가야함.
		
		Boolean wb1 = new Boolean(false);
		Boolean wb2 = new Boolean(true);
		
		Double wd1 = new Double(3.14159);
		Double wd2 = new Double(0.142656);
		
		// Unboxing 기존 박싱되어있는 wrapper 객체로부터 기본형으로 변경 [Integer객체(wrapper) -> int(기본형)]
		int i1 = wi1.intValue();
		int i2 = wi2.intValue();
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(wb1.booleanValue());
		System.out.println(wb2.booleanValue());
		System.out.println(wd1.doubleValue());
		System.out.println(wd2.doubleValue());
		
		/*
		 * auto boxing(wrapping)
		 */
		Integer wi3 = 89;
		Integer wi4 = 89;
		Boolean wb3 = true;
		Boolean wb4 = false;
		Double wd3 = 0.33;
		Double wd4 = 9.44;
		
		/*
		 * auto unboxing
		 */
		int i3 = wi3;
		int i4 = wi4;
		boolean b3 = wb3;
		boolean b4 = wb4;
		double d3 = wd3;
		double d4 = wd4;
		
		System.out.println("auto boxing (int -> Integer)");
		Integer ia = 89;
		Integer ib = 45;
		Integer ic = 78;
		Integer id = 99;
		
		System.out.println("자동형변환(Integer(child)-> Object(parent)");
		Object oa = ia;
		Object ob = ib;
		Object oc = ic;
		Object od = id;
		
		System.out.println("Auto Boxing && 자동형변환 (Integer -> Object)");
		Object ooa = 89;
		Object oob = 45;
		Object ooc = 78;
		Object ood = 99;
		
		System.out.println("Object[]");
		Object[] scoreArray = new Object[4];
		scoreArray[0] = new Integer(89);
		// 위에처럼 안해도 아래처럼 자동으로 박싱이 되는거얌
		scoreArray[1] = 45;
		scoreArray[2] = 78;
		scoreArray[3] = 99;
		// scoreArray[0] 이건 오브젝트 타입이야
		
		for (int i = 0; i < scoreArray.length; i++) {
			/*
			Integer tempInteger = (Integer)scoreArray[i]; // 근데 실제로는 integer 타입이잖아. 양의 탈을 쓴 늑대처럼.
			int tempScore = tempInteger.intValue();
			System.out.print(tempScore+" ");
			*/
			int tempScore = (Integer)scoreArray[i]; // 이렇게 하면 자동으로 언박싱됨
			System.out.print(tempScore+" ");
		}
		System.out.println();
		
	}
	

}

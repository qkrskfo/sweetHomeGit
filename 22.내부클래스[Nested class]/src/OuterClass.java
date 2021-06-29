
public class OuterClass {

	/*
	 * 인스턴스 멤버필드
	 */
	public int outer_member_field;
	
	/*
	 * 인스턴스멤버 메쏘드
	 */
	public void outer_member_method() {
		System.out.println("OuterClass.outer_member_method()");
	}
	
	/*** 외부클래스에서 내부클래스 사용 ***/
	public void outer_inner_class_use() {
		/*
		 * 1. InnerClass 객체생성
		 */
		InnerClass innerClassObject = new InnerClass();
		// OuterClass.InnerClass innerClassObject = this.new InnerClass(); 
		// 안에선 생략가능. 밖에선 써줘야해. 
		
		/*
		 * 2. InnerClass 객체멤버 사용
		 */
		innerClassObject.inner_member_field = 9999;
		innerClassObject.inner_member_method();
	}
	
	/*
	 * 인스턴스멤버 클래스[Nested class, Inner class, 내부클래스]
	 */
	public class InnerClass {
		// 클래스라는 키워드가 붙으면 클래스가 생성이됨.
		public int inner_member_field;
		public void inner_member_method() {
			System.out.println("InnerClass.inner_member_method()");
		}
		
		/*
		 * 내부클래스의 사용이유
		 *  - 내부클래스(객체)에서 외부클래스(객체)의 멤버필드, 멤버메쏘드 접근을 손쉽게하기위해서
		 */
		
		public void inner_outer_member_access() {
//			InnerClass.this.inner_member_field = 9090;
//			OuterClass.this.outer_member_field = 7878;
			// 이렇게 접근하는거야!
			outer_member_field = 7878; // 맨처음엔 이너클래스에서 찾고, 없으면 아우터클래스까지 찾아보고 알아서 들어감.
			outer_member_method();
		}
	} // inner class end
} // outer class end

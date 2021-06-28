
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
	
	/*
	 * 인스턴스멤버 클래스[Nested class, Inner class, 내부클래스]
	 */
	public class InnerClass {
		// 클래스라는 키워드가 붙으면 클래스가 생성이됨.
		public int inner_member_field;
		public void inner_member_method() {
			System.out.println("InnerClass.inner_member_method()");
		}
	}
}

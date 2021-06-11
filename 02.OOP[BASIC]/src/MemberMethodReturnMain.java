class MemberMethodReturn{
	int member1;
	int member2;
	
	public int method1() {
		System.out.println("--------public int method1()-----------");		
		int result = 1+2;
		return result;
		// void인 경우 생략 가능하지만, void가 없는 경우 리턴에 반환할 값이 있어야함.
		/*
		 * return << void가 아닌 경우, 호출한 클래스(객체)에게 반환할 값(변수, 리터럴, 연산의 결과)>>
		 * 호출한 곳으로 실행흐름(쓰레드) 반환
		 * 호출한 곳으로 데이터 반환
		 * 반환할 데이터가 없는 경우에는(void)  return문 생략 가능
		 * 반환할 데이터가 있는 경우에는 		return문 반드시 기술해야 함
		 */
	}  
	
	public boolean method2() {
		System.out.println("--------public boolean method2()--------");
		boolean married = true;
		return married;
	}
	
	/*
	 * 두개의 정수를 매개변수로 받아서 더한 후 결과값을 반환
	 */
	public int add(int a, int b) {
		System.out.println("--------public int add(int a, int b)--------");
		int result = a + b;
		return result;
	}
	
	/*
	 * 객체의 멤버변수 2개를 더한 결과값을 반환
	 */
	public int addMembers() {
		int result = this.member1 + this.member2;
		return result;
	}  
	
	/*
	 * 객체의 멤버필드 데이터를 반환해줌(getter)
	 */

	public int getMember1() {
		return this.member1;
	}
	
	public int getMember2() {
		return this.member2;
	}
	
	/*
	 * 객체의 멤버필드 데이터를 set(외부에서 입력) 해줌(setter)
	 */
	
	public void setMember1(int member1) {
		this.member1 = member1;
	}
	public void setMember2(int member2) {
		this.member2 = member2;
	}
	
}

public class MemberMethodReturnMain {

	public static void main(String[] args) {

		MemberMethodReturn mmr = new MemberMethodReturn();
		
		/*
		 public int method1();
		 */
		int receiveData1 = mmr.method1();
		System.out.println("main block에서 받은 receiveData1 --> "+receiveData1);
		
		/*
		 public boolean method2()
		 */
		
		boolean receiveData2 = mmr.method2();
		System.out.println("main block에서 받은 receiveData2 --> "+receiveData2);
		
		/*
		 public int add(int a, int b) 
		 */
		int addResult = mmr.add(12, 333);
		System.out.println("main block에서 받은 addResult --> "+addResult);
		addResult = mmr.add(3000, 456);
		System.out.println("main block에서 받은 addResult --> "+addResult);
		
			
		/*
		 public int addMembers()
		 */
		System.out.println("----this를 사용해서 멤버필드의 데이터를 더해서 반환----");
		int receiveAddMembers = mmr.addMembers();
		System.out.println("main block에서 받은 receiveAddMembers --> "+receiveAddMembers);
		
		System.out.println();
		
		
		
		System.out.println("----멤버변수의 데이터를 set하기(setter)----");
		mmr.setMember1(333);
		mmr.setMember2(666);
		
		System.out.println("----멤버변수의 데이터를 반환받기(getter)----");		
		
//		System.out.println(mmr.member1); 아래 문장과 같은 말임.
		int receiveMember1 = mmr.getMember1();
		System.out.println("receiveMember1"+receiveMember1);
		int receiveMember2 = mmr.getMember2();
		System.out.println("receiveMember2"+receiveMember2);
	}

}

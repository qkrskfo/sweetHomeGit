
class Parent extends Object{

	private int member1;
	private int member2;
	// getter, setter 를 만들어주면 되징!
	
	public Parent() {
		/*
		 * 클래스의 생성자 첫번째 라인에서는
		 * 부모클래스의 생성자(디폴트)가 반드시 호출되어야한다.
		 * 생략 시 부모의 디폴트생성자가 자동호출된다.
		 */
		// 기본생성자
		super();
		System.out.println("2.Parent() default 생성자");
	}
		
	public Parent(int member1, int member2) {
		super();
		this.member1 = member1;
		this.member2 = member2;
		System.out.println("2.Parent(int member1, int member2) 생성자 호출 ");
	}
	public void print() {
		System.out.print(this.member1+"\t"+this.member2);
	}

	public void method1() {
		System.out.println("Parent.method1()");
	}
	public void method2() {
		System.out.println("Parent.method2()");
	}

	public int getMember1() {
		return member1;
	}

	public void setMember1(int member1) {
		this.member1 = member1;
	}

	public int getMember2() {
		return member2;
	}

	public void setMember2(int member2) {
		this.member2 = member2;
	}
	
	
}

class Child extends Parent{
	public int member3;
	
	public Child() {
		/*
		 * 클래스의 생성자 첫번째 라인에서는
		 * 부모클래스의 생성자(디폴트)가 반드시 호출되어야한다.
		 * 생략 시 부모의 디폴트생성자가 자동호출된다.
		 */
		// 기본생성자
		super();
		System.out.println("3.Child() default 생성자");
	}
	
	public Child(int member1, int member2, int member3) {
//		super(); 
				
		/*
		 * 매개변수를 가지고 있는 생성자를 호출할 수 있음.
		 * 매개변수를 가지고 있는 생성자는 명시적으로 호출코드를 기술해야함.		
		 * 기본생성자를 호출하지 않고, 인자 포함된것을 호출할수 있음. 
		 * 그러면 밑에 this.member1 = member1; 은 안해도 됨.
		 */
		
		/* CASE 01
		this.setMember1(member1);
		this.setMember2(member2);
		*/
		/*
		 * CASE 02
		 */
		super(member1, member2); 
		
		this.member3 = member3;
				
		System.out.println("3.Child(int member1, int member2, int member3) 생성자 호출 ");
	}
	
	public void method3() {
		System.out.println("Child.method3()");
	}

	public void print() {
//		this.member1 는 접근 불가
//		System.out.println(this.member1+"\t"+this.member2+"\t"+this.member3);
		
		/* CASE 01
		System.out.println(this.getMember1()+"\t"+this.getMember2()+"\t"+this.member3);
		*/
		
		/*
		 * CASE 02
		 */
		super.print();
		System.out.println(this.member3);
	}
	public int getMember3() {
		return member3;
	}

	public void setMember3(int member3) {
		this.member3 = member3;
	}
	
	
}

public class ParentChildMain {

	public static void main(String[] args) {

		System.out.println("--------Child()-------");
		Child c1 = new Child();
		System.out.println("-------Child(int member1, int member2, int member3)--------");
		Child c2 = new Child(1, 2, 3);
	}

}


public class FinalClassChild extends FinalClass {
	
	// FinalClass.method1() 재정의 (ctrl + space바) 
	@Override
	public void method1() {
		System.out.println("FinalClassChild 에서 FinalClass.method1() 재정의(Override오버라이드)");
	}
	
	/*
	<< Cannot override the final method from FinalClass >>
	public void method2() {
		
	}
	*/
}

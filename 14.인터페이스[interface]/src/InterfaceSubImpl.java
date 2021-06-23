
public class InterfaceSubImpl implements InterfaceSub {

	@Override // = 재정의
	public void method_super1() {
		System.out.println("InterfaceSuper.method_super1()을 재정의&구현(implements)");
	}

	@Override
	public void method_super2() {
		System.out.println("InterfaceSuper.method_super2()를 재정의&구현(implements)");
	}

	@Override
	public void method_child1() {
		System.out.println("InterfaceSub.method_child1()을 재정의&구현(implements)");
	}

	@Override
	public void method_child2() {
		System.out.println("InterfaceSub.method_child2()를 재정의&구현(implements)");
	}

}

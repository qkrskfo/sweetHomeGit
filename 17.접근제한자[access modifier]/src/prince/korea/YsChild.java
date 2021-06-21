package prince.korea;

import president.korea.YS;
//extends president.korea.YS

public class YsChild extends YS {
	

	public void access2() {
		this.member1 = 1;
		this.member2 = 2; // protected는 상속받은 후 가능
		this.method1();
		this.method2();
	}
	
}

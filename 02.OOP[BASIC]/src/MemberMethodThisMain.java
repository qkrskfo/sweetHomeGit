class MemberMethodThis{
	int memberField1;
	char memberField2;
	double memberField3;
	
	public void setMemberField1(int memberField1) {
		this.memberField1 = memberField1;
	}
	
	public void setData(int memberField1, char memberField2, double memberField3) {
		this.memberField1 = memberField1;
		this.memberField2 = memberField2;
		this.memberField3 = memberField3;
	}
	
	public void print() {
		/*
		 * this : 
		 *  - self 참조변수
		 *  - print 메소드를 가지고 있는 객체의 주소값
		 */
		System.out.println("print() --> "+this);
		System.out.println(this.memberField1+"\t"+this.memberField2+"\t"+this.memberField3);
	}
}


public class MemberMethodThisMain {

	public static void main(String[] args) {
		
		MemberMethodThis mmt1 = new MemberMethodThis();
		/*
		mmt1.memberField1 = 1;
		mmt1.memberField2 = 'A';
		mmt1.memberField3 = 0.1;
		*/
		mmt1.setData(1, 'A', 0.1);
		
		System.out.println("main 1--> "+mmt1);
		// System.out.println(mm1.memberField1+"\t"+mm1.memberField2+"\t"+mm1.memberField3);
		mmt1.print();
		mmt1.setMemberField1(100);
		mmt1.print();
		
		MemberMethodThis mmt2 = new MemberMethodThis();
		/*
		mmt2.memberField1 = 2;
		mmt2.memberField2 = 'B';
		mmt2.memberField3 = 0.2;
		*/
		mmt2.setData(2, 'B', 0.2);
		
		System.out.println("main 2--> "+mmt2);
		// System.out.println(mm2.memberField1+"\t"+mm2.memberField2+"\t"+mm2.memberField3);
		mmt2.print();
		mmt2.setMemberField1(200);
		mmt2.print();
		
		MemberMethodThis mmt3 = new MemberMethodThis();
		/*
		mmt3.memberField1 = 3;
		mmt3.memberField2 = 'C';
		mmt3.memberField3 = 0.3;
		*/
		mmt3.setData(3, 'C', 0.3);
		System.out.println("main 3--> "+mmt3);
		mmt3.print();
		mmt3.setMemberField1(300);
		mmt3.print();
	}

}

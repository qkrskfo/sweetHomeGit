
public class AcademyMemberOverridingMain {

	public static void main(String[] args) {

		// AcademyMember m1 = new AcademyMember(1, "박나래");

		AcademyStudent st1 = new AcademyStudent(1, "KIM", "LINUX");
		AcademyStudent st2 = new AcademyStudent(2, "PARK", "JAVA");
		AcademyStudent st3 = new AcademyStudent(3, "CHOI", "DESIGN");
		
		AcademyGangsa gs1 = new AcademyGangsa(4, "LEE", "ANDROID");
		AcademyGangsa gs2 = new AcademyGangsa(5, "JOE", "IOS");
		
		AcademyStaff sf1 = new AcademyStaff(6, "WON", "MARKETING");
		AcademyStaff sf2 = new AcademyStaff(7, "HAM", "ACCOUNTING");
		
		/*
		st1.print(); 
		st2.print(); 
		st3.print(); 
		gs1.print(); 
		gs2.print(); 
		sf1.print(); 
		sf2.print(); 
		 */
		
		System.out.println("-----------student------------");
		st1.print();
		st2.print();
		st3.print();
		System.out.println("-----------gangsa------------");
		gs1.print();
		gs2.print();
		System.out.println("-----------staff------------");
		sf1.print();
		sf2.print();
	}

}

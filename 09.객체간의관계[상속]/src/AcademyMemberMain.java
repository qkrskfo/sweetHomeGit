
public class AcademyMemberMain {

	public static void main(String[] args) {

		// AcademyMember m1 = new AcademyMember(1, "박나래");

		AcademyStudent st1 = new AcademyStudent(1, "KIM", "LINUX");
		AcademyStudent st2 = new AcademyStudent(2, "PARK", "JAVA");
		AcademyStudent st3 = new AcademyStudent(3, "CHOI", "DESIGN");
		
		AcademyGansa gs1 = new AcademyGansa(4, "LEE", "ANDROID");
		AcademyGansa gs2 = new AcademyGansa(5, "JOE", "IOS");
		
		AcademyStaff sf1 = new AcademyStaff(6, "WON", "MARKETING");
		AcademyStaff sf2 = new AcademyStaff(7, "HAM", "ACCOUNTING");
		
		System.out.println("-----------student------------");
		st1.studentPrint();
		st2.studentPrint();
		st3.studentPrint();
		System.out.println("-----------gangsa------------");
		gs1.gansaPrint();
		gs2.gansaPrint();
		System.out.println("-----------staff------------");
		sf1.staffPrint();
		sf2.staffPrint();
	}

}

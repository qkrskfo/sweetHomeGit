
public class AcademyGansa extends AcademyMember {

	public String subject;
	public AcademyGansa() {
		// TODO Auto-generated constructor stub
	}
	public AcademyGansa(int no, String name, String subject) {
		this.no = no;
		this.name = name;
		this.subject = subject;
	}
	
	public void print() {
		super.print();
		System.out.println(this.subject);
	}
	
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
}


public class AcademyStudent extends AcademyMember {

	/* 상속
	public class AcademyMember {

	public int no;
	public String name;

	public AcademyMember() {

	}

	public AcademyMember(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public void print() {
		System.out.println(no+"\t"+name);
	}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	*/
	
	public String ban; //반
	public AcademyStudent() {
		
	}
	//alt+shift+s --> o
	public AcademyStudent(int no, String name, String ban) {
		super(no,name);
		this.ban=ban;
	}
	/*
	public void studentPrint() {
		this.print();
		System.out.println(this.ban);
	}
	*/
	
	public void print() {
		super.print();
		System.out.println(this.ban);
	}
	
	//alt+shift+s --> r
	public String getBan() {
		return ban;
	}
	public void setBan(String ban) {
		this.ban = ban;
	}
	

	
}

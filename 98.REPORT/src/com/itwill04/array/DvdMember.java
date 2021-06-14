package com.itwill04.array;

public class DvdMember {
	private int no;//회원번호
	private String name;//회원이름
	private String tel;//전화번호
	private Dvd[] dvds;//빌린dvd들[최대3개]
	
	public DvdMember() {
		
	}
	
	public DvdMember(int no, String name, String tel) {
		this.no = no;
		this.name = name;
		this.tel = tel;
	}

	public static void headerPrint() {
		System.out.println("회원번호   회원이름    전화번호       대여목록");
		System.out.println("-------------------------------------------------");
	}
	
	public void print() {
		System.out.print("   "+no+"     "+name+"   "+tel+"    ");
		for (int i = 0; i < dvds.length; i++) {
			dvds[i].print();
			if(i != dvds.length -1) {
				System.out.print(", ");
			}
		}
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public Dvd[] getDvds() {
		return dvds;
	}
	
	public void setDvds(Dvd[] dvds) {
		this.dvds = dvds;
	}
	
}
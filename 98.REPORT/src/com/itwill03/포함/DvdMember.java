package com.itwill03.포함;

public class DvdMember {
	//회원번호
	//회원이름
	//전화번호
	//빌린dvd
	
	private int memberNo;
	private String memberName;
	private String memberMobile;
	
	private Dvd dvd;
	
	public DvdMember() {

	}

	public DvdMember(int memberNo, String memberName, String memberMobile) {
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.memberMobile = memberMobile;
	}

	public DvdMember(Dvd dvd) {
		this.dvd = dvd;
	}
	
	//출력
	public static void headerPrint() {
		System.out.println("-------------------------------");
		System.out.printf("%s %s %s %s %n","회원번호","회원이름","전화번호", "대여목록");
		System.out.println("-------------------------------");
	}
	
	public void print() {
		System.out.printf("%d %s %s",this.memberNo, this.memberName, this.memberMobile);
		dvd.print();
	}
	
	
	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberMobile() {
		return memberMobile;
	}

	public void setMemberMobile(String memberMobile) {
		this.memberMobile = memberMobile;
	}

	public Dvd getDvd() {
		return dvd;
	}

	public void setDvd(Dvd dvd) {
		this.dvd = dvd;
	}
	
	
	
	
}

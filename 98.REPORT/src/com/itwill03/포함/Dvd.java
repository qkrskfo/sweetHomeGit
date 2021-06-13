package com.itwill03.포함;

public class Dvd {
	//번호
	//타이틀
	//쟝르
	
	private int dvdNo;
	private String dvdTitle;
	private String dvdGenre;
	
	public Dvd() {
	
	}
	
	public Dvd(int dvdNo, String dvdTitle, String dvdGenre) {
		this.dvdNo = dvdNo;
		this.dvdTitle = dvdTitle;
		this.dvdGenre = dvdGenre;
	}

	//출력
	public static void headerPrint() {
		System.out.println("-------------------------------");
		System.out.printf("%s %s %s %n","DVD 번호","DVD 제목","DVD 장르");
		System.out.println("-------------------------------");
	}
	
	public void print() {
		System.out.printf("%d %s %s %s %s %n", this.dvdNo, this.dvdTitle, "(", this.dvdGenre, ")");
	}

	public int getDvdNo() {
		return dvdNo;
	}

	public void setDvdNo(int dvdNo) {
		this.dvdNo = dvdNo;
	}

	public String getDvdTitle() {
		return dvdTitle;
	}

	public void setDvdTitle(String dvdTitle) {
		this.dvdTitle = dvdTitle;
	}

	public String getDvdGenre() {
		return dvdGenre;
	}

	public void setDvdGenre(String dvdGenre) {
		this.dvdGenre = dvdGenre;
	}
	
	
	
	

	
}
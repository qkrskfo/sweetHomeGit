package com.itwill07.dao.member;

import java.util.Date;

/*
이름         널?       유형            
---------- -------- ------------- 
M_ID       NOT NULL VARCHAR2(20)  
M_PASSWORD          VARCHAR2(10)  
M_NAME              VARCHAR2(50)  
M_ADDRESS           VARCHAR2(100) 
M_AGE               NUMBER(3)     
M_MARRIED           CHAR(1)       
M_REGIDATE          DATE 
*/

/*
VO(Value Object), DTO(Data Transfer Object)
  	- 한개의 주소 객체 데이터를 가지고 있다. (VO)
  	- 한개의 주소객체 데이터 이동(파라메타, 리턴데이터)시키기 위한 객체 (DTO)
  	- member테이블과 동일한 속성을 멤버변수로 가지는 객체 
 */
 

public class Member {
	
	private String m_id;
	private String m_password;
	private String m_name;
	private String m_address;
	private int m_age;
	private char m_married;
	private Date m_regidate;
	
	// 기본생성자
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String m_id, String m_password, String m_name, String m_address, int m_age, char m_married, Date m_regidate) {
		super();
		this.m_id = m_id;
		this.m_password = m_password;
		this.m_name = m_name;
		this.m_address = m_address;
		this.m_age = m_age;
		this.m_married = m_married;
		this.m_regidate = m_regidate;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_password() {
		return m_password;
	}

	public void setM_password(String m_password) {
		this.m_password = m_password;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_address() {
		return m_address;
	}

	public void setM_address(String m_address) {
		this.m_address = m_address;
	}

	public int getM_age() {
		return m_age;
	}

	public void setM_age(int m_age) {
		this.m_age = m_age;
	}

	public char getM_married() {
		return m_married;
	}

	public void setM_married(char m_married) {
		this.m_married = m_married;
	}

	public Date getM_regidate() {
		return m_regidate;
	}

	public void setM_regidate(Date m_regidate) {
		this.m_regidate = m_regidate;
	}

	@Override
	public String toString() {
		return "Member [m_id=" + m_id + ", m_password=" + m_password + ", m_name=" + m_name + ", m_address=" + m_address
				+ ", m_age=" + m_age + ", m_married=" + m_married + ", m_regidate=" + m_regidate + "]";
	}
	
	
	
	
	

}

package com.itwill07.dao.guest;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class GuestDaoTestMain {

	public static void main(String[] args) throws Exception {
		
		GuestDao guestDao = new GuestDao();

		/*
			 이름             널?       유형             
		-------------- -------- -------------- 
		GUEST_NO       NOT NULL NUMBER(10)     
		GUEST_NAME     NOT NULL VARCHAR2(100)  
		GUEST_DATE     NOT NULL DATE           
		GUEST_EMAIL             VARCHAR2(100)  
		GUEST_HOMEPAGE          VARCHAR2(100)  
		GUEST_TITLE    NOT NULL VARCHAR2(255)  
		GUEST_CONTENT  NOT NULL VARCHAR2(4000) 
			 
	 */
		
		System.out.println("-- 1. insert --" + guestDao.insertGuest(new Guest(0, "박나래", null, "aaa@gmail.com", "http://", "방명록 제목", "블라블라")));
		
		System.out.println("-- 2. update --" + guestDao.updateGuest(new Guest(4, "홍길동", null, "xoxo@gamil.com", "http://www.naver.com", "변경된 제목", "변경된 내용")));
		
		System.out.println("--3. delete --" + guestDao.deleteGuest(2));
		
		System.out.println("-- 4. select by no --" + guestDao.selectByNo(5));
				
		System.out.println("-- 5. select All --" + guestDao.selectAll());
				


		
	}

}
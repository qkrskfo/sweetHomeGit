package com.itwill07.dao.member;

public class MemberDaoTestMain {

	public static void main(String[] args) throws Exception {

		MemberDao memberDao = new MemberDao();
		
		System.out.println("--- 1. insert ---" + 
				memberDao.insert(new Member ("dddd", "password1", "박미래", "서울시 영등포구", 29, "F", null)));
		
		System.out.println("--- 2. update ---" + 
				memberDao.updateById(new Member ("bbbb", "7777", "박나래", "대전 중구", 31, "F", null)));
		
		System.out.println("--- 3. delete ---" + memberDao.deleteById("aaaa"));
		
		System.out.println("--- 4. selectById ---" + memberDao.selectById("cccc"));
		
		System.out.println("--- 5. selectAll ---" + memberDao.selectAll());

	}
}

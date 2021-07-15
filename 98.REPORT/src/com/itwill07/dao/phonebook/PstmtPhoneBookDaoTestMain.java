package com.itwill07.dao.phonebook;

public class PstmtPhoneBookDaoTestMain {

	public static void main(String[] args) throws Exception {
		
		PhoneBookDao phoneBookDao = new PhoneBookDao();
		
		System.out.println(">> insert");
		PhoneBook insertPB1 = new PhoneBook(1, "박나래", "1111-1111");
		phoneBookDao.insert(insertPB1);
		PhoneBook insertPB2 = new PhoneBook(2, "김나래", "2222-2222");
		phoneBookDao.insert(insertPB2);
		PhoneBook insertPB3 = new PhoneBook(3, "최나래", "3333-3333");
		phoneBookDao.insert(insertPB3);
		
				
		System.out.println(">> update");
		PhoneBook updatePB = new PhoneBook(1, "박나래", "7777-7777");
		phoneBookDao.updateByPk(updatePB);
		
		System.out.println(">> delete");
		phoneBookDao.deleteByPk(2);
		
		System.out.println(">> selectByPk");
		phoneBookDao.selectByPk(3);

		System.out.println(">> selectAll");
		phoneBookDao.selectAll();
		
	}

}
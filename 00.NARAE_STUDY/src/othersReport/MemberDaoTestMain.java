package othersReport;

// 백상열님꺼 - 날짜 넣는거 보려고

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MemberDaoTestMain {

	public static void main(String[] args) throws Exception{
		
		MemberDao memberDao = new MemberDao();
		
		/*******************insert1(sysdate)************************/
		
		System.out.println(memberDao.insert
						  (new Member("id1", "pw1", "이름1", "서울시 강남구", 20, "T", new Date()))
						   + "행 insert 완료");
		/*******************insert1(내가기입한날짜)************************/
		Member m1 = new Member("id2", "pw2", "이름2", "서울시 도봉구", 22, "F", new SimpleDateFormat("yyyy-MM-dd").parse("2021-04-04"));
		System.out.println(memberDao.insert(m1) + "행 insert 완료");
		
		
		/*******************update************************/
		Member updateMember = new Member("aaaa", "pw변경완료", "변경이름1", "주소변경", 17, "T", new SimpleDateFormat("yyyy/MM/dd").parse("2020/05/05"));
		System.out.println(memberDao.updateById(updateMember) + "행 update 완료");
		
		/*******************delete************************/
		System.out.println(memberDao.deleteById("id1") + "행 delete 완료");
		
		/*******************selectById************************/
		Member findMember = memberDao.selectById("id2");
		System.out.println(findMember);
		
		/*******************selectAll************************/
		ArrayList<Member> findMembers = memberDao.selectAll();
		for(Member member : findMembers) {
			System.out.println(member);
		}
		
	}

}
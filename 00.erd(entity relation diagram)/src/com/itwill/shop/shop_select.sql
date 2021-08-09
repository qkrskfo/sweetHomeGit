--shop_select.sql
/*
 * 1. 멤버의 정보(1)와 멤버상세정보(0,1)
 * 2. 멤버의 정보(1)와 게시글정보(0,n)
 
 * 2. 멤버 한사람의 특정날짜의 주문전체목록
 * 3. 멤버 한사람의 특정날짜의 주문한개
 * 4. 멤버 한사람의 카트정보(카트아이템리스트)
 * 5. 카트아이템 한개의 제품1개정보
 * 6. 주문한개의  멤버의 정보
 * 7. 주문한개의  제품여러개 정보들(주문상세)
 * 8. 주문한개의  제품여러개 정보&멤버정보(주문상세)
 */
 
-- 멤버의 정보와 멤버의 상세정보(전체멤버)
-- inner join
select * from member m join member_detail md
on m.m_id = md.m_id;
-- outer join
select * from member m left outer join member_detail md
on m.m_id = md.m_id;
 
-- 멤버의 정보와 멤버의 상세정보(로그인한 멤버 한명)
-- inner join
select * from member m join member_detail md
on m.m_id = md.m_id where m.m_id='ddd';
-- outer join
select * from member m left outer join member_detail md
on m.m_id = md.m_id where m.m_id='ddd';

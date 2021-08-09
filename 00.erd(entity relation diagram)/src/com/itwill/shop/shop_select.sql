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

-- 로그인한 사람(1)이 쓴 게시글 보기(0,n)
select * from board where m_id='aaa';
select * from board where m_id='bbb';
select * from board where m_id='ccc';

select * from member m join board b on m.m_id=b.m_id where m.m_id='aaa';
select * from member m join board b on m.m_id=b.m_id where m.m_id='bbb';
select * from member m join board b on m.m_id=b.m_id where m.m_id='ccc';

-- 로그인한 aaa 유저의 cart item리스트
select * from cart where m_id='aaa';
--select * from cart c where m_id='aaa';

-- 로그인한 aaa 유저의 cart item(제품정보포함)리스트
select * from cart c inner join product p on c.p_no = p.p_no where m_id='aaa';
-- 로그인한 ccc 유저의 cart item(제품정보포함)리스트
select * from cart c inner join product p on c.p_no = p.p_no where m_id='ccc';

-- 로그인한 aaa 유저의 cart item(제품정보포함) 한개보기
select * from cart c inner join product p on c.p_no = p.p_no where c.cart_item_no=7001;

-- 로그인한 aaa유저의 최근1주간(오늘) 주문목록
select * from orders where m_id='aaa' and to_char(o_date,'YYYY/MM/DD') > to_char(sysdate-7, 'YYYY/MM/DD');
select * from orders where m_id='aaa' and to_char(o_date,'YYYY/MM/DD') = to_char(sysdate, 'YYYY/MM/DD');

--로그인한 aaa 유저의 주문리스트 출력(주문1건에 주문아이템 여러개)
select * from orders o join order_item oi on o.o_no=oi.o_no where o.m_id='aaa';

--로그인한 aaa 유저의 주문1건 출력(주문1건에 주문아이템 여러개)
select * from orders o join order_item oi on o.o_no=oi.o_no where o.m_id='aaa' and o.o_no=8001;

--로그인한 aaa 유저의 주문(orders)한건 출력(주문1건에 주문아이템(order_item) 여러개 + 제품정보(product))
select * from orders o join order_item oi on o.o_no=oi.o_no join product p on oi.p_no = p.p_no
where o.m_id='aaa' and o.o_no=8001;













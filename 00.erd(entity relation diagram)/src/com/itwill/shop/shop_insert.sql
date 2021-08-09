-- member 회원가입
insert into member(m_id, m_password, m_name, m_address) values ('aaa', 'aaa', 'AIM', 'AEOUL');
insert into member(m_id, m_password, m_name, m_address) values ('bbb', 'bbb', 'BIM', 'BEOUL');
insert into member(m_id, m_password, m_name, m_address) values ('ccc', 'ccc', 'CIM', 'CEOUL');
insert into member(m_id, m_password, m_name, m_address) values ('ddd', 'ddd', 'DIM', 'DEOUL');
insert into member(m_id, m_password, m_name, m_address) values ('eee', 'eee', 'EIM', 'EEOUL');

-- member_detail 회원상세정보
insert into member_detail(m_id, md_carno, md_child) values ('aaa', '34가3050', 1);
insert into member_detail(m_id, md_carno, md_child) values ('bbb', '67야4532', 2);
insert into member_detail(m_id, md_carno, md_child) values ('ccc', '89가1249', 0);

-- board 회원게시판
insert into board(board_no, board_title, board_content, board_regdate, board_read_count, m_id) values(1, 'title1', 'content1', sysdate, 0, 'aaa');
insert into board(board_no, board_title, board_content, m_id) values(2, 'title2', 'content2', 'aaa');
insert into board(board_no, board_title, board_content, m_id) values(3, 'title3', 'content3', 'aaa');
insert into board(board_no, board_title, board_content, m_id) values(4, 'title4', 'content4', 'bbb');
insert into board(board_no, board_title, board_content, m_id) values(5, 'title5', 'content5', 'bbb');
insert into board(board_no, board_title, board_content, m_id) values(6, 'title6', 'content6', 'ccc');

-- product 제품
insert into product(p_no, p_name, p_price, p_desc) values (101, '아이패드1', 1000, '아이패드1 좋아요!');
insert into product(p_no, p_name, p_price, p_desc) values (102, '갤럭시20', 5000, '갤럭시20 좋아요!');
insert into product(p_no, p_name, p_price, p_desc) values (103, 'LG그램', 20000, 'LG그램 좋아요!');
insert into product(p_no, p_name, p_price, p_desc) values (104, '삼성노트북', 30000, '삼성노트북 좋아요!');
insert into product(p_no, p_name, p_price, p_desc) values (105, '현주컴퓨터', 10000, '현주컴퓨터 좋아요!');
insert into product(p_no, p_name, p_price, p_desc) values (106, '레노버노트북', 1000, '레노버노트북 좋아요!');
insert into product(p_no, p_name, p_price, p_desc) values (107, '한성컴퓨터', 1000, '한성컴퓨터 좋아요!');
insert into product(p_no, p_name, p_price, p_desc) values (108, '맥북', 50000, '맥북 좋아요!');

-- 로그인한 aaa유저 cart 담기(sql이 insert가 될수도 있고, 수량이 update가 될 수도 있음)
insert into cart(cart_item_no, cart_item_qty, m_id, p_no) values(7001, 1, 'aaa', 101);
insert into cart(cart_item_no, cart_item_qty, m_id, p_no) values(7002, 2, 'aaa', 102);
insert into cart(cart_item_no, cart_item_qty, m_id, p_no) values(7003, 3, 'aaa', 103);

-- 로그인한  bbb유저 cart 담기
insert into cart(cart_item_no, cart_item_qty, m_id, p_no) values(7004, 1, 'bbb', 103);
insert into cart(cart_item_no, cart_item_qty, m_id, p_no) values(7005, 2, 'bbb', 104);

-- 로그인한  ccc유저 cart 담기
insert into cart(cart_item_no, cart_item_qty, m_id, p_no) values(7006, 2, 'ccc', 105);


commit;

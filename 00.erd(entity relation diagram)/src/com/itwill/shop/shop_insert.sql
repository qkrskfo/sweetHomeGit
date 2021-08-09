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

commit;
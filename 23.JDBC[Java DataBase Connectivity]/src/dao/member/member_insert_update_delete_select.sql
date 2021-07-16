--insert
INSERT INTO member (m_id, m_password, m_name, m_address, m_age, m_married, m_regidate) VALUES ('aaaa', '1111', '김경호', '서울시 용산구', 48, 'T', sysdate);
INSERT INTO member (m_id, m_password, m_name, m_address, m_age, m_married, m_regidate) VALUES ('bbbb', '2222', '박나래', '서울시 강남구', 31, 'F', sysdate);
INSERT INTO member (m_id, m_password, m_name, m_address, m_age, m_married, m_regidate) VALUES ('cccc', '3333', '박여름', '서울시 관악구', 21, 'F', sysdate);

-- update pk
update member set m_password='0000', m_name='김변경', m_address='제주시', m_age=20, m_married='T' where m_id='aaaa';

-- delet pk
delete from member where m_id = 'aaaa';

-- select pk
select * from member where m_id = 'bbbb';

-- select all
select * from member;


-- commit 하지 않으면 아무것도 변경사항이 저장되지 않음
commit;

desc member;
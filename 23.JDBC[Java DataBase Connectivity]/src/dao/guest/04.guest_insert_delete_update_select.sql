--insert
insert into GUEST values(guest_no_seq.nextval , '김경호1', sysdate, 'guard1@naver.com', 'http://', '방명록 사용법1', '방명록처럼 사용하시면 됩니다1');
insert into GUEST values(guest_no_seq.nextval , '김경호2', sysdate, 'guard2@naver.com', 'http://', '방명록 사용법2', '방명록처럼 사용하시면 됩니다2');
insert into GUEST values(guest_no_seq.nextval , '김경호3', sysdate, 'guard3@naver.com', 'http://', '방명록 사용법3', '방명록처럼 사용하시면 됩니다3');
insert into GUEST values(guest_no_seq.nextval , '김경호4', sysdate, 'guard4@naver.com', 'http://', '방명록 사용법4', '방명록처럼 사용하시면 됩니다4');
--delete
delete from guest where guest_no = 1;
delete from guest where guest_no = 2;
--update
update guest set guest_name='name수정',                
                 guest_email='email수정',
                 guest_homepage='homepage수정',
                 guest_title='title수정',
                 guest_content='content수정'
where guest_no = 3;
--select pk
select * from guest where guest_no = 3;

--select all
select * from guest;

commit;
rollback;
DESC guest;

drop table accountA;
create table accountA( acc_no number(20)  primary key
                                  ,acc_name varchar2(20)
				  ,acc_balance number(10));
insert into accountA values(1,'이종범',350000);
insert into accountA values(2,'박찬호',670000);
insert into accountA values(3,'서재웅',235000);
insert into accountA values(4,'하리수',110000);
insert into accountA values(5,'김경호',900000);
insert into accountA values(6,'고길동',230000);

commit;







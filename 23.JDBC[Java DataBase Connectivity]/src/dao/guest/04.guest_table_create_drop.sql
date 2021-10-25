drop table GUEST;
create table GUEST(guest_no number(10) not null primary key,
		guest_name varchar2(100) not null,
		guest_date date not null,
		guest_email varchar2(100),
		guest_homepage varchar2(100),
		guest_title varchar2(255) not null,
		guest_content varchar2(4000) not null);

drop sequence guest_no_seq;
create sequence guest_no_seq  increment by 1 start with 1;








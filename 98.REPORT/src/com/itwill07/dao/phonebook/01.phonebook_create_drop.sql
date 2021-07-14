drop table phonebook;
create table phonebook (
		no number(4) primary key,
		name varchar2(50),
		phone varchar2(50)
);

drop sequence phonebook_no_seq;

create sequence phonebook_no_seq
start with 1 nocycle nocache;
desc phonebook;
--insert
insert into phonebook(no, name, phone) values(phonebook_no_seq.nextval, name, phone);
commit;

--update(pk update)
update phonebook set name='name', phone='phone' where no=no;
commit;

--delete (pk delete)
delete from phonebook where no = num;
commit;

--select (pk select)
select no, name, phone from phonebook where no = num;

--select(all select)
select no, name, phone from phonebook;

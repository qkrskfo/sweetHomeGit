--insert
insert into address values(address_no_seq.nextval,'guard','���ȣ','123-4568','��⵵ ������');
insert into address values(address_no_seq.nextval,'abcdf','�ڰ�ȣ','123-4568','��⵵ ������');
insert into address values(address_no_seq.nextval,'starts','�ְ�ȣ','123-4568','��⵵ ��õ��');
insert into address values(address_no_seq.nextval,'beauty','����ȣ','123-4568','��⵵ ��õ��');
insert into address values(address_no_seq.nextval,'bishop','����ȣ','123-4568','��⵵ ������');
insert into address values(address_no_seq.nextval,'xyzzx','�̰�ȣ','123-4568','��⵵ �Ⱦ��');
insert into address values(address_no_seq.nextval,'yyyyy','�ְ�ȣ','123-4568','��⵵ �Ȼ��');
insert into address values(address_no_seq.nextval,'super','���ȣ','123-4568','��⵵ ��õ��');
insert into address values(address_no_seq.nextval,'strong','�ΰ�ȣ','123-4568','��⵵ �����');
commit;

--update(pk update)
update address set id='xxx',name='���ȣ',phone='899-9999',address='����� ������' where no = 1;
commit;

--delete (pk delete)
delete address where no=1;
commit;

--select (pk select)
select no,id,name,phone,address from address where no = 3;
--select(all select)
select no,id,name,phone,address from address; 
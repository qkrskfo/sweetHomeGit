DROP TABLE TABLE_3 CASCADE CONSTRAINTS;
DROP TABLE member_detail CASCADE CONSTRAINTS;
DROP TABLE member CASCADE CONSTRAINTS;

CREATE TABLE member(
		m_id                          		VARCHAR2(10)		 NULL ,
		m_password                    		VARCHAR2(10)		 NULL ,
		m_name                        		VARCHAR2(50)		 NULL ,
		m_address                     		VARCHAR2(100)		 NULL 
);


CREATE TABLE member_detail(
		m_id                          		VARCHAR2(10)		 NULL ,
		md_carno                      		INTEGER(10)		 NULL ,
		md_child                      		INTEGER(10)		 NULL 
);


CREATE TABLE TABLE_3(
		board_no                      		NUMBER(3)		 NULL ,
		board_title                   		VARCHAR2(100)		 NULL ,
		board_content                 		VARCHAR2(512)		 NULL ,
		board_regdate                 		DATE		 NULL ,
		board_read_count              		NUMBER(10)		 NULL ,
		m_id                          		VARCHAR2(10)		 NULL 
);



ALTER TABLE member ADD CONSTRAINT IDX_member_PK PRIMARY KEY (m_id);

ALTER TABLE member_detail ADD CONSTRAINT IDX_member_detail_PK PRIMARY KEY (m_id);
ALTER TABLE member_detail ADD CONSTRAINT IDX_member_detail_FK0 FOREIGN KEY (m_id) REFERENCES member (m_id);

ALTER TABLE TABLE_3 ADD CONSTRAINT IDX_TABLE_3_PK PRIMARY KEY (board_no);
ALTER TABLE TABLE_3 ADD CONSTRAINT IDX_TABLE_3_FK0 FOREIGN KEY (m_id) REFERENCES member (m_id);


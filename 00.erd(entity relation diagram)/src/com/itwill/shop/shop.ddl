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



ALTER TABLE member ADD CONSTRAINT IDX_member_PK PRIMARY KEY (m_id);

ALTER TABLE member_detail ADD CONSTRAINT IDX_member_detail_PK PRIMARY KEY (m_id);
ALTER TABLE member_detail ADD CONSTRAINT IDX_member_detail_FK0 FOREIGN KEY (m_id) REFERENCES member (m_id);


DROP TABLE cart CASCADE CONSTRAINTS;
DROP TABLE product CASCADE CONSTRAINTS;
DROP TABLE board CASCADE CONSTRAINTS;
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
		md_carno                      		VARCHAR2(20)		 NULL ,
		md_child                      		NUMBER(10)		 NULL 
);


CREATE TABLE board(
		board_no                      		NUMBER(3)		 NULL ,
		board_title                   		VARCHAR2(100)		 NULL ,
		board_content                 		VARCHAR2(512)		 NULL ,
		board_regdate                 		DATE		 NULL ,
		board_read_count              		NUMBER(10)		 NULL ,
		m_id                          		VARCHAR2(10)		 NULL 
);


CREATE TABLE product(
		p_no                          		NUMBER(10)		 NULL ,
		p_name                        		VARCHAR2(50)		 NULL ,
		p_price                       		NUMBER(10)		 DEFAULT 0		 NULL ,
		p_desc                        		VARCHAR2(256)		 NULL 
);


CREATE TABLE cart(
		cart_item_no                  		NUMBER(10)		 NULL ,
		cart_item_qty                 		NUMBER(10)		 DEFAULT 1		 NULL ,
		m_id                          		VARCHAR2(10)		 NULL ,
		p_no                          		NUMBER(10)		 NULL 
);



ALTER TABLE member ADD CONSTRAINT IDX_member_PK PRIMARY KEY (m_id);

ALTER TABLE member_detail ADD CONSTRAINT IDX_member_detail_PK PRIMARY KEY (m_id);
ALTER TABLE member_detail ADD CONSTRAINT IDX_member_detail_FK0 FOREIGN KEY (m_id) REFERENCES member (m_id);

ALTER TABLE board ADD CONSTRAINT IDX_board_PK PRIMARY KEY (board_no);
ALTER TABLE board ADD CONSTRAINT IDX_board_FK0 FOREIGN KEY (m_id) REFERENCES member (m_id);

ALTER TABLE product ADD CONSTRAINT IDX_product_PK PRIMARY KEY (p_no);

ALTER TABLE cart ADD CONSTRAINT IDX_cart_PK PRIMARY KEY (cart_item_no);
ALTER TABLE cart ADD CONSTRAINT IDX_cart_FK0 FOREIGN KEY (m_id) REFERENCES member (m_id);
ALTER TABLE cart ADD CONSTRAINT IDX_cart_FK1 FOREIGN KEY (p_no) REFERENCES product (p_no);


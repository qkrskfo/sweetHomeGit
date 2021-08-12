DROP TABLE board_q_answer CASCADE CONSTRAINTS;
DROP TABLE board_p_inquiry CASCADE CONSTRAINTS;
DROP TABLE board_review CASCADE CONSTRAINTS;
DROP TABLE oder_item CASCADE CONSTRAINTS;
DROP TABLE orders CASCADE CONSTRAINTS;
DROP TABLE cart CASCADE CONSTRAINTS;
DROP TABLE product CASCADE CONSTRAINTS;
DROP TABLE member_delivery CASCADE CONSTRAINTS;
DROP TABLE member CASCADE CONSTRAINTS;

CREATE TABLE member(
		m_id                          		VARCHAR2(20)		 NULL ,
		m_password                    		VARCHAR2(20)		 NULL ,
		m_name                        		VARCHAR2(20)		 NULL ,
		m_email                       		VARCHAR2(50)		 NULL ,
		m_phone                       		VARCHAR2(15)		 NULL ,
		m_address                     		VARCHAR2(100)		 NULL ,
		m_gender                      		VARCHAR2(1)		 NULL ,
		m_birthdate                   		VARCHAR2(10)		 NULL 
);


CREATE TABLE member_delivery(
		delivery_no                   		NUMBER(3)		 NULL ,
		delivery_name                 		VARCHAR2(20)		 NULL ,
		delivery_phone                		VARCHAR2(15)		 NULL ,
		delivery_address              		VARCHAR2(100)		 NULL ,
		delivery_point                		VARCHAR2(20)		 NULL ,
		delivery_door_access          		VARCHAR2(20)		 NULL ,
		delivery_msg_time             		VARCHAR2(1)		 NULL ,
		m_id                          		VARCHAR2(20)		 NULL 
);


CREATE TABLE product(
		p_no                          		NUMBER(10)		 NULL ,
		p_name                        		VARCHAR2(50)		 NULL ,
		p_price                       		NUMBER(12)		 NULL ,
		p_comment                     		VARCHAR2(100)		 NULL ,
		p_stock                       		NUMBER(10)		 NULL ,
		p_product_type                		VARCHAR2(1)		 NULL 
);


CREATE TABLE cart(
		cart_item_no                  		NUMBER(10)		 NULL ,
		cart_qty                      		NUMBER(10)		 DEFAULT 1		 NULL ,
		p_no                          		NUMBER(10)		 NULL ,
		m_id                          		VARCHAR2(20)		 NULL 
);


CREATE TABLE orders(
		o_no                          		NUMBER(10)		 NULL ,
		o_date                        		DATE		 DEFAULT sysdate		 NULL ,
		o_price                       		NUMBER(20)		 NULL ,
		o_payment_method              		VARCHAR2(10)		 NULL ,
		o_delivery_state              		VARCHAR2(10)		 NULL ,
		o_deliveryFee                 		NUMBER(10)		 DEFAULT 0		 NULL ,
		m_id                          		VARCHAR2(20)		 NULL ,
		cart_item_no                  		NUMBER(10)		 NULL 
);


CREATE TABLE oder_item(
		oi_no                         		NUMBER(10)		 NULL ,
		oi_qty                        		NUMBER(10)		 DEFAULT 1		 NULL ,
		o_no                          		NUMBER(10)		 NULL ,
		p_no                          		NUMBER(10)		 NULL 
);


CREATE TABLE board_review(
		r_no                          		NUMBER(10)		 NULL ,
		r_title                       		VARCHAR2(20)		 NULL ,
		r_content                     		VARCHAR2(5000)		 NULL ,
		m_id                          		VARCHAR2(20)		 NULL ,
		p_no                          		NUMBER(10)		 NULL 
);


CREATE TABLE board_p_inquiry(
		q_no                          		NUMBER(10)		 NULL ,
		q_title                       		VARCHAR2(30)		 NULL ,
		q_details                     		VARCHAR2(5000)		 NULL ,
		q_secret                      		CHAR(1)		 DEFAULT F		 NULL ,
		q_regi_date                   		DATE		 DEFAULT sysdate		 NULL ,
		m_id                          		VARCHAR2(20)		 NULL ,
		p_no                          		NUMBER(10)		 NULL 
);


CREATE TABLE board_q_answer(
		q_answer_no                   		NUMBER(10)		 NULL ,
		q_answer                      		VARCHAR2(5000)		 NULL ,
		q_answer_regi_date            		DATE		 DEFAULT sysdate		 NULL ,
		q_no                          		NUMBER(10)		 NULL ,
		m_id                          		VARCHAR2(20)		 NULL 
);



ALTER TABLE member ADD CONSTRAINT IDX_member_PK PRIMARY KEY (m_id);

ALTER TABLE member_delivery ADD CONSTRAINT IDX_member_delivery_PK PRIMARY KEY (delivery_no);
ALTER TABLE member_delivery ADD CONSTRAINT IDX_member_delivery_FK0 FOREIGN KEY (m_id) REFERENCES member (m_id);

ALTER TABLE product ADD CONSTRAINT IDX_product_PK PRIMARY KEY (p_no);

ALTER TABLE cart ADD CONSTRAINT IDX_cart_PK PRIMARY KEY (cart_item_no);
ALTER TABLE cart ADD CONSTRAINT IDX_cart_FK0 FOREIGN KEY (p_no) REFERENCES product (p_no);
ALTER TABLE cart ADD CONSTRAINT IDX_cart_FK1 FOREIGN KEY (m_id) REFERENCES member (m_id);

ALTER TABLE orders ADD CONSTRAINT IDX_orders_PK PRIMARY KEY (o_no);
ALTER TABLE orders ADD CONSTRAINT IDX_orders_FK0 FOREIGN KEY (m_id) REFERENCES member (m_id);
ALTER TABLE orders ADD CONSTRAINT IDX_orders_FK1 FOREIGN KEY (cart_item_no) REFERENCES cart (cart_item_no);

ALTER TABLE oder_item ADD CONSTRAINT IDX_oder_item_PK PRIMARY KEY (oi_no);
ALTER TABLE oder_item ADD CONSTRAINT IDX_oder_item_FK0 FOREIGN KEY (o_no) REFERENCES orders (o_no);
ALTER TABLE oder_item ADD CONSTRAINT IDX_oder_item_FK1 FOREIGN KEY (p_no) REFERENCES product (p_no);

ALTER TABLE board_review ADD CONSTRAINT IDX_board_review_PK PRIMARY KEY (r_no);
ALTER TABLE board_review ADD CONSTRAINT IDX_board_review_FK0 FOREIGN KEY (m_id) REFERENCES member (m_id);
ALTER TABLE board_review ADD CONSTRAINT IDX_board_review_FK1 FOREIGN KEY (p_no) REFERENCES product (p_no);

ALTER TABLE board_p_inquiry ADD CONSTRAINT IDX_board_p_inquiry_PK PRIMARY KEY (q_no);
ALTER TABLE board_p_inquiry ADD CONSTRAINT IDX_board_p_inquiry_FK0 FOREIGN KEY (m_id) REFERENCES member (m_id);
ALTER TABLE board_p_inquiry ADD CONSTRAINT IDX_board_p_inquiry_FK1 FOREIGN KEY (p_no) REFERENCES product (p_no);

ALTER TABLE board_q_answer ADD CONSTRAINT IDX_board_q_answer_PK PRIMARY KEY (q_answer_no);
ALTER TABLE board_q_answer ADD CONSTRAINT IDX_board_q_answer_FK0 FOREIGN KEY (q_no) REFERENCES board_p_inquiry (q_no);
ALTER TABLE board_q_answer ADD CONSTRAINT IDX_board_q_answer_FK1 FOREIGN KEY (m_id) REFERENCES member (m_id);


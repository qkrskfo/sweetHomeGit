DROP TABLE board_q_answer CASCADE CONSTRAINTS;
DROP TABLE board_p_inquiry CASCADE CONSTRAINTS;
DROP TABLE board_review CASCADE CONSTRAINTS;
DROP TABLE oder_item CASCADE CONSTRAINTS;
DROP TABLE orders CASCADE CONSTRAINTS;
DROP TABLE cart CASCADE CONSTRAINTS;
DROP TABLE product CASCADE CONSTRAINTS;
DROP TABLE member_delivery CASCADE CONSTRAINTS;
DROP TABLE member CASCADE CONSTRAINTS;

/**********************************/
/* Table Name: member */
/**********************************/
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

COMMENT ON TABLE member is 'member';
COMMENT ON COLUMN member.m_id is 'm_id';
COMMENT ON COLUMN member.m_password is 'm_password';
COMMENT ON COLUMN member.m_name is 'm_name';
COMMENT ON COLUMN member.m_email is 'm_email';
COMMENT ON COLUMN member.m_phone is 'm_phone';
COMMENT ON COLUMN member.m_address is 'm_address';
COMMENT ON COLUMN member.m_gender is 'm_gender';
COMMENT ON COLUMN member.m_birthdate is 'm_birthdate';


/**********************************/
/* Table Name: member_delivery */
/**********************************/
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

COMMENT ON TABLE member_delivery is 'member_delivery';
COMMENT ON COLUMN member_delivery.delivery_no is 'delivery_no';
COMMENT ON COLUMN member_delivery.delivery_name is 'delivery_name';
COMMENT ON COLUMN member_delivery.delivery_phone is 'delivery_phone';
COMMENT ON COLUMN member_delivery.delivery_address is 'delivery_address';
COMMENT ON COLUMN member_delivery.delivery_point is 'delivery_point';
COMMENT ON COLUMN member_delivery.delivery_door_access is 'delivery_door_access';
COMMENT ON COLUMN member_delivery.delivery_msg_time is 'delivery_msg_time';
COMMENT ON COLUMN member_delivery.m_id is 'm_id';


/**********************************/
/* Table Name: product */
/**********************************/
CREATE TABLE product(
		p_no                          		NUMBER(10)		 NULL ,
		p_name                        		VARCHAR2(50)		 NULL ,
		p_price                       		NUMBER(12)		 NULL ,
		p_comment                     		VARCHAR2(100)		 NULL ,
		p_stock                       		NUMBER(10)		 NULL ,
		p_product_type                		VARCHAR2(1)		 NULL 
);

COMMENT ON TABLE product is 'product';
COMMENT ON COLUMN product.p_no is 'p_no';
COMMENT ON COLUMN product.p_name is 'p_name';
COMMENT ON COLUMN product.p_price is 'p_price';
COMMENT ON COLUMN product.p_comment is 'p_comment';
COMMENT ON COLUMN product.p_stock is 'p_stock';
COMMENT ON COLUMN product.p_product_type is 'p_product_type';


/**********************************/
/* Table Name: cart */
/**********************************/
CREATE TABLE cart(
		cart_item_no                  		NUMBER(10)		 NULL ,
		cart_qty                      		NUMBER(10)		 DEFAULT 1		 NULL ,
		p_no                          		NUMBER(10)		 NULL ,
		m_id                          		VARCHAR2(20)		 NULL 
);

COMMENT ON TABLE cart is 'cart';
COMMENT ON COLUMN cart.cart_item_no is 'cart_item_no';
COMMENT ON COLUMN cart.cart_qty is 'cart_qty';
COMMENT ON COLUMN cart.p_no is 'p_no';
COMMENT ON COLUMN cart.m_id is 'm_id';


/**********************************/
/* Table Name: orders */
/**********************************/
CREATE TABLE orders(
		o_no                          		NUMBER(10)		 NULL ,
		o_date                        		DATE		 DEFAULT sysdate		 NULL ,
		o_price                       		NUMBER(20)		 NULL ,
		o_payment_method              		VARCHAR2(10)		 NULL ,
		o_delivery_state              		VARCHAR2(10)		 NULL ,
		o_deliveryFee                 		NUMBER(10)		 DEFAULT 0		 NULL ,
		m_id                          		VARCHAR2(20)		 NULL 
);

COMMENT ON TABLE orders is 'orders';
COMMENT ON COLUMN orders.o_no is 'o_no';
COMMENT ON COLUMN orders.o_date is 'o_date';
COMMENT ON COLUMN orders.o_price is 'o_price';
COMMENT ON COLUMN orders.o_payment_method is 'o_payment_method';
COMMENT ON COLUMN orders.o_delivery_state is 'o_delivery_state';
COMMENT ON COLUMN orders.o_deliveryFee is 'o_deliveryFee';
COMMENT ON COLUMN orders.m_id is 'm_id';


/**********************************/
/* Table Name: oder_item */
/**********************************/
CREATE TABLE oder_item(
		oi_no                         		NUMBER(10)		 NULL ,
		oi_qty                        		NUMBER(10)		 DEFAULT 1		 NULL ,
		o_no                          		NUMBER(10)		 NULL ,
		p_no                          		NUMBER(10)		 NULL 
);

COMMENT ON TABLE oder_item is 'oder_item';
COMMENT ON COLUMN oder_item.oi_no is 'oi_no';
COMMENT ON COLUMN oder_item.oi_qty is 'oi_qty';
COMMENT ON COLUMN oder_item.o_no is 'o_no';
COMMENT ON COLUMN oder_item.p_no is 'p_no';


/**********************************/
/* Table Name: board_review */
/**********************************/
CREATE TABLE board_review(
		r_no                          		NUMBER(10)		 NULL ,
		r_title                       		VARCHAR2(20)		 NULL ,
		r_content                     		VARCHAR2(500)		 NULL ,
		m_id                          		VARCHAR2(20)		 NULL ,
		p_no                          		NUMBER(10)		 NULL 
);

COMMENT ON TABLE board_review is 'board_review';
COMMENT ON COLUMN board_review.r_no is 'r_no';
COMMENT ON COLUMN board_review.r_title is 'r_title';
COMMENT ON COLUMN board_review.r_content is 'r_content';
COMMENT ON COLUMN board_review.m_id is 'm_id';
COMMENT ON COLUMN board_review.p_no is 'p_no';


/**********************************/
/* Table Name: board_p_inquiry */
/**********************************/
CREATE TABLE board_p_inquiry(
		q_no                          		NUMBER(10)		 NULL ,
		q_title                       		VARCHAR2(30)		 NULL ,
		q_details                     		VARCHAR2(500)		 NULL ,
		q_secret                      		CHAR(1)		 NULL ,
		q_regi_date                   		DATE		 DEFAULT sysdate		 NULL ,
		m_id                          		VARCHAR2(20)		 NULL ,
		p_no                          		NUMBER(10)		 NULL 
);

COMMENT ON TABLE board_p_inquiry is 'board_p_inquiry';
COMMENT ON COLUMN board_p_inquiry.q_no is 'q_no';
COMMENT ON COLUMN board_p_inquiry.q_title is 'q_title';
COMMENT ON COLUMN board_p_inquiry.q_details is 'q_details';
COMMENT ON COLUMN board_p_inquiry.q_secret is 'q_secret';
COMMENT ON COLUMN board_p_inquiry.q_regi_date is 'q_regi_date';
COMMENT ON COLUMN board_p_inquiry.m_id is 'm_id';
COMMENT ON COLUMN board_p_inquiry.p_no is 'p_no';


/**********************************/
/* Table Name: board_q_answer */
/**********************************/
CREATE TABLE board_q_answer(
		q_answer_no                   		NUMBER(10)		 NULL ,
		q_answer                      		VARCHAR2(500)		 NULL ,
		q_answer_regi_date            		DATE		 DEFAULT sysdate		 NULL ,
		q_no                          		NUMBER(10)		 NULL ,
		m_id                          		VARCHAR2(20)		 NULL 
);

COMMENT ON TABLE board_q_answer is 'board_q_answer';
COMMENT ON COLUMN board_q_answer.q_answer_no is 'q_answer_no';
COMMENT ON COLUMN board_q_answer.q_answer is 'q_answer';
COMMENT ON COLUMN board_q_answer.q_answer_regi_date is 'q_answer_regi_date';
COMMENT ON COLUMN board_q_answer.q_no is 'q_no';
COMMENT ON COLUMN board_q_answer.m_id is 'm_id';



ALTER TABLE member ADD CONSTRAINT IDX_member_PK PRIMARY KEY (m_id);

ALTER TABLE member_delivery ADD CONSTRAINT IDX_member_delivery_PK PRIMARY KEY (delivery_no);
ALTER TABLE member_delivery ADD CONSTRAINT IDX_member_delivery_FK0 FOREIGN KEY (m_id) REFERENCES member (m_id);

ALTER TABLE product ADD CONSTRAINT IDX_product_PK PRIMARY KEY (p_no);

ALTER TABLE cart ADD CONSTRAINT IDX_cart_PK PRIMARY KEY (cart_item_no);
ALTER TABLE cart ADD CONSTRAINT IDX_cart_FK0 FOREIGN KEY (p_no) REFERENCES product (p_no);
ALTER TABLE cart ADD CONSTRAINT IDX_cart_FK1 FOREIGN KEY (m_id) REFERENCES member (m_id);

ALTER TABLE orders ADD CONSTRAINT IDX_orders_PK PRIMARY KEY (o_no);
ALTER TABLE orders ADD CONSTRAINT IDX_orders_FK0 FOREIGN KEY (m_id) REFERENCES member (m_id);

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


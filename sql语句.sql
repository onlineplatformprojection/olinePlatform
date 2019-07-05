create database educationsystem  DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
use educationsystem;
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article`  (
  `a_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_id` bigint(20) NULL DEFAULT NULL,
  `a_title` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `a_content` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `a_publish_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP() ON UPDATE CURRENT_TIMESTAMP(),
  PRIMARY KEY (`a_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;


use educationsystem;
alter table article  add a_classify varchar(32) not Null;

use educationsystem;
create table class
(
	cls_id	int 	not null AUTO_INCREMENT,
    cls_name	varchar(32)		not null,
    constraint PK_class primary key (cls_id)
    
);



create table chapter 
(
   chap_id              integer                        not null AUTO_INCREMENT,
   c_id                 integer                        not null,
   chap_Name            varchar(20)                    null,
   constraint PK_CHAPTER primary key (chap_id)
);



use educationsystem;
create table course 
(
   c_id                 integer                        not null AUTO_INCREMENT,
   c_Name               varchar(10)                    null,
   c_teacher            varchar(10)                    null,
   c_prize              numeric(8,2)                   null,
   c_buyNum             integer                        null,
   c_introduce          text                           null,
   c_img                text                           null,
   constraint PK_COURSE primary key (c_id)
);
use educationsystem;
alter table course  add a_classify varchar(32) not Null;




create table evaluate 
(
	e_id	int		not null auto_increment,			
   u_id                 bigint                        not null,
   c_id                 integer                        not null,
   e_content            text                           null,
   evaluateDate         datetime                       null,
   constraint PK_EVALUATE primary key (e_id)
);

create table purchase 
(
	p_id	int		not null auto_increment, 
   u_id                 bigint                        not null,
   c_id                 integer                        not null,
   buyDate              datetime                       null,
   constraint PK_PURCHASE primary key (p_id)
);

use educationsystem;
create table remark 
(
	r_id	int 	not null auto_increment,
   u_id                 bigint                        not null,
   a_id                 integer                        not null,
   remark_content       text                           null,
   remarkDate           timestamp                       not null,
   constraint PK_REMARK primary key clustered (r_id)
);

use educationsystem;
create table user
(
	u_id	int 	not null auto_increment primary key,
   u_account                 bigint                        not null,
   u_pwd                varchar(15)                    null,
   u_name               varchar(10)                    null,
   constraint PK_USER unique (u_account)
);



create table video 
(
   v_id                 integer                        not null AUTO_INCREMENT,
   chap_id              integer                        null,
   v_Name               varchar(20)                    null,
   v_Addr               text                   null,
   constraint PK_VIDEO primary key (v_id)
);

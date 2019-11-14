/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 8.0.16 : Database - xindasystem
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`xindasystem` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `xindasystem`;

/*Table structure for table `administartor` */

DROP TABLE IF EXISTS `administartor`;

CREATE TABLE `administartor` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `phone` varchar(11) DEFAULT NULL COMMENT '手机号',
  `password` varchar(20) DEFAULT NULL COMMENT '密码',
  `username` varchar(20) DEFAULT NULL COMMENT '用户名',
  `email` varchar(30) DEFAULT NULL COMMENT '邮箱',
  `status` enum('1:已登录','2:未登录') DEFAULT NULL COMMENT '登录状态',
  `time` timestamp NULL DEFAULT NULL COMMENT '注册时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `administartor` */

/*Table structure for table `business_order` */

DROP TABLE IF EXISTS `business_order`;

CREATE TABLE `business_order` (
  `b_id` int(32) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `business_no` varchar(32) DEFAULT NULL COMMENT '业务订单编号',
  `order_info` varchar(256) DEFAULT NULL COMMENT '订单内容',
  `status` int(22) DEFAULT NULL COMMENT '状态（1.未支付；2.已支付；3.已取消）',
  `toyal_price` int(22) DEFAULT NULL COMMENT '总费用',
  `pay_type` int(22) DEFAULT NULL COMMENT '支付方式',
  `member_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '会员id',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `member_name` varchar(32) DEFAULT NULL COMMENT '会员用户名',
  `product_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '服务商名称',
  `amount` varchar(20) DEFAULT NULL COMMENT '总数量',
  `tel` varchar(20) DEFAULT NULL COMMENT '电话号',
  `product_id` int(11) DEFAULT NULL COMMENT '服务商id',
  PRIMARY KEY (`b_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `business_order` */

insert  into `business_order`(`b_id`,`business_no`,`order_info`,`status`,`toyal_price`,`pay_type`,`member_id`,`create_time`,`member_name`,`product_name`,`amount`,`tel`,`product_id`) values (1,'456789','aaa',NULL,5000,NULL,NULL,'2019-11-14 10:17:53','张三','aaa','5','17044213',22);

/*Table structure for table `cart` */

DROP TABLE IF EXISTS `cart`;

CREATE TABLE `cart` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `member_id` varchar(32) DEFAULT NULL COMMENT '会员ID',
  `service_id` varchar(32) DEFAULT NULL COMMENT '服务产品ID',
  `service_name` varchar(64) DEFAULT NULL COMMENT '服务名称',
  `service_info` varchar(1024) DEFAULT NULL COMMENT '服务内容',
  `unit_price` int(22) DEFAULT NULL COMMENT '单价',
  `buy_num` int(22) DEFAULT NULL COMMENT '购买数量',
  `total_price` int(22) DEFAULT NULL COMMENT '总价',
  `service_request` varchar(1024) DEFAULT NULL COMMENT '服务需求',
  `provider_id` varchar(32) DEFAULT NULL COMMENT '服务ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `cart` */

/*Table structure for table `city` */

DROP TABLE IF EXISTS `city`;

CREATE TABLE `city` (
  `ci_id` int(10) NOT NULL AUTO_INCREMENT,
  `ci_name` varchar(20) DEFAULT NULL,
  `ci_pr` int(20) DEFAULT NULL,
  PRIMARY KEY (`ci_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `city` */

insert  into `city`(`ci_id`,`ci_name`,`ci_pr`) values (1,'哈尔滨',1),(2,'齐齐哈尔',1),(3,'牡丹江',1),(4,'长春',2);

/*Table structure for table `county` */

DROP TABLE IF EXISTS `county`;

CREATE TABLE `county` (
  `co_id` int(10) NOT NULL AUTO_INCREMENT,
  `co_name` varchar(20) DEFAULT NULL,
  `co_ci` int(10) DEFAULT NULL,
  PRIMARY KEY (`co_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `county` */

insert  into `county`(`co_id`,`co_name`,`co_ci`) values (1,'南岗区',1),(2,'香坊区',1);

/*Table structure for table `member` */

DROP TABLE IF EXISTS `member`;

CREATE TABLE `member` (
  `id` varchar(32) DEFAULT NULL COMMENT '主键',
  `name` varchar(16) DEFAULT NULL COMMENT '会员名称',
  `gender` int(22) DEFAULT NULL COMMENT '性别（1，男，2，女）',
  `cellphone` varchar(16) DEFAULT NULL COMMENT '手机号',
  `login_id` varchar(64) DEFAULT NULL COMMENT '登录账号',
  `password` varchar(128) DEFAULT NULL COMMENT '密码',
  `head_img` varchar(64) DEFAULT NULL COMMENT '头像',
  `register_time` date DEFAULT NULL COMMENT '注册时间',
  `email` varchar(128) DEFAULT NULL COMMENT '邮箱',
  `status` int(22) DEFAULT NULL COMMENT '状态（1，正常，2，停用）',
  `last_login_time` date DEFAULT NULL COMMENT '最后登录时间',
  `region_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '所在地'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `member` */

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '服务名称',
  `code` int(22) DEFAULT NULL COMMENT '产品编号',
  `img` blob COMMENT '图片',
  `info` varchar(256) DEFAULT NULL COMMENT '产品简介',
  `show_order` int(22) DEFAULT NULL COMMENT '排序',
  `style_id` varchar(32) DEFAULT NULL COMMENT '产品类型id',
  `type_id` varchar(32) DEFAULT NULL COMMENT '产品分类id',
  `market_price` int(22) DEFAULT NULL COMMENT '市场价格',
  `unit` varchar(8) DEFAULT NULL COMMENT '单位',
  `store_num` int(22) DEFAULT NULL COMMENT '库存量',
  `sale_num` int(22) DEFAULT NULL COMMENT '已售数量',
  `status` enum('1：在线','2：下线') DEFAULT NULL COMMENT '状态（1，在线，2，下线）',
  `service_content` varchar(4000) DEFAULT NULL COMMENT '服务内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

/*Data for the table `product` */

insert  into `product`(`id`,`name`,`code`,`img`,`info`,`show_order`,`style_id`,`type_id`,`market_price`,`unit`,`store_num`,`sale_num`,`status`,`service_content`) values (22,'aaa',NULL,NULL,'jjjjj',NULL,NULL,NULL,6000,NULL,NULL,NULL,NULL,NULL),(23,'大数据',NULL,NULL,'bbbb',NULL,NULL,NULL,50000,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `product_user` */

DROP TABLE IF EXISTS `product_user`;

CREATE TABLE `product_user` (
  `p_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '客户名称',
  `password` varchar(20) DEFAULT NULL COMMENT '密码',
  `tel` varchar(20) DEFAULT NULL COMMENT '电话号',
  `provider_info` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '服务说明',
  `provider_img` blob COMMENT '服务商头像',
  `auth_file` blob COMMENT '认证文件',
  `qq` int(11) DEFAULT NULL COMMENT 'qq',
  `work_time` varchar(20) DEFAULT NULL COMMENT '工作时间',
  `wechat` varchar(20) DEFAULT NULL COMMENT '微信',
  `email` varchar(20) DEFAULT NULL COMMENT '邮箱',
  `register_time` varchar(20) DEFAULT NULL COMMENT '注册时间',
  `regin_id` int(11) DEFAULT NULL COMMENT '地区',
  PRIMARY KEY (`p_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `product_user` */

insert  into `product_user`(`p_id`,`username`,`password`,`tel`,`provider_info`,`provider_img`,`auth_file`,`qq`,`work_time`,`wechat`,`email`,`register_time`,`regin_id`) values (1,'张三','123','17044213','1','22','5',600,'2019-11-12 11:38:50',NULL,NULL,NULL,NULL);

/*Table structure for table `provider` */

DROP TABLE IF EXISTS `provider`;

CREATE TABLE `provider` (
  `ID` varchar(32) NOT NULL COMMENT '主键',
  `NAME` varchar(16) DEFAULT NULL COMMENT '名称',
  `PROVIDER_INFO` varchar(1024) DEFAULT NULL COMMENT '服务说明',
  `CELLPHONE` varchar(16) DEFAULT NULL COMMENT '手机号',
  `PASSWORD` varchar(128) DEFAULT NULL COMMENT '密码',
  `PROVIDER_IMG` blob COMMENT '服务商头像',
  `REGION_ID` varchar(32) DEFAULT NULL COMMENT '地区',
  `REGISTER_TIME` date DEFAULT NULL COMMENT '注册时间',
  `STATUS` enum('1：正常','2：停用') DEFAULT NULL COMMENT '状态（1、正常，2、停用）',
  `AUTH_FILE` blob COMMENT '认证文件，营业执照',
  `WEIXIN` varchar(16) DEFAULT NULL COMMENT '微信号',
  `QQ` varchar(16) DEFAULT NULL COMMENT 'qq号',
  `WORK_TIME` varchar(64) DEFAULT NULL COMMENT '工作时间',
  `EMAIL` varchar(64) DEFAULT NULL COMMENT '邮箱',
  `RECOMMEND` varchar(300) DEFAULT NULL COMMENT '是否推荐服务商',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `provider` */

/*Table structure for table `province` */

DROP TABLE IF EXISTS `province`;

CREATE TABLE `province` (
  `pr_id` int(10) NOT NULL AUTO_INCREMENT,
  `pr_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`pr_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `province` */

insert  into `province`(`pr_id`,`pr_name`) values (1,'黑龙江'),(2,'吉林'),(3,'辽宁');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

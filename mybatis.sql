/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50556
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50556
File Encoding         : 65001

Date: 2023-05-18 10:19:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student1
-- ----------------------------
DROP TABLE IF EXISTS `student1`;
CREATE TABLE `student1` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  `age` tinyint(3) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of student1
-- ----------------------------
INSERT INTO `student1` VALUES ('1', '方方', '18');
INSERT INTO `student1` VALUES ('2', '海伦', '19');
INSERT INTO `student1` VALUES ('3', '汤姆', '19');

-- ----------------------------
-- Table structure for tb_card
-- ----------------------------
DROP TABLE IF EXISTS `tb_card`;
CREATE TABLE `tb_card` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_card
-- ----------------------------
INSERT INTO `tb_card` VALUES ('2', '1234567893423432');

-- ----------------------------
-- Table structure for tb_employee
-- ----------------------------
DROP TABLE IF EXISTS `tb_employee`;
CREATE TABLE `tb_employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `loginname` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `sex` char(1) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `sal` double(4,0) DEFAULT NULL,
  `state` varchar(18) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_employee
-- ----------------------------
INSERT INTO `tb_employee` VALUES ('1', 'jack', '123456', '杰克', '男', '26', '1390201999', '9800', 'ACTIVE');
INSERT INTO `tb_employee` VALUES ('2', 'rose', '123456', '露丝', '女', '21', '1282018888', '6800', 'ACTIVE');
INSERT INTO `tb_employee` VALUES ('3', 'tom', '123456', '汤姆', '男', '25', '1380201777', '8800', 'ACTIVE');
INSERT INTO `tb_employee` VALUES ('4', 'zhangmei', '456', '张梅', '女', '20', '1390201666', '5800', 'ACTIVE');

-- ----------------------------
-- Table structure for tb_person
-- ----------------------------
DROP TABLE IF EXISTS `tb_person`;
CREATE TABLE `tb_person` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `card_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `tb_person_ibfk_1` (`card_id`),
  CONSTRAINT `tb_person_ibfk_1` FOREIGN KEY (`card_id`) REFERENCES `tb_card` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_person
-- ----------------------------
INSERT INTO `tb_person` VALUES ('2', '李四', '女', '18', '2');

-- ----------------------------
-- Table structure for tb_student
-- ----------------------------
DROP TABLE IF EXISTS `tb_student`;
CREATE TABLE `tb_student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stuName` varchar(255) DEFAULT NULL,
  `stuNo` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_student
-- ----------------------------
INSERT INTO `tb_student` VALUES ('1', '张三', '1001', '男', '18');
INSERT INTO `tb_student` VALUES ('2', '李四', '1002', '男', '20');
INSERT INTO `tb_student` VALUES ('3', '王五', '1003', '男', '19');
INSERT INTO `tb_student` VALUES ('4', '赵六', '1004', '女', '19');
INSERT INTO `tb_student` VALUES ('5', '李七', '1005', '男', '20');

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `sex` char(2) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', '张三丰', '男', '80');
INSERT INTO `tb_user` VALUES ('2', 'zhangsan', 'm', '18');
INSERT INTO `tb_user` VALUES ('3', 'zhangsan', 'm', '18');
INSERT INTO `tb_user` VALUES ('4', 'lisi', 'f', '20');
INSERT INTO `tb_user` VALUES ('5', 'liyu', 'f', '20');
INSERT INTO `tb_user` VALUES ('6', 'wangxiaoer', 'f', '20');
INSERT INTO `tb_user` VALUES ('7', 'wangxiaowu', 'f', '20');
INSERT INTO `tb_user` VALUES ('8', 'wangxiaoqi', 'm', '20');
INSERT INTO `tb_user` VALUES ('9', 'admin', '男', '26');
INSERT INTO `tb_user` VALUES ('10', 'admin', '男', '26');
INSERT INTO `tb_user` VALUES ('11', 'admin123', '男', '30');
INSERT INTO `tb_user` VALUES ('12', 'admin123', '男', '30');
INSERT INTO `tb_user` VALUES ('14', '张三', '男', '24');
INSERT INTO `tb_user` VALUES ('15', 'admin124', '女', '20');
INSERT INTO `tb_user` VALUES ('16', 'adminyy', '男', '26');
INSERT INTO `tb_user` VALUES ('17', 'adminyy', '男', '26');
INSERT INTO `tb_user` VALUES ('18', 'adminyy', '男', '26');
INSERT INTO `tb_user` VALUES ('19', 'adminyy', '男', '26');
INSERT INTO `tb_user` VALUES ('20', 'adminyy', '男', '26');
INSERT INTO `tb_user` VALUES ('21', 'adminyy', '男', '26');
INSERT INTO `tb_user` VALUES ('22', 'admin', '男', '26');
INSERT INTO `tb_user` VALUES ('23', 'admin', '男', '26');
INSERT INTO `tb_user` VALUES ('24', 'adminyy', '男', '26');
INSERT INTO `tb_user` VALUES ('25', 'adminyy', '男', '26');
INSERT INTO `tb_user` VALUES ('26', 'adminyy', '男', '26');
INSERT INTO `tb_user` VALUES ('27', 'adminyy', '男', '26');
INSERT INTO `tb_user` VALUES ('28', 'zhangsanfeng', '男', '90');
INSERT INTO `tb_user` VALUES ('29', 'adminyy', '男', '26');
INSERT INTO `tb_user` VALUES ('31', 'wangxiaoer', '男', '20');
INSERT INTO `tb_user` VALUES ('32', 'wangxiaowu', '男', '25');
INSERT INTO `tb_user` VALUES ('34', 'wangxiaoqi', '男', '35');

-- ----------------------------
-- Table structure for t_clazz
-- ----------------------------
DROP TABLE IF EXISTS `t_clazz`;
CREATE TABLE `t_clazz` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) DEFAULT NULL,
  `cname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_clazz
-- ----------------------------
INSERT INTO `t_clazz` VALUES ('1', '10086', '中国移动特招班');

-- ----------------------------
-- Table structure for t_customer
-- ----------------------------
DROP TABLE IF EXISTS `t_customer`;
CREATE TABLE `t_customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `jobs` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_customer
-- ----------------------------
INSERT INTO `t_customer` VALUES ('1', 'zhangsanfeng', 'teacher', '13088090678');

-- ----------------------------
-- Table structure for t_student
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student` (
  `sid` int(11) NOT NULL,
  `sname` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `clazz_id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`sid`),
  KEY `t_student_ibfk_1` (`clazz_id`),
  CONSTRAINT `t_student_ibfk_1` FOREIGN KEY (`clazz_id`) REFERENCES `t_clazz` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_student
-- ----------------------------
INSERT INTO `t_student` VALUES ('1', '张三', '男', '18', '1');
INSERT INTO `t_student` VALUES ('2', '李四', '男', '19', '1');
INSERT INTO `t_student` VALUES ('3', '王五', '男', '19', '1');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'sa', '123');
INSERT INTO `t_user` VALUES ('2', 'ssa', '1234');
INSERT INTO `t_user` VALUES ('3', 'zhangsan', '123');
INSERT INTO `t_user` VALUES ('4', 'ccit', '123');
INSERT INTO `t_user` VALUES ('5', 'admin', '123');
INSERT INTO `t_user` VALUES ('6', 'wangxiaoer', '123');
INSERT INTO `t_user` VALUES ('7', 'wangyun', '123');
INSERT INTO `t_user` VALUES ('8', 'wangxiaowu', '123');
INSERT INTO `t_user` VALUES ('9', 'wangan', '123');
INSERT INTO `t_user` VALUES ('10', 'wangdong', '123');

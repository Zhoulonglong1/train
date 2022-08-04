/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50558
Source Host           : localhost:3306
Source Database       : test_train

Target Server Type    : MYSQL
Target Server Version : 50558
File Encoding         : 65001

Date: 2022-08-04 22:35:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for order_list
-- ----------------------------
DROP TABLE IF EXISTS `order_list`;
CREATE TABLE `order_list` (
  `order_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '订单编号',
  `user_phone_number` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '用户电话号码',
  `passenger_phone_number` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '乘客手机号',
  `passenger_id_number` varchar(20) NOT NULL COMMENT '乘客身份证号',
  `t_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '车次',
  `start_station_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '出发站名',
  `end_station_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '结束站名',
  `carriage_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '车厢号',
  `seat_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '座位编号',
  `order_money` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '订单钱',
  `order_create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '订单创建时间',
  `order_status` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '订单状态',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_list
-- ----------------------------
INSERT INTO `order_list` VALUES ('3', '15044236840', '1', '1', 'K100', '1111', '1111', '1', 'A1', '', '2022-08-04 21:53:25', '0');

-- ----------------------------
-- Table structure for passenger
-- ----------------------------
DROP TABLE IF EXISTS `passenger`;
CREATE TABLE `passenger` (
  `u_phone` varchar(255) NOT NULL,
  `passenger_phone_number` varchar(20) NOT NULL,
  `passenger_real_name` varchar(20) NOT NULL,
  `passenger_id_number` varchar(20) NOT NULL,
  `passenger_type` varchar(20) NOT NULL,
  `passenger_address` varchar(20) NOT NULL,
  PRIMARY KEY (`passenger_phone_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of passenger
-- ----------------------------
INSERT INTO `passenger` VALUES ('15044236840', '1', '1', '1', '1', '1');
INSERT INTO `passenger` VALUES ('15044236840', '15044236840', '周天龙', '220222222233336666', '成人', '北京');
INSERT INTO `passenger` VALUES ('15044236840', '66666', '66666', '66666', '66666', '666666');

-- ----------------------------
-- Table structure for schedule_of_train
-- ----------------------------
DROP TABLE IF EXISTS `schedule_of_train`;
CREATE TABLE `schedule_of_train` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `t_id` varchar(20) NOT NULL COMMENT '车次K100',
  `departure_station` varchar(20) DEFAULT NULL COMMENT '始发站',
  `end_station` varchar(20) DEFAULT NULL COMMENT '终点站',
  `from_station` varchar(20) DEFAULT NULL COMMENT '出发站',
  `to_station` varchar(20) DEFAULT NULL COMMENT '到达站',
  `departure_time` varchar(20) DEFAULT NULL COMMENT '出发时间',
  `arrival_time` varchar(20) DEFAULT NULL COMMENT '到达时间',
  `use_time` varchar(20) DEFAULT NULL COMMENT '历时',
  `soft_bed` varchar(20) DEFAULT NULL COMMENT '软卧',
  `hard_bed` varchar(20) DEFAULT NULL COMMENT '硬卧',
  `first_class_seat` varchar(20) DEFAULT NULL COMMENT '一等座',
  `second_class_seat` varchar(20) DEFAULT NULL COMMENT '二等座',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of schedule_of_train
-- ----------------------------
INSERT INTO `schedule_of_train` VALUES ('1', 'Z100', '吉林', '北京', '吉林', '海宁', '6:00', '6:30', '00：30', '200', '150', '100', '50');
INSERT INTO `schedule_of_train` VALUES ('2', 'W100', '长春', '北京', '长春', '嘉兴', '7:00', '8:00', '01:00', '100', '80', '50', '20');

-- ----------------------------
-- Table structure for seat
-- ----------------------------
DROP TABLE IF EXISTS `seat`;
CREATE TABLE `seat` (
  `t_id` varchar(20) NOT NULL COMMENT '车次，如K200',
  `carriage_no` varchar(20) NOT NULL COMMENT '车厢号：1-8',
  `seat_type` varchar(20) NOT NULL COMMENT '座位类型',
  `seat_count` int(20) NOT NULL COMMENT '座位数量'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of seat
-- ----------------------------
INSERT INTO `seat` VALUES ('K100', '2', '软卧', '10');
INSERT INTO `seat` VALUES ('K100', '3', '硬卧', '20');
INSERT INTO `seat` VALUES ('K100', '4', '硬卧', '20');
INSERT INTO `seat` VALUES ('K100', '5', '一等座', '10');
INSERT INTO `seat` VALUES ('K100', '6', '一等座', '10');
INSERT INTO `seat` VALUES ('K100', '7', '二等座', '20');
INSERT INTO `seat` VALUES ('K100', '8', '二等座', '20');
INSERT INTO `seat` VALUES ('K100', '1', '软卧', '10');
INSERT INTO `seat` VALUES ('Z100', '1', '软卧', '10');
INSERT INTO `seat` VALUES ('Z100', '2', '软卧', '10');
INSERT INTO `seat` VALUES ('Z100', '3', '硬卧', '20');
INSERT INTO `seat` VALUES ('Z100', '4', '硬卧', '20');
INSERT INTO `seat` VALUES ('Z100', '5', '一等座', '10');
INSERT INTO `seat` VALUES ('Z100', '6', '一等座', '10');
INSERT INTO `seat` VALUES ('Z100', '7', '二等座', '20');
INSERT INTO `seat` VALUES ('Z100', '8', '二等座', '20');
INSERT INTO `seat` VALUES ('W100', '1', '软卧', '10');
INSERT INTO `seat` VALUES ('W100', '2', '软卧', '10');
INSERT INTO `seat` VALUES ('W100', '3', '硬卧', '20');
INSERT INTO `seat` VALUES ('W100', '4', '硬卧', '20');
INSERT INTO `seat` VALUES ('W100', '5', '一等座', '10');
INSERT INTO `seat` VALUES ('W100', '6', '一等座', '10');
INSERT INTO `seat` VALUES ('W100', '7', '二等座', '20');
INSERT INTO `seat` VALUES ('W100', '8', '二等座', '20');

-- ----------------------------
-- Table structure for train_info
-- ----------------------------
DROP TABLE IF EXISTS `train_info`;
CREATE TABLE `train_info` (
  `t_id` varchar(10) NOT NULL COMMENT '车次（Z100）',
  `t_type` varchar(10) NOT NULL COMMENT '车的类型',
  `t_start_station` varchar(20) NOT NULL COMMENT '始发站',
  `t_end_station` varchar(20) NOT NULL COMMENT '终点站',
  `t_starttime` varchar(20) NOT NULL COMMENT '始发时间',
  `t_endtime` varchar(20) NOT NULL COMMENT '到达时间',
  `t_arrival_time` varchar(20) NOT NULL COMMENT '到达日期',
  PRIMARY KEY (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of train_info
-- ----------------------------
INSERT INTO `train_info` VALUES ('D100', '动车', '无锡', '常州', '13:40', '6:50', '次日到达');
INSERT INTO `train_info` VALUES ('D200', '动车', '苏州', '南京', '6:30', '12:40', '当日到达');
INSERT INTO `train_info` VALUES ('K100', '快速', '上海', '昆山', '9:00', '12:20', '当日到达');
INSERT INTO `train_info` VALUES ('K200', '快速', '大连', '北京', '8:00', '20:00', '当日到达');
INSERT INTO `train_info` VALUES ('K300', '快速', '杭州', '海宁', '6:00', '9:00', '次日到达');
INSERT INTO `train_info` VALUES ('Z100', '直特', '吉林', '北京', '6:00', '18:00', '当日到达');

-- ----------------------------
-- Table structure for train_parking
-- ----------------------------
DROP TABLE IF EXISTS `train_parking`;
CREATE TABLE `train_parking` (
  `t_id` varchar(20) NOT NULL,
  `arrive_day_type` varchar(20) NOT NULL,
  `arrive_time` varchar(20) NOT NULL,
  `start_time` varchar(20) NOT NULL,
  `running_time` varchar(20) NOT NULL,
  `station_no` varchar(20) NOT NULL,
  `station_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of train_parking
-- ----------------------------
INSERT INTO `train_parking` VALUES ('Z100', '当日到达', '6:00', '6:00', '00:30', '01', '吉林');
INSERT INTO `train_parking` VALUES ('Z100', '当日到达', '6:30', '6:32', '00:30', '02', '海宁');
INSERT INTO `train_parking` VALUES ('Z100', '当日到达', '7:02', '7:07', '00:30', '03', '嘉兴');
INSERT INTO `train_parking` VALUES ('Z100', '当日到达', '7:37', '7:40', '04:20', '04', '昆山');
INSERT INTO `train_parking` VALUES ('Z100', '当日到达', '12:00', '15:00', '01:00', '05', '苏州');
INSERT INTO `train_parking` VALUES ('Z100', '当日到达', '16:00', '17:00', '01:00', '06', '公主岭');
INSERT INTO `train_parking` VALUES ('Z100', '当日到达', '18:00', '---', '---', '07', '北京');
INSERT INTO `train_parking` VALUES ('W100', '当日到达', '8:00', '8:02', '00:58', '02', '嘉兴');
INSERT INTO `train_parking` VALUES ('W100', '当日到达', '7:00', '7:00', '01:00', '01', '长春');
INSERT INTO `train_parking` VALUES ('W100', '当日到达', '9:00', '9:02', '00:58', '03', '大连');
INSERT INTO `train_parking` VALUES ('W100', '当日到达', '10:00', '10:02', '00:58', '04', '深圳');
INSERT INTO `train_parking` VALUES ('W100', '当日到达', '19:00', '---', '---', '05', '北京');

-- ----------------------------
-- Table structure for train_parking_station
-- ----------------------------
DROP TABLE IF EXISTS `train_parking_station`;
CREATE TABLE `train_parking_station` (
  `t_id` varchar(20) NOT NULL,
  `sname1` varchar(10) DEFAULT NULL,
  `stime1` varchar(20) DEFAULT NULL,
  `sname2` varchar(10) DEFAULT NULL,
  `stime2` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of train_parking_station
-- ----------------------------
INSERT INTO `train_parking_station` VALUES ('Z100', '吉林', '6:00', '海宁', '6:00');
INSERT INTO `train_parking_station` VALUES ('Z100', '海宁', '6:30', '嘉兴', '6:32');
INSERT INTO `train_parking_station` VALUES ('Z100', '嘉兴', '7:02', '昆山', '7:07');
INSERT INTO `train_parking_station` VALUES ('Z100', '昆山', '7:37', '苏州', '7:40');
INSERT INTO `train_parking_station` VALUES ('Z100', '苏州', '12:00', '公主岭', '12:02');
INSERT INTO `train_parking_station` VALUES ('Z100', '公主岭', '16:00', '北京', '17:00');
INSERT INTO `train_parking_station` VALUES ('Z100', '北京', '18:00', '', '');
INSERT INTO `train_parking_station` VALUES ('K100', '上海', '9:00', '公主岭', '9:20');
INSERT INTO `train_parking_station` VALUES ('K100', '公主岭', '10:50', '辽宁', '11:00');
INSERT INTO `train_parking_station` VALUES ('K100', '辽宁', '11:30', '昆山', '11:40');
INSERT INTO `train_parking_station` VALUES ('K100', '昆山', '12:20', null, null);

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `user_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `u_name` varchar(255) NOT NULL COMMENT '用户名',
  `u_password` varchar(255) NOT NULL COMMENT '用户密码',
  `u_type` int(11) DEFAULT '0' COMMENT '用户类型 0是用户，1是管理员',
  `u_phone` varchar(255) NOT NULL COMMENT '用户电话',
  `u_email` varchar(255) DEFAULT '' COMMENT '用户邮箱',
  `u_realname` varchar(255) DEFAULT NULL COMMENT '用户真实姓名',
  `u_gender` int(11) DEFAULT '1' COMMENT '用户性别（1：男   0：女）',
  `u_adress` varchar(255) DEFAULT NULL COMMENT '用户地址',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', 'zhou', '123', '0', '15044236840', '152@163.com', '周天龙', '1', '吉林省吉林市');
INSERT INTO `user_info` VALUES ('18', 'tian', '123', '0', '', '', '', null, '');
INSERT INTO `user_info` VALUES ('19', 'long', '123', '0', '', '', '', null, '');

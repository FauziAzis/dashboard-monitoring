/*
Navicat MySQL Data Transfer

Source Server         : dashboard-db
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : dashboard

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2021-05-03 14:44:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for job_det_t
-- ----------------------------
DROP TABLE IF EXISTS `job_det_t`;
CREATE TABLE `job_det_t` (
  `job_det_id` varchar(255) NOT NULL,
  `job_det_response` varchar(255) DEFAULT NULL,
  `job_det_status` int(11) DEFAULT NULL,
  `job_det_time` datetime DEFAULT NULL,
  `job_head_id` varchar(255) DEFAULT NULL,
  `service_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`job_det_id`),
  KEY `FKnb3wd7a1e6pjj0k2at866kokh` (`job_head_id`),
  KEY `FKnpdxsdcp2ra2sxfo1djlh4boq` (`service_id`),
  CONSTRAINT `FKnb3wd7a1e6pjj0k2at866kokh` FOREIGN KEY (`job_head_id`) REFERENCES `job_head_t` (`job_head_id`),
  CONSTRAINT `FKnpdxsdcp2ra2sxfo1djlh4boq` FOREIGN KEY (`service_id`) REFERENCES `service_t` (`service_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of job_det_t
-- ----------------------------
INSERT INTO `job_det_t` VALUES ('0f49f9cc-5b6b-41c4-b01b-52c5ac8eda56', 'RESPONSE 200:OK', '1', '2021-05-03 04:19:05', '943bb702-473e-4692-a0c2-ff9537626168', 'e413175d-e973-488d-90a0-8235304a7fa5');
INSERT INTO `job_det_t` VALUES ('2f7588ab-5f53-4669-9036-67a9c8b091c4', 'RESPONSE 200:OK', '1', '2021-05-03 04:19:05', '943bb702-473e-4692-a0c2-ff9537626168', '13752576-bbf0-4046-bfcf-6fab5a9c99db');
INSERT INTO `job_det_t` VALUES ('f7ce8628-27cb-4eb5-8a2d-287e6cfd67b3', 'RESPONSE 200:OK', '1', '2021-05-03 04:19:05', '943bb702-473e-4692-a0c2-ff9537626168', 'c2fb13d2-e534-48b6-ba34-8f4568d82053');

-- ----------------------------
-- Table structure for job_head_t
-- ----------------------------
DROP TABLE IF EXISTS `job_head_t`;
CREATE TABLE `job_head_t` (
  `job_head_id` varchar(255) NOT NULL,
  `job_head_finish` datetime NOT NULL,
  `job_head_name` varchar(255) NOT NULL,
  `job_head_start` datetime NOT NULL,
  `job_head_status` int(11) NOT NULL,
  PRIMARY KEY (`job_head_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of job_head_t
-- ----------------------------
INSERT INTO `job_head_t` VALUES ('86b9c2f2-6c3c-400d-bbac-748d34b2f5eb', '2021-05-03 04:19:05', 'JOB JAM 10', '2021-05-03 04:19:05', '100');
INSERT INTO `job_head_t` VALUES ('943bb702-473e-4692-a0c2-ff9537626168', '2021-05-03 04:19:05', 'JOB JAM 10', '2021-05-03 04:19:05', '100');

-- ----------------------------
-- Table structure for service_group_t
-- ----------------------------
DROP TABLE IF EXISTS `service_group_t`;
CREATE TABLE `service_group_t` (
  `service_group_id` varchar(255) NOT NULL,
  `service_group_category` varchar(255) NOT NULL,
  `service_group_name` varchar(255) NOT NULL,
  PRIMARY KEY (`service_group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of service_group_t
-- ----------------------------
INSERT INTO `service_group_t` VALUES ('2b520ca9-cbde-44c9-b8e9-0e611b6a2299', 'SISTEM PEMBAYARAN', 'BI-RTGS');

-- ----------------------------
-- Table structure for service_t
-- ----------------------------
DROP TABLE IF EXISTS `service_t`;
CREATE TABLE `service_t` (
  `service_id` varchar(255) NOT NULL,
  `service_endpoint` varchar(255) NOT NULL,
  `service_name` varchar(255) NOT NULL,
  `service_type` varchar(255) NOT NULL,
  `service_group_id` varchar(255) NOT NULL,
  PRIMARY KEY (`service_id`),
  KEY `FKak7b33fvcs6avtee9bs11mo6u` (`service_group_id`),
  CONSTRAINT `FKak7b33fvcs6avtee9bs11mo6u` FOREIGN KEY (`service_group_id`) REFERENCES `service_group_t` (`service_group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of service_t
-- ----------------------------
INSERT INTO `service_t` VALUES ('13752576-bbf0-4046-bfcf-6fab5a9c99db', 'hhtp', 'BI-SSSS Gateway', 'Web Service', '2b520ca9-cbde-44c9-b8e9-0e611b6a2299');
INSERT INTO `service_t` VALUES ('c2fb13d2-e534-48b6-ba34-8f4568d82053', 'http://*/', 'BI-RTGS Gateway 1', 'Web Service', '2b520ca9-cbde-44c9-b8e9-0e611b6a2299');
INSERT INTO `service_t` VALUES ('e413175d-e973-488d-90a0-8235304a7fa5', 'hhtp', 'BI-SSSS Core', 'Web Service', '2b520ca9-cbde-44c9-b8e9-0e611b6a2299');

-- ----------------------------
-- View structure for job_det_v
-- ----------------------------
DROP VIEW IF EXISTS `job_det_v`;
CREATE ALGORITHM=UNDEFINED DEFINER=`springuser`@`%` SQL SECURITY DEFINER VIEW `job_det_v` AS select `job_det_t`.`job_det_id` AS `job_det_id`,`job_det_t`.`job_head_id` AS `job_head_id`,`job_det_t`.`service_id` AS `service_id`,`job_det_t`.`job_det_status` AS `job_det_status`,`job_det_t`.`job_det_response` AS `job_det_response`,`job_det_t`.`job_det_time` AS `job_det_time`,`job_head_t`.`job_head_name` AS `job_head_name`,`service_v`.`service_name` AS `service_name`,`service_v`.`service_type` AS `service_type`,`service_v`.`service_endpoint` AS `service_endpoint`,`service_v`.`service_group_category` AS `service_group_category`,`service_v`.`service_group_name` AS `service_group_name` from ((`job_det_t` join `job_head_t` on(`job_det_t`.`job_head_id` = `job_head_t`.`job_head_id`)) join `service_v` on(`job_det_t`.`service_id` = `job_det_t`.`service_id`)) ;

-- ----------------------------
-- View structure for service_v
-- ----------------------------
DROP VIEW IF EXISTS `service_v`;
CREATE ALGORITHM=UNDEFINED DEFINER=`springuser`@`%` SQL SECURITY DEFINER VIEW `service_v` AS select `service_t`.`service_id` AS `service_id`,`service_t`.`service_name` AS `service_name`,`service_t`.`service_type` AS `service_type`,`service_t`.`service_endpoint` AS `service_endpoint`,`service_group_t`.`service_group_id` AS `service_group_id`,`service_group_t`.`service_group_category` AS `service_group_category`,`service_group_t`.`service_group_name` AS `service_group_name` from (`service_t` join `service_group_t` on(`service_t`.`service_group_id` = `service_group_t`.`service_group_id`)) ;

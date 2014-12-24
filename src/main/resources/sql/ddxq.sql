/*
 Navicat MySQL Data Transfer

 Source Server         : 本地
 Source Server Version : 50614
 Source Host           : localhost
 Source Database       : ddxq

 Target Server Version : 50614
 File Encoding         : utf-8

 Date: 12/24/2014 22:41:42 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `ddxq_banner`
-- ----------------------------
DROP TABLE IF EXISTS `ddxq_banner`;
CREATE TABLE `ddxq_banner` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `title` varchar(100) DEFAULT NULL COMMENT '标题',
  `imageUrl` varchar(100) DEFAULT NULL COMMENT '图片地址',
  `createTime` timestamp NULL DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='banner|banner信息维护|基础管理|BaseDomain\nbanner信息';

-- ----------------------------
--  Table structure for `ddxq_comment`
-- ----------------------------
DROP TABLE IF EXISTS `ddxq_comment`;
CREATE TABLE `ddxq_comment` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `content` varchar(100) NOT NULL COMMENT '评论内容',
  `shareId` bigint(10) NOT NULL COMMENT '分享id',
  `userId` bigint(10) NOT NULL COMMENT '评论人id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ddxq_community`
-- ----------------------------
DROP TABLE IF EXISTS `ddxq_community`;
CREATE TABLE `ddxq_community` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(20) DEFAULT NULL COMMENT '名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='小区|小区信息维护|基础管理|BaseDomain\n小区信息';

-- ----------------------------
--  Table structure for `ddxq_nickname`
-- ----------------------------
DROP TABLE IF EXISTS `ddxq_nickname`;
CREATE TABLE `ddxq_nickname` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(10) DEFAULT NULL COMMENT '名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='昵称|昵称信息维护|基础管理|BaseDomain\n昵称信息';

-- ----------------------------
--  Table structure for `ddxq_share`
-- ----------------------------
DROP TABLE IF EXISTS `ddxq_share`;
CREATE TABLE `ddxq_share` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `userId` bigint(10) NOT NULL COMMENT '发布者id',
  `content` varchar(500) DEFAULT NULL COMMENT '发布内容',
  `comment` int(10) DEFAULT '0' COMMENT '评论数',
  `zan` int(100) DEFAULT '0' COMMENT '赞数',
  `createTime` timestamp NULL DEFAULT NULL COMMENT '发布时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='圈子|圈子信息维护|基础管理|BaseDomain\n圈子信息';

-- ----------------------------
--  Table structure for `ddxq_user`
-- ----------------------------
DROP TABLE IF EXISTS `ddxq_user`;
CREATE TABLE `ddxq_user` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `comunityId` bigint(10) DEFAULT NULL COMMENT '小区id',
  `nickName` varchar(20) DEFAULT NULL COMMENT '昵称',
  `headUrl` varchar(100) DEFAULT NULL COMMENT '头像',
  `userType` varchar(10) DEFAULT NULL COMMENT '身份 业务，物业',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户|用户信息维护|基础管理|BaseDomain\n用户信息';

-- ----------------------------
--  Table structure for `ddxq_user_head`
-- ----------------------------
DROP TABLE IF EXISTS `ddxq_user_head`;
CREATE TABLE `ddxq_user_head` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `url` varchar(100) DEFAULT NULL COMMENT '头像地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户头像|用户头像信息维护|基础管理|BaseDomain\n用户头像信息';

SET FOREIGN_KEY_CHECKS = 1;

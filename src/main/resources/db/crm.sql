-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.17 - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 导出 crm 的数据库结构
CREATE DATABASE IF NOT EXISTS `crm` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `crm`;

-- 导出  表 crm.authority 结构
CREATE TABLE IF NOT EXISTS `authority` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `authority` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 数据导出被取消选择。
-- 导出  表 crm.customer_info 结构
CREATE TABLE IF NOT EXISTS `customer_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `info_template_id` int(11) NOT NULL,
  `extend` text NOT NULL,
  PRIMARY KEY (`name`),
  KEY `id` (`id`),
  KEY `FK_customer_info_info_template` (`info_template_id`),
  CONSTRAINT `FK_customer_info_info_template` FOREIGN KEY (`info_template_id`) REFERENCES `info_template` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 数据导出被取消选择。
-- 导出  表 crm.info_template 结构
CREATE TABLE IF NOT EXISTS `info_template` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `template` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 数据导出被取消选择。
-- 导出  表 crm.tag 结构
CREATE TABLE IF NOT EXISTS `tag` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value` text NOT NULL,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`name`),
  KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 数据导出被取消选择。
-- 导出  表 crm.tag_kind 结构
CREATE TABLE IF NOT EXISTS `tag_kind` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kind` varchar(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`kind`),
  KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 数据导出被取消选择。
-- 导出  表 crm.user 结构
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`username`),
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- 数据导出被取消选择。
-- 导出  表 crm.user_authority 结构
CREATE TABLE IF NOT EXISTS `user_authority` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `authority_id` int(11) NOT NULL,
  PRIMARY KEY (`username`),
  KEY `id` (`id`),
  KEY `FK_user_authority_authority` (`authority_id`),
  CONSTRAINT `FK__user_authority` FOREIGN KEY (`username`) REFERENCES `user` (`username`),
  CONSTRAINT `FK_user_authority_authority` FOREIGN KEY (`authority_id`) REFERENCES `authority` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 数据导出被取消选择。
-- 导出  表 crm.user_info 结构
CREATE TABLE IF NOT EXISTS `user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `info__template_id` int(11) NOT NULL,
  `extend` text NOT NULL,
  PRIMARY KEY (`username`),
  KEY `id` (`id`),
  KEY `FK_user_info_info_template` (`info__template_id`),
  CONSTRAINT `FK__user_info` FOREIGN KEY (`username`) REFERENCES `user` (`username`),
  CONSTRAINT `FK_user_info_info_template` FOREIGN KEY (`info__template_id`) REFERENCES `info_template` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 数据导出被取消选择。
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

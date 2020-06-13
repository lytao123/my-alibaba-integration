/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.136.136
 Source Server Type    : MySQL
 Source Server Version : 80020
 Source Host           : 192.168.136.136:3306
 Source Schema         : alibaba_storage

 Target Server Type    : MySQL
 Target Server Version : 80020
 File Encoding         : 65001

 Date: 13/06/2020 19:09:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for u_goods
-- ----------------------------
DROP TABLE IF EXISTS `u_goods`;
CREATE TABLE `u_goods`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `goods_count` int(0) NULL DEFAULT NULL,
  `use_count` int(0) NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `price` decimal(10, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of u_goods
-- ----------------------------
INSERT INTO `u_goods` VALUES (1, 100, 2, '2020-06-13 11:03:16', 1.00);

-- ----------------------------
-- Table structure for undo_log
-- ----------------------------
DROP TABLE IF EXISTS `undo_log`;
CREATE TABLE `undo_log`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `branch_id` bigint(0) NOT NULL,
  `xid` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `context` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `rollback_info` longblob NOT NULL,
  `log_status` int(0) NOT NULL,
  `log_created` datetime(0) NOT NULL,
  `log_modified` datetime(0) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `ux_undo_log`(`xid`, `branch_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of undo_log
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;

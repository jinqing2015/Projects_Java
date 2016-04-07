/*
Navicat MySQL Data Transfer

Source Server         : Test
Source Server Version : 50022
Source Host           : localhost:3306
Source Database       : onlineshopping

Target Server Type    : MYSQL
Target Server Version : 50022
File Encoding         : 65001

Date: 2013-07-18 12:33:57
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `category`
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `category_id` int(11) NOT NULL auto_increment,
  `name` varchar(64) default NULL,
  `descriptions` varchar(256) default NULL,
  PRIMARY KEY  (`category_id`)
) ENGINE=MyISAM DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('1', '豪华别墅', '豪华');
INSERT INTO `category` VALUES ('2', '休闲别墅', '休闲');
INSERT INTO `category` VALUES ('3', '普通别墅', '普通');

-- ----------------------------
-- Table structure for `comment`
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `productId` int(11) default NULL,
  `userName` varchar(20) NOT NULL,
  `comment` varchar(100) NOT NULL,
  `commentId` int(11) NOT NULL auto_increment,
  PRIMARY KEY  (`commentId`)
) ENGINE=MyISAM DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES ('34', 'qq', 'hahah', '1');
INSERT INTO `comment` VALUES ('33', 'qq', 'sa', '2');
INSERT INTO `comment` VALUES ('12', 'qq', 'sa', '3');
INSERT INTO `comment` VALUES ('34', 'qq', 'as', '4');
INSERT INTO `comment` VALUES ('36', 'qq', 'as', '5');
INSERT INTO `comment` VALUES ('34', 'qq', 'aaa我是', '6');
INSERT INTO `comment` VALUES ('34', '张晋卿', '物流很好，东西不错', '7');
INSERT INTO `comment` VALUES ('4', '张晋卿', '123', '8');
INSERT INTO `comment` VALUES ('4', 'qq', 'haha', '9');
INSERT INTO `comment` VALUES ('33', 'qq', '张', '10');
INSERT INTO `comment` VALUES ('33', 'qq', '是大法官', '11');
INSERT INTO `comment` VALUES ('34', 'qq', 'haha\r\n', '12');
INSERT INTO `comment` VALUES ('34', '张晋卿', '好好', '13');
INSERT INTO `comment` VALUES ('34', '张晋卿', '好', '14');
INSERT INTO `comment` VALUES ('34', 'qq', '色差太大', '15');
INSERT INTO `comment` VALUES ('36', 'qq', '房子太旧 两天以后就倒了', '16');
INSERT INTO `comment` VALUES ('7', 'qq', '丑 漏雨 昨天半夜漏了我老婆一脸', '17');
INSERT INTO `comment` VALUES ('3', 'qq', '没有游泳池 不开心 后院挖出一具尸体来 不知道是哪年的', '18');

-- ----------------------------
-- Table structure for `contcatinfo`
-- ----------------------------
DROP TABLE IF EXISTS `contcatinfo`;
CREATE TABLE `contcatinfo` (
  `contcatinfo_id` int(11) NOT NULL default '0',
  `street1` varchar(128) default NULL,
  `street2` varchar(128) default NULL,
  `city` varchar(128) default NULL,
  `zip` varchar(12) default NULL,
  `email` varchar(128) default NULL,
  `homePhone` varchar(32) default NULL,
  `cellPhone` varchar(32) default NULL,
  `officePhone` varchar(32) default NULL,
  `country_id` int(11) default NULL,
  `province_id` int(11) default NULL,
  PRIMARY KEY  (`contcatinfo_id`)
) ENGINE=MyISAM DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of contcatinfo
-- ----------------------------
INSERT INTO `contcatinfo` VALUES ('16', null, null, 'qingdao3', null, null, null, 'test3', null, null, null);
INSERT INTO `contcatinfo` VALUES ('10', 'ten', 'ten', 'qingdao', 'ten', 'ren', 'ten', 'test_ten', 'ten', '1', '25');
INSERT INTO `contcatinfo` VALUES ('15', null, null, 'qingdao', null, null, null, 'test', null, null, null);
INSERT INTO `contcatinfo` VALUES ('17', null, null, 'qingdao', null, null, null, 'test_ten', null, '1', '25');
INSERT INTO `contcatinfo` VALUES ('18', null, null, 'qingdao5', null, null, null, 'test5', null, '1', '25');
INSERT INTO `contcatinfo` VALUES ('19', null, null, 'qingdao6', null, null, null, 'test6', null, '1', '25');
INSERT INTO `contcatinfo` VALUES ('20', null, null, 'qingdao7', null, null, null, 'test7', null, '1', '25');
INSERT INTO `contcatinfo` VALUES ('21', null, null, 'qingdao7', null, null, null, 'test7', null, '1', '25');
INSERT INTO `contcatinfo` VALUES ('22', null, null, 'qingdao7', null, null, null, 'test7', null, '1', '25');
INSERT INTO `contcatinfo` VALUES ('23', null, 'asdadsf', 'asd', 'sdfasdf', 'asdfasdf', 'asdfasdf', 'asdfasdf', 'asdfasdf', '1', '1');
INSERT INTO `contcatinfo` VALUES ('24', 'asdasd ', 'sadsadas', 'qingdao ', 'dsadasdas', '1234@qq.com', '1234', '1234', '1234', '1', '4');
INSERT INTO `contcatinfo` VALUES ('25', 'sdf', 'sdf', 'jdsj', 'sdf', 'sdf', 'sdf', 'sdf', '', '1', '1');
INSERT INTO `contcatinfo` VALUES ('26', '', '', '', '', '', '', '', '', '1', '35');
INSERT INTO `contcatinfo` VALUES ('27', null, '1234', '1234', '45534663d84f', '1234', '1234', '1234', '1234', '1', '2');
INSERT INTO `contcatinfo` VALUES ('32', '', '', '', '', '', '', '', '', '1', '35');
INSERT INTO `contcatinfo` VALUES ('30', 'o[k', 'oj[', 'ko[oj', '5654', '123213', '123123213', '123123213', '12321321', '1', '3');
INSERT INTO `contcatinfo` VALUES ('33', null, 'bbb', 'bbb', 'bbb', 'bbb', 'bbb', 'bbb', 'bbb', '1', '6');
INSERT INTO `contcatinfo` VALUES ('34', null, 'ccc', 'ccc', 'ccc', 'ccc', 'ccc', 'ccc', 'ccc', '1', '2');
INSERT INTO `contcatinfo` VALUES ('35', null, '明霞路', '日照', '276526', '10103969769', '123456', '18765917725', '123456', '1', '5');
INSERT INTO `contcatinfo` VALUES ('36', 'eee2', 'eee2', 'eee2', 'eee2', 'eee2', 'eee2', 'eee2', 'eee2', '1', '1');
INSERT INTO `contcatinfo` VALUES ('37', 'ff', 'f', 'ff', 'f', 'ff', 'fff', 'fff', 'fff', '1', '2');
INSERT INTO `contcatinfo` VALUES ('38', 'ggg', 'ggg', 'ggg', 'ggg', 'ggg', 'ggg', 'ggg', 'ggg', '1', '5');
INSERT INTO `contcatinfo` VALUES ('39', 'qwe', 'qwe', 'qwe', '1111', '12@143.com', '123', '3123', '123', '1', '35');
INSERT INTO `contcatinfo` VALUES ('41', 'w', 'w', 'w', 'w', 'w', 'www', 'wwwwwwwwwww', 'w', '1', '35');
INSERT INTO `contcatinfo` VALUES ('42', '地底', '天上', '山西', '123456', '12345678910', '12345678910', '12345678910', '12345678910', '1', '6');
INSERT INTO `contcatinfo` VALUES ('43', '123', '123', '123', '123', '12', '12', '12312312312', '12', '1', '35');
INSERT INTO `contcatinfo` VALUES ('44', '123', '123', '123', '123', '123', '123', '12312312312', '123', '1', '35');
INSERT INTO `contcatinfo` VALUES ('45', 'w', 'w', 'w', 'w', 'w', 'ww', 'wwwwwwwwwww', 'w', '1', '35');
INSERT INTO `contcatinfo` VALUES ('46', 'qwer', 'qwer', 'qwer', 'qwer', '123', 'rrrrr', '12312312312', '123', '1', '17');
INSERT INTO `contcatinfo` VALUES ('47', '123', '123', '123', '123', '123', '123', '12312312312', '123', '1', '35');
INSERT INTO `contcatinfo` VALUES ('48', '宁夏路308号', '青岛大学', '青岛', '266071', 'zjq@163.com', '18765999999', '18765999999', '18765999999', '1', '25');

-- ----------------------------
-- Table structure for `country`
-- ----------------------------
DROP TABLE IF EXISTS `country`;
CREATE TABLE `country` (
  `country_id` int(11) NOT NULL auto_increment,
  `name` varchar(64) default NULL,
  PRIMARY KEY  (`country_id`)
) ENGINE=MyISAM DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of country
-- ----------------------------
INSERT INTO `country` VALUES ('1', '中国');

-- ----------------------------
-- Table structure for `myorder`
-- ----------------------------
DROP TABLE IF EXISTS `myorder`;
CREATE TABLE `myorder` (
  `order_id` int(11) NOT NULL auto_increment,
  `name` varchar(32) default NULL,
  `cost` double default NULL,
  `user_id` int(11) default NULL,
  `payWay_id` int(11) default NULL,
  `orderStatus_id` int(11) default NULL,
  PRIMARY KEY  (`order_id`)
) ENGINE=MyISAM DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of myorder
-- ----------------------------
INSERT INTO `myorder` VALUES ('1', 'test', '2.5', '10', '1', '1');
INSERT INTO `myorder` VALUES ('2', 'aaaa', '0', null, null, null);
INSERT INTO `myorder` VALUES ('10', 'aaa', '0', '10', '1', '2');
INSERT INTO `myorder` VALUES ('11', null, '0', null, '1', '1');
INSERT INTO `myorder` VALUES ('12', null, '0', '10', '1', '1');
INSERT INTO `myorder` VALUES ('13', null, '0', '10', '1', '1');
INSERT INTO `myorder` VALUES ('14', 'eee', '122222', '36', '1', '2');
INSERT INTO `myorder` VALUES ('15', 'eee', '233333', '36', '1', '2');
INSERT INTO `myorder` VALUES ('16', 'eee', '122222', '36', '1', '2');
INSERT INTO `myorder` VALUES ('17', 'eee', '122222', '36', '1', '2');
INSERT INTO `myorder` VALUES ('18', 'eee', '122222', '36', '1', '2');
INSERT INTO `myorder` VALUES ('19', 'eee', '111111', '36', '1', '1');
INSERT INTO `myorder` VALUES ('20', 'eee', '122222', '36', '1', '1');
INSERT INTO `myorder` VALUES ('21', 'eee', '233333', '36', '1', '1');
INSERT INTO `myorder` VALUES ('22', 'eee', '122222', '36', '1', '2');
INSERT INTO `myorder` VALUES ('23', 'eee', '122222', '36', '1', '2');
INSERT INTO `myorder` VALUES ('24', 'eee', '122222', '36', '1', '2');
INSERT INTO `myorder` VALUES ('25', 'eee', '122222', '36', '1', '2');
INSERT INTO `myorder` VALUES ('26', 'eee', '122222', '36', '1', '2');
INSERT INTO `myorder` VALUES ('27', 'eee', '356456', '36', '1', '1');
INSERT INTO `myorder` VALUES ('28', 'eee', '122222', '36', '1', '1');
INSERT INTO `myorder` VALUES ('29', 'eee', '122222', '36', '1', '1');
INSERT INTO `myorder` VALUES ('30', 'eee', '272222', '36', '1', '1');
INSERT INTO `myorder` VALUES ('31', 'eee', '396912', '36', '2', '1');
INSERT INTO `myorder` VALUES ('32', 'eee', '616666', '36', '2', '2');
INSERT INTO `myorder` VALUES ('33', 'eee', '616666', '36', '2', '2');
INSERT INTO `myorder` VALUES ('34', 'eee', '356789', '36', '1', '1');
INSERT INTO `myorder` VALUES ('35', 'eee', '741356', '36', '1', '1');
INSERT INTO `myorder` VALUES ('36', 'eee', '0', '36', '1', '1');
INSERT INTO `myorder` VALUES ('37', 'eee', '150000', '36', '1', '1');
INSERT INTO `myorder` VALUES ('38', 'eee', '150000', '36', '3', '1');
INSERT INTO `myorder` VALUES ('39', 'eee', '150000', '36', '3', '2');
INSERT INTO `myorder` VALUES ('40', 'eee', '150000', '36', '3', '1');
INSERT INTO `myorder` VALUES ('41', 'eee', '150000', '36', '2', '1');
INSERT INTO `myorder` VALUES ('42', 'eee', '150000', '36', '1', '1');
INSERT INTO `myorder` VALUES ('43', 'eee', '150000', '36', '1', '1');
INSERT INTO `myorder` VALUES ('44', 'eee', '0', '36', '2', '1');
INSERT INTO `myorder` VALUES ('45', 'eee', '0', '36', '1', '1');
INSERT INTO `myorder` VALUES ('46', 'eee', '273123', '36', '1', '1');
INSERT INTO `myorder` VALUES ('47', 'eee', '273123', '36', '1', '2');
INSERT INTO `myorder` VALUES ('48', 'eee', '122222', '36', '1', '2');
INSERT INTO `myorder` VALUES ('49', 'eee', '122222', '36', '1', '1');
INSERT INTO `myorder` VALUES ('50', 'eee', '123456', '36', '1', '1');
INSERT INTO `myorder` VALUES ('51', null, '0', '10', '1', '1');
INSERT INTO `myorder` VALUES ('52', 'eee', '150000', '36', '1', '1');
INSERT INTO `myorder` VALUES ('53', 'eee', '122222', '36', '1', '2');
INSERT INTO `myorder` VALUES ('54', 'summer', '333333', '35', '2', '2');
INSERT INTO `myorder` VALUES ('55', 'eee', '669134', '36', '2', '2');
INSERT INTO `myorder` VALUES ('56', 'eee', '368801', '36', '2', '2');
INSERT INTO `myorder` VALUES ('57', 'eee', '111111', '36', '1', '2');
INSERT INTO `myorder` VALUES ('58', 'ggg', '877157', '38', '2', '2');
INSERT INTO `myorder` VALUES ('59', 'eee', '1345343', '36', '2', '2');
INSERT INTO `myorder` VALUES ('60', 'eee', '0', '36', '2', '1');
INSERT INTO `myorder` VALUES ('61', 'eee', '0', '36', '2', '2');
INSERT INTO `myorder` VALUES ('62', 'eee', '150000', '36', '1', '2');
INSERT INTO `myorder` VALUES ('63', 'eee', '0', '36', '1', '1');
INSERT INTO `myorder` VALUES ('64', 'eee', '0', '36', '1', '1');
INSERT INTO `myorder` VALUES ('65', 'eee', '0', '36', '1', '1');
INSERT INTO `myorder` VALUES ('66', 'eee', '150000', '36', '1', '1');
INSERT INTO `myorder` VALUES ('67', 'eee', '1222220', '36', '1', '1');
INSERT INTO `myorder` VALUES ('68', 'eee', '122222', '36', '1', '1');
INSERT INTO `myorder` VALUES ('69', 'eee', '366666', '36', '1', '1');
INSERT INTO `myorder` VALUES ('70', 'eee', '150000', '36', '1', '2');
INSERT INTO `myorder` VALUES ('71', 'qq', '111111', '39', '2', '2');
INSERT INTO `myorder` VALUES ('72', 'eee', '111111', '36', '2', '2');
INSERT INTO `myorder` VALUES ('73', 'qq', '1099998', '39', '1', '2');
INSERT INTO `myorder` VALUES ('74', 'qq', '600000', '39', '1', '2');
INSERT INTO `myorder` VALUES ('75', 'qq', '122222', '39', '1', '2');
INSERT INTO `myorder` VALUES ('76', 'eee', '123123', '36', '1', '1');
INSERT INTO `myorder` VALUES ('77', 'qq', '588888', '39', '1', '2');
INSERT INTO `myorder` VALUES ('78', 'qq', '150000', '39', '1', '2');
INSERT INTO `myorder` VALUES ('79', 'qq', '813813', '39', '1', '2');
INSERT INTO `myorder` VALUES ('80', 'qq', '244444', '39', '1', '2');
INSERT INTO `myorder` VALUES ('81', 'qq', '123123', '39', '1', '2');
INSERT INTO `myorder` VALUES ('82', 'qq', '150000', '39', '1', '2');
INSERT INTO `myorder` VALUES ('83', 'ww', '122222', '41', '1', '1');
INSERT INTO `myorder` VALUES ('84', 'qq', '986701', '39', '1', '2');
INSERT INTO `myorder` VALUES ('85', 'qq', '122222', '39', '1', '1');
INSERT INTO `myorder` VALUES ('86', 'hehe', '943456', '47', '1', '1');
INSERT INTO `myorder` VALUES ('87', 'hehe', '900000', '47', '1', '2');
INSERT INTO `myorder` VALUES ('88', 'hehe', '600000', '47', '1', '1');
INSERT INTO `myorder` VALUES ('89', 'hehe', '455555', '47', '1', '1');
INSERT INTO `myorder` VALUES ('90', 'qq', '300000', '39', '1', '1');
INSERT INTO `myorder` VALUES ('91', 'qq', '300000', '39', '1', '1');
INSERT INTO `myorder` VALUES ('92', 'qq', '300000', '39', '1', '1');
INSERT INTO `myorder` VALUES ('93', 'qq', '300000', '39', '1', '1');
INSERT INTO `myorder` VALUES ('94', 'qq', '123123', '39', '1', '1');
INSERT INTO `myorder` VALUES ('95', 'qq', '300000', '39', '1', '1');
INSERT INTO `myorder` VALUES ('96', 'qq', '300000', '39', '1', '1');
INSERT INTO `myorder` VALUES ('97', 'qq', '300000', '39', '1', '1');
INSERT INTO `myorder` VALUES ('98', '张晋卿', '300000', '48', '1', '2');
INSERT INTO `myorder` VALUES ('99', '张晋卿', '0', '48', '1', '1');
INSERT INTO `myorder` VALUES ('100', '张晋卿', '111111', '48', '1', '1');
INSERT INTO `myorder` VALUES ('101', 'qq', '1800000', '39', '2', '2');
INSERT INTO `myorder` VALUES ('102', 'qq', '245678', '39', '1', '2');

-- ----------------------------
-- Table structure for `orderline`
-- ----------------------------
DROP TABLE IF EXISTS `orderline`;
CREATE TABLE `orderline` (
  `orderLine_id` int(11) NOT NULL auto_increment,
  `amount` int(11) default NULL,
  `product_id` int(11) default NULL,
  `order_id` int(11) default NULL,
  PRIMARY KEY  (`orderLine_id`)
) ENGINE=MyISAM DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of orderline
-- ----------------------------
INSERT INTO `orderline` VALUES ('1', '20', '1', '1');
INSERT INTO `orderline` VALUES ('2', '10', '2', '1');
INSERT INTO `orderline` VALUES ('3', '40', '2', '11');
INSERT INTO `orderline` VALUES ('4', '30', '1', '11');
INSERT INTO `orderline` VALUES ('5', '40', '2', '12');
INSERT INTO `orderline` VALUES ('6', '30', '1', '12');
INSERT INTO `orderline` VALUES ('7', '30', '1', '13');
INSERT INTO `orderline` VALUES ('8', '40', '2', '13');
INSERT INTO `orderline` VALUES ('9', '1', '3', null);
INSERT INTO `orderline` VALUES ('10', '1', '4', null);
INSERT INTO `orderline` VALUES ('11', '1', '3', null);
INSERT INTO `orderline` VALUES ('12', '1', '3', null);
INSERT INTO `orderline` VALUES ('13', '1', '3', null);
INSERT INTO `orderline` VALUES ('14', '1', '3', null);
INSERT INTO `orderline` VALUES ('15', '1', '4', null);
INSERT INTO `orderline` VALUES ('16', '1', '3', null);
INSERT INTO `orderline` VALUES ('17', '1', '4', null);
INSERT INTO `orderline` VALUES ('18', '1', '3', null);
INSERT INTO `orderline` VALUES ('19', '1', '3', null);
INSERT INTO `orderline` VALUES ('20', '1', '3', null);
INSERT INTO `orderline` VALUES ('21', '1', '3', null);
INSERT INTO `orderline` VALUES ('22', '1', '3', null);
INSERT INTO `orderline` VALUES ('23', '1', '3', null);
INSERT INTO `orderline` VALUES ('24', '1', '3', null);
INSERT INTO `orderline` VALUES ('25', '1', '5', null);
INSERT INTO `orderline` VALUES ('26', '1', '4', null);
INSERT INTO `orderline` VALUES ('27', '1', '3', null);
INSERT INTO `orderline` VALUES ('28', '1', '3', null);
INSERT INTO `orderline` VALUES ('29', '1', '1', null);
INSERT INTO `orderline` VALUES ('30', '2', '7', null);
INSERT INTO `orderline` VALUES ('31', '2', '4', null);
INSERT INTO `orderline` VALUES ('32', '2', '3', null);
INSERT INTO `orderline` VALUES ('33', '1', '1', null);
INSERT INTO `orderline` VALUES ('34', '1', '6', null);
INSERT INTO `orderline` VALUES ('35', '1', '3', null);
INSERT INTO `orderline` VALUES ('36', '1', '4', null);
INSERT INTO `orderline` VALUES ('37', '1', '8', null);
INSERT INTO `orderline` VALUES ('38', '1', '7', null);
INSERT INTO `orderline` VALUES ('39', '2', '4', null);
INSERT INTO `orderline` VALUES ('40', '1', '3', null);
INSERT INTO `orderline` VALUES ('41', '1', '1', null);
INSERT INTO `orderline` VALUES ('42', '1', '1', '33');
INSERT INTO `orderline` VALUES ('43', '1', '1', '33');
INSERT INTO `orderline` VALUES ('44', '1', '1', '33');
INSERT INTO `orderline` VALUES ('45', '1', '5', '33');
INSERT INTO `orderline` VALUES ('46', '1', '1', '33');
INSERT INTO `orderline` VALUES ('47', '1', '3', '33');
INSERT INTO `orderline` VALUES ('48', '1', '3', '33');
INSERT INTO `orderline` VALUES ('49', '1', '8', null);
INSERT INTO `orderline` VALUES ('50', '40', '2', '51');
INSERT INTO `orderline` VALUES ('51', '30', '1', '51');
INSERT INTO `orderline` VALUES ('52', '1', '1', null);
INSERT INTO `orderline` VALUES ('53', '1', '3', '53');
INSERT INTO `orderline` VALUES ('54', '1', '10', '54');
INSERT INTO `orderline` VALUES ('55', '1', '4', '54');
INSERT INTO `orderline` VALUES ('56', '2', '1', '55');
INSERT INTO `orderline` VALUES ('57', '2', '7', '55');
INSERT INTO `orderline` VALUES ('58', '1', '3', '55');
INSERT INTO `orderline` VALUES ('59', '1', '12', '56');
INSERT INTO `orderline` VALUES ('60', '1', '6', '56');
INSERT INTO `orderline` VALUES ('61', '1', '3', '56');
INSERT INTO `orderline` VALUES ('62', '1', '4', '57');
INSERT INTO `orderline` VALUES ('63', '1', '4', '58');
INSERT INTO `orderline` VALUES ('64', '1', '1', '58');
INSERT INTO `orderline` VALUES ('65', '1', '3', '58');
INSERT INTO `orderline` VALUES ('66', '1', '6', '58');
INSERT INTO `orderline` VALUES ('67', '1', '8', '58');
INSERT INTO `orderline` VALUES ('68', '2', '7', '58');
INSERT INTO `orderline` VALUES ('69', '1', '5', '59');
INSERT INTO `orderline` VALUES ('70', '10', '3', '59');
INSERT INTO `orderline` VALUES ('71', '1', '1', '62');
INSERT INTO `orderline` VALUES ('72', '1', '1', '66');
INSERT INTO `orderline` VALUES ('73', '10', '3', '67');
INSERT INTO `orderline` VALUES ('74', '1', '3', '68');
INSERT INTO `orderline` VALUES ('75', '3', '3', '69');
INSERT INTO `orderline` VALUES ('76', '1', '1', '70');
INSERT INTO `orderline` VALUES ('77', '1', '4', '71');
INSERT INTO `orderline` VALUES ('78', '1', '4', '72');
INSERT INTO `orderline` VALUES ('79', '9', '3', '73');
INSERT INTO `orderline` VALUES ('80', '4', '1', '74');
INSERT INTO `orderline` VALUES ('81', '1', '3', '75');
INSERT INTO `orderline` VALUES ('82', '1', '5', '76');
INSERT INTO `orderline` VALUES ('83', '2', '4', '77');
INSERT INTO `orderline` VALUES ('84', '3', '3', '77');
INSERT INTO `orderline` VALUES ('85', '1', '1', '78');
INSERT INTO `orderline` VALUES ('86', '4', '4', '79');
INSERT INTO `orderline` VALUES ('87', '3', '5', '79');
INSERT INTO `orderline` VALUES ('88', '2', '3', '80');
INSERT INTO `orderline` VALUES ('89', '1', '5', '81');
INSERT INTO `orderline` VALUES ('90', '1', '1', '82');
INSERT INTO `orderline` VALUES ('91', '1', '3', '83');
INSERT INTO `orderline` VALUES ('92', '1', '5', '84');
INSERT INTO `orderline` VALUES ('93', '2', '7', '84');
INSERT INTO `orderline` VALUES ('94', '2', '3', '84');
INSERT INTO `orderline` VALUES ('95', '1', '1', '84');
INSERT INTO `orderline` VALUES ('96', '2', '4', '84');
INSERT INTO `orderline` VALUES ('97', '1', '3', '85');
INSERT INTO `orderline` VALUES ('98', '1', '6', '86');
INSERT INTO `orderline` VALUES ('99', '1', '16', '86');
INSERT INTO `orderline` VALUES ('100', '1', '17', '86');
INSERT INTO `orderline` VALUES ('101', '1', '2', '86');
INSERT INTO `orderline` VALUES ('102', '1', '15', '87');
INSERT INTO `orderline` VALUES ('103', '1', '14', '87');
INSERT INTO `orderline` VALUES ('104', '1', '17', '87');
INSERT INTO `orderline` VALUES ('105', '1', '14', '88');
INSERT INTO `orderline` VALUES ('106', '1', '16', '88');
INSERT INTO `orderline` VALUES ('107', '3', '4', '89');
INSERT INTO `orderline` VALUES ('108', '1', '3', '89');
INSERT INTO `orderline` VALUES ('109', '1', '34', '90');
INSERT INTO `orderline` VALUES ('110', '1', '34', '91');
INSERT INTO `orderline` VALUES ('111', '1', '34', '92');
INSERT INTO `orderline` VALUES ('112', '1', '33', '93');
INSERT INTO `orderline` VALUES ('113', '1', '12', '94');
INSERT INTO `orderline` VALUES ('114', '1', '34', '95');
INSERT INTO `orderline` VALUES ('115', '1', '36', '96');
INSERT INTO `orderline` VALUES ('116', '1', '34', '97');
INSERT INTO `orderline` VALUES ('117', '1', '34', '98');
INSERT INTO `orderline` VALUES ('118', '1', '4', '100');
INSERT INTO `orderline` VALUES ('119', '2', '34', '101');
INSERT INTO `orderline` VALUES ('120', '4', '36', '101');
INSERT INTO `orderline` VALUES ('121', '1', '7', '102');
INSERT INTO `orderline` VALUES ('122', '1', '3', '102');

-- ----------------------------
-- Table structure for `orderstatus`
-- ----------------------------
DROP TABLE IF EXISTS `orderstatus`;
CREATE TABLE `orderstatus` (
  `orderStatus_id` int(11) NOT NULL auto_increment,
  `name` varchar(36) default NULL,
  `descriptions` varchar(128) default NULL,
  PRIMARY KEY  (`orderStatus_id`)
) ENGINE=MyISAM DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of orderstatus
-- ----------------------------
INSERT INTO `orderstatus` VALUES ('1', '配货状态', '订单正在配货状态三天内将回应');
INSERT INTO `orderstatus` VALUES ('2', '成功状态', '订单交易已成功');
INSERT INTO `orderstatus` VALUES ('3', '交易途中', '订单正在送货状态');
INSERT INTO `orderstatus` VALUES ('4', '缺货状态', '订单涉及货品暂时缺货');

-- ----------------------------
-- Table structure for `payway`
-- ----------------------------
DROP TABLE IF EXISTS `payway`;
CREATE TABLE `payway` (
  `payway_id` int(11) NOT NULL auto_increment,
  `payStyle` varchar(36) default NULL,
  PRIMARY KEY  (`payway_id`)
) ENGINE=MyISAM DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of payway
-- ----------------------------
INSERT INTO `payway` VALUES ('1', '现金付款');
INSERT INTO `payway` VALUES ('2', '网银付款');
INSERT INTO `payway` VALUES ('3', '电汇付款');

-- ----------------------------
-- Table structure for `product`
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `product_id` int(11) NOT NULL auto_increment,
  `name` varchar(64) default NULL,
  `author` varchar(64) default NULL,
  `publish` varchar(128) default NULL,
  `pages` int(11) default NULL,
  `images` varchar(128) default NULL,
  `basePrice` double default NULL,
  `descriptions` varchar(4000) default NULL,
  `category_id` int(11) default NULL,
  PRIMARY KEY  (`product_id`)
) ENGINE=MyISAM DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', '别墅1', '1998年', '120平', '7', 'product/big_pic1.jpg', '150000', '位于龙溪路靠近虹桥路，就在西郊国宾馆的西面，属于西郊的核心地段，96、97年一期二期开盘，开盘价在300-600平，一共149套，09年第三期开盘，单价12.5万/平，一共74套。', '1');
INSERT INTO `product` VALUES ('3', '别墅3', '2001年', '123平', '87', 'product/big_pic3.jpg', '122222', '本案位于古北路古羊路，属长宁古北国际社区，由两幢中西结合风格的小高层以及28幢独立别墅构成。', '1');
INSERT INTO `product` VALUES ('4', '别墅4', '2001年', '140平', '12', 'product/big_pic4.jpg', '111111', '本楼盘位于中环线与外环线之间，属于优美生活圈，依托周边便捷的交通和和睦完善的商业配套设施及小区的高绿化率所创造的自然生态社区.', '1');
INSERT INTO `product` VALUES ('5', '别墅5', '2001年', '130平', '23', 'product/big_pic5.jpg', '123123', '绿城玫瑰园是由绿城集团开发，建筑面积775平，其中地下室面积是270平.', '1');
INSERT INTO `product` VALUES ('6', '别墅6', '2002年', '123平', '12', 'product/big_pic6.jpg', '123456', '位于英式风貌区其中一隅，泰晤士小镇G区，以四面抚水的秀美小岛与后现代主义英式别墅建筑尽现风华。', '1');
INSERT INTO `product` VALUES ('7', '别墅7', '2002年', '123平', '12', 'product/big_pic7.jpg', '123456', '沪上顶级的超五星级豪华会所，设施齐全、高雅设计，令住客舒展身心，享受天伦之乐。\r\r\n', '1');
INSERT INTO `product` VALUES ('8', '别墅8', '2002年', '123平', '12', 'product/big_pic8.jpg', '123456', '一流住宅当然要配上与众不同的服务，「四季雅苑」强调「一站式」服务概念.', '1');
INSERT INTO `product` VALUES ('9', '别墅13', '2002年', '150平', '12', 'product/big_pic9.jpg', '123456', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '2');
INSERT INTO `product` VALUES ('10', '别墅10', '2001年', '130平', '23', 'product/big_pic10.jpg', '222222', '不错房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '2');
INSERT INTO `product` VALUES ('11', '别墅11', '2002年', '140平', '34', 'product/big_pic11.jpg', '123123', '很好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '2');
INSERT INTO `product` VALUES ('2', '别墅2', '2001年', '120平', '10', 'product/big_pic2.jpg', '220000', '普通房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '2');
INSERT INTO `product` VALUES ('17', '别墅17', '2003年', '150平', '12', 'product/big_pic17.jpg', '300000', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '2');
INSERT INTO `product` VALUES ('16', '别墅16', '2003年', '150平', '11', 'product/big_pic16.jpg', '300000', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '3');
INSERT INTO `product` VALUES ('15', '别墅15', '2003年', '150平', '12', 'product/big_pic15.jpg', '300000', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '3');
INSERT INTO `product` VALUES ('14', '别墅14', '2003年', '150平', '11', 'product/big_pic14.jpg', '300000', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '3');
INSERT INTO `product` VALUES ('13', '别墅13', '2003年', '280平', '12', 'product/big_pic13.jpg', '300000', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '3');
INSERT INTO `product` VALUES ('12', '别墅12', '2003年', '150平', '23', 'product/big_pic12.jpg', '123123', '、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。目前完好无损。', '1');
INSERT INTO `product` VALUES ('18', '别墅18', '2003年', '150平', '11', 'product/big_pic18.jpg', '300000', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '3');
INSERT INTO `product` VALUES ('19', '别墅19', '2003年', '150平', '13', 'product/big_pic19.jpg', '300000', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '3');
INSERT INTO `product` VALUES ('20', '别墅20', '2003年', '150平', '14', 'product/big_pic20.jpg', '300000', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '3');
INSERT INTO `product` VALUES ('21', '别墅21', '2003年', '150平', '14', 'product/big_pic21.jpg', '300000', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '3');
INSERT INTO `product` VALUES ('22', '别墅22', '2003年', '150平', '14', 'product/big_pic22.jpg', '300000', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '3');
INSERT INTO `product` VALUES ('23', '别墅23', '2003年', '150平', '14', 'product/big_pic23.jpg', '300000', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '3');
INSERT INTO `product` VALUES ('24', '别墅24', '2003年', '150平', '12', 'product/big_pic24.jpg', '300000', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '3');
INSERT INTO `product` VALUES ('25', '别墅25', '2003年', '150平', '12', 'product/big_pic25.jpg', '300000', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '3');
INSERT INTO `product` VALUES ('26', '别墅26', '2003年', '150平', '12', 'product/big_pic26.jpg', '300000', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '3');
INSERT INTO `product` VALUES ('27', '别墅27', '2003年', '150平', '12', 'product/big_pic27.jpg', '300000', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '3');
INSERT INTO `product` VALUES ('28', '别墅28', '2003年', '150平', '12', 'product/big_pic28.jpg', '300000', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '3');
INSERT INTO `product` VALUES ('29', '别墅29', '2003年', '150平', '12', 'product/big_pic29.jpg', '300000', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '3');
INSERT INTO `product` VALUES ('30', '别墅30', '2003年', '150平', '12', 'product/big_pic30.jpg', '300000', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '3');
INSERT INTO `product` VALUES ('31', '别墅31', '2003年', '150平', '12', 'product/big_pic31.jpg', '300000', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '3');
INSERT INTO `product` VALUES ('32', '别墅32', '2003年', '150平', '21', 'product/big_pic32.jpg', '300000', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '3');
INSERT INTO `product` VALUES ('33', '别墅33', '2003年', '150平', '12', 'product/big_pic33.jpg', '300000', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '3');
INSERT INTO `product` VALUES ('34', '别墅34', '2003年', '150平', '21', 'product/big_pic34.jpg', '300000', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '3');
INSERT INTO `product` VALUES ('35', '别墅35', '2003年', '150平', '12', 'product/big_pic35.jpg', '300000', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '3');
INSERT INTO `product` VALUES ('36', '别墅36', '2003年', '150平', '22', 'product/big_pic36.jpg', '300000', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '3');
INSERT INTO `product` VALUES ('37', '别墅37', '2003年', '150平', '2', 'product/big_pic37.jpg', '300000', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '3');
INSERT INTO `product` VALUES ('38', '别墅38', '2003年', '150平', '22', 'product/big_pic38.jpg', '300000', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '3');
INSERT INTO `product` VALUES ('39', '别墅39', '2003年', '150平', '12', 'product/big_pic39.jpg', '300000', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '3');
INSERT INTO `product` VALUES ('40', '别墅40', '2003年', '150平', '12', 'product/big_pic40.jpg', '300000', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '3');
INSERT INTO `product` VALUES ('41', '别墅41', '2003年', '150平', '12', 'product/big_pic41.jpg', '300000', '好房屋描述 - 房地产区位状况描述 一、 房屋描述 1、 房屋概况:富悦新城 D 栋三楼 1 号,坐南朝北,三室一厅一厨一卫。', '3');

-- ----------------------------
-- Table structure for `province`
-- ----------------------------
DROP TABLE IF EXISTS `province`;
CREATE TABLE `province` (
  `province_id` int(11) NOT NULL auto_increment,
  `name` varchar(64) default NULL,
  `country_id` int(11) default NULL,
  PRIMARY KEY  (`province_id`),
  KEY `country_fk` (`country_id`)
) ENGINE=MyISAM DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of province
-- ----------------------------
INSERT INTO `province` VALUES ('1', '安徽', '1');
INSERT INTO `province` VALUES ('2', '北京', '1');
INSERT INTO `province` VALUES ('3', '重庆', '1');
INSERT INTO `province` VALUES ('4', '福建', '1');
INSERT INTO `province` VALUES ('5', '广东', '1');
INSERT INTO `province` VALUES ('6', '甘肃', '1');
INSERT INTO `province` VALUES ('7', '广西', '1');
INSERT INTO `province` VALUES ('8', '贵州', '1');
INSERT INTO `province` VALUES ('9', '河南', '1');
INSERT INTO `province` VALUES ('10', '湖北', '1');
INSERT INTO `province` VALUES ('11', '河北', '1');
INSERT INTO `province` VALUES ('12', '海南', '1');
INSERT INTO `province` VALUES ('13', '香港', '1');
INSERT INTO `province` VALUES ('14', '黑龙江', '1');
INSERT INTO `province` VALUES ('15', '湖南', '1');
INSERT INTO `province` VALUES ('16', '吉林', '1');
INSERT INTO `province` VALUES ('17', '江苏', '1');
INSERT INTO `province` VALUES ('18', '江西', '1');
INSERT INTO `province` VALUES ('19', '辽宁', '1');
INSERT INTO `province` VALUES ('20', '澳门', '1');
INSERT INTO `province` VALUES ('21', '内蒙古', '1');
INSERT INTO `province` VALUES ('22', '宁夏', '1');
INSERT INTO `province` VALUES ('23', '青海', '1');
INSERT INTO `province` VALUES ('24', '四川', '1');
INSERT INTO `province` VALUES ('25', '山东', '1');
INSERT INTO `province` VALUES ('26', '上海', '1');
INSERT INTO `province` VALUES ('27', '陕西', '1');
INSERT INTO `province` VALUES ('28', '山西', '1');
INSERT INTO `province` VALUES ('29', '天津', '1');
INSERT INTO `province` VALUES ('30', '台湾', '1');
INSERT INTO `province` VALUES ('31', '新疆', '1');
INSERT INTO `province` VALUES ('32', '西藏', '1');
INSERT INTO `province` VALUES ('33', '云南', '1');
INSERT INTO `province` VALUES ('34', '浙江', '1');
INSERT INTO `province` VALUES ('35', '其它', '1');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL auto_increment,
  `name` varchar(64) default NULL,
  `passwd` varchar(16) default NULL,
  PRIMARY KEY  (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('10', 'admin2', 'admin2');
INSERT INTO `user` VALUES ('11', 'admin', 'admin');
INSERT INTO `user` VALUES ('16', 'test3', 'test3');
INSERT INTO `user` VALUES ('13', 'test', 'test');
INSERT INTO `user` VALUES ('23', 'haha', 'haha');
INSERT INTO `user` VALUES ('15', 'test2', 'test2');
INSERT INTO `user` VALUES ('18', 'test5', 'test5');
INSERT INTO `user` VALUES ('19', 'test6', 'test6');
INSERT INTO `user` VALUES ('20', 'test7', 'test7');
INSERT INTO `user` VALUES ('21', 'test7', 'test7');
INSERT INTO `user` VALUES ('22', 'test7', 'test7');
INSERT INTO `user` VALUES ('24', 'zhang', 'zhang');
INSERT INTO `user` VALUES ('25', 'aaa2', 'aaa2');
INSERT INTO `user` VALUES ('26', 'as', 'as');
INSERT INTO `user` VALUES ('27', 'aaa1', 'aaa1');
INSERT INTO `user` VALUES ('33', 'bbb', 'bbb');
INSERT INTO `user` VALUES ('32', 'as', 'as');
INSERT INTO `user` VALUES ('30', '123', '123');
INSERT INTO `user` VALUES ('34', 'ccc', 'ccc');
INSERT INTO `user` VALUES ('35', 'summer', 'youxia');
INSERT INTO `user` VALUES ('36', 'eee', 'eee');
INSERT INTO `user` VALUES ('37', 'fff', 'fff');
INSERT INTO `user` VALUES ('38', 'ggg', 'ggg');
INSERT INTO `user` VALUES ('39', 'qq', 'qq');
INSERT INTO `user` VALUES ('41', 'ww', 'ww');
INSERT INTO `user` VALUES ('42', '呵呵', '123');
INSERT INTO `user` VALUES ('43', '王呵呵', '123');
INSERT INTO `user` VALUES ('44', '1232', '123');
INSERT INTO `user` VALUES ('45', 'www', 'www');
INSERT INTO `user` VALUES ('46', 'rrr', 'rrr');
INSERT INTO `user` VALUES ('47', 'hehe', 'hehe');
INSERT INTO `user` VALUES ('48', '张晋卿', '123');

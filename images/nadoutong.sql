/*
Navicat MySQL Data Transfer

Source Server         : 47.94.108.26
Source Server Version : 50722
Source Host           : 47.94.108.26:3306
Source Database       : nadoutong

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2019-09-25 15:25:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `captaininfo`
-- ----------------------------
DROP TABLE IF EXISTS `captaininfo`;
CREATE TABLE `captaininfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `captainname` varchar(255) DEFAULT '',
  `fleetname` varchar(255) DEFAULT '',
  `captaintel` varchar(255) DEFAULT '',
  `createtime` datetime DEFAULT NULL,
  `mark` varchar(255) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of captaininfo
-- ----------------------------
INSERT INTO `captaininfo` VALUES ('1', '测试数据', '测试数据', '17852456557', '2019-02-25 16:45:43', '测试');
INSERT INTO `captaininfo` VALUES ('2', '测试', '测试', '17852756555', '2019-02-25 16:57:21', '');

-- ----------------------------
-- Table structure for `carinfo`
-- ----------------------------
DROP TABLE IF EXISTS `carinfo`;
CREATE TABLE `carinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `numberplate` varchar(255) DEFAULT '',
  `platetype` varchar(255) DEFAULT '',
  `platecolor` varchar(255) DEFAULT '',
  `cartype` varchar(255) DEFAULT '',
  `carlength` double DEFAULT NULL,
  `fullload` double DEFAULT NULL,
  `maxload` double DEFAULT NULL,
  `roadtransportcertificate` varchar(255) DEFAULT '',
  `businessname` varchar(255) DEFAULT '',
  `businesstel` varchar(255) DEFAULT '',
  `businesslicense` varchar(255) DEFAULT '',
  `brandmodel` varchar(255) DEFAULT '',
  `createtime` datetime DEFAULT NULL,
  `drivinglicensepath` varchar(255) DEFAULT '',
  `operatinglicencepath` varchar(255) DEFAULT '',
  `cid` int(11) DEFAULT NULL,
  `mark` varchar(255) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=139653 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of carinfo
-- ----------------------------
INSERT INTO `carinfo` VALUES ('139652', '鲁S4444', '大型汽车号牌', '黄色', '牵引车', '4.2', '22', '22', '2121212', 'QQ', '13122122234', '2121', '121', '2019-09-25 15:16:18', '', '', null, '');

-- ----------------------------
-- Table structure for `driverinfo`
-- ----------------------------
DROP TABLE IF EXISTS `driverinfo`;
CREATE TABLE `driverinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sex` varchar(255) DEFAULT '',
  `realname` varchar(255) DEFAULT '',
  `tel` varchar(255) DEFAULT '',
  `idcard` varchar(255) DEFAULT '',
  `address` varchar(255) DEFAULT '',
  `createtime` datetime DEFAULT NULL,
  `pcphoto` varchar(255) DEFAULT '',
  `idcarda` varchar(255) DEFAULT '',
  `idcardb` varchar(255) DEFAULT '',
  `drivercard` varchar(255) DEFAULT '',
  `cid` int(11) DEFAULT NULL,
  `car` varchar(255) DEFAULT NULL,
  `mark` varchar(255) DEFAULT '',
  `state` varchar(255) DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `cid` (`cid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=49062 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of driverinfo
-- ----------------------------
INSERT INTO `driverinfo` VALUES ('49061', '男', 'qq', '13122433345', '371203198787495871', '妖塔', '2019-09-25 15:15:11', '', '', '', '', '2', null, '', '1');

-- ----------------------------
-- Table structure for `goodsinfo`
-- ----------------------------
DROP TABLE IF EXISTS `goodsinfo`;
CREATE TABLE `goodsinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `goodstype` varchar(255) DEFAULT '',
  `goodsname` varchar(255) DEFAULT '',
  `mark` varchar(255) DEFAULT '',
  `creattime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of goodsinfo
-- ----------------------------
INSERT INTO `goodsinfo` VALUES ('15', '大宗货物', '煤炭', '', '2018-11-28 20:45:45');

-- ----------------------------
-- Table structure for `logininfo`
-- ----------------------------
DROP TABLE IF EXISTS `logininfo`;
CREATE TABLE `logininfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT '',
  `password` varchar(255) DEFAULT '',
  `disablelogin` varchar(255) DEFAULT '0',
  `isreview` varchar(255) DEFAULT '0',
  `createtime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of logininfo
-- ----------------------------
INSERT INTO `logininfo` VALUES ('9', 'admin', 'admina', '0', '1', '2018-10-21 11:14:26');

-- ----------------------------
-- Table structure for `mobileregistry`
-- ----------------------------
DROP TABLE IF EXISTS `mobileregistry`;
CREATE TABLE `mobileregistry` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `realname` varchar(255) DEFAULT '',
  `tel` varchar(255) DEFAULT '',
  `password` varchar(255) DEFAULT '123456',
  `uploadstate` varchar(255) DEFAULT '',
  `pcphoto` varchar(255) DEFAULT '',
  `drivercard` varchar(255) DEFAULT '',
  `idcarda` varchar(255) DEFAULT '',
  `idcardb` varchar(255) DEFAULT '',
  `drivinglicensepath` varchar(255) DEFAULT '',
  `operatinglicencepath` varchar(255) DEFAULT '',
  `createtime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of mobileregistry
-- ----------------------------
INSERT INTO `mobileregistry` VALUES ('3', '张三', '17853558068', '123456', '1', '/image/张三17853558068人车照.jpg', '/image/张三17853558068驾驶证.jpg', '/image/张三17853558068身份证正.jpg', '/image/张三17853558068身份证反.jpg', '/image/张三17853558068行驶证.jpg', '/image/张三17853558068运营证.jpg', null);

-- ----------------------------
-- Table structure for `ordermanagementinfo`
-- ----------------------------
DROP TABLE IF EXISTS `ordermanagementinfo`;
CREATE TABLE `ordermanagementinfo` (
  `id` int(11) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `dispatchedparty` varchar(255) DEFAULT '',
  `carrier` varchar(255) DEFAULT '',
  `departure` varchar(255) DEFAULT '',
  `destination` varchar(255) DEFAULT '',
  `sendername` varchar(255) DEFAULT '',
  `sendertel` varchar(255) DEFAULT '',
  `receivername` varchar(255) DEFAULT '',
  `receivertel` varchar(255) DEFAULT '',
  `ordernumber` varchar(255) DEFAULT '',
  `ordercreatetime` datetime DEFAULT NULL,
  `remain` float(10,3) DEFAULT NULL,
  `totaltraffic` float(10,3) DEFAULT NULL,
  `volume` varchar(255) DEFAULT NULL,
  `contractrote` varchar(255) DEFAULT '',
  `gid` varchar(255) DEFAULT '',
  `mark` varchar(255) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31073 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of ordermanagementinfo
-- ----------------------------
INSERT INTO `ordermanagementinfo` VALUES ('00000031058', '物流', '哪都通（大连）科技有限公司', '内蒙古自治区鄂尔多斯市准格尔旗', '山西省朔州市平鲁区', '郭瑞龙', '15034777090', '李贵宏', '17640336662', 'NDT2018D0000001', '2018-05-23 13:28:40', '10000.000', '10000.000', '', '', '15', '');
INSERT INTO `ordermanagementinfo` VALUES ('00000031059', '物流', '哪都通（大连）科技有限公司', '内蒙古自治区鄂尔多斯市准格尔旗', '山西省朔州市平鲁区', '郭瑞龙', '15034777090', '李贵宏', '17640336662', 'NDT2018D0000002', '2018-05-23 13:28:40', '10000.000', '10000.000', '', '', '15', '');
INSERT INTO `ordermanagementinfo` VALUES ('00000031060', '物流', '哪都通（大连）科技有限公司', '内蒙古自治区鄂尔多斯市准格尔旗', '山西省朔州市平鲁区', '郭瑞龙', '15034777090', '李贵宏', '17640336662', 'NDT2018D0000003', '2018-05-23 15:27:47', '10000.000', '10000.000', '', '', '15', '');
INSERT INTO `ordermanagementinfo` VALUES ('00000031061', '物流', '哪都通（大连）科技有限公司', '内蒙古自治区鄂尔多斯市准格尔旗', '山西省朔州市平鲁区', '郭瑞龙', '15034777090', '李贵宏', '17640336662', 'NDT2018D0000004', '2018-05-23 13:28:40', '10000.000', '10000.000', '', '', '15', '');
INSERT INTO `ordermanagementinfo` VALUES ('00000031062', '物流', '哪都通（大连）科技有限公司', '内蒙古自治区鄂尔多斯市准格尔旗', '山西省朔州市平鲁区', '郭瑞龙', '15034777090', '李贵宏', '17640336662', 'NDT2018D0000005', '2018-05-23 13:28:40', '10000.000', '10000.000', '', '', '15', '');
INSERT INTO `ordermanagementinfo` VALUES ('00000031063', '物流', '哪都通（大连）科技有限公司', '内蒙古自治区鄂尔多斯市准格尔旗', '山西省朔州市平鲁区', '郭瑞龙', '15034777090', '李贵宏', '17640336662', 'NDT2018D0000006', '2018-05-23 13:28:40', '10000.000', '10000.000', '', '', '15', '');
INSERT INTO `ordermanagementinfo` VALUES ('00000031064', '物流', '哪都通（大连）科技有限公司', '内蒙古自治区鄂尔多斯市准格尔旗', '山西省朔州市平鲁区', '郭瑞龙', '15034777090', '李贵宏', '17640336662', 'NDT2018D0000007', '2018-11-23 15:27:47', '10000.000', '10000.000', '', '', '15', '');
INSERT INTO `ordermanagementinfo` VALUES ('00000031065', '物流', '哪都通（大连）科技有限公司', '内蒙古自治区鄂尔多斯市准格尔旗', '山西省朔州市平鲁区', '郭瑞龙', '15034777090', '李贵宏', '17640336662', 'NDT2018D0000008', '2018-05-23 15:27:47', '15000.000', '15000.000', '', '', '15', '');
INSERT INTO `ordermanagementinfo` VALUES ('00000031066', '物流', '哪都通（大连）科技有限公司', '内蒙古自治区鄂尔多斯市准格尔旗', '山西省朔州市平鲁区', '郭瑞龙', '15034777090', '李贵宏', '17640336662', 'NDT2018D0000009', '2018-05-23 15:27:47', '12300.000', '12300.000', '', '', '15', '');
INSERT INTO `ordermanagementinfo` VALUES ('00000031067', '物流', '哪都通（大连）科技有限公司', '内蒙古自治区鄂尔多斯市准格尔旗', '山西省朔州市平鲁区', '郭瑞龙', '15034777090', '李贵宏', '17640336662', 'NDT2018D0000010', '2018-05-23 15:27:47', '11100.000', '11100.000', '', '', '15', '');
INSERT INTO `ordermanagementinfo` VALUES ('00000031068', '物流', '哪都通（大连）科技有限公司', '内蒙古自治区鄂尔多斯市准格尔旗', '山西省朔州市平鲁区', '郭瑞龙', '15034777090', '李贵宏', '17640336662', 'NDT2018D0000011', '2018-05-23 15:27:47', '13000.000', '13000.000', '', '', '15', '');
INSERT INTO `ordermanagementinfo` VALUES ('00000031069', '物流', '哪都通（大连）科技有限公司', '内蒙古自治区鄂尔多斯市准格尔旗', '山西省朔州市平鲁区', '郭瑞龙', '15034777090', '李贵宏', '17640336662', 'NDT2018D0000012', '2018-05-23 15:27:47', '14000.000', '14000.000', '', '', '15', '');
INSERT INTO `ordermanagementinfo` VALUES ('00000031070', '物流', '哪都通（大连）科技有限公司', '内蒙古自治区鄂尔多斯市准格尔旗', '山西省朔州市平鲁区', '郭瑞龙', '15034777090', '李贵宏', '17640336662', 'NDT2018D0000013', '2018-05-23 15:27:47', '12000.000', '12000.000', '', '', '15', '');
INSERT INTO `ordermanagementinfo` VALUES ('00000031071', '物流', '哪都通（大连）科技有限公司', '内蒙古自治区鄂尔多斯市准格尔旗', '山西省朔州市平鲁区', '郭瑞龙', '15034777090', '李贵宏', '17640336662', 'NDT2018D0000014', '2018-05-23 15:27:47', '11000.000', '11000.000', '', '', '15', '');
INSERT INTO `ordermanagementinfo` VALUES ('00000031072', '物流', '哪都通（大连）科技有限公司', '内蒙古自治区鄂尔多斯市准格尔旗', '山西省朔州市平鲁区', '郭瑞龙', '15034777090', '李贵宏', '17640336662', 'NDT2018D0000015', '2018-05-23 13:28:40', '13777.000', '14000.000', '', '', '15', '');

-- ----------------------------
-- Table structure for `sendermanagementinfo`
-- ----------------------------
DROP TABLE IF EXISTS `sendermanagementinfo`;
CREATE TABLE `sendermanagementinfo` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `ordernumber` varchar(255) DEFAULT '',
  `ordermoney` double(10,2) DEFAULT NULL,
  `numberplate` varchar(255) DEFAULT '',
  `orderdriver` varchar(255) DEFAULT '',
  `oncetraffic` float(10,3) DEFAULT NULL,
  `singlenumber` varchar(255) DEFAULT '',
  `waybillstate` varchar(255) DEFAULT '',
  `totaltraffic` varchar(255) DEFAULT '',
  `btime` datetime DEFAULT NULL,
  `etime` datetime DEFAULT NULL,
  `location` varchar(4000) DEFAULT '',
  `transport` varchar(255) DEFAULT '',
  `operating` varchar(255) DEFAULT '',
  `mark` varchar(255) DEFAULT '',
  `createtime` datetime DEFAULT NULL,
  `oid` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=93135 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of sendermanagementinfo
-- ----------------------------
INSERT INTO `sendermanagementinfo` VALUES ('93130', 'NDT2018D0000015', '2000.00', '40682', '晋B89603', '50.000', 'NDTYD2018Y00000001', '已完成', '', '2018-11-05 19:43:29', '2018-11-06 04:36:22', '39.621817,109.777515,2018/11/05 19:43:29;\r\n39.685814,109.860303,2018/11/05 20:43:29;\r\n39.75785,111.088035,2018/11/06 1:43:29;\r\n39.763951,111.907002,2018/11/06 3:43:29;\r\n39.518585,112.302544,2018/11/06 4:36:22\r\n', '', '傻狗', '', '2018-11-23 00:00:00', null);
INSERT INTO `sendermanagementinfo` VALUES ('93131', 'NDT2018D0000015', '4000.00', '40685', '晋B99758', '6.000', 'NDTYD2018Y00000002', '已完成', '', '2018-12-08 00:00:00', '2018-12-15 00:00:00', '', '', '亲亲', '', '2018-12-08 00:00:00', null);
INSERT INTO `sendermanagementinfo` VALUES ('93133', 'NDT2018D0000015', '1333.00', '40684', '晋B99921', '55.000', 'NDTYD2018Y00000003', '接单中', '', null, null, '', '', 'qqq', '', '2018-12-22 00:00:00', null);
INSERT INTO `sendermanagementinfo` VALUES ('93134', 'NDT2018D0000015', '112.00', '40686', '晋B93131', '112.000', 'NDTYD2018Y00000004', '已完成', '', '2019-02-27 00:00:00', '2019-02-27 00:00:00', '', '', '阿斯蒂芬', '', '2018-12-20 00:00:00', null);

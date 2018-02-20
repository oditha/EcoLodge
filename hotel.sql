-- MySQL dump 10.16  Distrib 10.1.21-MariaDB, for Linux (x86_64)
--
-- Host: localhost    Database: localhost
-- ------------------------------------------------------
-- Server version	10.1.21-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bookingtable`
--

DROP TABLE IF EXISTS `bookingtable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bookingtable` (
  `book_id` int(11) NOT NULL AUTO_INCREMENT,
  `room_no` varchar(45) DEFAULT NULL,
  `cus_no` int(11) NOT NULL,
  `date_fro` varchar(45) DEFAULT NULL,
  `date_to` varchar(45) DEFAULT NULL,
  `no_of_day` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`book_id`),
  KEY `fk_bookingtable_cusdetail_idx` (`cus_no`),
  CONSTRAINT `fk_bookingtable_cusdetail` FOREIGN KEY (`cus_no`) REFERENCES `custdetail` (`Cust_id_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bookingtable`
--

LOCK TABLES `bookingtable` WRITE;
/*!40000 ALTER TABLE `bookingtable` DISABLE KEYS */;
INSERT INTO `bookingtable` VALUES (1,'101',1,'01.01.2018','03.01.2018','2');
/*!40000 ALTER TABLE `bookingtable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `custdetail`
--

DROP TABLE IF EXISTS `custdetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `custdetail` (
  `Cust_id_no` int(11) NOT NULL AUTO_INCREMENT,
  `Cust_name` varchar(45) DEFAULT NULL,
  `Cust_NIC` varchar(45) DEFAULT NULL,
  `Cust_city` varchar(45) DEFAULT NULL,
  `Geusts` varchar(45) DEFAULT NULL,
  `Cust_country` varchar(45) DEFAULT NULL,
  `Cust_ph` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Cust_id_no`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `custdetail`
--

LOCK TABLES `custdetail` WRITE;
/*!40000 ALTER TABLE `custdetail` DISABLE KEYS */;
INSERT INTO `custdetail` VALUES (1,'oditha','123454','badulla','1','lk','0771981680');
/*!40000 ALTER TABLE `custdetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invoice`
--

DROP TABLE IF EXISTS `invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `invoice` (
  `idinvoice` int(11) NOT NULL AUTO_INCREMENT,
  `invID` varchar(45) DEFAULT NULL,
  `roomrate` varchar(45) DEFAULT NULL,
  `days` varchar(45) DEFAULT NULL,
  `total` varchar(45) DEFAULT NULL,
  `CusName` varchar(45) DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL,
  `booking` int(11) NOT NULL,
  PRIMARY KEY (`idinvoice`),
  KEY `fk_invoice_roomdetail1_idx` (`booking`),
  CONSTRAINT `fk_invoice_roomdetail1` FOREIGN KEY (`booking`) REFERENCES `roomdetail` (`room_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invoice`
--

LOCK TABLES `invoice` WRITE;
/*!40000 ALTER TABLE `invoice` DISABLE KEYS */;
INSERT INTO `invoice` VALUES (1,'INV-0001','1500','2','3000.0','oditha','31.01.2018',1);
/*!40000 ALTER TABLE `invoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roomdetail`
--

DROP TABLE IF EXISTS `roomdetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `roomdetail` (
  `room_id` int(11) NOT NULL AUTO_INCREMENT,
  `room_no` varchar(45) DEFAULT NULL,
  `room_type` varchar(45) DEFAULT NULL,
  `room_rate` varchar(45) DEFAULT NULL,
  `room_bed` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`room_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roomdetail`
--

LOCK TABLES `roomdetail` WRITE;
/*!40000 ALTER TABLE `roomdetail` DISABLE KEYS */;
INSERT INTO `roomdetail` VALUES (1,'101','AC Room','1500','Single Bed');
/*!40000 ALTER TABLE `roomdetail` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-31 20:13:13

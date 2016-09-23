-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: cleanmaster
-- ------------------------------------------------------
-- Server version	5.7.14-log

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
-- Table structure for table `appraisals`
--

DROP TABLE IF EXISTS `appraisals`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `appraisals` (
  `AppraisalID` int(11) NOT NULL AUTO_INCREMENT,
  `EmpID` int(11) NOT NULL,
  `Bonus` decimal(6,2) DEFAULT NULL,
  `Reviews` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`AppraisalID`),
  KEY `EmpID` (`EmpID`),
  CONSTRAINT `appraisals_ibfk_1` FOREIGN KEY (`EmpID`) REFERENCES `employee` (`EmployeeID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appraisals`
--

LOCK TABLES `appraisals` WRITE;
/*!40000 ALTER TABLE `appraisals` DISABLE KEYS */;
INSERT INTO `appraisals` VALUES (1,2,2000.00,'Very Good');
/*!40000 ALTER TABLE `appraisals` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `attendance`
--

DROP TABLE IF EXISTS `attendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `attendance` (
  `AttendanceID` int(11) NOT NULL AUTO_INCREMENT,
  `EmpID` int(11) NOT NULL,
  `Work_Date` date DEFAULT NULL,
  `Presence` char(10) DEFAULT NULL,
  PRIMARY KEY (`AttendanceID`),
  KEY `EmpID` (`EmpID`),
  CONSTRAINT `attendance_ibfk_1` FOREIGN KEY (`EmpID`) REFERENCES `employee` (`EmployeeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendance`
--

LOCK TABLES `attendance` WRITE;
/*!40000 ALTER TABLE `attendance` DISABLE KEYS */;
/*!40000 ALTER TABLE `attendance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cb`
--

DROP TABLE IF EXISTS `cb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cb` (
  `cname` varchar(20) NOT NULL,
  `cid` int(10) NOT NULL AUTO_INCREMENT,
  `bp` date NOT NULL,
  `sb` varchar(150) NOT NULL,
  `noj` int(4) NOT NULL,
  `cc` varchar(400) NOT NULL,
  `ta` decimal(10,0) NOT NULL,
  `bd` int(10) NOT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cb`
--

LOCK TABLES `cb` WRITE;
/*!40000 ALTER TABLE `cb` DISABLE KEYS */;
/*!40000 ALTER TABLE `cb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `check_items`
--

DROP TABLE IF EXISTS `check_items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `check_items` (
  `Item_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Product_Id` varchar(45) NOT NULL,
  `Product_Name` varchar(45) NOT NULL,
  `Return_Qunty` int(11) DEFAULT NULL,
  `Issue_Qunty` int(11) DEFAULT NULL,
  PRIMARY KEY (`Item_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `check_items`
--

LOCK TABLES `check_items` WRITE;
/*!40000 ALTER TABLE `check_items` DISABLE KEYS */;
/*!40000 ALTER TABLE `check_items` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `CusID` int(11) NOT NULL AUTO_INCREMENT,
  `Title` varchar(45) DEFAULT NULL,
  `FName` varchar(45) DEFAULT NULL,
  `LName` varchar(45) DEFAULT NULL,
  `NIC` varchar(12) NOT NULL,
  `Ad1` varchar(45) DEFAULT NULL,
  `Ad2` varchar(45) DEFAULT NULL,
  `City` varchar(45) DEFAULT NULL,
  `Gender` varchar(6) DEFAULT NULL,
  `Mobile` varchar(10) DEFAULT NULL,
  `Office` varchar(10) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `Type` varchar(45) DEFAULT NULL,
  `Level` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`CusID`),
  UNIQUE KEY `NIC` (`NIC`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'Mr','Supun','Chathuranga','931090771V','No 156/B','Sunethrarama Road','Kadawata','Male','0712768008','0112929709','chathu6@gmail.com','Ordinary','Default Customer'),(2,'Miss','Dinushi','Rathnaweera','939010660V','Uduravanapura','Kandy Road','Galle','Male','0718597810','0112745859','dinu6@gmail.com','Bulk','Platinum Customer'),(3,'Dr','Chathu','Raaksha','931080445V','Ravanapura','Yamaweediya','Matara','Male','0714578901','0112424289','ravanaraaksha@gmail.com','Bulk','Gold Customer'),(4,'Mrs','Amaya','Godagama','910641578V','Pahalakaragama','Hettiweediya','Colombo','Female','0774541782','0115468740','amaya2@hotmail.com','Bulk','Bronze Customer'),(5,'Mr','E.G.','Sunil','551090771V','Sunetrarama Road','Kelanimulla','Kadawata','Male','0718040410','0115555555','sunil@rocketmail.com','Bulk','Level 1'),(6,'Mr','Buddihka','Nanayakkara','758070117V','Maradana Parana Para','Ananda Road','Colombo','Male','0715465782','0112458745','buddhikan@ceb.lk','Bulk','Level 3'),(7,'Mr','Satira','Paranasena','931040445V','Angoda','Thuththiriya','Colombo','Male','0712454756','0112458745','pxs@gmail.com','Bulk','Level 5');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empassigned`
--

DROP TABLE IF EXISTS `empassigned`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empassigned` (
  `jobid` int(11) NOT NULL,
  `jdate` date NOT NULL,
  `empass` int(11) NOT NULL,
  `stat` varchar(15) DEFAULT NULL,
  `Vehi_Num` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empassigned`
--

LOCK TABLES `empassigned` WRITE;
/*!40000 ALTER TABLE `empassigned` DISABLE KEYS */;
INSERT INTO `empassigned` VALUES (1,'2016-04-01',7,NULL,NULL),(3,'2016-04-21',47,NULL,NULL),(126,'2016-04-02',3,NULL,NULL),(127,'2016-04-02',2,NULL,NULL),(128,'2016-04-01',3,NULL,NULL),(129,'2016-04-01',1,NULL,NULL),(132,'2016-04-03',4,'pending',NULL),(133,'2016-04-09',4,'pending',NULL),(2,'2016-09-28',4,'pending',NULL),(135,'2016-09-29',3,'pending',NULL),(134,'2016-09-29',1,'pending',NULL);
/*!40000 ALTER TABLE `empassigned` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `EmployeeID` int(11) NOT NULL AUTO_INCREMENT,
  `First_Name` char(100) NOT NULL,
  `Last_Name` char(100) NOT NULL,
  `Address` varchar(300) NOT NULL,
  `Date_of_Birth` date NOT NULL,
  `NIC_No` varchar(10) NOT NULL,
  `Gender` char(10) NOT NULL,
  `Marital_Status` char(10) NOT NULL,
  `Mobile_No` char(10) DEFAULT NULL,
  `Home_No` char(10) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `Current_Status` char(10) NOT NULL DEFAULT 'Working',
  `RoleID` int(11) NOT NULL,
  PRIMARY KEY (`EmployeeID`),
  UNIQUE KEY `NIC_No` (`NIC_No`),
  KEY `RoleID` (`RoleID`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`RoleID`) REFERENCES `role` (`RoleID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'Thisura','Thejith','Elpitiya,Galle','1994-10-07','942811110v','Male','Single','0776139937','0912290157','ttcphilips@gmail.com','Working',1),(2,'Chamara','Hareendra','Maharagam,Colombo','1990-08-20','903753743v','Male','Single','0763434354','0112347483','chcphilips@gmail.com','Working',1),(3,'Charles','Philips','Kurundugahahethepma,Galle','1995-09-13','953453454v','Male','Married','0713233432','0913234342','charlesphil@yahoo.com','Working',1),(4,'Hasitha','Jayarathna','PnJ City,Galle','1994-10-27','948787687v','Male','Married','0773543466','0912286876','hasithajay@gmail.com','Working',1);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventory_management`
--

DROP TABLE IF EXISTS `inventory_management`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inventory_management` (
  `Item_Code` varchar(20) NOT NULL,
  `Item_Name` varchar(50) NOT NULL,
  `Avalible_Quantity` int(11) NOT NULL,
  `Stock` int(11) NOT NULL,
  `Cost_Per_Item` double NOT NULL,
  `Supplier_name` varchar(50) NOT NULL,
  `Expire_Date` date NOT NULL,
  `Issue_Date` date NOT NULL,
  `Customer_Name` varchar(50) NOT NULL,
  PRIMARY KEY (`Item_Name`,`Supplier_name`,`Item_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory_management`
--

LOCK TABLES `inventory_management` WRITE;
/*!40000 ALTER TABLE `inventory_management` DISABLE KEYS */;
INSERT INTO `inventory_management` VALUES ('sda','dsa',434,434,434.34,'fdaf','2016-07-07','2016-01-20','dffs'),('ic56','Isuu',45,100,100,'Lss','2016-11-12','2016-01-10','hjd'),('iu15','lkd',45,89,50,'hjgfd','2016-12-07','2016-07-04','kjkjdgas');
/*!40000 ALTER TABLE `inventory_management` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `issuepaymnet`
--

DROP TABLE IF EXISTS `issuepaymnet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `issuepaymnet` (
  `rname` varchar(100) NOT NULL,
  `pd` date NOT NULL,
  `pn` int(20) NOT NULL AUTO_INCREMENT,
  `amount` decimal(10,0) NOT NULL,
  `bdap` varchar(300) NOT NULL,
  PRIMARY KEY (`pn`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `issuepaymnet`
--

LOCK TABLES `issuepaymnet` WRITE;
/*!40000 ALTER TABLE `issuepaymnet` DISABLE KEYS */;
INSERT INTO `issuepaymnet` VALUES ('sathira','2016-09-10',1,200000,'to buy a new brooms and mopers'),('Sathira kumarasinghe','2016-09-08',2,200000,'    to buy new mopers');
/*!40000 ALTER TABLE `issuepaymnet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jobs`
--

DROP TABLE IF EXISTS `jobs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jobs` (
  `jobID` int(11) NOT NULL AUTO_INCREMENT,
  `CusID` int(11) NOT NULL,
  `location` varchar(20) NOT NULL,
  `date` date NOT NULL,
  `emp` int(11) NOT NULL,
  `gprice` decimal(10,0) NOT NULL,
  PRIMARY KEY (`jobID`),
  KEY `jobID` (`jobID`)
) ENGINE=InnoDB AUTO_INCREMENT=136 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jobs`
--

LOCK TABLES `jobs` WRITE;
/*!40000 ALTER TABLE `jobs` DISABLE KEYS */;
INSERT INTO `jobs` VALUES (2,1,'metro 15th floor','2016-09-28',5,4792),(3,2,'lads','2015-03-03',2,300),(103,901,'seeduwa','2016-08-15',9,0),(104,5,'ks','2016-08-02',12,99),(106,5,'ks','2016-08-02',12,99),(107,5,'ks','2016-08-02',12,99),(108,21,'galle','2016-08-08',2,0),(111,21,'angoda','2016-04-01',2,0),(112,0,'malabe','2016-01-02',4,0),(113,3,'ampara','2016-04-01',3,1),(114,1,'1','2016-05-05',1,1),(116,3,'uert','2015-08-07',5,750),(117,7,'654','2015-09-06',78,11700),(118,6,'098-','2015-09-05',4,600),(119,32,'home1','2016-04-02',1,150),(120,4,'ew','2015-08-06',5,4600),(121,4,'2nd floor','2019-05-09',7,6440),(122,6,'mlb2','2016-03-03',4,3680),(123,8,'mlb3','2016-03-04',1,920),(124,2,'332','2016-04-07',1,920),(125,9,'mn','2016-01-01',20,18400),(126,4,'mn2','2016-04-02',3,2760),(127,6,'mn','2016-04-02',2,1840),(128,2,'3','2016-04-01',3,2760),(129,3,'mn','2016-04-01',1,920),(130,4,'uo','2016-04-02',7,6440),(131,2,'08u','2016-04-02',7,6440),(132,3,'2nd floor','2016-04-03',6,5520),(133,14,'3rd floor','2016-04-09',6,5520),(134,11,'sliit campus','2016-09-29',7,6708),(135,11,'sliit malabe','2016-09-29',3,2875);
/*!40000 ALTER TABLE `jobs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_details`
--

DROP TABLE IF EXISTS `product_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_details` (
  `Product_Name` varchar(45) NOT NULL,
  `Product_Id` varchar(45) NOT NULL,
  `getPrice` varchar(45) DEFAULT NULL,
  `Price` int(11) NOT NULL,
  `Available_Items` int(11) NOT NULL,
  PRIMARY KEY (`Product_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_details`
--

LOCK TABLES `product_details` WRITE;
/*!40000 ALTER TABLE `product_details` DISABLE KEYS */;
INSERT INTO `product_details` VALUES ('Harpic Large','001l','185',190,42),('Harpic Medium','001m','120',125,18),('Harpic Small','001s','70',75,7),('Detol Large','002l','190',195,8),('Detol Medium','002m','135',140,15),('Detol Small','002s','85',90,23),('Toilat Brush Large','003l','145',150,15),('Toilat Brush Medium','003m','110',115,27),('Toilat Brush Small','003s','75',80,45),('Hand Wash Large','004l','145',150,22),('Hand Wash Medium','004m','120',125,15),('Hand Wash Small','004s','95',110,25);
/*!40000 ALTER TABLE `product_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `RoleID` int(11) NOT NULL AUTO_INCREMENT,
  `RoleName` char(30) NOT NULL,
  `Description` char(100) DEFAULT NULL,
  `role_status` char(10) NOT NULL DEFAULT 'Active',
  PRIMARY KEY (`RoleID`),
  UNIQUE KEY `RoleName` (`RoleName`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'Manager','Takes care of the management issues of the company','Active'),(2,'Admin','Handles the administration purposes of the company\n','Active'),(3,'DEO','Enters data in to the system of the company','Active'),(4,'Permanent Cleaner','Works for the company permanently','Active'),(5,'Driver','Fulfills the transportation issues of the company','Active');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salary`
--

DROP TABLE IF EXISTS `salary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `salary` (
  `SalaryID` int(11) NOT NULL AUTO_INCREMENT,
  `RoleID` int(11) NOT NULL,
  `BasicSalary` decimal(8,2) DEFAULT NULL,
  `EPF` float DEFAULT NULL,
  `ETF` float DEFAULT NULL,
  `No_of_Leaves_for_no_pay` int(11) NOT NULL,
  PRIMARY KEY (`SalaryID`),
  UNIQUE KEY `RoleID` (`RoleID`),
  CONSTRAINT `salary_ibfk_1` FOREIGN KEY (`RoleID`) REFERENCES `role` (`RoleID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salary`
--

LOCK TABLES `salary` WRITE;
/*!40000 ALTER TABLE `salary` DISABLE KEYS */;
INSERT INTO `salary` VALUES (1,1,60000.00,10,10,30),(2,4,25000.00,10,10,30);
/*!40000 ALTER TABLE `salary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sales`
--

DROP TABLE IF EXISTS `sales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sales` (
  `Product_Id` varchar(45) NOT NULL DEFAULT '',
  `Product_Name` varchar(45) NOT NULL,
  `Price` varchar(45) NOT NULL,
  `Quantity` varchar(45) NOT NULL,
  `Isue_Date` varchar(45) NOT NULL,
  `Customer_Name` varchar(45) NOT NULL,
  `Level` varchar(45) DEFAULT NULL,
  `Discount` varchar(45) DEFAULT NULL,
  `Tot_Amount` varchar(45) NOT NULL,
  `Return_Items` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Product_Id`,`Customer_Name`,`Isue_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sales`
--

LOCK TABLES `sales` WRITE;
/*!40000 ALTER TABLE `sales` DISABLE KEYS */;
INSERT INTO `sales` VALUES ('','','','','2016-8-12','','Choose Level','','',NULL),('','','','','2016-8-7','kamal','Choose Level','','',NULL),('001l','Harpic Large','190','18','2016-8-10','akila','Choose Level','10','3410','2'),('001l','Harpic Large','190','4','2016-8-11','ananda','Choose Level','10','750','1'),('001l','Harpic Large','190','5','2016-8-10','aruna','Choose Level','10','940',NULL),('001l','Harpic Large','190','4','2016-8-10','aruni','Choose Level','10','750','1'),('001l','Harpic Large','190','5','2016-8-11','aruni','Choose Level','10','940',NULL),('001l','Harpic Large','190','7','2016-8-11','avs1','Choose Level','10','1320',NULL),('001l','Harpic Large','190','35','2016-8-10','bandula','Choose Level','34','6616',NULL),('001l','Harpic Large','190','2','2016-8-10','kali','Choose Level','23','357',NULL),('001l','Harpic Large','190','5','2016-8-11','kanda','Choose Level','12','938',NULL),('001l','Harpic Large','190','5','2016-8-10','kavidu','Choose Level','10','940',NULL),('001l','Harpic Large','190','3','2016-8-10','kavinda','Choose Level','10','560','2'),('001l','Harpic Large','190','5','2016-8-11','madahas','Choose Level','10','940',NULL),('001l','Harpic Large','190','5','2016-8-11','mahinda','Choose Level','10','940',NULL),('001l','Harpic Large','190','5','2016-8-11','mahindaa','Choose Level','10','940',NULL),('001l','Harpic Large','190','5','2016-8-11','mashi','Choose Level','10','940',NULL),('001l','Harpic Large','190','5','2016-8-10','sampath','Choose Level','10','940',NULL),('001l','Harpic Large','190','5','2016-8-10','tara','Choose Level','23','927',NULL),('001l','Harpic Large','190','5','2016-8-11','udeni','Choose Level','12','938',NULL),('001m','Harpic Medium','125','','2016-8-12','','Choose Level','','',NULL),('001m','Harpic Medium','125','5','2016-8-10','ads','Choose Level','4','621',NULL),('001m','Harpic_Medium','125','600','2016-07-25','amda','Level 2','45','74955','3'),('001m','Harpic Medium','125','1','2016-8-6','arnald','Choose Level','34','91','1'),('001m','Harpic_Medium','125','24','2016-8-6','asd','Choose Level','23','2977',NULL),('001m','Harpic Medium','125','24','2016-8-7','buddima','Choose Level','23','2977',NULL),('001m','Harpic_Medium','125','2','2016-07-25','ds','Level 1','45','234',NULL),('001m','Harpic_Medium','125','4','2016-8-6','isuru','Choose Level','23','477',NULL),('001m','Harpic Medium','125','20','2016-8-8','mariyan','Choose Level','24','2476','4'),('001m','Harpic Medium','125','24','2016-8-8','mariyan1','Choose Level','24','2976',NULL),('001m','Harpic Medium','125','2','2016-8-10','ranjan','Choose Level','23','227',NULL),('001m','Harpic Medium','125','21','2016-8-8','rejinold','Choose Level','56','2569','3'),('001m','Harpic Medium','125','1','2016-8-12','sasha','Choose Level','12','113',NULL),('001m','Harpic Medium','125','1','2016-8-12','shane','Choose Level','10','115',NULL),('001m','Harpic Medium','125','2','2016-8-18','sthira','Level 1','34','216',NULL),('001m','Harpic Medium','125','10','2016-8-10','sunil','Choose Level','23','1227',NULL),('001m','Harpic Medium','125','2','2016-8-18','Supun','Default Customer','2','248',NULL),('001m','Harpic Medium','125','1','2016-8-22','Supun','Level 4','1','124',NULL),('001s','Harpic_Small','75','3','2016-7-29','','Choose Level','45','180',NULL),('001s','Harpic_Small','75','2','2016-8-5','kamal','Choose Level','3','147',NULL),('001s','Harpic Small','75','5','2016-8-10','kanda','Choose Level','6','369',NULL),('001s','Harpic Small','75','3','2016-8-22','rrr','-Select Customer Level-','22','203',NULL),('001s','Harpic Small','75','2','2016-8-22','Supun','Default Customer','12','138',NULL),('002l','Detol Large','195','1','2016-8-10','rasa','Choose Level','2','193',NULL),('002l','Detol Large','195','1','2016-8-10','tarushi','Choose Level','12','183',NULL),('002m','Detol_Medium','140','4','2016-7-30','','Choose Level','34','526',NULL),('002m','Detol_Medium','140','2','2016-7-29','dada','Choose Level','45','235',NULL),('002m','Detol_Medium','140','2','2016-8-5','saman','Level 3','34','246',NULL);
/*!40000 ALTER TABLE `sales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `supplier` (
  `Supplier_ID` int(4) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Con_Num` int(11) NOT NULL,
  PRIMARY KEY (`Supplier_ID`),
  UNIQUE KEY `Supplier_ID` (`Supplier_ID`),
  UNIQUE KEY `Supplier_ID_2` (`Supplier_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier`
--

LOCK TABLES `supplier` WRITE;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
INSERT INTO `supplier` VALUES (4,'Dssanayake','No 2/4,colombo 8',753124387),(5,'W.S.Premarathna','No 234,colombo 8',770928317),(6,'B.W.D.Senawirathna','No 34,Baththaramulla',705293461),(8,'C.K.Premarathna','No 20/3/4,Kaduwela',760237651),(9,'V.K.Perera','No 251,Athurugiriya',714085761),(10,'S.W.D.Liyanage','No 21,Madawalapaa,Mathale',712938576),(11,'R.P.K.Senarathna','No 29,Pannipitiya',719283648),(12,'T.Y.D.Pathirage','No 29,Boralla',759182746),(13,'W.H.N.Athukorala','No 765,Pannaipitiya',779372491),(14,'C.H.R.Kumarasinghe','NO 435/2,colombo 08',712435167),(15,'A.L.laknath','No 43,Millenuom City,Athurugiriya',116253454),(16,'W,Pathirana','No 21,Kandy Road Colombo',714329452);
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supplier_details_management`
--

DROP TABLE IF EXISTS `supplier_details_management`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `supplier_details_management` (
  `Supplier_ID` varchar(30) NOT NULL,
  `Supplier_Name` varchar(34) NOT NULL,
  `Item_Code` varchar(35) NOT NULL,
  `Item_Name` varchar(35) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Cost_per_Item` float NOT NULL,
  `Supply_date` varchar(35) NOT NULL,
  `Email` varchar(35) NOT NULL,
  `Contact_No` varchar(12) NOT NULL,
  `Address` varchar(35) NOT NULL,
  PRIMARY KEY (`Supplier_ID`,`Supplier_Name`,`Item_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier_details_management`
--

LOCK TABLES `supplier_details_management` WRITE;
/*!40000 ALTER TABLE `supplier_details_management` DISABLE KEYS */;
INSERT INTO `supplier_details_management` VALUES ('23','WDC','ID45','Item 1',3,33,'2016-08-03','DC','333333333','DCWDC'),('454','kljhf','Detol','kkh',80,40,'2016-08-02','njbhvlscd','112489565','fsafagg'),('IJ78','KLHOJHGD','ID45','Item 2',70,45,'2016-09-07','HGOUFOADS','11265432','HOUGUG'),('IR45','kjkgg','ID45','Item 2',45,50,'2016-07-01','hjghsda','112489562','kho;hdugwdw');
/*!40000 ALTER TABLE `supplier_details_management` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `User_Name` varchar(45) NOT NULL,
  `Password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`User_Name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehivle`
--

DROP TABLE IF EXISTS `vehivle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vehivle` (
  `Vehi_Num` varchar(10) NOT NULL,
  `Brand` varchar(50) NOT NULL,
  `Model` varchar(50) NOT NULL,
  `Rate` int(11) DEFAULT NULL,
  `Supplier_ID` int(4) NOT NULL,
  PRIMARY KEY (`Vehi_Num`),
  UNIQUE KEY `Vehi_Num` (`Vehi_Num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehivle`
--

LOCK TABLES `vehivle` WRITE;
/*!40000 ALTER TABLE `vehivle` DISABLE KEYS */;
INSERT INTO `vehivle` VALUES ('251-8377','Nissan','Caravan',23000,4),('54-3170','Toyota','LH51',34000,0),('55-7645','Nissan','Caravan',25000,0),('56-9954','Toyota','Liteace CM 36',30000,0),('58-4398','Mitsubishi','Delica',20000,0),('HD-6512','Toyota','Hiace 173',22000,10),('HN-6752','Toyota','Hiace 172',42000,0),('PB-0958','Nissan','Lion face vanette',20000,0),('PC-6341','Toyota','KDH 220 Highroof',34000,0),('PC-7872','Subaru','BUDDY VAN',45000,0),('PD-4853','Suzuki','Da64 buddy van auto',25000,0);
/*!40000 ALTER TABLE `vehivle` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-09-23  9:03:38

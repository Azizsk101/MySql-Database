-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: atm
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `atm_data`
--

DROP TABLE IF EXISTS `atm_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `atm_data` (
  `AccountNo` int NOT NULL,
  `PIN` int NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Balance` double NOT NULL,
  PRIMARY KEY (`AccountNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atm_data`
--

LOCK TABLES `atm_data` WRITE;
/*!40000 ALTER TABLE `atm_data` DISABLE KEYS */;
INSERT INTO `atm_data` VALUES (100001,1111,'Abdul Aziz Kalsekar',98925.80000000006),(100002,2222,'Zaheem Abdulla',8.999999999999996),(100003,3333,'Anas Khan',5590),(100004,4444,'Ryan Alex',768.8000000000001),(999999,1234,'Manager',0);
/*!40000 ALTER TABLE `atm_data` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atm_data2`
--

DROP TABLE IF EXISTS `atm_data2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `atm_data2` (
  `AccountNo` int NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Balance` double NOT NULL,
  `WithdrawAmount` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atm_data2`
--

LOCK TABLES `atm_data2` WRITE;
/*!40000 ALTER TABLE `atm_data2` DISABLE KEYS */;
INSERT INTO `atm_data2` VALUES (100004,'Ryan Alex',859,50),(100002,'Zaheem Abdulla',25.399999999999995,10),(100003,'Anas Khan',5745.8,250),(100001,'Abdul Aziz Kalsekar',99672.00000000003,30),(100004,'Ryan Alex',826.2,40),(100003,'Anas Khan',5663.8,100),(100001,'Abdul Aziz Kalsekar',99639.20000000004,20),(100001,'Abdul Aziz Kalsekar',99590.00000000004,40),(100003,'Anas Khan',5598.2,50),(100003,'Anas Khan',5590,10),(100004,'Ryan Alex',768.8000000000001,70),(100002,'Zaheem Abdulla',17.199999999999996,10),(100001,'SAbdul Aziz Kalsekar',99590.00000000004,0),(100002,'Zaheem Abdulla',8.999999999999996,10),(100001,'Abdul Aziz Kalsekar',99467.00000000004,150),(100001,'Abdul Aziz Kalsekar',99450.60000000005,20),(100001,'Abdul Aziz Kalsekar',99450.60000000005,0),(100001,'Abdul Aziz Kalsekar',99409.60000000005,50),(100001,'Abdul Aziz Kalsekar',99393.20000000006,20),(100001,'Abdul Aziz Kalsekar',99393.20000000006,0),(100001,'Abdul Aziz Kalsekar',99368.60000000005,30),(100002,'Zaheem Abdulla',8.999999999999996,0),(100001,'Abdul Aziz Kalsekar',99163.60000000005,250),(100001,'Abdul Aziz Kalsekar',99147.20000000006,20),(100001,'Abdul Aziz Kalsekar',99122.60000000005,30),(100001,'Abdul Aziz Kalsekar',99114.40000000005,10),(100001,'Abdul Aziz Kalsekar',99057.00000000006,70),(100001,'Abdul Aziz Kalsekar',98983.20000000006,90),(100001,'Abdul Aziz Kalsekar',98925.80000000006,70);
/*!40000 ALTER TABLE `atm_data2` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-07  3:54:19

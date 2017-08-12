-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Aug 10, 2017 at 03:04 PM
-- Server version: 5.6.34-log
-- PHP Version: 7.1.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `test`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_airplane`
--

CREATE TABLE `tbl_airplane` (
  `airid` int(11) NOT NULL,
  `country` varchar(20) NOT NULL,
  `airplane` varchar(20) NOT NULL,
  `status` varchar(8) NOT NULL,
  `flightName` varchar(10) NOT NULL,
  `flightNum` varchar(5) NOT NULL,
  `date` varchar(10) NOT NULL,
  `time` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_airplane`
--

INSERT INTO `tbl_airplane` (`airid`, `country`, `airplane`, `status`, `flightName`, `flightNum`, `date`, `time`) VALUES
(1, 'Germany', 'Germany Airline', 'IN TIME', 'MVK800', 'VS4KK', '08/08/2017', '10:00'),
(2, 'France', 'France Airline', 'DELAY', 'JGK6890', 'LS021', '08/08/2017', '12:00'),
(3, 'Italy', 'Air Dolomiti', 'IN TIME', 'TNG358', 'DJD98', '08/10/2017', '23:00'),
(4, 'Canada', 'Air Inuit', 'In Time', 'FDS56', 'adlja', '08/09/2017', '10'),
(5, 'Egypt', 'Air Cairo', 'IN TIME', 'FET676', 'GLY56', '09/08/2017', '20:00'),
(6, 'Dubai', 'Air Arabia', 'IN TIME', 'HJJH56', 'DF098', '09/08/2017', '20:00'),
(7, 'Germany', 'Lufthansa', 'IN TIME', 'KLO986', 'JY876', '08/16/2017', '13:30'),
(8, 'Germany', 'Air Berlin', 'DELAY', 'JUG575', 'JGU56', '09/23/2017', '03:45'),
(9, 'Germany', 'Germania', 'DELAY', 'JKHG54', 'OTE45', '08/08/2017', '12:20'),
(10, 'Germany', 'Avanti Air', 'IN TIME', 'JGLK34', 'AAD45', '09/21/2017', '07:00'),
(11, 'Germany', 'Hahn Air', 'IN TIME', 'HGY456', '5GYT7', '08/17/2017', '14:00'),
(12, 'France', 'Aigle Azur', 'IN TIME', 'JHG45', '466TT', '08/27/2017', '09:45'),
(13, 'France', 'Air Corsica', 'DELAY', 'GUJG4', '7H8UU', '08/11/2017', '14:45'),
(14, 'France', 'OpenSkies', 'IN TIME', 'UJGIU', '7H8UU', '08/11/2017', '23:30'),
(15, 'France', 'Finist\'air', 'IN TIME', '4JFG67', '7G6JH', '08/11/2017', '01:30'),
(16, 'Italy', 'Meridiana', 'IN TIME', 'HUI3O8', 'K2U3H', '09/01/2017', '02:00'),
(17, 'Italy', 'Air Dolomiti', 'DELAY', 'Y333G', 'IIHG8', '09/01/2017', '17:00'),
(18, 'Italy', 'Alitalia CityLiner', 'IN TIME', '77756T', 'GIUH6', '09/02/2017', '12:40'),
(19, 'Italy', 'Cargolux Italia', 'IN TIME', 'KUGIIU', 'G70H6', '09/04/2017', '17:40'),
(20, 'Italy', 'Ernest Airlines', 'DELAY', 'KHG333', 'FEF56', '09/04/2017', '19:40'),
(21, 'Canada', 'Air Canada Jetz', 'DELAY', 'EEG45', '65KK7', '08/09/2017', '20:00'),
(22, 'Canada', 'Air Canada', 'IN TIME', 'KJ44G4', 'FEG5', '08/12/2017', '23:30'),
(23, 'Canada', 'Air Georgian', 'IN TIME', 'JUY66I', '76OOI', '08/19/2017', '7:30'),
(24, 'Canada', 'Air Montmagny', 'DELAY', 'KUGO56', 'L5HG5', '08/21/2017', '9:30'),
(25, 'Canada', 'Air Montmagny', 'IN TIME', 'KUGO56', 'L5HG5', '08/21/2017', '9:30'),
(26, 'Egypt', 'EgyptAir', 'IN TIME', 'KKR558', 'YJKJ5', '08/08/2017', '23:00'),
(27, 'Egypt', 'EgyptAir', 'IN TIME', 'OIH567', '56R7G', '08/27/2017', '12:00'),
(28, 'Egypt', 'Nile Air', 'IN TIME', 'IUG56', 'K555G', '08/17/2017', '12:00'),
(29, 'Egypt', 'Air Sinai', 'DELAY', 'HTHT55', 'EWY5I', '08/19/2017', '21:00'),
(30, 'Egypt', 'EgyptAir Express', 'IN TIME', 'IO45H6', 'JJY44', '08/6/2017', '15:00'),
(31, 'Dubai', 'Rotana Jet', 'IN TIME', 'KJGJ565', 'UHUI6', '09/11/2017', '22:00'),
(32, 'Dubai', 'Emirates', 'IN TIME', 'HKLT876', 'KUI76', '09/12/2017', '2:00'),
(33, 'Dubai', 'Flydubai', 'IN TIME', 'FEUUY768', 'LFEY0', '09/19/2017', '11:25'),
(34, 'Dubai', 'Etihad Airways', 'DELAY', 'HLO987', 'LYT56', '09/25/2017', '16:20'),
(35, 'Dubai', 'Air Arabia', 'IN TIME', 'AKL567', 'DKL56', '09/27/2017', '19:30');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `id` int(11) NOT NULL,
  `uname` varchar(20) NOT NULL,
  `fName` varchar(10) NOT NULL,
  `lName` varchar(10) NOT NULL,
  `email` varchar(50) NOT NULL,
  `account` varchar(20) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `country` varchar(10) NOT NULL,
  `pass` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`id`, `uname`, `fName`, `lName`, `email`, `account`, `phone`, `country`, `pass`) VALUES
(1, 'Ishtiak Ahmed', 'Ishtiak', 'Ahmed', 'info@gmail.com', '123-456-789', '+8801234567', 'Bangladesh', '12345'),
(8, 'Datt', 'Anik', 'Datta', 'datt@gmail.com', '123-454-545', '1244355', 'Google', '12345'),
(9, 'Tushar Khan', 'Tushar', 'Khan', 'kq@gma.com', '667574353', 'r3644656465', 'hdjah', '12345');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_airplane`
--
ALTER TABLE `tbl_airplane`
  ADD PRIMARY KEY (`airid`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_airplane`
--
ALTER TABLE `tbl_airplane`
  MODIFY `airid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;
--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

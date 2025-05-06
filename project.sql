-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 05, 2019 at 09:30 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project`
--

-- --------------------------------------------------------

--
-- Table structure for table `club`
--

CREATE TABLE `club` (
  `C_Name` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `C_info` varchar(500) COLLATE utf8mb4_unicode_ci NOT NULL,
  `T_Player` int(3) NOT NULL,
  `T_coach` int(3) NOT NULL,
  `T_Staff` int(3) NOT NULL,
  `C_Sponsor` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `coach`
--

CREATE TABLE `coach` (
  `C_id` int(10) NOT NULL,
  `C_Name` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `C_Experience` int(5) NOT NULL,
  `C_Nationality` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `C_Careerinfo` varchar(250) COLLATE utf8mb4_unicode_ci NOT NULL,
  `C_DOB` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `C_Time` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `C_Speciality` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `C_Salary` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `C_Password` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `coach`
--

INSERT INTO `coach` (`C_id`, `C_Name`, `C_Experience`, `C_Nationality`, `C_Careerinfo`, `C_DOB`, `C_Time`, `C_Speciality`, `C_Salary`, `C_Password`) VALUES
(1111, 'Tom Moddy', 20, 'Australian', 'Coached Srilankan National Team from 2016-2018.Also Coached IPL & Big Bash League', '02-10-1965', '08-10 AM', 'Batting', '3,00,000/=', '11111'),
(1112, 'Stuart Law', 12, 'Australian', 'coached Bangladesh (2011–2012) and WestIndies cricket teams (2018-2019) through a difficult time', '18-10-1968', '10-12 PM', 'Batting', '2,00,000/=', 'lawcricket2019'),
(1113, 'Jonty Rhodes', 15, 'South African', 'Coached Mumbai Indian for  (2013-2018) also trained south african naitonal team', '27-07-1969', '12-2PM', 'Fielding', '5,00,000/=', 'Jonty.fire'),
(1114, 'Gary  Kirsten', 12, 'South African', 'coached indian national cricket team (2008-2011) and played a significant role for wining ICC world cup 2011 trophy for india.', '23-11-1967', '2-4PM', 'General(head)', '8,00,000/=', 'kristen8790'),
(1115, 'Sunil  Joshi', 7, 'Indian', 'coached Bangladesh cricket team (2015-)', '06-06-1970', '4-5PM', 'Spinner', '1,50,000/=', 'joshi.bcci'),
(1116, 'Wasim Akram', 9, 'Pakistani', 'coached in kolkata knight riders from (2010-), also current coached in lahore whites', '03-06-1966', '5-6PM', 'Seamer', '6,00,000/=', 'wasim.pakistan');

-- --------------------------------------------------------

--
-- Table structure for table `fixture`
--

CREATE TABLE `fixture` (
  `F_Time` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `F_Club1` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `F_Club2` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `ground`
--

CREATE TABLE `ground` (
  `G_id` int(10) NOT NULL,
  `G_Name` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `G_Phone` int(11) NOT NULL,
  `G_Email` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `G_Time` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `G_Capacity` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `G_Location` varchar(25) COLLATE utf8mb4_unicode_ci NOT NULL,
  `G_Cost` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `ground`
--

INSERT INTO `ground` (`G_id`, `G_Name`, `G_Phone`, `G_Email`, `G_Time`, `G_Capacity`, `G_Location`, `G_Cost`) VALUES
(4441, '', 0, '', '', '', '', ''),
(4442, '', 0, '', '', '', '', ''),
(4443, '', 0, '', '', '', '', ''),
(4444, '', 0, '', '', '', '', ''),
(4445, '', 0, '', '', '', '', ''),
(4446, '', 0, '', '', '', '', ''),
(4447, '', 0, '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `notice`
--

CREATE TABLE `notice` (
  `N_Id` int(10) NOT NULL,
  `N_Message` varchar(500) COLLATE utf8mb4_unicode_ci NOT NULL,
  `N_Time` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `notice`
--

INSERT INTO `notice` (`N_Id`, `N_Message`, `N_Time`) VALUES
(12, 'sdssssssssssssssss', 'dsddsd'),
(2, 'test notice', '5-2-2019'),
(1, 'Hi test', '2/5/2019');

-- --------------------------------------------------------

--
-- Table structure for table `odi`
--

CREATE TABLE `odi` (
  `ID` int(10) NOT NULL,
  `MATCHES` int(4) NOT NULL,
  `RUNS` int(5) NOT NULL,
  `50s` int(3) NOT NULL,
  `100s` int(3) NOT NULL,
  `HIGHEST SCORE` int(3) NOT NULL,
  `INNINGS` int(4) NOT NULL,
  `WICKETS` int(4) NOT NULL,
  `BEST FIGURE` varchar(6) NOT NULL,
  `5W` int(2) NOT NULL,
  `ECO RATE` float(3,2) NOT NULL,
  `CATCHES` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `odi`
--

INSERT INTO `odi` (`ID`, `MATCHES`, `RUNS`, `50s`, `100s`, `HIGHEST SCORE`, `INNINGS`, `WICKETS`, `BEST FIGURE`, `5W`, `ECO RATE`, `CATCHES`) VALUES
(1111, 214, 7095, 62, 22, 157, 201, 0, 'N/A', 0, 0.00, 406),
(1112, 177, 6775, 62, 28, 162, 158, 0, 'N/A', 0, 0.00, 521),
(1113, 245, 5935, 33, 2, 121, 220, 0, 'N/A', 0, 0.00, 733),
(1114, 218, 4756, 42, 19, 136, 202, 0, 'N/A', 0, 0.00, 400),
(1115, 154, 809, 1, 0, 58, 71, 388, '6/31', 12, 4.21, 231),
(1116, 327, 1203, 2, 0, 61, 285, 471, '7/29', 19, 4.67, 290),
(2221, 188, 5096, 27, 8, 154, 179, 0, 'N/A', 0, 0.00, 242),
(2222, 200, 5344, 24, 6, 201, 167, 0, 'N/A', 0, 0.00, 226),
(2223, 132, 3963, 19, 9, 142, 118, 27, '2/29', 0, 7.34, 168),
(2224, 36, 1132, 12, 3, 127, 35, 42, '4/36', 0, 4.56, 27),
(2225, 47, 1208, 8, 1, 109, 45, 51, '3/19', 0, 6.12, 52),
(2226, 40, 768, 5, 1, 100, 38, 42, '4/19', 0, 6.63, 23),
(2227, 269, 998, 4, 0, 69, 198, 487, '6/42', 9, 5.71, 322),
(2228, 145, 2335, 7, 2, 119, 129, 188, '5/37', 5, 5.55, 200),
(2229, 88, 206, 0, 0, 22, 57, 105, '6/23', 4, 4.11, 33),
(2230, 33, 1023, 12, 3, 128, 32, 0, ' N/A', 0, 0.00, 23),
(2231, 255, 8778, 42, 10, 172, 213, 233, '5/45', 3, 4.45, 305),
(2232, 21, 578, 6, 1, 102, 19, 0, 'N/A', 0, 0.00, 16),
(2233, 28, 723, 7, 1, 100, 25, 21, '3/8', 0, 4.23, 12),
(2234, 3, 109, 0, 0, 34, 3, 4, '2/4', 0, 3.33, 1),
(2235, 200, 4021, 26, 13, 188, 176, 0, 'N/A', 0, 0.00, 336),
(2236, 266, 1205, 6, 0, 66, 219, 289, '6/29', 9, 4.69, 208),
(2237, 138, 148, 0, 0, 23, 87, 196, '6/23', 5, 5.56, 87),
(2238, 123, 2389, 11, 3, 148, 108, 36, '3/39', 0, 6.12, 72),
(2239, 188, 5897, 36, 9, 158, 153, 0, '', 0, 0.00, 242),
(2240, 205, 5879, 33, 13, 162, 0, 0, 'N/A', 0, 0.00, 243);

-- --------------------------------------------------------

--
-- Table structure for table `player`
--

CREATE TABLE `player` (
  `P_id` int(10) NOT NULL,
  `P_Name` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `P_Nationality` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `P_Height` varchar(6) COLLATE utf8mb4_unicode_ci NOT NULL,
  `P_Weight` int(3) NOT NULL,
  `P_Time` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `P_Batstyle` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `P_Bowlstyle` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `P_speciality` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `P_DOB` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `P_type` varchar(8) COLLATE utf8mb4_unicode_ci NOT NULL,
  `P_Salary` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `P_Password` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `player`
--

INSERT INTO `player` (`P_id`, `P_Name`, `P_Nationality`, `P_Height`, `P_Weight`, `P_Time`, `P_Batstyle`, `P_Bowlstyle`, `P_speciality`, `P_DOB`, `P_type`, `P_Salary`, `P_Password`) VALUES
(2221, 'Tamim Iqbal', 'Bangladeshi', '5\'8\"', 75, '8-10AM', 'Left Hand', 'N/A', 'Batting', '24-03-1988', 'Paid', '2,00,000/=', '12345'),
(2222, 'Mushfiqur Rahim', 'Bangladeshi', '5\'4\"', 60, '8-10AM', 'Right Hand', 'N/A', 'Keeping Batsman', '29-06-1989', 'Paid', '90,000/=', 'bcwiuv44'),
(2223, 'Coling Munro', 'Newzeland', '5\'10\"', 80, '8-10AM', 'Left Hand', 'N/A', 'Batting', '15-06-1985', 'Paid', '1,50,000/=', '47543'),
(2224, 'Abdur Rahman ', 'Bangladeshi', '5\'8\"', 75, '2-4PM', 'Right Hand', 'Right Hand', 'All-Rounder', '07-04-1996', 'Trainee', '50,000/=', '543877h'),
(2225, 'Faisal Mahmud Anik', 'Bangladeshi', '5\'8\"', 76, '2-4PM', 'Right Hand', 'Right Hand', 'All-Rounder', '23-04-1996', 'Trainee', '50,000/=', 'Anik'),
(2226, 'Rifat  Bin Aziz', 'Bangladeshi', '5\'10\"', 80, '2-4PM', 'Right Hand', 'Right Hand', 'All-Rounder', '01-01-1998', 'Trainee', '50,000/=', 'R777'),
(2227, 'MIcheal Starc', 'Australian', '6\'2\"', 90, '5-6PM', 'Left Hand', 'Left Hand', 'Seamer', '13-09-1983', 'Paid', '1,00,000/=', '95698'),
(2228, 'Adam Zampa', 'Australian', '5\'9\"', 75, '4-5PM', 'Left Hand', 'Right Hand', 'Spinner', '24-05-1987', 'Paid', '1,50,000/=', 'jkahk6'),
(2229, 'Mustafizur Rahman', 'Bangladeshi', '5\'8\"', 70, '5-6PM', 'Left Hand', 'Left Hand', 'Seamer', '20-06-1994', 'Trainee', '1,50,000/=', 'Fizz90'),
(2230, 'Mehedi Maruf', 'Bangladeshi', '5\'7\"', 65, '8-10AM', 'Right Hand', 'N/A', 'Batting', '25-10-1991', 'Paid', '70,000/=', 'shkhsg888'),
(2231, 'Mohammad Hafeez', 'Pakistani', '5\'8\"', 65, '2-4PM', 'Right Hand', 'Right Hand', 'All-Rounder', '18-11-1986', 'Paid', '1,00,000/=', 'haf123'),
(2232, 'Fawaz Ahmed', 'Pakistani', '5\'7\"', 65, '8-10AM', 'Right Hand', 'N/A', 'Batting', '06-05-1987', 'Trainee', '80,000/=', 'F7878'),
(2233, 'Erfanul Haque', 'Bangladeshi', '5\'7\"', 70, '2-4PM', 'Left Hand', 'Right Hand', 'All-Rounder', '29-02-1992', 'Trainee', '50,000/=', 'B.baria'),
(2234, 'Swagoto paul', 'Bangladeshi', '5\'0\"', 53, '2-4PM', 'Right Hand', 'Right Hand', 'All-Rounder', '14-02-1997', 'Trainee', '50,000/=', 'paul070708'),
(2235, 'David Miller', 'South African', '6\'0\"', 85, '8-10AM', 'Left Hand', 'N/A', 'Batting', '27-01-1985', 'Paid', '2,00,000/=', '76547'),
(2236, 'Mashrafe Bin Mortaza', 'Bangladeshi', '6\'1\"', 84, '5-6PM', 'Right Hand', 'Right Hand', 'Seamer', '06-10-1983', 'Paid', '2,50,000/=', 'Mash54321'),
(2237, 'Rubel Hossain', 'Bangladeshi', '5\'10\"', 75, '5-6PM', 'Right Hand', 'Right Hand', 'Seamer', '12-11-1990', 'Trainee', '1,50,000/=', 'R.happy'),
(2238, 'Soumya Sarker', 'Bangladeshi', '5\'8\"', 75, '10-12PM', 'Left Hand', 'Right Hand', 'All-Rounder', '06-10-1983', 'Trainee', '1,00,000/=', 'Sarker59'),
(2239, 'Jos Buttler', 'English', '5\'9\"', 70, '10-12PM', 'Right Hand', 'N/A', 'Batting', '06-10-1983', 'Trainee', '2,00,000/=', 'Butler7683'),
(2240, 'Joe Root', 'English', '6\'0\"', 80, '10-12PM', 'Right Hand', 'N/A', 'Batting', '21-08-1990', 'Trainee', '1,50,000/=', '7093root');

-- --------------------------------------------------------

--
-- Table structure for table `playingxi`
--

CREATE TABLE `playingxi` (
  `X_id` int(3) NOT NULL,
  `X_Data` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `playingxi`
--

INSERT INTO `playingxi` (`X_id`, `X_Data`) VALUES
(1, 2221),
(2, 2222),
(3, 2223),
(4, 2224),
(5, 2225),
(6, 2226),
(7, 2227),
(8, 2230),
(9, 2229),
(10, 2230),
(11, 2231);

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `S_id` int(11) NOT NULL,
  `S_Name` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `S_Nationality` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `S_DOB` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `S_Experience` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `S_Time` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `S_Speciality` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `S_Salary` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `S_Password` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`S_id`, `S_Name`, `S_Nationality`, `S_DOB`, `S_Experience`, `S_Time`, `S_Speciality`, `S_Salary`, `S_Password`) VALUES
(3331, 'Maruf Ahmed', 'Bangladeshi', '28-09-1997', '4 year as groundsman in MCG', '8AM-5PM', 'Groundsman', '20,000/=', 'Maruf777'),
(3332, 'Sifat Hasan Adib', 'Bangladeshi', '28-12-1997', '5 year as groundsman in SBNCS', '8AM-5PM', 'Groundsman', '20,000/=', 'Sifat9898'),
(3333, 'Fariha Mahzabin', 'Bangladeshi', '21-07-1998', '3 years working at PRAN', '8AM-5PM', 'Accountant', '70,000/=', 'Azaz.Fariha'),
(3334, 'Aziz Ahmed ', 'Bangladeshi', '22-08-1996', 'Managerr at 4 coporate companies ', '8AM-5PM', 'Manager', '1,00,000/=', 'N.Aziz777'),
(3335, 'Naemul Hasan', 'Bangladeshi', '26-07-1997', '7 years as physician', '8AM-5PM', 'Physician', '60,000/=', 'Neamul2390'),
(3336, 'Yousuf Pranto', 'Bangladeshi', '09-10-1996', '1 year', '8-12PM', 'Bowl Boy', '15,000/=', 'Yusuf12390'),
(3337, 'Seikh Sadiq', 'Bangladeshi', '24-12-1997', '1 year', '8-12PM', 'Bowl Boy', '15,000/=', 'Sadiq2019'),
(3338, 'Evan Ahmed', 'Bangladeshi', '15-03-1998', '2 years', '8AM-5PM', 'Water Boy', '10,000/=', 'Barisal2121');

-- --------------------------------------------------------

--
-- Table structure for table `suggest`
--

CREATE TABLE `suggest` (
  `Sugg_p` varchar(20) NOT NULL,
  `Sugg_by` varchar(20) NOT NULL,
  `Serial` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `t20`
--

CREATE TABLE `t20` (
  `ID` int(10) NOT NULL,
  `MATCHES` int(4) NOT NULL,
  `RUNS` int(5) NOT NULL,
  `50s` int(3) NOT NULL,
  `100s` int(3) NOT NULL,
  `HIGHEST SCORE` int(3) NOT NULL,
  `INNINGS` int(4) NOT NULL,
  `WICKETS` int(4) NOT NULL,
  `BEST FIGURE` varchar(6) NOT NULL,
  `5W` int(2) NOT NULL,
  `ECO RATE` float(3,2) NOT NULL,
  `CATCHES` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t20`
--

INSERT INTO `t20` (`ID`, `MATCHES`, `RUNS`, `50s`, `100s`, `HIGHEST SCORE`, `INNINGS`, `WICKETS`, `BEST FIGURE`, `5W`, `ECO RATE`, `CATCHES`) VALUES
(1111, 197, 7095, 54, 13, 123, 175, 0, 'N/A', 0, 0.00, 387),
(1112, 156, 4985, 46, 13, 119, 142, 0, 'N/A', 0, 0.00, 323),
(1113, 169, 5939, 26, 2, 103, 150, 0, 'N/A', 0, 0.00, 266),
(1114, 185, 3698, 40, 10, 123, 156, 0, 'N/A', 0, 0.00, 210),
(1115, 162, 900, 1, 0, 58, 71, 388, '6/31', 12, 4.21, 231),
(1116, 327, 1203, 2, 0, 61, 285, 471, '7/29', 19, 4.67, 290),
(2221, 200, 4009, 27, 3, 127, 179, 0, 'N/A', 0, 0.00, 142),
(2222, 201, 4344, 24, 6, 101, 167, 0, 'N/A', 0, 0.00, 216),
(2223, 92, 2963, 19, 2, 142, 118, 27, '2/29', 0, 7.34, 138),
(2224, 25, 1236, 16, 4, 127, 35, 42, '4/36', 0, 4.56, 24),
(2225, 47, 1208, 8, 1, 109, 45, 51, '3/19', 0, 6.12, 52),
(2226, 30, 798, 5, 1, 100, 38, 42, '4/19', 0, 6.63, 29),
(2227, 169, 1098, 5, 0, 79, 198, 487, '6/42', 9, 5.71, 302),
(2228, 136, 2458, 8, 2, 103, 129, 169, '5/30', 4, 5.55, 159),
(2229, 80, 690, 0, 0, 22, 57, 105, '5/23', 4, 4.11, 26),
(2230, 33, 1023, 12, 3, 128, 32, 0, ' N/A', 0, 0.00, 23),
(2231, 198, 6987, 32, 6, 137, 175, 196, '5/45', 2, 4.32, 291),
(2232, 26, 56, 9, 1, 102, 19, 0, 'N/A', 0, 0.00, 19),
(2233, 28, 723, 7, 1, 100, 25, 21, '3/8', 0, 4.23, 12),
(2234, 3, 109, 0, 0, 34, 3, 4, '2/4', 0, 3.33, 1),
(2235, 163, 3096, 13, 6, 188, 146, 0, 'N/A', 0, 0.00, 113),
(2236, 196, 805, 2, 0, 66, 219, 289, '6/21', 7, 4.69, 146),
(2237, 121, 136, 0, 0, 16, 56, 196, '5/36', 3, 5.98, 56),
(2238, 112, 1968, 8, 1, 100, 97, 36, '3/39', 0, 5.23, 61),
(2239, 158, 4589, 35, 2, 106, 123, 0, '', 0, 0.00, 229),
(2240, 205, 5879, 33, 13, 162, 0, 0, 'N/A', 0, 0.00, 243);

-- --------------------------------------------------------

--
-- Table structure for table `temp_player`
--

CREATE TABLE `temp_player` (
  `P_id` int(10) NOT NULL,
  `P_Name` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `P_Nationality` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `P_Height` varchar(6) COLLATE utf8mb4_unicode_ci NOT NULL,
  `P_Weight` int(3) NOT NULL,
  `P_Time` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `P_Batstyle` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `P_Bowlstyle` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `P_speciality` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `P_DOB` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `test`
--

CREATE TABLE `test` (
  `ID` int(10) NOT NULL,
  `MATCHES` int(4) NOT NULL,
  `RUNS` int(5) NOT NULL,
  `50s` int(3) NOT NULL,
  `100s` int(3) NOT NULL,
  `HIGHEST SCORE` int(3) NOT NULL,
  `INNINGS` int(4) NOT NULL,
  `WICKETS` int(4) NOT NULL,
  `BEST FIGURE` varchar(6) NOT NULL,
  `5W` int(2) NOT NULL,
  `ECO RATE` float(3,2) NOT NULL,
  `CATCHES` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `test`
--

INSERT INTO `test` (`ID`, `MATCHES`, `RUNS`, `50s`, `100s`, `HIGHEST SCORE`, `INNINGS`, `WICKETS`, `BEST FIGURE`, `5W`, `ECO RATE`, `CATCHES`) VALUES
(1111, 156, 8069, 49, 19, 198, 208, 0, 'N/A', 0, 0.00, 487),
(1112, 152, 5897, 53, 23, 153, 158, 0, 'N/A', 0, 0.00, 456),
(1113, 245, 5935, 33, 2, 121, 220, 0, 'N/A', 0, 0.00, 733),
(1114, 218, 4756, 42, 19, 136, 202, 0, 'N/A', 0, 0.00, 400),
(1115, 154, 809, 1, 0, 58, 71, 388, '6/31', 12, 4.21, 231),
(1116, 327, 1203, 2, 0, 61, 285, 471, '7/29', 19, 4.67, 290),
(2221, 198, 6987, 25, 11, 206, 316, 0, 'N/A', 0, 0.00, 262),
(2222, 156, 6944, 30, 6, 256, 229, 0, 'N/A', 0, 0.00, 500),
(2223, 135, 4063, 12, 6, 159, 220, 27, '6/98', 0, 7.34, 168),
(2224, 20, 1332, 8, 3, 127, 35, 42, '4/36', 0, 4.56, 20),
(2225, 35, 1108, 8, 1, 109, 45, 51, '4/29', 0, 6.12, 62),
(2226, 40, 768, 5, 1, 100, 38, 42, '4/19', 0, 6.63, 23),
(2227, 189, 1623, 5, 0, 87, 218, 487, '6/42', 9, 5.71, 269),
(2228, 112, 2498, 8, 3, 139, 187, 188, '6/69', 3, 5.55, 223),
(2229, 60, 706, 0, 0, 29, 87, 105, '6/23', 4, 4.11, 33),
(2230, 33, 1023, 12, 3, 128, 32, 0, ' N/A', 0, 0.00, 23),
(2231, 255, 8778, 42, 10, 172, 213, 233, '5/45', 3, 4.45, 305),
(2232, 21, 578, 6, 1, 102, 19, 0, 'N/A', 0, 0.00, 16),
(2233, 28, 723, 7, 1, 100, 25, 21, '3/8', 0, 4.23, 12),
(2234, 3, 109, 0, 0, 34, 3, 4, '2/4', 0, 3.33, 1),
(2235, 200, 4021, 26, 13, 188, 176, 0, 'N/A', 0, 0.00, 336),
(2236, 266, 1205, 6, 0, 66, 219, 289, '6/29', 9, 4.69, 208),
(2237, 138, 148, 0, 0, 23, 87, 196, '6/23', 5, 5.56, 87),
(2238, 123, 2389, 11, 3, 148, 108, 36, '3/39', 0, 6.12, 72),
(2239, 188, 5897, 36, 9, 158, 153, 0, '', 0, 0.00, 242),
(2240, 205, 5879, 33, 13, 162, 0, 0, 'N/A', 0, 0.00, 243);

-- --------------------------------------------------------

--
-- Table structure for table `tground`
--

CREATE TABLE `tground` (
  `G_Name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `G_Phone` varchar(11) COLLATE utf8mb4_unicode_ci NOT NULL,
  `G_Email` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `G_Time` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `G_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `club`
--
ALTER TABLE `club`
  ADD PRIMARY KEY (`C_Name`);

--
-- Indexes for table `coach`
--
ALTER TABLE `coach`
  ADD PRIMARY KEY (`C_id`);

--
-- Indexes for table `ground`
--
ALTER TABLE `ground`
  ADD PRIMARY KEY (`G_id`);

--
-- Indexes for table `odi`
--
ALTER TABLE `odi`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `player`
--
ALTER TABLE `player`
  ADD PRIMARY KEY (`P_id`);

--
-- Indexes for table `playingxi`
--
ALTER TABLE `playingxi`
  ADD PRIMARY KEY (`X_id`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`S_id`);

--
-- Indexes for table `suggest`
--
ALTER TABLE `suggest`
  ADD PRIMARY KEY (`Serial`);

--
-- Indexes for table `t20`
--
ALTER TABLE `t20`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `temp_player`
--
ALTER TABLE `temp_player`
  ADD PRIMARY KEY (`P_id`);

--
-- Indexes for table `test`
--
ALTER TABLE `test`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `tground`
--
ALTER TABLE `tground`
  ADD UNIQUE KEY `G_id` (`G_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `suggest`
--
ALTER TABLE `suggest`
  MODIFY `Serial` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `temp_player`
--
ALTER TABLE `temp_player`
  MODIFY `P_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tground`
--
ALTER TABLE `tground`
  MODIFY `G_id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

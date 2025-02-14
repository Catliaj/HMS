-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 14, 2025 at 11:51 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `goldenfields_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `booking_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `room_id` int(11) NOT NULL,
  `check_in_date` date NOT NULL,
  `check_out_date` date NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`booking_id`, `user_id`, `room_id`, `check_in_date`, `check_out_date`, `status`) VALUES
(1, 4, 8, '2025-01-20', '2025-01-21', 'Cancelled'),
(2, 6, 7, '2025-01-28', '2025-01-30', 'Checked-out'),
(3, 6, 7, '2025-01-20', '2025-01-25', 'Cancelled'),
(4, 7, 9, '2025-01-15', '2025-01-18', 'Checked-in'),
(5, 4, 6, '2024-12-24', '2024-12-29', 'Confirmed'),
(6, 7, 10, '2025-02-02', '2025-02-04', 'Confirmed'),
(7, 4, 1, '2025-01-12', '2025-01-15', 'Cancelled'),
(8, 8, 1, '2025-02-11', '2025-02-15', 'Checked-out'),
(9, 6, 4, '2025-01-23', '2025-01-24', 'Checked-out'),
(10, 7, 15, '2024-12-21', '2024-12-23', 'Confirmed'),
(11, 6, 1, '2024-12-21', '2024-12-25', 'Cancelled'),
(12, 6, 2, '2024-12-30', '2025-01-03', 'Confirmed'),
(13, 4, 15, '2025-01-08', '2025-01-09', 'Cancelled'),
(14, 9, 5, '2025-01-07', '2025-01-09', 'Confirmed'),
(15, 4, 9, '2025-02-07', '2025-02-11', 'Checked-in'),
(16, 9, 3, '2025-01-30', '2025-02-04', 'Checked-out'),
(17, 9, 8, '2025-02-05', '2025-02-08', 'Confirmed'),
(18, 5, 10, '2025-01-01', '2025-01-06', 'Cancelled'),
(19, 5, 7, '2025-02-10', '2025-02-13', 'Checked-out'),
(20, 8, 2, '2024-12-25', '2024-12-27', 'Checked-out'),
(21, 7, 3, '2025-02-08', '2025-02-09', 'Checked-out'),
(22, 6, 5, '2025-01-30', '2025-02-02', 'Cancelled'),
(23, 8, 13, '2025-01-17', '2025-01-20', 'Checked-out'),
(24, 7, 11, '2025-02-05', '2025-02-07', 'Cancelled'),
(25, 8, 5, '2025-02-11', '2025-02-16', 'Checked-in'),
(26, 6, 2, '2025-01-22', '2025-01-24', 'Checked-out'),
(27, 9, 5, '2024-12-26', '2024-12-28', 'Checked-out'),
(28, 4, 1, '2025-01-29', '2025-01-31', 'Checked-in'),
(29, 7, 6, '2025-01-07', '2025-01-12', 'Checked-in'),
(30, 6, 9, '2025-01-07', '2025-01-08', 'Checked-in'),
(31, 5, 6, '2024-12-31', '2025-01-02', 'Checked-in'),
(32, 8, 5, '2025-01-02', '2025-01-05', 'Confirmed'),
(33, 9, 8, '2025-01-04', '2025-01-07', 'Checked-out'),
(34, 5, 10, '2025-02-08', '2025-02-09', 'Checked-out'),
(35, 8, 13, '2025-02-04', '2025-02-06', 'Confirmed'),
(36, 7, 4, '2025-01-03', '2025-01-07', 'Confirmed'),
(37, 9, 9, '2024-12-26', '2024-12-27', 'Cancelled'),
(38, 5, 5, '2025-01-21', '2025-01-22', 'Confirmed'),
(39, 4, 5, '2025-01-18', '2025-01-20', 'Cancelled'),
(40, 6, 5, '2025-01-10', '2025-01-11', 'Checked-out'),
(41, 4, 10, '2025-01-28', '2025-01-29', 'Checked-in'),
(42, 7, 10, '2025-02-13', '2025-02-15', 'Checked-in'),
(43, 4, 4, '2025-01-31', '2025-02-04', 'Cancelled'),
(44, 5, 1, '2024-12-28', '2024-12-31', 'Checked-out'),
(45, 4, 1, '2025-02-06', '2025-02-08', 'Confirmed'),
(46, 5, 4, '2025-01-08', '2025-01-10', 'Checked-out'),
(47, 5, 11, '2024-12-23', '2024-12-26', 'Cancelled'),
(48, 4, 3, '2024-12-26', '2024-12-29', 'Cancelled'),
(49, 9, 10, '2025-01-24', '2025-01-26', 'Checked-out'),
(50, 8, 7, '2025-01-01', '2025-01-02', 'Checked-out'),
(51, 7, 7, '2025-01-11', '2025-01-16', 'Confirmed'),
(52, 8, 7, '2025-01-18', '2025-01-19', 'Checked-out'),
(53, 4, 2, '2025-01-25', '2025-01-29', 'Checked-out'),
(54, 6, 9, '2024-12-23', '2024-12-25', 'Confirmed'),
(55, 4, 2, '2025-01-15', '2025-01-16', 'Cancelled'),
(56, 4, 5, '2024-12-21', '2024-12-25', 'Confirmed'),
(57, 8, 7, '2024-12-20', '2024-12-21', 'Checked-out'),
(58, 5, 4, '2025-01-18', '2025-01-22', 'Checked-in'),
(59, 4, 5, '2025-01-23', '2025-01-26', 'Confirmed'),
(60, 5, 9, '2025-01-02', '2025-01-04', 'Confirmed'),
(61, 5, 4, '2025-02-05', '2025-02-10', 'Cancelled'),
(62, 8, 13, '2024-12-28', '2024-12-29', 'Confirmed'),
(63, 7, 1, '2025-01-20', '2025-01-22', 'Confirmed'),
(64, 9, 3, '2025-01-01', '2025-01-04', 'Checked-in'),
(65, 4, 4, '2024-12-23', '2024-12-26', 'Checked-out'),
(66, 6, 10, '2025-01-19', '2025-01-23', 'Checked-in'),
(67, 6, 10, '2025-01-07', '2025-01-12', 'Cancelled'),
(68, 9, 7, '2024-12-25', '2024-12-27', 'Checked-out'),
(69, 5, 8, '2024-12-23', '2024-12-26', 'Checked-out'),
(70, 4, 4, '2025-01-28', '2025-01-29', 'Confirmed'),
(71, 8, 4, '2025-01-15', '2025-01-17', 'Cancelled'),
(72, 5, 9, '2024-12-18', '2024-12-20', 'Cancelled'),
(73, 8, 7, '2025-01-05', '2025-01-10', 'Checked-in'),
(74, 6, 8, '2025-01-12', '2025-01-14', 'Checked-in'),
(75, 6, 1, '2025-01-04', '2025-01-05', 'Checked-out'),
(76, 9, 11, '2024-12-19', '2024-12-22', 'Checked-in'),
(77, 4, 8, '2025-01-15', '2025-01-18', 'Confirmed'),
(78, 8, 8, '2024-12-19', '2024-12-20', 'Checked-out'),
(79, 5, 1, '2025-01-06', '2025-01-07', 'Checked-in'),
(80, 9, 5, '2025-02-08', '2025-02-09', 'Cancelled'),
(81, 4, 11, '2025-01-28', '2025-01-29', 'Checked-out'),
(82, 5, 3, '2024-12-22', '2024-12-24', 'Cancelled'),
(83, 5, 9, '2025-01-24', '2025-01-29', 'Checked-out'),
(84, 4, 2, '2025-02-07', '2025-02-11', 'Confirmed'),
(85, 9, 1, '2025-01-01', '2025-01-02', 'Checked-in'),
(86, 6, 8, '2025-01-28', '2025-01-29', 'Cancelled'),
(87, 5, 1, '2025-01-24', '2025-01-28', 'Checked-in'),
(88, 9, 5, '2025-02-05', '2025-02-07', 'Cancelled'),
(89, 9, 7, '2025-02-06', '2025-02-07', 'Checked-out'),
(90, 4, 4, '2024-12-28', '2025-01-02', 'Checked-in'),
(91, 9, 7, '2024-12-18', '2024-12-19', 'Checked-out'),
(92, 9, 3, '2025-02-11', '2025-02-12', 'Checked-out'),
(93, 5, 2, '2024-12-18', '2024-12-19', 'Cancelled'),
(94, 9, 7, '2025-02-08', '2025-02-09', 'Checked-in'),
(95, 4, 12, '2024-12-19', '2024-12-24', 'Checked-in'),
(96, 6, 9, '2025-01-31', '2025-02-04', 'Cancelled'),
(97, 8, 7, '2025-01-03', '2025-01-04', 'Checked-in'),
(98, 4, 10, '2024-12-19', '2024-12-21', 'Confirmed'),
(99, 7, 11, '2025-02-09', '2025-02-11', 'Cancelled'),
(100, 8, 1, '2025-01-16', '2025-01-18', 'Checked-in'),
(101, 5, 6, '2025-01-29', '2025-01-31', 'Checked-in'),
(102, 5, 3, '2025-01-23', '2025-01-26', 'Confirmed'),
(103, 7, 4, '2025-01-25', '2025-01-27', 'Checked-in'),
(104, 4, 6, '2025-01-03', '2025-01-04', 'Checked-in'),
(105, 4, 2, '2025-01-05', '2025-01-10', 'Confirmed'),
(106, 7, 10, '2025-01-17', '2025-01-18', 'Checked-in'),
(107, 8, 9, '2024-12-28', '2024-12-31', 'Confirmed'),
(108, 4, 8, '2025-01-22', '2025-01-25', 'Cancelled'),
(109, 4, 13, '2025-01-31', '2025-02-02', 'Confirmed'),
(110, 6, 2, '2025-02-01', '2025-02-06', 'Checked-out'),
(111, 9, 7, '2025-02-01', '2025-02-04', 'Checked-in'),
(112, 8, 3, '2025-01-05', '2025-01-07', 'Cancelled'),
(113, 4, 11, '2024-12-30', '2025-01-02', 'Confirmed'),
(114, 7, 4, '2025-01-12', '2025-01-13', 'Checked-out'),
(115, 4, 5, '2025-01-13', '2025-01-15', 'Confirmed'),
(116, 5, 10, '2024-12-22', '2024-12-24', 'Checked-in'),
(117, 8, 5, '2024-12-19', '2024-12-20', 'Cancelled'),
(118, 6, 4, '2024-12-18', '2024-12-20', 'Cancelled'),
(119, 7, 6, '2025-01-20', '2025-01-23', 'Cancelled'),
(120, 4, 2, '2024-12-23', '2024-12-24', 'Checked-in'),
(121, 4, 4, '2024-12-21', '2024-12-22', 'Cancelled'),
(122, 9, 13, '2025-01-09', '2025-01-11', 'Confirmed'),
(123, 7, 10, '2024-12-25', '2024-12-29', 'Checked-out'),
(124, 8, 5, '2024-12-30', '2025-01-01', 'Checked-out'),
(125, 7, 1, '2025-02-02', '2025-02-05', 'Checked-in'),
(126, 6, 10, '2025-01-30', '2025-02-01', 'Checked-out'),
(127, 4, 1, '2025-01-08', '2025-01-11', 'Cancelled'),
(128, 5, 10, '2025-02-05', '2025-02-07', 'Checked-in'),
(129, 4, 6, '2025-02-05', '2025-02-07', 'Cancelled'),
(130, 5, 7, '2024-12-23', '2024-12-24', 'Checked-out'),
(131, 6, 7, '2024-12-30', '2024-12-31', 'Confirmed'),
(132, 4, 10, '2025-02-10', '2025-02-11', 'Cancelled'),
(133, 4, 10, '2025-01-15', '2025-01-16', 'Cancelled'),
(134, 4, 6, '2025-02-02', '2025-02-03', 'Checked-out'),
(135, 7, 14, '2024-12-21', '2024-12-24', 'Confirmed'),
(136, 8, 2, '2025-01-17', '2025-01-21', 'Checked-out'),
(137, 6, 8, '2024-12-31', '2025-01-03', 'Confirmed'),
(138, 8, 7, '2025-01-26', '2025-01-27', 'Cancelled'),
(139, 8, 5, '2025-02-03', '2025-02-04', 'Cancelled'),
(140, 7, 2, '2025-02-12', '2025-02-14', 'Checked-out'),
(141, 5, 7, '2024-12-28', '2024-12-29', 'Checked-in'),
(142, 5, 9, '2025-01-21', '2025-01-23', 'Checked-out'),
(143, 9, 8, '2025-02-01', '2025-02-02', 'Cancelled'),
(144, 7, 1, '2024-12-18', '2024-12-20', 'Checked-in'),
(145, 6, 8, '2025-01-08', '2025-01-09', 'Checked-out'),
(146, 4, 10, '2025-01-13', '2025-01-14', 'Cancelled'),
(147, 7, 9, '2025-01-11', '2025-01-13', 'Checked-out'),
(148, 8, 8, '2024-12-29', '2024-12-30', 'Checked-out'),
(149, 8, 10, '2024-12-30', '2024-12-31', 'Checked-out'),
(150, 4, 1, '2025-02-09', '2025-02-10', 'Checked-in'),
(151, 6, 4, '2025-02-11', '2025-02-12', 'Checked-in'),
(152, 9, 2, '2025-01-12', '2025-01-13', 'Checked-out'),
(153, 8, 9, '2025-01-19', '2025-01-20', 'Cancelled'),
(154, 4, 3, '2025-01-17', '2025-01-19', 'Cancelled'),
(155, 5, 3, '2025-01-11', '2025-01-16', 'Checked-out'),
(156, 7, 5, '2025-01-16', '2025-01-17', 'Checked-out'),
(157, 8, 3, '2025-01-27', '2025-01-28', 'Checked-out'),
(158, 8, 8, '2025-02-11', '2025-02-12', 'Checked-in'),
(159, 7, 9, '2025-02-05', '2025-02-06', 'Confirmed'),
(160, 9, 8, '2025-01-30', '2025-01-31', 'Checked-out'),
(161, 4, 3, '2025-02-14', '2025-02-16', 'Confirmed'),
(162, 9, 6, '2025-02-09', '2025-02-12', 'Cancelled'),
(163, 5, 6, '2024-12-19', '2024-12-21', 'Checked-in'),
(164, 4, 9, '2025-01-05', '2025-01-06', 'Confirmed'),
(165, 9, 3, '2025-01-20', '2025-01-22', 'Cancelled'),
(166, 9, 11, '2025-02-13', '2025-02-16', 'Cancelled'),
(167, 4, 3, '2024-12-19', '2024-12-20', 'Checked-out'),
(168, 9, 12, '2025-01-12', '2025-01-16', 'Checked-out'),
(169, 9, 2, '2024-12-21', '2024-12-22', 'Confirmed'),
(170, 7, 9, '2025-01-09', '2025-01-10', 'Cancelled'),
(171, 9, 5, '2025-01-27', '2025-01-28', 'Checked-in'),
(172, 8, 12, '2024-12-31', '2025-01-03', 'Checked-out'),
(173, 4, 8, '2025-02-03', '2025-02-04', 'Checked-in'),
(174, 8, 6, '2025-01-13', '2025-01-18', 'Confirmed'),
(175, 4, 3, '2025-01-08', '2025-01-09', 'Confirmed'),
(176, 6, 3, '2024-12-30', '2024-12-31', 'Checked-out'),
(177, 6, 3, '2025-02-05', '2025-02-06', 'Confirmed'),
(178, 6, 13, '2025-01-26', '2025-01-27', 'Confirmed'),
(179, 6, 2, '2024-12-28', '2024-12-29', 'Cancelled'),
(180, 9, 15, '2025-01-16', '2025-01-17', 'Checked-out'),
(181, 4, 8, '2025-01-10', '2025-01-11', 'Checked-in'),
(182, 9, 8, '2025-02-09', '2025-02-10', 'Confirmed'),
(183, 8, 8, '2024-12-21', '2024-12-22', 'Confirmed'),
(184, 5, 6, '2025-01-05', '2025-01-06', 'Cancelled'),
(185, 8, 6, '2025-02-13', '2025-02-14', 'Checked-out'),
(186, 4, 15, '2025-02-08', '2025-02-12', 'Checked-out'),
(187, 9, 6, '2025-01-26', '2025-01-28', 'Checked-in'),
(188, 5, 6, '2025-01-24', '2025-01-25', 'Checked-out'),
(189, 6, 11, '2025-01-05', '2025-01-10', 'Confirmed'),
(190, 8, 9, '2024-12-21', '2024-12-22', 'Cancelled'),
(191, 6, 1, '2024-12-26', '2024-12-27', 'Checked-in'),
(192, 8, 14, '2025-01-18', '2025-01-19', 'Confirmed'),
(193, 5, 13, '2025-02-09', '2025-02-10', 'Cancelled'),
(194, 5, 8, '2024-12-27', '2024-12-28', 'Checked-out'),
(195, 5, 12, '2025-02-08', '2025-02-11', 'Checked-out'),
(196, 7, 11, '2025-01-12', '2025-01-16', 'Confirmed'),
(197, 8, 11, '2025-01-31', '2025-02-02', 'Cancelled'),
(198, 8, 2, '2025-01-30', '2025-01-31', 'Checked-in'),
(199, 8, 13, '2025-01-21', '2025-01-24', 'Checked-out'),
(200, 8, 6, '2024-12-22', '2024-12-23', 'Confirmed');

-- --------------------------------------------------------

--
-- Table structure for table `rooms`
--

CREATE TABLE `rooms` (
  `room_id` int(11) NOT NULL,
  `room_type` varchar(50) NOT NULL,
  `price` double NOT NULL,
  `avail_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `rooms`
--

INSERT INTO `rooms` (`room_id`, `room_type`, `price`, `avail_status`) VALUES
(1, 'Single', 250, 'available'),
(2, 'Single', 2500, 'Available'),
(3, 'Single', 300, 'Available'),
(4, 'Single', 300, 'Available'),
(5, 'Single', 250, 'Out of Order'),
(6, 'Double', 800, 'Available'),
(7, 'Double', 800, 'Available'),
(8, 'Double', 800, 'Available'),
(9, 'Double', 750, 'Available'),
(10, 'Double', 750, 'Available'),
(11, 'Premium Suite', 2000, 'Available'),
(12, 'Premium Suite', 2000, 'Available'),
(13, 'Premium Suite', 2000, 'Out of Order'),
(14, 'Deluxe Penthouse', 7500, 'Unavailable'),
(15, 'Deluxe Penthouse', 7500, 'Available');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL,
  `user_name` varchar(50) NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `middle_initial` char(25) NOT NULL,
  `surname` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phone_number` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `role` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `user_name`, `first_name`, `middle_initial`, `surname`, `email`, `phone_number`, `password`, `role`) VALUES
(1, 'aj', 'Catli', 'E', 'Catli', 'ajcatli@gmail.com', '0987-983-8871', 'walkingdead', 'clerk'),
(2, 'ara', 'Aravheiyl', 'B', 'Felicisimo', 'arafelicisimo@gmail.com', '0923-617-2377', 'shot', 'clerk'),
(3, 'red', 'Jared Jeffrey', 'A', 'Abellera', 'jaredabellera@gmail.com', '0969-4465890', 'river', 'clerk'),
(4, 'dave', 'David', 'A', 'Kushner', 'davidkushner@gmail.com', '0972-851-9928', 'darkerside', 'customer'),
(5, 'matt', 'Matthew', 'S', 'Rife', 'mattrife@gmail.com', '0951-677-8264', 'crowdwork', 'customer'),
(6, 'river', 'Robert', 'J', 'Lardizabal', 'robertlardi@gmail.com', '0972-726-9764', 'designer', 'customer'),
(7, 'abi', 'Abi', 'L', 'Marquez', 'abimarquez@gmail.com', '0963-737-7372', 'lumpia', 'customer'),
(8, 'mini', 'Milo', 'M', 'Rossi', 'milorossi@gmail.com', '0973-274-0284', 'miniminuteman', 'customer'),
(9, 'nick', 'Kit', 'S', 'Connor', 'kitconnor@gmail.com', '0936-374-6542', 'charlie', 'customer');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`booking_id`),
  ADD KEY `fk_users` (`user_id`),
  ADD KEY `fk_rooms` (`room_id`);

--
-- Indexes for table `rooms`
--
ALTER TABLE `rooms`
  ADD PRIMARY KEY (`room_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `booking`
--
ALTER TABLE `booking`
  MODIFY `booking_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=201;

--
-- AUTO_INCREMENT for table `rooms`
--
ALTER TABLE `rooms`
  MODIFY `room_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `booking`
--
ALTER TABLE `booking`
  ADD CONSTRAINT `fk_rooms` FOREIGN KEY (`room_id`) REFERENCES `rooms` (`room_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_users` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

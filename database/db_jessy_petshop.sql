-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 05, 2024 at 02:30 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_jessy_petshop`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_barang`
--

CREATE TABLE `tb_barang` (
  `kd_barang` varchar(20) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `harga` mediumint(8) UNSIGNED NOT NULL,
  `stok` tinyint(3) UNSIGNED NOT NULL,
  `kd_jenis` char(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_barang`
--

INSERT INTO `tb_barang` (`kd_barang`, `nama_barang`, `harga`, `stok`, `kd_jenis`) VALUES
('121213234', 'bananasnana', 5858, 90, 'PRD002'),
('123123', 'saidboys X Reta', 500000, 123, 'BRG002'),
('6', 'nabilo', 10000, 10, 'PRD002'),
('8994125000439', 'Beauty 1 kg', 30000, 25, 'PRD001'),
('8994125000507', 'Me-O  1,1 kg', 55000, 20, 'PRD001'),
('PSR0001', 'Pasir Hay Bro', 5500, 73, 'BRG002');

-- --------------------------------------------------------

--
-- Table structure for table `tb_detail_transaksi`
--

CREATE TABLE `tb_detail_transaksi` (
  `nota_produk` char(10) NOT NULL,
  `kd_barang` varchar(20) NOT NULL,
  `diskon` int(11) NOT NULL,
  `jumlah_beli` tinyint(3) UNSIGNED NOT NULL,
  `sub_total` mediumint(8) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tb_master_barang`
--

CREATE TABLE `tb_master_barang` (
  `kd_jenis` char(6) NOT NULL,
  `jenis_barang` varchar(30) NOT NULL,
  `satuan` varchar(15) NOT NULL,
  `min_stok` tinyint(3) UNSIGNED NOT NULL,
  `max_stok` tinyint(3) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_master_barang`
--

INSERT INTO `tb_master_barang` (`kd_jenis`, `jenis_barang`, `satuan`, `min_stok`, `max_stok`) VALUES
('BRG001', 'Perlengkapan', 'Unit', 5, 12),
('BRG002', 'Pasir', 'Litter', 50, 100),
('PRD001', 'Produk Kemasan', 'Pcs', 10, 40),
('PRD002', 'Makanan Kiloan', 'Kg', 10, 30);

-- --------------------------------------------------------

--
-- Table structure for table `tb_master_user`
--

CREATE TABLE `tb_master_user` (
  `kd_user` char(6) NOT NULL,
  `jenis_user` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_master_user`
--

INSERT INTO `tb_master_user` (`kd_user`, `jenis_user`) VALUES
('ADM01', 'admin'),
('KSR01', 'kasir'),
('OWN01', 'owner');

-- --------------------------------------------------------

--
-- Table structure for table `tb_member`
--

CREATE TABLE `tb_member` (
  `id_member` char(10) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `nomor_hp` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_member`
--

INSERT INTO `tb_member` (`id_member`, `nama`, `nomor_hp`) VALUES
('-', 'NON MEMBER', '-'),
('2312230001', 'Abana', '081393810391'),
('2312230002', 'Reta Alkhudri', '0987623434');

-- --------------------------------------------------------

--
-- Table structure for table `tb_transaksi`
--

CREATE TABLE `tb_transaksi` (
  `nota_produk` char(10) NOT NULL,
  `tanggal` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `id_user` char(10) NOT NULL,
  `id_member` char(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_transaksi`
--

INSERT INTO `tb_transaksi` (`nota_produk`, `tanggal`, `id_user`, `id_member`) VALUES
('0000.01', '2024-01-04 12:55:02', 'KSR-001', '-'),
('0000.02', '2024-01-04 12:57:37', 'KSR-001', '-'),
('0000.03', '2024-01-04 12:59:15', 'KSR-001', '-'),
('0000.04', '2024-01-04 12:59:57', 'KSR-001', '-'),
('0000.05', '2024-01-04 13:30:48', 'KSR-001', '-'),
('0000.06', '2024-01-04 13:32:03', 'KSR-001', '-'),
('0000.07', '2024-01-04 13:33:16', 'KSR-001', '-'),
('0000.08', '2024-01-04 13:37:54', 'KSR-001', '-'),
('0000.09', '2024-01-04 13:38:51', 'KSR-001', '-'),
('0000.10', '2024-01-04 13:39:17', 'KSR-001', '-'),
('0000.11', '2024-01-04 13:39:55', 'KSR-001', '-'),
('0000.12', '2024-01-04 13:40:37', 'KSR-001', '-'),
('0000.13', '2024-01-04 13:42:31', 'KSR-001', '-'),
('0000.14', '2024-01-04 13:42:54', 'KSR-001', '-'),
('0000.15', '2024-01-04 13:46:12', 'KSR-001', '-'),
('0000.16', '2024-01-04 13:48:06', 'KSR-001', '-'),
('0000.17', '2024-01-04 13:49:32', 'KSR-001', '-'),
('0000.18', '2024-01-04 13:57:31', 'KSR-001', '-');

-- --------------------------------------------------------

--
-- Table structure for table `tb_user`
--

CREATE TABLE `tb_user` (
  `id_user` char(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(60) NOT NULL,
  `kd_user` char(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_user`
--

INSERT INTO `tb_user` (`id_user`, `username`, `password`, `kd_user`) VALUES
('ADM-001', 'said', '356a192b7913b04c54574d18c28d46e6395428ab', 'ADM01'),
('KSR-001', 'yoga', '356a192b7913b04c54574d18c28d46e6395428ab', 'KSR01'),
('OWN-001', 'nabil', '356a192b7913b04c54574d18c28d46e6395428ab', 'OWN01');

-- --------------------------------------------------------

--
-- Table structure for table `tb_utility`
--

CREATE TABLE `tb_utility` (
  `logo` varchar(50) DEFAULT NULL,
  `alamat` varchar(150) DEFAULT NULL,
  `nomor_hp` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Stand-in structure for view `view_barang`
-- (See below for the actual view)
--
CREATE TABLE `view_barang` (
`kd_barang` varchar(20)
,`nama_barang` varchar(50)
,`harga` mediumint(8) unsigned
,`stok` tinyint(3) unsigned
,`jenis_barang` varchar(30)
);

-- --------------------------------------------------------

--
-- Structure for view `view_barang`
--
DROP TABLE IF EXISTS `view_barang`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `view_barang`  AS SELECT `tb_barang`.`kd_barang` AS `kd_barang`, `tb_barang`.`nama_barang` AS `nama_barang`, `tb_barang`.`harga` AS `harga`, `tb_barang`.`stok` AS `stok`, `tb_master_barang`.`jenis_barang` AS `jenis_barang` FROM (`tb_barang` join `tb_master_barang`) WHERE `tb_barang`.`kd_jenis` = `tb_master_barang`.`kd_jenis` ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_barang`
--
ALTER TABLE `tb_barang`
  ADD PRIMARY KEY (`kd_barang`),
  ADD KEY `kd_jenis` (`kd_jenis`);

--
-- Indexes for table `tb_detail_transaksi`
--
ALTER TABLE `tb_detail_transaksi`
  ADD KEY `tb_detail_transaksi_ibfk_1` (`nota_produk`),
  ADD KEY `tb_detail_transaksi_ibfk_2` (`kd_barang`);

--
-- Indexes for table `tb_master_barang`
--
ALTER TABLE `tb_master_barang`
  ADD PRIMARY KEY (`kd_jenis`);

--
-- Indexes for table `tb_master_user`
--
ALTER TABLE `tb_master_user`
  ADD PRIMARY KEY (`kd_user`);

--
-- Indexes for table `tb_member`
--
ALTER TABLE `tb_member`
  ADD PRIMARY KEY (`id_member`);

--
-- Indexes for table `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  ADD PRIMARY KEY (`nota_produk`),
  ADD KEY `id_user` (`id_user`),
  ADD KEY `id_member` (`id_member`);

--
-- Indexes for table `tb_user`
--
ALTER TABLE `tb_user`
  ADD PRIMARY KEY (`id_user`),
  ADD KEY `kd_user` (`kd_user`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tb_barang`
--
ALTER TABLE `tb_barang`
  ADD CONSTRAINT `tb_barang_ibfk_1` FOREIGN KEY (`kd_jenis`) REFERENCES `tb_master_barang` (`kd_jenis`);

--
-- Constraints for table `tb_detail_transaksi`
--
ALTER TABLE `tb_detail_transaksi`
  ADD CONSTRAINT `tb_detail_transaksi_ibfk_1` FOREIGN KEY (`nota_produk`) REFERENCES `tb_transaksi` (`nota_produk`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `tb_detail_transaksi_ibfk_2` FOREIGN KEY (`kd_barang`) REFERENCES `tb_barang` (`kd_barang`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  ADD CONSTRAINT `tb_transaksi_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `tb_user` (`id_user`),
  ADD CONSTRAINT `tb_transaksi_ibfk_2` FOREIGN KEY (`id_member`) REFERENCES `tb_member` (`id_member`);

--
-- Constraints for table `tb_user`
--
ALTER TABLE `tb_user`
  ADD CONSTRAINT `tb_user_ibfk_1` FOREIGN KEY (`kd_user`) REFERENCES `tb_master_user` (`kd_user`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

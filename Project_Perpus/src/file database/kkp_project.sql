-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Waktu pembuatan: 09 Feb 2020 pada 19.43
-- Versi server: 10.3.15-MariaDB
-- Versi PHP: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kkp_project`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `buku`
--

CREATE TABLE `buku` (
  `id_buku` varchar(30) NOT NULL,
  `judul` varchar(30) NOT NULL,
  `pengarang` varchar(30) NOT NULL,
  `penerbit` varchar(30) NOT NULL,
  `kategori` varchar(30) NOT NULL,
  `isbn` text NOT NULL,
  `stok` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `buku`
--

INSERT INTO `buku` (`id_buku`, `judul`, `pengarang`, `penerbit`, `kategori`, `isbn`, `stok`) VALUES
('B0001', 'bobo', 'donal', 'gramedia', 'Novel', 'tamvan', 20),
('B0002', 'komik', 'donal', 'erlanggga', 'Tesis', 'Deskripsi', 30),
('B0003', 'naruto', 'dodo', 'jayen', 'Novel', 'tamvan', 40);

-- --------------------------------------------------------

--
-- Struktur dari tabel `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `npm` varchar(30) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `telpon` int(30) NOT NULL,
  `alamat` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `mahasiswa`
--

INSERT INTO `mahasiswa` (`npm`, `nama`, `telpon`, `alamat`) VALUES
('065116299', 'Bayu Junis Pribadi', 0, ''),
('065116300', 'Farhan Driansyah', 0, ''),
('201643500187', 'susi', 219999888, 'jawa barat'),
('201643500198', 'dede', 0, ''),
('201643500199', 'ade', 0, '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pinjaman`
--

CREATE TABLE `pinjaman` (
  `id_pinjam` varchar(30) NOT NULL,
  `npm` varchar(30) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `id_buku` varchar(30) NOT NULL,
  `judul` varchar(30) NOT NULL,
  `jumlah` int(30) NOT NULL,
  `tgl_pinjam` varchar(30) NOT NULL,
  `tgl_balik` varchar(30) NOT NULL,
  `denda` int(30) NOT NULL,
  `status` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pinjaman`
--

INSERT INTO `pinjaman` (`id_pinjam`, `npm`, `nama`, `id_buku`, `judul`, `jumlah`, `tgl_pinjam`, `tgl_balik`, `denda`, `status`) VALUES
('P0001', '065116299', 'Bayu Junis Pribadi', 'B0003', 'Depok', 24, '06 February 2018', '08 February 2018', 0, 'Sudah Kembali'),
('P0002', '065116299', 'Bayu Junis Pribadi', 'B0001', 'Ketamvanan Bayu', 1, '06 Februari 2020', '13 Februari 2020', 0, 'Belum Kembali'),
('P0003', '065116299', 'Bayu Junis Pribadi', 'B0001', 'Ketamvanan Bayu', 3, '07 Februari 2020', '08 Februari 2020', 0, 'Belum Kembali'),
('P0004', '201643500187', 'susi', 'B0001', 'bobo', 10, '06 Februari 2020', '07 Februari 2020', 0, 'Sudah Kembali');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`id_buku`);

--
-- Indeks untuk tabel `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`npm`);

--
-- Indeks untuk tabel `pinjaman`
--
ALTER TABLE `pinjaman`
  ADD PRIMARY KEY (`id_pinjam`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

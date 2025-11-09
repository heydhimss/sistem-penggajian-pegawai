# Sistem Informasi Penggajian Pegawai

## Deskripsi
Sistem Informasi Penggajian Pegawai adalah aplikasi Java yang dirancang untuk menghitung gaji berbagai jenis pegawai dalam sebuah organisasi. Sistem ini menggunakan konsep Object-Oriented Programming (OOP) dengan inheritance dan abstraction.

## Fitur Utama
- Menghitung gaji untuk 3 jenis pegawai:
  - **Pegawai Tetap**: Gaji berdasarkan masa kerja dengan tunjangan lengkap
  - **Pegawai Kontrak**: Gaji tetap dengan tunjangan terbatas  
  - **Pegawai Mitra**: Gaji harian dengan sistem bonus kehadiran
- Interface menu yang user-friendly
- Validasi input pengguna
- Rincian perhitungan gaji yang detail

## Struktur Kelas

### 1. Kelas Anggota (Abstract)
**File**: `Anggota.java`
- **Deskripsi**: Kelas abstrak sebagai superclass untuk semua jenis pegawai
- **Atribut**:
  - `nomorInduk`: Nomor induk pegawai
  - `nama`: Nama lengkap pegawai
  - `status`: Status kepegawaian (Tetap/Kontrak/Mitra)
  - `alamat`: Alamat tempat tinggal
  - `lama`: Lama bekerja dalam **tahun** (contoh: 5 = 5 tahun bekerja)
  - `hadir`: Jumlah hari kehadiran dalam **sebulan** (maksimal 26 hari kerja)
- **Method Utama**:
  - Getter dan Setter untuk semua atribut
  - `jumlahAbsen()`: Menghitung jumlah hari absen
  - `hitungGaji()`: Menghitung gaji pokok (abstract)
  - `hitungTunjangan()`: Menghitung tunjangan (abstract)
  - `hitungPotongan()`: Menghitung potongan (abstract)
  - `hitungTotal()`: Menghitung total gaji bersih (abstract)
  - `isiData()`: Input dan tampil data pegawai (abstract)

### 2. Kelas Tetap
**File**: `Tetap.java`
- **Extends**: `Anggota`
- **Deskripsi**: Implementasi untuk pegawai tetap
- **Sistem Gaji**:
  - Gaji Pokok berdasarkan masa kerja (**dalam tahun**):
    - Kurang dari 5 tahun: Rp 3.000.000
    - 5 sampai 9 tahun: Rp 4.500.000
    - 10 sampai 14 tahun: Rp 6.500.000
    - 15 tahun atau lebih: Rp 10.000.000
  - Tunjangan (per bulan):
    - Tunjangan kehadiran: hari_hadir × Rp 75.000
    - Tunjangan makan: hari_hadir × Rp 25.000
    - Tunjangan tetap: Rp 1.000.000
  - Potongan (per bulan):
    - Potongan absen: jumlah_absen × Rp 100.000
    - Asuransi: 20% dari tunjangan
    - Pajak: 12% dari gaji pokok

### 3. Kelas Kontrak
**File**: `Kontrak.java`
- **Extends**: `Anggota`
- **Deskripsi**: Implementasi untuk pegawai kontrak
- **Sistem Gaji**:
  - Gaji Pokok: Rp 2.500.000 (tetap per bulan, tidak bergantung masa kerja)
  - Tunjangan (per bulan):
    - Tunjangan kehadiran: hari_hadir × Rp 50.000
    - Tunjangan tetap: Rp 500.000
  - Potongan (per bulan):
    - Potongan absen: jumlah_absen × Rp 75.000
    - Asuransi: 10% dari tunjangan
    - Pajak: 8% dari gaji pokok

### 4. Kelas Mitra
**File**: `Mitra.java`
- **Extends**: `Anggota`
- **Deskripsi**: Implementasi untuk pegawai mitra
- **Sistem Gaji**:
  - Gaji Harian: hari_hadir × Rp 100.000 (dibayar per hari kerja)
  - Bonus Kehadiran: Rp 300.000 per bulan (jika hadir ≥ 22 hari dalam sebulan)
  - Potongan (per bulan):
    - Denda absen: jumlah_absen × Rp 50.000
    - Pajak: 5% dari total gaji harian

### 5. Kelas Menu
**File**: `Menu.java`
- **Deskripsi**: Menangani antarmuka pengguna
- **Fitur**:
  - Menu utama dengan 3 pilihan
  - Sub-menu pemilihan jenis pegawai
  - Validasi input pengguna
  - Informasi "About Us"

### 6. Kelas Main
**File**: `Main.java`
- **Deskripsi**: Kelas utama yang menjalankan program
- **Fungsi**: Mengatur alur program dan koordinasi antar objek

### 7. Kelas Rincian
**File**: `Rincian.java`
- **Deskripsi**: Menyimpan komponen perhitungan gaji
- **Atribut**:
  - `pokok`: Gaji pokok
  - `tunjangan`: Total tunjangan
  - `potongan`: Total potongan
  - `total`: Gaji bersih

## Cara Menjalankan Program

### Menggunakan VS Code:
1. Buka VS Code
2. Buka file `Main.java`
3. Klik tombol "Run" (▶️) di atas method `main()`
4. Program akan berjalan di terminal

### Menggunakan Command Line:
```bash
# Compile
javac -d build/classes src/main/*.java

# Run
java -cp build/classes main.Main
```

### Menggunakan NetBeans:
1. Buka NetBeans IDE
2. File → Open Project
3. Pilih folder project
4. Klik kanan project → Run

## Contoh Penggunaan

```
============================
SISTEM INFORMASI AKADEMIK
============================
1) Hitung Gaji Pegawai
2) About us
3) Keluar
Pilih Menu [1/2/3] : 1

Pilih status pegawai

1) Pegawai Tetap
2) Pegawai Kontrak
3) Pegawai Mitra
Pilih Member [1/2/3] : 1

===========================
Rincian gaji pegawai tetap
===========================
NIP              : 412701001
Nama Pegawai     : Andri heryandri
Status Pegawai   : Tetap
Alamat Pegawai   : Ujung Berung
Lama Bekerja (tahun) : 5
Jumlah Kehadiran : 24

=== RINCIAN GAJI ===
Gaji Pokok       : Rp 4500000
Tunjangan        : Rp 3400000
Potongan         : Rp 1220000
Jumlah Absen     : 2 hari
Total Gaji       : Rp 6680000
========================
```

## JavaDoc Documentation

Semua kelas telah dilengkapi dengan dokumentasi JavaDoc yang komprehensif meliputi:
- Deskripsi kelas dan tujuan
- Parameter dan return value untuk setiap method
- Contoh penggunaan
- Relationship antar kelas
- Author dan version information

## Validasi Input

Program melakukan validasi pada:
- Pilihan menu (harus 1-3)
- Jumlah kehadiran (harus 0-26 hari)
- Input numerik untuk mencegah error

## Author
- **Nama**: Dhimas Kurnia Putra Supriyadi
- **NIM**: 10122307
- **Kelas**: CCDP
- **Version**: 1.0
- **Year**: 2024
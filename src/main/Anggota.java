/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 * Kelas abstrak Anggota yang merepresentasikan data pegawai dalam sistem penggajian.
 * Kelas ini menjadi superclass untuk berbagai jenis pegawai seperti Tetap, Kontrak, dan Mitra.
 * 
 * @author dhimas
 * @version 1.0
 * @since 2024
 */
public abstract class Anggota {
    /** Nomor induk pegawai */
    protected int nomorInduk;
    
    /** Nama lengkap pegawai */
    protected String nama;
    
    /** Status kepegawaian (Tetap/Kontrak/Mitra) */
    protected String status;
    
    /** Alamat tempat tinggal pegawai */
    protected String alamat;
    
    /** Lama bekerja pegawai dalam tahun (misal: 5 = 5 tahun bekerja) */
    protected int lama;
    
    /** Jumlah hari kehadiran dalam sebulan */
    protected int hadir;

    /**
     * Mendapatkan nomor induk pegawai
     * @return nomor induk pegawai
     */
    public int getNomorInduk() {
        return nomorInduk;
    }

    /**
     * Mengatur nomor induk pegawai
     * @param nomorInduk nomor induk yang akan diset
     */
    public void setNomorInduk(int nomorInduk) {
        this.nomorInduk = nomorInduk;
    }

    /**
     * Mendapatkan nama lengkap pegawai
     * @return nama lengkap pegawai
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengatur nama lengkap pegawai
     * @param nama nama lengkap yang akan diset
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Mendapatkan status kepegawaian
     * @return status kepegawaian (Tetap/Kontrak/Mitra)
     */
    public String getStatus() {
        return status;
    }

    /**
     * Mengatur status kepegawaian
     * @param status status kepegawaian yang akan diset
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Mendapatkan alamat tempat tinggal pegawai
     * @return alamat tempat tinggal
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * Mengatur alamat tempat tinggal pegawai
     * @param alamat alamat yang akan diset
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * Mendapatkan lama bekerja pegawai dalam tahun
     * @return lama bekerja dalam tahun (contoh: 5 berarti 5 tahun)
     */
    public int getLama() {
        return lama;
    }

    /**
     * Mengatur lama bekerja pegawai dalam tahun
     * @param lama lama bekerja dalam tahun (contoh: input 5 = 5 tahun bekerja)
     */
    public void setLama(int lama) {
        this.lama = lama;
    }

    /**
     * Mendapatkan jumlah hari kehadiran dalam sebulan
     * @return jumlah hari kehadiran
     */
    public int getHadir() {
        return hadir;
    }

    /**
     * Mengatur jumlah hari kehadiran pegawai
     * @param hadir jumlah hari kehadiran (maksimal 26 hari)
     */
    public void setHadir(int hadir) {
        this.hadir = hadir;
    }
    
    /**
     * Method abstrak untuk menampilkan menu (implementasi kosong)
     */
    public void menu(){
        System.out.println("");
    }
    
    /**
     * Method abstrak untuk menghitung jumlah absen pegawai
     * @return jumlah hari absen (default: 0)
     */
    public int jumlahAbsen(){
        return 0;
    } 
    
    /**
     * Method abstrak untuk menghitung gaji pokok pegawai
     * @return gaji pokok dalam rupiah (default: 0)
     */
    public int hitungGaji(){
        return 0;
    }
    
    /**
     * Method abstrak untuk menghitung potongan gaji pegawai
     * @return jumlah potongan dalam rupiah (default: 0)
     */
    public int hitungPotongan(){
        return 0;
    }
    
    /**
     * Method abstrak untuk menghitung tunjangan pegawai
     * @return jumlah tunjangan dalam rupiah (default: 0)
     */
    public int hitungTunjangan(){
        return 0;
    }
    
    /**
     * Method abstrak untuk menghitung total gaji yang diterima pegawai
     * @return total gaji bersih dalam rupiah (default: 0)
     */
    public int hitungTotal(){
        return 0;
    }
    
    /**
     * Method abstrak untuk mengisi dan menampilkan data pegawai
     */
    public void isiData(){
        System.out.println("Data Belum Terisi");
    }
}

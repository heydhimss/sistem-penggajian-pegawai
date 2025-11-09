/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 * Kelas utama (Main) yang berisi method main untuk menjalankan 
 * Sistem Informasi Penggajian Pegawai.
 * 
 * Program ini dapat menghitung gaji untuk 3 jenis pegawai:
 * - Pegawai Tetap: gaji berdasarkan masa kerja dengan tunjangan lengkap
 * - Pegawai Kontrak: gaji tetap dengan tunjangan terbatas
 * - Pegawai Mitra: gaji harian dengan sistem bonus kehadiran
 * 
 * @author dhimas
 * @version 1.0
 * @since 2024
 */
public class Main {

    /**
     * Method utama yang menjalankan program Sistem Informasi Penggajian.
     * 
     * Alur program:
     * 1. Membuat objek Menu untuk navigasi
     * 2. Membuat objek untuk setiap jenis pegawai (Tetap, Kontrak, Mitra)
     * 3. Menampilkan menu dan memproses pilihan pengguna
     * 4. Loop akan berjalan sampai pengguna memilih keluar (menu = 3)
     * 
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        // Inisialisasi objek-objek yang diperlukan
        Menu out = new Menu();
        Tetap kel = new Tetap();
        Kontrak ou= new Kontrak();
        Mitra tampil = new Mitra();
        
        // Tampilkan menu pertama kali
        out.menu();
        
        // Loop utama program
        while(out.getMenu()!= 3){
            if (out.getMenu() == 1) { // Hanya jalankan jika pilih menu 1 (Hitung Gaji)
                if (out.getMenu2()== 1) {
                    kel.isiData(); // Proses data pegawai tetap
                }else if(out.getMenu2() == 2) {
                    ou.isiData(); // Proses data pegawai kontrak
                }else{
                    tampil.isiData(); // Proses data pegawai mitra
                }
            }
            out.menu(); // Tampilkan menu lagi
        }
    }
    
}

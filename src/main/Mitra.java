/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;

/**
 * Kelas Mitra yang merepresentasikan pegawai mitra dalam sistem penggajian.
 * Pegawai mitra dibayar berdasarkan hari kerja (gaji harian) dengan 
 * sistem bonus kehadiran.
 * 
 * @author dhimas
 * @version 1.0
 * @since 2024
 * @see Anggota
 */
public class Mitra extends Anggota {
   /** Scanner untuk input data dari user */
   Scanner in = new Scanner(System.in);
   
   /**
    * Konstruktor untuk membuat objek pegawai mitra.
    * Menginisialisasi data default untuk pegawai mitra.
    */
   public Mitra(){
        super.setNomorInduk(412703045);
        super.setNama("Slamet Riyadi");
        super.setStatus("Mitra");
        super.setAlamat("Antapani");
   }
   
   /**
    * Menghitung jumlah hari absen pegawai mitra.
    * Asumsi: dalam sebulan ada 26 hari kerja.
    * 
    * @return jumlah hari absen (26 - hari hadir)
    */
   public int jumlahAbsen(){
        int Absen;
        Absen = 26 - super.getHadir();
        return Absen;
   }
    
   /**
    * Menghitung gaji pegawai mitra berdasarkan hari kerja.
    * Sistem pembayaran harian: hari_hadir × Rp 100.000 per hari.
    * 
    * @return gaji total berdasarkan hari kerja dalam rupiah
    */
   public int hitungGaji(){
        int Gaji = super.getHadir() * 100000; // Gaji per hari untuk mitra
        return Gaji;
   }
    
   /**
    * Menghitung total potongan gaji pegawai mitra.
    * Komponen potongan:
    * - Denda absen: jumlah_absen × Rp 50.000
    * - Pajak: 5% dari gaji harian
    * 
    * @return total potongan dalam rupiah
    */
   public int hitungPotongan(){
        int potongan;
        potongan = (jumlahAbsen() * 50000) + ((5 * hitungGaji())/100); // Potongan untuk mitra
        return potongan;
   }
    
   /**
    * Menghitung bonus kehadiran untuk pegawai mitra.
    * Bonus diberikan jika kehadiran >= 22 hari dalam sebulan.
    * Bonus kehadiran: Rp 300.000
    * 
    * @return bonus kehadiran dalam rupiah (0 jika tidak memenuhi syarat)
    */
   public int hitungTunjangan(){
        int Tunjangan = 0; // Mitra tidak ada tunjangan tetap
        if(super.getHadir() >= 22) {
            Tunjangan = 300000; // Bonus jika hadir >= 22 hari
        }
        return Tunjangan;
   }
    
   /**
    * Menghitung total gaji bersih yang diterima pegawai mitra.
    * Formula: Gaji Harian + Bonus Kehadiran - Potongan
    * 
    * @return total gaji bersih dalam rupiah
    */
   public int hitungTotal(){
        int total;
        total = hitungGaji() + hitungTunjangan() - hitungPotongan();
        return total;
   }
   
   public void isiData(){
       System.out.println("");
        System.out.println("===========================");
        System.out.println("Rincian gaji pegawai mitra");
        System.out.println("===========================");
        System.out.println("NIP              : "+super.getNomorInduk());
        System.out.println("Nama Pegawai     : "+super.getNama());
        System.out.println("Status Pegawai   : "+super.getStatus());
        System.out.println("Alamat Pegawai   : "+super.getAlamat());
        System.out.print("Lama Bekerja (tahun) : ");super.setLama(in.nextInt());
        System.out.print("Jumlah Kehadiran : ");
        int hadir = in.nextInt();
        while(hadir < 0 || hadir > 26){
            System.out.println("Kehadiran harus antara 0-26 hari!");
            System.out.print("Jumlah Kehadiran : ");
            hadir = in.nextInt();
        }
        super.setHadir(hadir);
        
        // Tampilkan rincian perhitungan
        System.out.println("");
        System.out.println("=== RINCIAN GAJI ===");
        System.out.println("Gaji Harian      : Rp " + hitungGaji());
        System.out.println("Bonus Kehadiran  : Rp " + hitungTunjangan());
        System.out.println("Potongan         : Rp " + hitungPotongan());
        System.out.println("Jumlah Absen     : " + jumlahAbsen() + " hari");
        System.out.println("Total Gaji       : Rp " + hitungTotal());
        System.out.println("========================");
   }
}

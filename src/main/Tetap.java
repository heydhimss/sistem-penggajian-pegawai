/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;

/**
 * Kelas Tetap yang merepresentasikan pegawai tetap dalam sistem penggajian.
 * Pegawai tetap memiliki gaji pokok yang ditentukan berdasarkan lama bekerja,
 * serta mendapat tunjangan dan potongan khusus.
 * 
 * @author dhimas
 * @version 1.0
 * @since 2024
 * @see Anggota
 */
public class Tetap extends Anggota {
    /** Scanner untuk input data dari user */
    Scanner in = new Scanner(System.in);
    
    /**
     * Konstruktor untuk membuat objek pegawai tetap.
     * Menginisialisasi data default untuk pegawai tetap.
     */
    public Tetap(){
        super.setNomorInduk(412701001);
        super.setNama("Andri heryandri");
        super.setStatus("Tetap");
        super.setAlamat("Ujung Berung");
    }
    
    /**
     * Menghitung jumlah hari absen pegawai tetap.
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
     * Menghitung gaji pokok pegawai tetap berdasarkan lama bekerja dalam tahun.
     * Kriteria berdasarkan masa kerja (dalam tahun):
     * - Kurang dari 5 tahun: Rp 3.000.000
     * - 5 sampai 9 tahun: Rp 4.500.000  
     * - 10 sampai 14 tahun: Rp 6.500.000
     * - 15 tahun atau lebih: Rp 10.000.000
     * 
     * @return gaji pokok dalam rupiah
     */
   public int hitungGaji(){
       int Gaji;
       if(super.getLama() < 5){
           Gaji = 3000000;
       }else if(super.getLama() < 10){
           Gaji = 4500000;
       }else if(super.getLama() < 15){
           Gaji = 6500000;
       }else{
           Gaji = 10000000;
       }
       return Gaji;
    }
    
    /**
     * Menghitung total potongan gaji pegawai tetap.
     * Komponen potongan:
     * - Potongan absen: jumlah_absen × Rp 100.000
     * - Potongan asuransi: 20% dari tunjangan
     * - Pajak: 12% dari gaji pokok
     * 
     * @return total potongan dalam rupiah
     */
    public int hitungPotongan(){
        int potongan;
        potongan = (jumlahAbsen() * 100000) + ((20 * hitungTunjangan())/100 ) + ((12 * hitungGaji())/100); 
        return potongan;
    }
    
    /**
     * Menghitung tunjangan pegawai tetap.
     * Komponen tunjangan:
     * - Tunjangan kehadiran: hari_hadir × Rp 75.000
     * - Tunjangan makan: hari_hadir × Rp 25.000
     * - Tunjangan tetap: Rp 1.000.000
     * 
     * @return total tunjangan dalam rupiah
     */
    public int hitungTunjangan(){
        int Tunjangan;
        Tunjangan = (super.getHadir() * 75000)+(super.getHadir() * 25000)+1000000;
        return Tunjangan;
    }
    
    /**
     * Menghitung total gaji bersih yang diterima pegawai tetap.
     * Formula: Gaji Pokok + Tunjangan - Potongan
     * 
     * @return total gaji bersih dalam rupiah
     */
    public int hitungTotal(){
        int total;
        total = hitungTunjangan() + hitungGaji() - hitungPotongan();
        
        return total;
    }
    public void isiData(){
        System.out.println("");
        System.out.println("===========================");
        System.out.println("Rincian gaji pegawai tetap");
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
        System.out.println("Gaji Pokok       : Rp " + hitungGaji());
        System.out.println("Tunjangan        : Rp " + hitungTunjangan());
        System.out.println("Potongan         : Rp " + hitungPotongan());
        System.out.println("Jumlah Absen     : " + jumlahAbsen() + " hari");
        System.out.println("Total Gaji       : Rp " + hitungTotal());
        System.out.println("========================");
    }
    
}

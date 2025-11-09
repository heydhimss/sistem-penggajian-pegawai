/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;

/**
 * Kelas Kontrak yang merepresentasikan pegawai kontrak dalam sistem penggajian.
 * Pegawai kontrak memiliki gaji pokok tetap, dengan tunjangan dan potongan
 * yang berbeda dari pegawai tetap.
 * 
 * @author dhimas
 * @version 1.0
 * @since 2024
 * @see Anggota
 */
public class Kontrak extends Anggota {
    /** Scanner untuk input data dari user */
    Scanner in = new Scanner(System.in);

    /**
     * Konstruktor untuk membuat objek pegawai kontrak.
     * Menginisialisasi data default untuk pegawai kontrak.
     */
    public Kontrak(){
        super.setNomorInduk(412702023);
        super.setNama("Angga Setiyadi");
        super.setStatus("Kontrak");
        super.setAlamat("Cibiru");
    }
    /**
     * Menghitung jumlah hari absen pegawai kontrak.
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
     * Menghitung gaji pokok pegawai kontrak.
     * Gaji pokok pegawai kontrak adalah tetap sebesar Rp 2.500.000.
     * 
     * @return gaji pokok dalam rupiah (Rp 2.500.000)
     */
    public int hitungGaji(){
        int Gaji = 2500000; // Gaji pokok untuk pegawai kontrak
        return Gaji;
    }
    
    /**
     * Menghitung total potongan gaji pegawai kontrak.
     * Komponen potongan:
     * - Potongan absen: jumlah_absen × Rp 75.000
     * - Potongan asuransi: 10% dari tunjangan
     * - Pajak: 8% dari gaji pokok
     * 
     * @return total potongan dalam rupiah
     */
    public int hitungPotongan(){
        int potongan;
        potongan = (jumlahAbsen() * 75000) + ((10 * hitungTunjangan())/100 ) + ((8 * hitungGaji())/100); 
        return potongan;
    }
    
    /**
     * Menghitung tunjangan pegawai kontrak.
     * Komponen tunjangan:
     * - Tunjangan kehadiran: hari_hadir × Rp 50.000
     * - Tunjangan tetap: Rp 500.000
     * 
     * @return total tunjangan dalam rupiah
     */
    public int hitungTunjangan(){
        int Tunjangan;
        Tunjangan = (super.getHadir() * 50000) + 500000; // Tunjangan untuk kontrak
        return Tunjangan;
    }
    
    /**
     * Menghitung total gaji bersih yang diterima pegawai kontrak.
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
        System.out.println("Rincian gaji pegawai kontrak");
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

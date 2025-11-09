/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 * Kelas Rincian yang menyimpan komponen-komponen perhitungan gaji.
 * Kelas ini dapat digunakan untuk menyimpan detail perhitungan gaji
 * seperti gaji pokok, tunjangan, potongan, dan total gaji.
 * 
 * @author dhimas
 * @version 1.0
 * @since 2024
 */
public class Rincian {
    /** Gaji pokok pegawai dalam rupiah */
    protected int pokok;
    
    /** Total tunjangan yang diterima pegawai dalam rupiah */
    protected int tunjangan;
    
    /** Total potongan dari gaji pegawai dalam rupiah */
    protected int potongan;
    
    /** Total gaji bersih yang diterima pegawai dalam rupiah */
    protected int total;

    /**
     * Mendapatkan gaji pokok pegawai
     * @return gaji pokok dalam rupiah
     */
    public int getPokok() {
        return pokok;
    }

    /**
     * Mengatur gaji pokok pegawai
     * @param pokok gaji pokok dalam rupiah
     */
    public void setPokok(int pokok) {
        this.pokok = pokok;
    }

    /**
     * Mendapatkan total tunjangan pegawai
     * @return total tunjangan dalam rupiah
     */
    public int getTunjangan() {
        return tunjangan;
    }

    /**
     * Mengatur total tunjangan pegawai
     * @param tunjangan total tunjangan dalam rupiah
     */
    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    /**
     * Mendapatkan total potongan gaji pegawai
     * @return total potongan dalam rupiah
     */
    public int getPotongan() {
        return potongan;
    }

    /**
     * Mengatur total potongan gaji pegawai
     * @param potongan total potongan dalam rupiah
     */
    public void setPotongan(int potongan) {
        this.potongan = potongan;
    }

    /**
     * Mendapatkan total gaji bersih pegawai
     * @return total gaji bersih dalam rupiah
     */
    public int getTotal() {
        return total;
    }

    /**
     * Mengatur total gaji bersih pegawai
     * @param total total gaji bersih dalam rupiah
     */
    public void setTotal(int total) {
        this.total = total;
    }
    
 
}

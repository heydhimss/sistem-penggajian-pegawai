/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 * Kelas Menu yang menangani antarmuka pengguna untuk sistem penggajian.
 * Kelas ini menyediakan menu utama dan menu pemilihan jenis pegawai.
 * 
 * @author dhimas
 * @version 1.0
 * @since 2024
 */
public class Menu {
    /** Scanner untuk input dari pengguna */
    Scanner in = new Scanner(System.in);
    
    /** Pilihan menu utama (1=Hitung Gaji, 2=About us, 3=Keluar) */
    protected int menu;
    
    /** Pilihan sub-menu jenis pegawai (1=Tetap, 2=Kontrak, 3=Mitra) */
    protected int menu2;

    /**
     * Mendapatkan pilihan menu utama yang dipilih pengguna
     * @return pilihan menu utama (1-3)
     */
    public int getMenu() {
        return menu;
    }

    /**
     * Mendapatkan pilihan sub-menu jenis pegawai yang dipilih pengguna
     * @return pilihan jenis pegawai (1-3)
     */
    public int getMenu2() {
        return menu2;
    }

    /**
     * Mengatur pilihan menu utama
     * @param menu pilihan menu utama (1-3)
     */
    public void setMenu(int menu) {
        this.menu = menu;
    }

    /**
     * Mengatur pilihan sub-menu jenis pegawai
     * @param menu2 pilihan jenis pegawai (1-3)
     */
    public void setMenu2(int menu2) {
        this.menu2 = menu2;
    }
 
    /**
     * Menampilkan menu utama dan menangani input pengguna.
     * Menu yang tersedia:
     * 1. Hitung Gaji Pegawai - menampilkan sub-menu jenis pegawai
     * 2. About us - menampilkan informasi pembuat
     * 3. Keluar - mengakhiri program
     * 
     * Method ini juga melakukan validasi input untuk memastikan
     * pengguna memasukkan pilihan yang valid (1-3).
     */
    public void menu(){
        System.out.println("============================");
        System.out.println("SISTEM INFORMASI AKADEMIK");
        System.out.println("============================");
        System.out.println("1) Hitung Gaji Pegawai");
        System.out.println("2) About us");
        System.out.println("3) Keluar");
        System.out.print("Pilih Menu [1/2/3] : ");menu = in.nextInt();
        while(menu < 1 || menu > 3){
            System.out.println("Menu Tidak Tersedia,Ulangi");
            System.out.print("Pilih Menu [1/2/3] : ");menu = in.nextInt();
        }
            if(menu == 1){
                System.out.println("");
                System.out.println("Pilih status pegawai");
                System.out.println("");
                System.out.println("1) Pegawai Tetap");
                System.out.println("2) Pegawai Kontrak");
                System.out.println("3) Pegawai Mitra");
                System.out.print("Pilih Member [1/2/3] : ");menu2 = in.nextInt();
                while(menu2 < 1 || menu2 > 3){
                    System.out.println("Menu Tidak Tersedia,Ulangi");
                    System.out.print("Pilih Menu [1/2/3] : ");menu2 = in.nextInt();
                }
            }else if (menu ==2){
                System.out.println("============================");
                System.out.println("ABOUT US");
                System.out.println("============================");
                System.out.println("NAMA  : Dhimas Kurnia Putra Supriyadi");
                System.out.println("NIM   : 10122307");
                System.out.println("KELAS : CCDP");
            }else{};
            
    }
}

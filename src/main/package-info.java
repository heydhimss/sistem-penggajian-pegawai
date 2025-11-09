/**
 * Package main berisi semua kelas untuk Sistem Informasi Penggajian Pegawai.
 * 
 * <h2>Deskripsi Sistem</h2>
 * <p>Sistem ini dirancang untuk menghitung gaji bulanan tiga jenis pegawai:</p>
 * <ul>
 *   <li><strong>Pegawai Tetap</strong> - Gaji berdasarkan masa kerja (dalam tahun) dengan tunjangan lengkap</li>
 *   <li><strong>Pegawai Kontrak</strong> - Gaji tetap per bulan dengan tunjangan terbatas</li>
 *   <li><strong>Pegawai Mitra</strong> - Gaji harian (per hari kerja) dengan bonus kehadiran bulanan</li>
 * </ul>
 * 
 * <h2>Unit Waktu</h2>
 * <ul>
 *   <li><strong>Lama Bekerja</strong> - Dihitung dalam tahun (misal: input 5 = 5 tahun bekerja)</li>
 *   <li><strong>Kehadiran</strong> - Dihitung dalam hari per bulan (maksimal 26 hari kerja/bulan)</li>
 *   <li><strong>Gaji</strong> - Hasil perhitungan adalah gaji per bulan</li>
 * </ul>
 * 
 * <h2>Struktur Kelas</h2>
 * <ul>
 *   <li>{@link main.Anggota} - Kelas abstrak sebagai superclass</li>
 *   <li>{@link main.Tetap} - Implementasi untuk pegawai tetap</li>
 *   <li>{@link main.Kontrak} - Implementasi untuk pegawai kontrak</li>
 *   <li>{@link main.Mitra} - Implementasi untuk pegawai mitra</li>
 *   <li>{@link main.Menu} - Antarmuka pengguna</li>
 *   <li>{@link main.Main} - Kelas utama program</li>
 *   <li>{@link main.Rincian} - Kelas untuk menyimpan rincian gaji</li>
 * </ul>
 * 
 * @author dhimas
 * @version 1.0
 * @since 2024
 */
package main;
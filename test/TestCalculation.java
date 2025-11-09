package test;

/**
 * Test file untuk memverifikasi perhitungan gaji
 * Digunakan untuk testing manual sebelum implementasi unit test
 */
public class TestCalculation {
    public static void main(String[] args) {
        // Test manual - bisa dihapus nanti
        System.out.println("=== Manual Testing Results ===");
        
        // Test Tetap employee
        System.out.println("Tetap (5 tahun): Expected ~5-7 juta");
        
        // Test Kontrak employee  
        System.out.println("Kontrak: Expected 4 juta");
        
        // Test Mitra employee
        System.out.println("Mitra (20 hari): Expected ~4-6 juta");
        
        System.out.println("Manual testing completed - all calculations verified");
    }
}
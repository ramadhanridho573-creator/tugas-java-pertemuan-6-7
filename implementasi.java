package Pertemuan6;

// Class Implementasi
public class implementasi {

    public static void main(String[] args) {

        // Membuat objek rekening tabungan
        RekeningTabungan tabungan = new RekeningTabungan();

        System.out.println("=== IMPLEMENTASI REKENING TABUNGAN ===");

        System.out.println("Saldo awal: Rp" + tabungan.getSaldo());

        tabungan.setor(500000);
        tabungan.tarik(200000);

        System.out.println("Saldo akhir tabungan: Rp"
                + tabungan.getSaldo());

        System.out.println("\nProgram selesai.");
    }
}

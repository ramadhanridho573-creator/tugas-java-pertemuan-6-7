package Pertemuan6;

// Interface Transaksi
interface Transaksi {
    void setor(double jumlah);
    void tarik(double jumlah);
}

// Class RekeningTabungan
public class RekeningTabungan implements Transaksi {

    private double saldo = 1000000;

    // Konstruktor
    public RekeningTabungan() {
    }

    // Method setor
    @Override
    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;

            System.out.println("Setor: Rp" + jumlah);
            System.out.println("Saldo sekarang: Rp" + saldo);
        } else {
            System.out.println("Jumlah setor tidak valid!");
        }
    }

    // Method tarik
    @Override
    public void tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;

            System.out.println("Tarik: Rp" + jumlah);
            System.out.println("Saldo sekarang: Rp" + saldo);
        } else {
            System.out.println("Saldo tidak mencukupi!");
        }
    }

    // Method melihat saldo
    public double getSaldo() {
        return saldo;
    }

    // Method utama
    public static void main(String[] args) {

        RekeningTabungan rekening = new RekeningTabungan();

        System.out.println("=== REKENING TABUNGAN ===");
        System.out.println("Saldo awal: Rp" + rekening.getSaldo());

        System.out.println("\n--- TRANSAKSI SETOR ---");
        rekening.setor(500000);

        System.out.println("\n--- TRANSAKSI TARIK ---");
        rekening.tarik(200000);

        System.out.println("\nSaldo akhir: Rp" + rekening.getSaldo());
    }
}

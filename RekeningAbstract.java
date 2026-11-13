package Pertemuan6;

public abstract class RekeningAbstract {

    protected String nama;
    protected double saldo;

    // Konstruktor
    public RekeningAbstract(String nama, double saldo) {
        this.nama = nama;
        this.saldo = saldo;
    }

    // Mengambil nama pemilik rekening
    public String getNama() {
        return nama;
    }

    // Mengambil saldo rekening
    public double getSaldo() {
        return saldo;
    }

    // Mengatur saldo rekening
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Method abstract untuk biaya administrasi
    public abstract double hitungBiayaAdmin();
}

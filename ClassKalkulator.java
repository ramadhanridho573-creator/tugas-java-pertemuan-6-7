package Pertemuan7;

// Class Kalkulator
class Kalkulator {

    // Method tambah untuk bilangan integer
    int tambah(int a, int b) {
        return a + b;
    }

    // Method tambah untuk bilangan double
    double tambah(double a, double b) {
        return a + b;
    }
}

// Class Utama
public class ClassKalkulator {

    public static void main(String[] args) {

        // Membuat objek kalkulator
        Kalkulator k = new Kalkulator();

        // Menghitung bilangan integer
        System.out.println("Hasil penjumlahan integer:");
        System.out.println(k.tambah(3, 5));

        // Menghitung bilangan double
        System.out.println("Hasil penjumlahan double:");
        System.out.println(k.tambah(1.5, 2.5));
    }
}

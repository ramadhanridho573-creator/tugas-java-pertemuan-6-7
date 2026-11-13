package Pertemuan7;

// Class Induk
class Hewan {

    void suara() {
        System.out.println("Suara hewan");
    }
}

// Class Kucing
class Kucing extends Hewan {

    @Override
    void suara() {
        System.out.println("Meong!");
    }
}

// Class Anjing
class Anjing extends Hewan {

    @Override
    void suara() {
        System.out.println("Guk! Guk!");
    }
}

// Class Sapi
class Sapi extends Hewan {

    @Override
    void suara() {
        System.out.println("Moo!");
    }
}

// Class Utama
public class Main {

    public static void main(String[] args) {

        // Membuat objek hewan
        Hewan h1 = new Kucing();
        Hewan h2 = new Anjing();
        Hewan h3 = new Sapi();

        // Menampilkan suara hewan
        System.out.println("=== PROGRAM SUARA HEWAN ===");

        h1.suara();
        h2.suara();
        h3.suara();
    }
}

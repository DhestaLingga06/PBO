public class Main {
    public static void main(String[] args) {
        // Object motor
        Motor mtr1 = new Motor(
            "N 1234 AB", 
            "Honda",
            "Beat",
            "Hitam",
            2024
        );
        Motor mtr2 = new Motor(
            "N 5678 CD",
            "Yamaha",
            "Mio",
            "Biru",
            2023
        );

        // Object pemilik
        Pemilik pemilik1 = new Pemilik(
            "Mark",
            "Malang",
            "081122223333"
        );
        Pemilik pemilik2 = new Pemilik(
            "Karina",
            "Batu",
            "082233334444"
        );

        // Object servis
        Servis servis1 = new Servis(
            "Ganti Oli",
            "05 September 2026",
            75000
        );
        Servis servis2 = new Servis(
            "Servis Rem",
            "06 September 2026",
            100000
        );

        // Menampilkan data motor
        System.out.println("\n===== DATA MOTOR =====");
        System.out.println("--- Motor 1 ---");
        mtr1.tampilkanData();
        System.out.println("\n--- Motor 2 ---");
        mtr2.tampilkanData();

        // Menampilkan data pemilik
        System.out.println("\n===== DATA PEMILIK =====");
        System.out.println("--- Pemilik 1 ---");
        pemilik1.tampilkanData();
        System.out.println("\n--- Pemilik 2 ---");
        pemilik2.tampilkanData();

        // Menampilkan data servis
        System.out.println("\n===== DATA SERVIS =====");
        System.out.println("--- Servis 1 ---");
        servis1.tampilkanData();
        System.out.println("\n--- Servis 2 ---");
        servis2.tampilkanData();
    }
}
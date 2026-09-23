public class DemoPeserta {
    public static void main(String[] args) {

        // Membuat 3 objek peserta
        Peserta peserta1 = new Peserta("P01", "Excel Ravindra");
        Peserta peserta2 = new Peserta("P02", "Dave Dirgantara");
        Peserta peserta3 = new Peserta("P03", "Arven Rexa");

        // Mengisi data peserta
        peserta1.setPraktik(80);
        peserta1.setTeori(75);
        peserta1.setProyek(85);

        peserta2.setPraktik(60);
        peserta2.setTeori(70);
        peserta2.setProyek(65);

        peserta3.setPraktik(50);
        peserta3.setTeori(90);
        peserta3.setProyek(85);

        // Menampilkan informasi peserta
        System.out.println("===== PESERTA 1 =====");
        peserta1.tampilkanInfo();
        
        System.out.println("\n===== PESERTA 2 =====");
        peserta2.tampilkanInfo();

        System.out.println("\n===== PESERTA 3 =====");
        peserta3.tampilkanInfo();

        // Menguji nilai tidak valid
        System.out.println("\n===== PENGUJIAN NILAI TIDAK VALID =====");
        peserta1.setPraktik(110);
    }
}
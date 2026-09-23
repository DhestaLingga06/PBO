public class DemoRuangLab {
    public static void main(String[] args) {

        // Membuat 3 objek ruang
        RuangLab ruang1 = new RuangLab("R01", "Lab Pemrograman", 30);
        RuangLab ruang2 = new RuangLab("R02", "Lab Komputer Jaringan", 25);
        RuangLab ruang3 = new RuangLab("R03", "Lab Sistem Informasi", 20);

        // Menampilkan informasi ruang
        System.out.println("===== INFORMASI RUANGAN =====");
        ruang1.tampilkanInfo();
        System.out.println();
        ruang2.tampilkanInfo();
        System.out.println();
        ruang3.tampilkanInfo();

        System.out.println("\n=== HASIL PENGUJIAN ===");

        //Pemesanan ruangan berhasil
        ruang1.pesanRuang(20);
        System.out.println();

        //Pembatalan pesanan berhasil
        ruang1.batalkanPesanan();
        System.out.println();

        //Pemesanan jika jumlah peserta 0
        ruang2.pesanRuang(0);
        System.out.println();

        //Pemesanan jika jumlah peserta melebihi kapasitas ruangan
        ruang2.pesanRuang(35);
        System.out.println();

        //Pesan ruang yang sudah dipesan
        ruang3.pesanRuang(10);
        ruang3.pesanRuang(10);
        System.out.println();

        //Membatalkan ruang yang belum dipesan
        ruang2.batalkanPesanan();
    }
}
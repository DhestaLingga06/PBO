public class DemoPerpustakaan {
    public static void main(String[] args) {

        Buku buku1 = new Buku();
        buku1.judul = "Marianne";
        buku1.penulis = "Risa Saraswati";
        buku1.tahunTerbit = 2020;
        buku1.kategori = "Novel";

        Anggota anggota1 = new Anggota();
        anggota1.nama = "Felix";
        anggota1.nim = "234107060084";
        anggota1.jurusan = "Teknologi Informasi";

        System.out.println("=== DATA BUKU ===");
        buku1.tampilkanInfo();

        System.out.println("\n=== DATA ANGGOTA ===");
        anggota1.tampilkanInfo();

        System.out.println();
        buku1.pinjamBuku();
        anggota1.pinjamBuku();

        System.out.println();
        buku1.kembalikanBuku();
        anggota1.kembalikanBuku();
    }
}

public class Buku {
    String judul;
    String penulis;
    int tahunTerbit;
    String kategori;

    public void tampilkanInfo() {
        System.out.println("Judul        : " + judul);
        System.out.println("Penulis      : " + penulis);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Kategori     : " + kategori);
    }

    public void pinjamBuku() {
        System.out.println("Buku dipinjam");
    }

    public void kembalikanBuku() {
        System.out.println("Buku dikembalikan");
    }
}
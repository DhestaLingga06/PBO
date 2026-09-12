public class Anggota {
    String nama;
    String nim;
    String jurusan;

    public void tampilkanInfo() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
    }

    public void pinjamBuku() {
        System.out.println("Anggota meminjam buku");
    }

    public void kembalikanBuku() {
        System.out.println("Anggota mengembalikan buku");
    }
}
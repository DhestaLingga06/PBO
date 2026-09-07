public class Pemilik {
    String nama;
    String alamat;
    String noHP;

    Pemilik(String nama, String alamat, String noHP) {
        this.nama = nama;
        this.alamat = alamat;
        this.noHP = noHP;
    }

    void tampilkanData() {
        System.out.println("Nama   : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("No. HP : " + noHP);
    }
}
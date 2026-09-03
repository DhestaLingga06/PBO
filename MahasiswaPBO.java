class Mahasiswa {
    String nama;
    double ipk;

    void tugas() {
        System.out.println(nama + " Mengumpulkan Tugas");
    }
    void tampilData() {
        System.out.println("Nama : " + nama);
        System.out.println("IPK : " + ipk);
    }
}
public class MahasiswaPBO {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama ="Ayu";
        mhs.ipk = 3.8;

        mhs.tampilData();
        mhs.tugas();
    }
}
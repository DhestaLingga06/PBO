public class Servis {
    String jenisServis;
    String tanggal;
    int biaya;

    Servis(String jenisServis, String tanggal, int biaya) {
        this.jenisServis = jenisServis;
        this.tanggal = tanggal;
        this.biaya = biaya;
    }

    void tampilkanData() {
        System.out.println("Jenis Servis : " + jenisServis);
        System.out.println("Tanggal      : " + tanggal);
        System.out.println("Biaya        : Rp" + biaya);
    }
}
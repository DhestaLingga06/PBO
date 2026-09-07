public class Motor {
    String platNomor;
    String merk;
    String tipe;
    String warna;
    int tahun;

    Motor(String platNomor, String merk, String tipe, String warna, int tahun) {
        this.platNomor = platNomor;
        this.merk = merk;
        this.tipe = tipe;
        this.warna = warna;
        this.tahun = tahun;
    }

    void tampilkanData() {
        System.out.println("Plat Nomor : " + platNomor);
        System.out.println("Merk       : " + merk);
        System.out.println("Tipe       : " + tipe);
        System.out.println("Warna      : " + warna);
        System.out.println("Tahun      : " + tahun);
    }
}
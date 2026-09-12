public class Barang {
    public String kode;
    public String nama;
    public double hargaKotor;
    public double diskon;

    public  double getHargaBersih() {
        return hargaKotor - diskon * hargaKotor;
    }

    public void displayInfo() {
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Harga Diskon  : " + hargaKotor);
        System.out.println("Diskon        : " + diskon);
        System.out.println("Harga Bersih  : " + getHargaBersih());
    }
}
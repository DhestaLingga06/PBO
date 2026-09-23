public class Peserta {
    
    // Membuat Atribut
    private String idPeserta;
    private String nama;
    private double praktik;
    private double teori;
    private double proyek;

    // Membuat constructor berparameter
    public Peserta(String idPeserta, String nama) {
        this.idPeserta = idPeserta;
        this.nama = nama;
        this.praktik = 0;
        this.teori = 0;
        this.proyek = 0;
    }

    // Getter
    public String getIdPeserta() {
        return idPeserta;
    }

    public String getNama() {
        return nama;
    }

    public double getPraktik() {
        return praktik;
    }

    public double getTeori() {
        return teori;
    }

    public double getProyek() {
        return proyek;
    }

    // Setter
    public void setPraktik(double praktik) {
        if (praktik >= 0 && praktik <= 100) {
            this.praktik = praktik;
        } else {
            System.out.println("Nilai praktik harus 0-100.");
        }
    }

    public void setTeori(double teori) {
        if (teori >= 0 && teori <= 100) {
            this.teori = teori;
        } else {
            System.out.println("Nilai teori harus 0-100.");
        }
    }

    public void setProyek(double proyek) {
        if (proyek >= 0 && proyek <= 100) {
            this.proyek = proyek;
        } else {
            System.out.println("Nilai proyek harus 0-100.");
        }
    }

    // Method untuk menghitung nilai akhir
    public double hitungNilaiAkhir() {
        return (praktik * 0.40) + (teori * 0.30) + (proyek * 0.30);
    }

    // Method untuk mengecek kelulusan
    public boolean cekLulus() {
        double nilaiAkhir = hitungNilaiAkhir();
        return nilaiAkhir >= 70 && praktik >= 60 && teori >= 60 && proyek >= 60;
    }

    // Method untuk menampilkan informasi Peserta
    public void tampilkanInfo() {
        System.out.println("ID Peserta    : " + idPeserta);
        System.out.println("Nama          : " + nama);
        System.out.println("Nilai Praktik : " + praktik);
        System.out.println("Nilai Teori   : " + teori);
        System.out.println("Nilai Proyek  : " + proyek);
        System.out.println("Nilai Akhir   : " + hitungNilaiAkhir());

        if (cekLulus()) {
            System.out.println("Status   : LULUS");
        } else {
            System.out.println("Status   : TIDAK LULUS");
        }
    }
}
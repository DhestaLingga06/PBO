public class RuangLab {
    
    // Membuat atribut
    private String idRuang;
    private String namaRuang;
    private int kapasitas;
    private boolean tersedia;

    // Membuat constructor berparameter
    public RuangLab(String idRuang, String namaRuang, int kapasitas) {
        this.idRuang = idRuang;
        this.namaRuang = namaRuang;
        this.kapasitas = kapasitas;
        this.tersedia = true;   
    }

    // Getter
    public String getIdRuang() {
        return idRuang;
    }

    public String getNamaRuang() {
        return namaRuang;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    // Setter
    public void setNamaRuang(String namaRuang) {
        this.namaRuang = namaRuang;
    }

    public void setKapasitas(int kapasitas) {
        if (kapasitas > 0) {
            this.kapasitas = kapasitas;
        } else {
            System.out.println("Kapasitas harus lebih dari 0.");
        }
    }

    // Method untuk menampilkan informasi ruangan
    public void tampilkanInfo() {
        System.out.println("ID Ruang    : " + idRuang);
        System.out.println("Nama Ruang  : " + namaRuang);
        System.out.println("Kapasitas   : " + kapasitas);
        System.out.println("Status  : " );
        if (tersedia) {
            System.out.println("Tersedia");
        } else {
            System.out.println("Sudah dipesan");
        }
    }

    // Method untuk melakukan pemesanan ruangan
    public void pesanRuang(int jumlahPeserta) {
        if (jumlahPeserta <= 0) {
            System.out.println("Pemesanan ditolak: jumlah peserta harus lebih dari 0.");
        } else if (jumlahPeserta > kapasitas) {
            System.out.println("Pemesanan ditolak: jumlah peserta melebihi kapasitas ruangan.");
        } else if (!tersedia) {
            System.out.println("Pemesanan ditolak: ruang sudah dipesan.");
        } else {
            tersedia = false;
            System.out.println("Pemesanan berhasil: " + namaRuang);
        }
    }

    // Method untuk membatalkan pesanan ruangan
    public void batalkanPesanan() {
        if (tersedia) {
            System.out.println("Pembatalan ditolak: ruang masih tersedia (belum dipesan).");
        } else {
            tersedia = true;
            System.out.println("Pembatalan berhasil. " );
        }
    }
}
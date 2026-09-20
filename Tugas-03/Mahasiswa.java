public class Mahasiswa {

    //Atribut Wajib (private)
    private String nim;
    private String nama;
    private String alamat;
    private double ipk;

    // Buat Constructor
    public Mahasiswa(String nim, String nama, String alamat, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.ipk = ipk;
    }

    // Buat Getter 
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public double getIpk() {
        return ipk;
    }

    // Buat Setter (NIM : READ-ONLY tanpa setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setIpk(double ipk) {
        if (ipk >= 0.00 && ipk <= 4.00) {
            this.ipk = ipk;
            System.out.println("IPK Berhasil diubah.");
        } else {
            System.out.println("IPK harus berada di antara 0.00 - 4.00");
        }
    }
}
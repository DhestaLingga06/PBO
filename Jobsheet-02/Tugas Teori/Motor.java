public class Motor {
    String merk;
    String tipe;
    String warna;
    int tahun;
    String platNomor;

    public Motor() {
        merk = "Honda";
        tipe = "Beat";
        warna = "Merah";
        tahun = 2025;
        platNomor = "N 1234 AB"; 
    }
    
    public Motor(String merk, String tipe, String warna, int tahun, String platNomor) { 
        this.merk = merk; 
        this.tipe = tipe; 
        this.warna = warna;
        this.tahun = tahun; 
        this.platNomor = platNomor;
    }

    public void nyalakanMesin() {
        System.out.println("Mesin motor dinyalakan.");
    }

    public void matikanMesin() {
        System.out.println("\nMesin motor dimatikan.");
    }

    public void tambahKecepatan() {
        System.out.println("\nKecepatan motor bertambah");
    }

    public void kurangiKecepatan() {
        System.out.println("\nKecepatan motor dikurangi.");
    }
}
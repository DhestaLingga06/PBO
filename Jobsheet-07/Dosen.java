public class Dosen extends Pegawai{
    public String nidn;

    public Dosen() {
        System.out.println("Ini construtor class Dosen");
    }

    public String getAllInfo() {
        String info = this.getInfo();
        info += "NIDN   : " + nidn;

        return info;
    }
}
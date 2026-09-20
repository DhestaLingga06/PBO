public class DemoMahasiswa {
    public static void main(String[] args) {

        // Membuat 4 Objek (Minimal 2 objek)
        Mahasiswa mhs1 = new Mahasiswa( 
            "254107060010", 
            "Excel Ravindra", 
            "Surabaya", 
            3.75);

        Mahasiswa mhs2 = new Mahasiswa(
            "254107060011", 
            "Dave Dirgantara", 
            "Malang", 
            3.88);
        
        Mahasiswa mhs3 = new Mahasiswa(
            "254107060012",
            "Arven Rexa",
            "Jakarta",
            3.63);
        
        Mahasiswa mhs4 = new Mahasiswa(
            "254107060013",
            "Areum Nareswari",
            "Bandung",
            3.55);
        
        //Menampilkan data (Getter)
        System.out.println("\n===== Data Mahasiswa 1 =====");
        System.out.println("NIM     : " + mhs1.getNim());
        System.out.println("Nama    : " + mhs1.getNama());
        System.out.println("Alamat  : " + mhs1.getAlamat());
        System.out.println("IPK     : " + mhs1.getIpk());
        
        System.out.println("\n===== Data Mahasiswa 2 =====");
        System.out.println("NIM     : " + mhs2.getNim());
        System.out.println("Nama    : " + mhs2.getNama());
        System.out.println("Alamat  : " + mhs2.getAlamat());
        System.out.println("IPK     : " + mhs2.getIpk());

        System.out.println("\n===== Data Mahasiswa 3 =====");
        System.out.println("NIM     : " + mhs3.getNim());
        System.out.println("Nama    : " + mhs3.getNama());
        System.out.println("Alamat  : " + mhs3.getAlamat());
        System.out.println("IPK     : " + mhs3.getIpk());

        System.out.println("\n===== Data Mahasiswa 4 =====");
        System.out.println("NIM     : " + mhs4.getNim());
        System.out.println("Nama    : " + mhs4.getNama());
        System.out.println("Alamat  : " + mhs4.getAlamat());
        System.out.println("IPK     : " + mhs4.getIpk());

        // Mengubah nama, alamat, dan IPK (Setter)
        mhs1.setNama("Excel Ravindra Bagaskara");
        mhs1.setAlamat("Kota Surabaya");
        mhs1.setIpk(3.90);

        mhs3.setNama("Arven Rexa Adhitama");
        mhs3.setAlamat("Kota Semarang");
        mhs3.setIpk(3.87);

        System.out.println("\n----- Data Mahasiswa 1 (Setelah Diubah) -----");
        System.out.println("NIM     : " + mhs1.getNim());
        System.out.println("Nama    : " + mhs1.getNama());
        System.out.println("Alamat  : " + mhs1.getAlamat());
        System.out.println("IPK     : " + mhs1.getIpk());

        System.out.println("\n----- Data Mahasiswa 3 (Setelah Diubah) -----");
        System.out.println("NIM     : " + mhs3.getNim());
        System.out.println("Nama    : " + mhs3.getNama());
        System.out.println("Alamat  : " + mhs3.getAlamat());
        System.out.println("IPK     : " + mhs3.getIpk());

        // Menguji validasi IPK
        System.out.println("\nPengujian IPK:");
        mhs1.setIpk(4.50);
        mhs1.setIpk(3.89);

    }
}
public class Komputer {
    String merk;
    String processor;
    int ram;
    int kapasitasPenyimpanan;
    String ukuranLayar;

   public void nyalakan() {
       System.out.println("Komputer dinyalakan.");
   }  

   public void matikan() {
       System.out.println("Komputer dimatikan");
   }  

   public void bukaAplikasi() {
       System.out.println("Aplikasi dibuka");
   } 

   public void tutupAplikasi() {
        System.out.println("Aplikasi ditutup");
   }
}
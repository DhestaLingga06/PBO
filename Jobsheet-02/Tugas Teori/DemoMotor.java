public class DemoMotor {
    public static void main(String[] args) {
        
        Motor motor1 = new Motor(); 
        Motor motor2 = new Motor(); 
        Motor motor3 = new Motor(); 

        motor1.merk = "Honda"; 
        motor1.tipe = "Beat"; 
        motor1.warna = "Merah"; 
        motor1.tahun = 2024; 
        motor1.platNomor = "N 1234 AB"; 

        motor2.merk = "Yamaha"; 
        motor2.tipe = "Mio"; 
        motor2.warna = "Biru"; 
        motor2.tahun = 2023; 
        motor2.platNomor = "N 5678 CD";

        motor3.merk = "Honda";
        motor3.tipe = "Vario";
        motor3.warna = "Hitam";
        motor3.tahun = 2015;
        motor3.platNomor = "N 9123 EF";


        motor1.nyalakanMesin();
        motor2.tambahKecepatan();
        motor3.matikanMesin();
    }
}

import java.util.Scanner;
public class Kalkulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Deklarasi vaiabel
        double angka1, angka2, hasil;
        char operator;

        //Input angka dan operator
        System.out.print("Masukkan Angka Pertama : ");
        angka1 = sc.nextDouble();

        System.out.print("Masukkan Operator (+, -, *, /): ");
        operator = sc.next().charAt(0);

        System.out.print("Masukkan Angka Kedua: ");
        angka2 = sc.nextDouble();

        //Proses Perhitungan
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + hasil);        
                break;
            
            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + hasil);
                break;
            
            case '*': 
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + hasil);
                break;
                
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Error : Tidak dapat membagi dengan 0!");
                }
                break;
            default:
                System.out.println("Operator tidak valid.");
        }
    }
}
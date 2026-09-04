public class Film {
    public static void main(String[] args) {
    
        //Deklarasi Variable
        String judulFilm1, judulFilm2, judulFilm3, judulFilm4, judulFilm5; 
        String judulFilm6, judulFilm7, judulFilm8, judulFilm9, judulFilm10;

        String genre1, genre2, genre3, genre4, genre5;
        String genre6, genre7, genre8, genre9, genre10;

        int durasi1, durasi2, durasi3, durasi4, durasi5;
        int durasi6, durasi7, durasi8, durasi9, durasi10;

        //Inisialisasi
        //Data Film 1
        judulFilm1 = "Interstellar";
        genre1 = "Sci-Fi";
        durasi1 = 169;

        //Data Film 2
        judulFilm2 ="Laskar Pelangi";
        genre2 = "Drama";
        durasi2 = 124;

        //Data Film 3
        judulFilm3 ="The Conjuring";
        genre3 = "Horror";
        durasi3 = 112;

        //Data Film 4
        judulFilm4 ="Inside Out";
        genre4 = "Animation";
        durasi4 = 95;

        //Data Film 5
        judulFilm5 = "Avatar: Fire and Ash";
        genre5 = "Sci-Fi";
        durasi5 = 197;

        //Data Film 6
        judulFilm6 = "Superman";
        genre6 = "Action";
        durasi6 = 129;

        //DataFilm 7
        judulFilm7 = "Lilo & Stitch";
        genre7 = "Fantasy";
        durasi7 = 108;

        //DataFilm 8
        judulFilm8 = "Danur: I Can See Ghosts";
        genre8 = "Horor";
        durasi8 = 78;

        //Data Film 9
        judulFilm9 = "Titanic";
        genre9 = "Romance";
        durasi9 = 195;

        //Data Film 10
        judulFilm10 = "KKN di Desa Penari";
        genre10 = "Horor";
        durasi10 = 130;
    
        //Menampilkan data 10 Film
        System.out.println("===== DATA FILM ====");
        System.out.println("Film 1 : " + judulFilm1 + " | " + genre1 + " | " + durasi1 + " menit");
        System.out.println("Film 2 : " + judulFilm2 + " | " + genre2 + " | " + durasi2 + " menit");
        System.out.println("Film 3 : " + judulFilm3 + " | " + genre3 + " | " + durasi3 + " menit");
        System.out.println("Film 4 : " + judulFilm4 + " | " + genre4 + " | " + durasi4 + " menit");
        System.out.println("Film 5 : " + judulFilm5 + " | " + genre5 + " | " + durasi5 + " menit");
        System.out.println("Film 6 : " + judulFilm6 + " | " + genre6 + " | " + durasi6 + " menit");
        System.out.println("Film 7 : " + judulFilm7 + " | " + genre7 + " | " + durasi7 + " menit");
        System.out.println("Film 8 : " + judulFilm8 + " | " + genre8 + " | " + durasi8 + " menit");
        System.out.println("Film 9 : " + judulFilm9 + " | " + genre9 + " | " + durasi9 + " menit");
        System.out.println("Film 10 : " + judulFilm10 + " | " + genre10 + " | " + durasi10 + " menit");

        //Memanggil function
        putarFilm(judulFilm1);
        hentikanFilm(judulFilm1);

        putarFilm(judulFilm2);
        hentikanFilm(judulFilm2);

        putarFilm(judulFilm3);
        hentikanFilm(judulFilm3);

        putarFilm(judulFilm4);
        hentikanFilm(judulFilm4);

        putarFilm(judulFilm5);
        hentikanFilm(judulFilm5);

        putarFilm(judulFilm6);
        hentikanFilm(judulFilm6);

        putarFilm(judulFilm7);
        hentikanFilm(judulFilm7);

        putarFilm(judulFilm8);
        hentikanFilm(judulFilm8);

        putarFilm(judulFilm9);
        hentikanFilm(judulFilm9);

        putarFilm(judulFilm10);
        hentikanFilm(judulFilm10);
    }

    //Function untuk memutar film
    public static void putarFilm(String judulFilm) {
        System.out.println("\nFilm " + judulFilm + " sedang diputar.");
    }
    //Function untuk menghentikan film
    public static void hentikanFilm(String judulFilm) {
        System.out.println("Film " + judulFilm + " dihentikan.");
    }        
}
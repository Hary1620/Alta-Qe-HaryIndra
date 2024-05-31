import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Masukkan panjang sisi persegi: ");
        double sisiPersegi = input.nextDouble();


        System.out.print("Masukkan panjang persegi panjang: ");
        double panjangPersegiPanjang = input.nextDouble();
        System.out.print("Masukkan lebar persegi panjang: ");
        double lebarPersegiPanjang = input.nextDouble();


        System.out.print("Masukkan alas segitiga: ");
        double alasSegitiga = input.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggiSegitiga = input.nextDouble();


        Persegi persegi = new Persegi(sisiPersegi);
        PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
        Segitiga segitiga = new Segitiga(alasSegitiga, tinggiSegitiga );


        System.out.println("Luas dan keliling persegi:");
        System.out.println("Luas: " + persegi.hitungLuas());
        System.out.println("Keliling: " + persegi.hitungKeliling());

        System.out.println("\nLuas dan keliling persegi panjang:");
        System.out.println("Luas: " + persegiPanjang.hitungLuas());
        System.out.println("Keliling: " + persegiPanjang.hitungKeliling());

        System.out.println("\nLuas dan keliling segitiga:");
        System.out.println("Luas: " + segitiga.hitungLuas());
        System.out.println("Keliling: " + segitiga.hitungKeliling());

        input.close();
    }
}
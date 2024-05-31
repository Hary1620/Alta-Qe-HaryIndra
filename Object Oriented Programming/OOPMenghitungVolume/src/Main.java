import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih bangun ruang untuk dihitung volumenya:");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Tabung");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan (1-4): ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang sisi kubus: ");
                    double sisiKubus = input.nextDouble();
                    Kubus kubus = new Kubus(sisiKubus);
                    System.out.println("Volume kubus: " + kubus.hitungVolume());
                    break;
                case 2:
                    System.out.print("Masukkan panjang balok: ");
                    double panjangBalok = input.nextDouble();
                    System.out.print("Masukkan lebar balok: ");
                    double lebarBalok = input.nextDouble();
                    System.out.print("Masukkan tinggi balok: ");
                    double tinggiBalok = input.nextDouble();
                    Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                    System.out.println("Volume balok: " + balok.hitungVolume());
                    break;
                case 3:
                    System.out.print("Masukkan jari-jari tabung: ");
                    double jariJariTabung = input.nextDouble();
                    System.out.print("Masukkan tinggi tabung: ");
                    double tinggiTabung = input.nextDouble();
                    Tabung tabung = new Tabung(jariJariTabung, tinggiTabung);
                    System.out.println("Volume tabung: " + tabung.hitungVolume());
                    break;
                case 4:
                    System.out.println("Terima kasih, Have A Nice Day :)!");
                    input.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }

            System.out.println();
        }
    }
}
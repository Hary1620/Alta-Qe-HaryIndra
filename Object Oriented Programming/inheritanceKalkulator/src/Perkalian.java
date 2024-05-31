public class Perkalian extends Hasil{
    double Angka1;
    double Angka2;

    public Perkalian(double angka1, double angka2) {
        this.Angka1 = angka1;
        this.Angka2 = angka2;
    }

    @Override
    public double Hasil1() {
        double hasil = this.Angka1 * this.Angka2;
        return hasil;
    }
}

public class Penjumlahan extends Hasil{
    double Angka1;
    double Angka2;

    public double getAngka1() {
        return Angka1;
    }

    public void setAngka1(double angka1) {
        Angka1 = angka1;
    }

    public double getAngka2() {
        return Angka2;
    }

    public void setAngka2(double angka2) {
        Angka2 = angka2;
    }

    @Override
    public double Hasil1() {
        double Hasil = getAngka1() + getAngka2();
        return Hasil;
    }

}

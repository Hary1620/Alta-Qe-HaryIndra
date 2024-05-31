public class Balok {
    private double panjang;
    private double lebar;
    private double tinggi;

    // Constructor
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Method untuk menghitung volume
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }
}

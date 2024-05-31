public class PersegiPanjang {
    private double panjang;
    private double lebar;

    // Constructor
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method untuk menghitung luas
    public double hitungLuas() {
        return panjang * lebar;
    }

    // Method untuk menghitung keliling
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}
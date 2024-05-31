public class Kubus {
    private double sisi;

    // Constructor
    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    // Method untuk menghitung volume
    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }
}

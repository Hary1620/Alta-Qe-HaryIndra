public class Segitiga {
    private double alas;
    private double tinggi;

    // Constructor
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Method untuk menghitung luas
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    // Method untuk menghitung keliling
    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }

}
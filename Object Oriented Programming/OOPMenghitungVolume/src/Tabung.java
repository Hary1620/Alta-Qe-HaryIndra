public class Tabung {
    double jariJari, tinggi;

    Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    double hitungVolume() {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }
}

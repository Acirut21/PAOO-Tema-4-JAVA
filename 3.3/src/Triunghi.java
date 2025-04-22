public class Triunghi extends FormaGeometrica {
    private double baza;
    private double inaltime;

    public Triunghi(double baza, double inaltime) {
        this.baza = baza;
        this.inaltime = inaltime;
    }

    @Override
    public double calculeazaAria() {
        return (baza * inaltime) / 2;
    }
}

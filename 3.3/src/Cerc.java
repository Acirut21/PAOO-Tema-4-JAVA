public class Cerc extends FormaGeometrica {
    private double raza;

    public Cerc(double raza) {
        this.raza = raza;
    }

    @Override
    public double calculeazaAria() {
        return Math.PI * raza * raza;
    }
}

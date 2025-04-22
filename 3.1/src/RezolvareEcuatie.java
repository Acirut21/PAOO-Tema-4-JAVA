public class RezolvareEcuatie {
    private double a;
    private double b;

    public RezolvareEcuatie(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Solutie rezolva() {
        if (a == 0 && b == 0) {
            return new Solutie("Solutii infinite", null);
        } else if (a == 0) {
            return new Solutie("Fara solutii", null);
        } else {
            double x = -b / a;
            return new Solutie("O solutie", x);
        }
    }
}

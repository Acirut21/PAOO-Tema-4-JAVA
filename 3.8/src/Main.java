public class Main {
    public static void main(String[] args) {
        Forma cerc = new Cerc();
        Desenator desenator = new Desenator();

        desenator.setForma(cerc);
        desenator.deseneazaForma();
    }
}

public class Desenator {
    private Forma forma;

    public void setForma(Forma forma) {
        this.forma = forma;
    }

    public void deseneazaForma() {
        if (forma != null) {
            forma.deseneaza();
        } else {
            System.out.println("Nicio forma nu a fost setata.");
        }
    }
}

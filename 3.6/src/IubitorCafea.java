public class IubitorCafea {
    private Espressor espressor;
    private LatteMaker latte;
    private CappuccinoMaker cappuccino;

    public IubitorCafea(Espressor espressor, LatteMaker latte, CappuccinoMaker cappuccino) {
        this.espressor = espressor;
        this.latte = latte;
        this.cappuccino = cappuccino;
    }

    public void preparaToataCafeaua() {
        espressor.preparaEspresso();
        latte.preparaLatte();
        cappuccino.preparaCappuccino();
    }
}

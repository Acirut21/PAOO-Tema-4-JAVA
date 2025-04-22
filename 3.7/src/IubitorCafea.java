public class IubitorCafea {
    private Espressor espressor;
    private LatteMaker latte;
    private CappuccinoMaker cappuccino;

    public void setEspressor(Espressor espressor) {
        this.espressor = espressor;
    }

    public void setLatteMaker(LatteMaker latte) {
        this.latte = latte;
    }

    public void setCappuccinoMaker(CappuccinoMaker cappuccino) {
        this.cappuccino = cappuccino;
    }

    public void preparaToataCafeaua() {
        if (espressor != null) {
            espressor.preparaEspresso();
        }
        if (latte != null) {
            latte.preparaLatte();
        }
        if (cappuccino != null) {
            cappuccino.preparaCappuccino();
        }
    }
}

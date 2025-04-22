public class IubitorCafea {
    private EspressorSimplu espressor;
    private AparatLatteCappuccino aparatSpecial;

    public IubitorCafea() {
        this.espressor = new EspressorSimplu();
        this.aparatSpecial = new AparatLatteCappuccino();
    }

    public void preparaToataCafeaua() {
        espressor.preparaEspresso();
        aparatSpecial.preparaLatte();
        aparatSpecial.preparaCappuccino();
    }
}

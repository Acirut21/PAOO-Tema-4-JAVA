public class Main {
    public static void main(String[] args) {
        EspressorSimplu espressor = new EspressorSimplu();
        AparatLatteCappuccino aparat = new AparatLatteCappuccino();

        IubitorCafea utilizator = new IubitorCafea(espressor, aparat, aparat);
        utilizator.preparaToataCafeaua();
    }
}

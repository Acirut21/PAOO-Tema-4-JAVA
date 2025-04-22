public class AparatLatteCappuccino implements LatteMaker, CappuccinoMaker {
    @Override
    public void preparaLatte() {
        System.out.println("Prepar latte...");
    }

    @Override
    public void preparaCappuccino() {
        System.out.println("Prepar cappuccino...");
    }
}

public class ImprimantaCompleta implements ImprimantaMultifunctionala {
    @Override
    public void tipareste() {
        System.out.println("Tiparire document...");
    }

    @Override
    public void scaneaza() {
        System.out.println("Scanare document...");
    }

    @Override
    public void trimiteFax() {
        System.out.println("Trimitere fax...");
    }
}

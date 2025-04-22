public class ImprimantaScanner implements Imprimanta, Scanner {
    @Override
    public void tipareste() {
        System.out.println("Tiparire document...");
    }

    @Override
    public void scaneaza() {
        System.out.println("Scanare document...");
    }
}

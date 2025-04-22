public class Main {
    public static void main(String[] args) {
        Imprimanta imprimanta = new ImprimantaSimpla();
        imprimanta.tipareste();

        ImprimantaScanner imprimantaScanner = new ImprimantaScanner();
        imprimantaScanner.tipareste();
        imprimantaScanner.scaneaza();

        ImprimantaMultifunctionala multifunctionala = new ImprimantaCompleta();
        multifunctionala.tipareste();
        multifunctionala.scaneaza();
        multifunctionala.trimiteFax();
    }
}

import java.util.List;

public class CalculatorArii {
    public void calculeazaSiAfiseazaArii(List<Forma> forme) {
        for (Forma f : forme) {
            System.out.println("Aria este: " + f.calculeazaAria());
        }
    }
}

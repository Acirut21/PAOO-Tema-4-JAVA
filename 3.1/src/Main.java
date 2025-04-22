import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        RezolvareEcuatie ecuatie = new RezolvareEcuatie(2, 4); // aici poti schimba a si b
        Solutie solutie = ecuatie.rezolva();

        try {
            FileWriter writer = new FileWriter("solutie.json");
            writer.write(solutie.toJson());
            writer.close();
            System.out.println("Solutia a fost salvata in solutie.json");
        } catch (IOException e) {
            System.out.println("Eroare la scrierea fisierului: " + e.getMessage());
        }
    }
}

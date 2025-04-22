import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crearea obiectelor pentru forme
        FormaGeometrica cerc = new Cerc(5); // Raza cercului = 5
        FormaGeometrica dreptunghi = new Dreptunghi(4, 6); // Lungime = 4, Latime = 6
        FormaGeometrica triunghi = new Triunghi(3, 4); // Baza = 3, Inaltime = 4

        // Adăugăm formele într-o listă
        ArrayList<FormaGeometrica> forme = new ArrayList<>();
        forme.add(cerc);
        forme.add(dreptunghi);
        forme.add(triunghi);

        // Calculăm suma ariilor
        double sumaAriilor = calculeazaSumaAriilor(forme);

        System.out.println("Suma ariilor formelor este: " + sumaAriilor);
    }

    // Metodă care calculează suma ariilor
    public static double calculeazaSumaAriilor(ArrayList<FormaGeometrica> forme) {
        double suma = 0;
        for (FormaGeometrica forma : forme) {
            suma += forma.calculeazaAria();
        }
        return suma;
    }
}

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        List<Shape> shapes = Arrays.asList(circle, rectangle);

        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.calculateTotalArea(shapes);

        System.out.println("Total area: " + totalArea);
    }
}
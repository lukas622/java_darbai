import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();

        System.out.println(c.getColor());

        Rectangle r = new Rectangle();

        System.out.println(r.isFilled());

        Square s = new Square();

        System.out.println(r.getPerimeter());

        ArrayList<Shape> Shapes = new ArrayList<>();

        Shapes.add(c);
        Shapes.add(r);
        Shapes.add(s);

        Shapes.forEach(System.out::println);

        double area = 0;

        for (Shape sh : Shapes) {
            area += sh.getArea();
        }

        System.out.println(Double.toString(area));
    }
}

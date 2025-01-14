import java.util.ArrayList;
import java.util.Arrays;

public class Herd implements Movable {
    private ArrayList<Movable> moveables = new ArrayList<>();

    public String toString() {
        for (Movable moveable : moveables) {
            System.out.println(moveable);
        }
        return "";
    }

    public void addToHerd(Movable moveable) {
        moveables.add(moveable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable moveable : moveables) {
            moveable.move(dx, dy);
        }
    }
}
